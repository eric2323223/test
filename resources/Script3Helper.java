// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;
import HSC1;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;

/**
 * Script Name   : <b>Script3</b><br>
 * Generated     : <b>2010/10/03 12:47:25</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows NT (unknown) x86 6.0 <br>
 * 
 * @since  ʮ�� 03, 2010
 * @author think
 */
public abstract class Script3Helper extends HSC1
{
	/**
	 * Button�� with default state.
	 *		text : 
	 * 		toolTipText : Eclipse.org
	 * 		.class : org.eclipse.swt.widgets.Button
	 * 		.classIndex : 3
	 */
	protected GuiTestObject button() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button"));
	}
	/**
	 * Button�� with specific test context and state.
	 *		text : 
	 * 		toolTipText : Eclipse.org
	 * 		.class : org.eclipse.swt.widgets.Button
	 * 		.classIndex : 3
	 */
	protected GuiTestObject button(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button"), anchor, flags);
	}
	
	/**
	 * CTabFolder�� with default state.
	 *		toolTipText : project1/emp
	 * 		tabCount : 3
	 * 		.class : org.eclipse.swt.custom.CTabFolder
	 * 		.tabs : {emp,script.sql.ddl,script.sql.ddl}
	 * 		.classIndex : 1
	 */
	protected GuiSubitemTestObject cTabFolder() 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("cTabFolder"));
	}
	/**
	 * CTabFolder�� with specific test context and state.
	 *		toolTipText : project1/emp
	 * 		tabCount : 3
	 * 		.class : org.eclipse.swt.custom.CTabFolder
	 * 		.tabs : {emp,script.sql.ddl,script.sql.ddl}
	 * 		.classIndex : 1
	 */
	protected GuiSubitemTestObject cTabFolder(TestObject anchor, long flags) 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("cTabFolder"), anchor, flags);
	}
	
	/**
	 * Menu�� with default state.
	 *		.class : org.eclipse.swt.widgets.Menu
	 */
	protected GuiSubitemTestObject menu() 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("menu"));
	}
	/**
	 * Menu�� with specific test context and state.
	 *		.class : org.eclipse.swt.widgets.Menu
	 */
	protected GuiSubitemTestObject menu(TestObject anchor, long flags) 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("menu"), anchor, flags);
	}
	
	/**
	 * OK�� with default state.
	 *		text : OK
	 * 		.class : org.eclipse.swt.widgets.Button
	 * 		.classIndex : 2
	 */
	protected GuiTestObject ok() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"));
	}
	/**
	 * OK�� with specific test context and state.
	 *		text : OK
	 * 		.class : org.eclipse.swt.widgets.Button
	 * 		.classIndex : 2
	 */
	protected GuiTestObject ok(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"), anchor, flags);
	}
	
	/**
	 * OK�� with default state.
	 *		text : OK
	 * 		.class : org.eclipse.swt.widgets.Button
	 * 		.classIndex : 3
	 */
	protected GuiTestObject ok2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok2"));
	}
	/**
	 * OK�� with specific test context and state.
	 *		text : OK
	 * 		.class : org.eclipse.swt.widgets.Button
	 * 		.classIndex : 3
	 */
	protected GuiTestObject ok2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok2"), anchor, flags);
	}
	
	

	protected Script3Helper()
	{
		setScriptName("Script3");
	}
	
}