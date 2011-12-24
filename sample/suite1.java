package sample;

import resources.sample.suite1Helper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * Description   : Functional Test Script
 * @author think
 */
public class suite1 extends suite1Helper
{
	/**
	 * Script Name   : <b>suite1</b>
	 * Generated     : <b>2010-10-5 17:48:57</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.0  Build 6001 (S)
	 * 
	 * @since  2010/10/05
	 * @author think
	 */
	public void testMain(Object[] args) 
	{
		callScript("sample.Script3");
		callScript("sample.Script2");
		callScript("sample.Script1");
	}
}
