package sample;

import resources.sample.Script3Helper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * Description   : Functional Test Script
 * @author think
 */
public class Script3 extends Script3Helper
{
	/**
	 * Script Name   : <b>Script3</b>
	 * Generated     : <b>2010-10-5 16:28:02</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.0  Build 6001 (S)
	 * 
	 * @since  2010/10/05
	 * @author think
	 */
	public void testMain(Object[] args) 
	{
		System.out.println("script3");
		vpManual("test","yes","no").performTest();
	}

}
