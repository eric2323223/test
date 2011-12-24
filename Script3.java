

import resources.Script3Helper;

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
	 * Generated     : <b>2010-9-3 16:17:30</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.0  Build 6001 (S)
	 * 
	 * @since  2010/09/03
	 * @author think
	 */
	public void run() 
	{
		menu().click(atPath("Help->About Sybase WorkSpace"));
		button().click();
		ok().click();
		ok2().click();
		System.out.println("hello");
	}
}
