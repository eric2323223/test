package sample;

import resources.sample.Script2Helper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * Description   : Functional Test Script
 * @author think
 */
public class Script2 extends Script2Helper
{

	public void testMain(Object[] args) 
	{
		System.out.println("script2");
		
		// Frame: Service Development - as/testfile2.sql - Sybase WorkSpace
		tree().click(RIGHT, atPath("as"));
		
		// 
		contextMenu().click(atPath("Properties"));
		
		// Frame: Properties for as
		propertiesForAs().move(atPoint(137,24));
		cancel().click();
	}
}
