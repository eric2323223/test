/*
 * 创建日期 2010-9-30
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
package sample;

import com.rational.test.ft.script.RationalTestScript;

/**
 * @author think
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public class AbstractHelperSuperClass extends RationalTestScript {

	public void testMain(Object[] args){
		try{
			repare();
			run();
			cleanUp();
		}catch(Exception e){
			
		}
		
	}

	/**
	 * 
	 */
	public void cleanUp() {
		// TODO 自动生成方法存根
		
	}

	/**
	 * 
	 */
	public void run() {
		logInfo("hello");
		
	}

	/**
	 * 
	 */
	public void repare() {
		// TODO 自动生成方法存根
		
	}
	
}
