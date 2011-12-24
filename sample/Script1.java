package sample;

import resources.sample.Script1Helper;

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
	 * Generated     : <b>2010-9-30 17:17:37</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.0  Build 6001 (S)
	 * 
	 * @since  2010/09/30
	 * @author think
	 */
	public void testMain(Object[] args) 
	{
		System.out.println("hi");
		logInfo("hi");
		super.testMain(args);
	}
}
