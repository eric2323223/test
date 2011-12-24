

import resources.Script1Helper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * Description   : Functional Test Script
 * @author think
 */
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>2010-8-21 4:39:41</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.0  Build 6001 (S)
	 * 
	 * @since  2010/08/21
	 * @author think
	 */
	
	public void run() throws Exception{
//		System.out.println("script1");
////		throw new RuntimeException("failed for no reason");
//		vpManual("test","ok","ok1").performTest();
//		vpManual("test2", new Integer(1), "hello").performTest();
		
//		tree().click(RIGHT, atPath("project1->Database->Schemas->ml_server->Table1"));
		tree().click(RIGHT, atPath("project1"));
		contextMenu().click(atPath("Properties"));
		vpManual("test","path",text().getProperty("text"));
		text().click(atPoint(174,5));
		ok().click();
		new RuntimeException("this is a runtime exception");
	}
	
	public void setup(){
		callScript("setupSample1");
	}
	
	public void teardown(){
		callScript("teardownSample1");
	}
}
