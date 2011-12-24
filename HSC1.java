import java.util.ArrayList;
import java.util.List;

import com.rational.test.ft.object.interfaces.TestObject;
import com.rational.test.ft.object.interfaces.TopLevelTestObject;
import com.rational.test.ft.script.RationalTestScript;
import com.rational.test.ft.vp.IFtVerificationPoint;

/**
 * Description   : Super class for script helper
 * 
 * @author think
 * @since  °ËÔÂ 21, 2010
 */
public class HSC1 extends RationalTestScript
{
	/* £¨·Ç Javadoc£©
	 * @see com.rational.test.ft.script.RationalTestScript#callScript(java.lang.String)
	 */
	private TestResult result;
	

	/* £¨·Ç Javadoc£©
	 * @see com.rational.test.ft.script.RationalTestScript#vpManual(java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void onVpFailure(IFtVerificationPoint arg0) {
		if (this.result == null) {
			this.result = new TestResult(TestResult.FAIL);
		}
		this.result.addVp(buildVPtext(arg0));
		super.onVpFailure(arg0);
	}
	
	private String buildVPtext(IFtVerificationPoint arg0) {
		return "["+arg0.getVPName()+"]: Excpected:["+arg0.getExpectedData().toString()+
			"] Actual:["+arg0.getActualData().toString()+"]";
		
	}


	public final void testMain(Object[] args) {
		try {
			System.out.println("Name: " + getScriptName());
			setup();
			run();
			teardown();
		} catch (Exception e) {
			System.out.println("["+getLineNumber()+"] Exception occurred: " + e.getClass());
			this.result = new TestResult(e.getMessage());
			logError(result.toString());
			cleanup();
		} finally {
			printSummary();
		}
	}

	private void cleanup() {
		closeDialogs();
		closeAllFiles();
		saveAll();
		reset();
	}
	
	private void saveAll(){
		
	}
	
	private void closeDialogs(){
//		while(true){
//			String windowName = getScreen().getActiveWindow().getText();
//			if(windowName.endsWith("Sybase WorkSpace")){
//				break;
//			}else{
//				DialogCloser.close(windowName);
//			}
//		}
	}
	
	private void closeAllFiles(){
		System.out.println("close all files...");
	}
	
	private void reset(){
		System.out.println("reset perspective");
	}
	
	private void printSummary(){
		if(this.result == null){
			this.result = new TestResult(TestResult.PASS);
		}
		System.out.print("["+getScriptName()+"]" );
		System.out.println(this.result.toString());
	}

	public void run() throws Exception{
		throw new RuntimeException("Run method must be overloaded.");
	}

	public void setup() {
		
	}

	public void teardown() {

	}

	public TestResult getResult() {
		return this.result;
	}
}
