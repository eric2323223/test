import java.util.ArrayList;
import java.util.List;

/*
 * 创建日期 2010-9-19
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */

/**
 * @author think
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public class TestResult {
	public static final int PASS=1;
	public static final int FAIL=2;
	public static final int ABORT=3;
	
	private int code;
	private String Exception;
	private List vpList = new ArrayList();
	
	public List getVpList(){
		return this.vpList;
	}
	
	private void printVpList() {
		for(int i=0;i<vpList.size();i++){
			VP vp = (VP)vpList.get(i);
			System.out.println("["+vp.getName()+"]"+vp.getExpected()+"|"+vp.getActual());
		}
	}
	
	public TestResult(int result){
		this.code = result;
	}
	
	public void addVp(String vp){
		this.vpList.add(vp);
	}
	
	public TestResult(String msg){
		this.code = ABORT;
		this.Exception = msg;
	}
	
	public String getException(){
		return this.Exception;
	}
	
	public int resultCode(){
		return this.code;
	}
	
	public String toString(){
		if(this.code == PASS){
			return "Pass";
		}else if(this.code == FAIL){
			String msg = "Fail.\n";
			for(int i = 0;i<this.vpList.size();i++){
				msg = msg + this.vpList.get(i) + "\n";
			}
			return msg;
		}else{
			return "Abort";
		}
	}
}
