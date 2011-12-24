

import java.util.ArrayList;
import java.util.List;

import com.rational.test.ft.script.RationalTestScript;

/**
 * Description   : Super class for script helper
 * 
 * @author think
 * @since  ¾ÅÔÂ 03, 2010
 */
public abstract class SuiteSC extends RationalTestScript
{
	//TODO Insert shared functionality here
	
	/* £¨·Ç Javadoc£©
	 * @see com.rational.test.ft.script.RationalTestScript#callScript(java.lang.String)
	 */
	private List failedScripts = new ArrayList();
	private List abortedScripts = new ArrayList();
	private int total;
	
	
	private HSC1 createInstance(String className){
		Class clazz;
		try {
			clazz = Class.forName(className);
			return (HSC1)clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (InstantiationException e) {
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected Object callScript(String arg0) {
		total++;
		HSC1 script = createInstance(arg0);
		script.testMain(null);
//		script.run();
		TestResult result = script.getResult();
		if(result.resultCode()==TestResult.FAIL){
			failedScripts.add(script);
		}
		if(result.resultCode() == TestResult.ABORT){
			abortedScripts.add(script);
		}
		return null;
//		return super.callScript(arg0);
	}
	/* £¨·Ç Javadoc£©
	 * @see com.rational.test.ft.script.RationalTestScript#onTerminate()
	 */
	public void onTerminate() {
		printSummary();
		super.onTerminate();
	}
	/**
	 * 
	 */
	private void printSummary() {
		System.out.println("All together "+ total+" cases.");
		System.out.println(failedScripts.size()+" scripts are failed");
		System.out.println(abortedScripts.size()+" scripts are aborted");
	}
}
