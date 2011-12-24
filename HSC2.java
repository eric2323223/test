

import java.util.ArrayList;

import com.rational.test.ft.script.RationalTestScript;
import com.rational.test.ft.vp.IFtVerificationPoint;

/**
 * Description   : Super class for script helper
 * 
 * @author think
 * @since  九月 03, 2010
 */
public class HSC2 extends RationalTestScript
{
	private java.util.List failedVP = new ArrayList();
	private boolean result = true;
	private String exception;

	/**
	 * @param arg0
	 */
	public HSC2(String arg0) {
		
		// TODO 自动生成构造函数存根
	}

	public boolean onUnhandledException(Throwable e) {
		this.result = false;
//		this.exception = e.getClass() + "["+e.getMessage()+"]";
		cleanup();
		return super.onUnhandledException(e);
	}

	/**
	 * 
	 */
	private void cleanup() {
		System.out.println("cleanning up your mess");
	}

	public void onVpFailure(IFtVerificationPoint arg0) {
		this.result = false;
		this.failedVP.add(buildVPtext(arg0));
		super.onVpFailure(arg0);
	}
	

	private String buildVPtext(IFtVerificationPoint arg0) {
		return "["+arg0.getVPName()+"]: Excpected:["+arg0.getBaselineData().toString()+
			"] Actual:["+arg0.getActualData().toString()+"]";
		
	}

	public boolean getResult(){
		return this.result;
	}
	
	public String getSummary(){
		if(this.result){
			return this.getScriptName()+"[Passed]";
		}else{
			return getErrors();
		}
	}

	/**
	 * 
	 */
	private String getErrors() {
		String msg = this.getScriptName()+"[Failed]\n";
		if(this.failedVP.size()>0){
			msg = msg + "Failed verification points:\n";
			for(int i = 0;i<this.failedVP.size();i++){
				msg = msg+ this.failedVP.get(i).toString()+"\n";
			}
		}
//		if(this.exception!=null){
//			msg = msg + ("Unhandled exception:\n");
//			msg = msg + (this.exception)+"\n";
//		}
		return msg;
		
	}
	
	/* （非 Javadoc）
	 * @see com.rational.test.ft.script.RationalTestScript#onTerminate()
	 */
	public void onTerminate() {
		System.out.println(getSummary());
		super.onTerminate();
	}
}
