

import resources.Script2Helper;

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
	/**
	 * Script Name   : <b>Script2</b>
	 * Generated     : <b>2010-8-21 9:24:12</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.0  Build 6001 (S)
	 * 
	 * @since  2010/08/21
	 * @author think
	 */
	/* £¨·Ç Javadoc£©
	 * @see HSC1#run()
	 */
	public void run() throws Exception {
		
		
		// Frame: Service Development - project1/testfile.sql - Sybase WorkSpace
		menu().click(atPath("File->New->Other..."));
//		
//		// Frame: New
//		_new().inputChars("file");
//		_new().inputKeys("{ENTER}");
//		_new().inputChars("a");
		tree().click(atPath("SQL Development->SQL File"));
		_Next().click();
		
		// Frame: New SQL File
		text().click(atPoint(41,11));
		newSQLFile().inputChars("testfile2");
		_Finish().click();
		
		// Frame: Service Development - project1/testfile2.sql - Sybase WorkSpace
		serviceDevelopmentProject1Test().inputChars("tet");
		vpManual("vpscript2","ok","ok");
	}
}
