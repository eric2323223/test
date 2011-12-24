import com.rational.test.ft.script.RationalTestScript;

/*
 * 创建日期 2010-8-21
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
public class VP {
	private String name;
	private String expected;
	private String actual;
	
	public VP (String st1, String st2, String st3){
		this.name = st1;
		this.expected = st2;
		this.actual = st3;
	}
	/**
	 * @return 返回 actual。
	 */
	public String getActual() {
		return actual;
	}
	/**
	 * @return 返回 expected。
	 */
	public String getExpected() {
		return expected;
	}
	/**
	 * @return 返回 name。
	 */
	public String getName() {
		return name;
	}

}
