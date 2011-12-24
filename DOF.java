import resources.DOFHelper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;



import java.awt.Rectangle;
import java.util.Enumeration;
import java.util.Hashtable;

import resources.DOFHelper;

import com.rational.test.ft.object.interfaces.GuiSubitemTestObject;
import com.rational.test.ft.object.interfaces.GuiTestObject;
import com.rational.test.ft.object.interfaces.ScrollGuiSubitemTestObject;
import com.rational.test.ft.object.interfaces.ScrollTestObject;
import com.rational.test.ft.object.interfaces.TestObject;
import com.rational.test.ft.object.interfaces.TextScrollTestObject;
import com.rational.test.ft.object.interfaces.TopLevelTestObject;
import com.rational.test.ft.script.RationalTestScript;
import com.rational.test.ft.value.MethodInfo;
import com.rational.test.ft.vp.ITestDataTree;
import com.rational.test.ft.vp.ITestDataTreeNode;
import com.rational.test.ft.vp.ITestDataTreeNodes;
import com.rational.test.util.regex.Regex;

/**
 * Description   : Functional Test Script
 * @author pyin
 */
public class DOF extends DOFHelper
{
	/**
	 * Script Name   : <b>DOF</b>
	 * Generated     : <b>Apr 20, 2009 5:02:30 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2009/04/20
	 * @author pyin
	 */
	/**
	 * Script Name : <b>DOF </b> Generated : <b>Nov 13, 2007 5:30:35 PM </b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2007/11/13
	 * @author pyin
	 */

	/**
	 * Script Name : <b>ObjectFindHelper </b> Generated : <b>Oct 16, 2007
	 * 4:45:51 PM </b> Description : Functional Test Script Original Host :
	 * WinNT Version 5.1 Build 2600 (S)
	 * 
	 * @since 2007/10/16
	 * @author pyin
	 */

	public static final int WAIT_ROOT_COUNT = 20;
public final static String ANCESTORS_OF_SINGLE_TEXT_SQLRESULT = "Composite->Composite->SashForm->Composite->Composite->Composite->Composite->Shell" ;
//public final static String ANCESTORS_OF_EDITOR_TAB = "Canvas->Composite->Composite->Composite->CTabFolder->Composite->Composite->Composite->Composite->Composite->Shell";
public final static String ANCESTORS_OF_SINGLE_GRID_SQLRESULT = "Composite->ScrolledComposite->Composite->Composite->SashForm->Composite->Composite->Composite->Composite->Shell";
public final static String ANCESTORS_OF_FILE_STYLEDTEXT = "Canvas->Composite->Composite->Composite->Composite->Composite->Composite->Composite->Shell";
public final static String ANCESTORS_OF_SCRAPBOOK_STYLEDTEXT = "Canvas->Composite->Composite->Composite->Composite->Composite->Composite->Composite->Composite->Composite->Shell";
public final static String ANCESTORS_OF_SP_SOURCE_STYLEDTEXT = "Canvas->Composite->Composite->Composite->CTabFolder->Composite->Composite->Composite->Composite->Composite->Shell";
public final static String ANCESTORS_OF_CONSTRAINT_DEFINITION_STYLEDTEXT = "Canvas->Composite->SQLStatementArea->Composite->Group->LayoutComposite->LayoutComposite->Section->LayoutComposite->WrappedPageBook->ScrolledPageBook->MasterDetailsBlock$MDSashForm->LayoutComposite->Form->ScrolledForm->CTabFolder->Composite->Composite->Composite->Composite->Composite->Shell";
public final static String ANCESTORS_OF_CONSTRAINT_NAME_TEXT   = "LayoutComposite->LayoutComposite->Section->LayoutComposite->WrappedPageBook->ScrolledPageBook->MasterDetailsBlock$MDSashForm->LayoutComposite->Form->ScrolledForm->CTabFolder->Composite->Composite->Composite->Composite->Composite->Shell";
public final static String ANCESTORS_OF_CONSTRAINT_NAME_TEXT2 = "LayoutComposite->LayoutComposite->LayoutComposite->Section->LayoutComposite->WrappedPageBook->ScrolledPageBook->MasterDetailsBlock$MDSashForm->LayoutComposite->Form->ScrolledForm->CTabFolder->Composite->Composite->Composite->Composite->Composite->Shell";



	public void testMain(Object[] args) {

	}
	
	public static TestObject getParent(TestObject child){
	    return (TestObject)child.invoke("getParent");
	}

	public static ScrollTestObject getFigureCanvas() {
		TestObject[] to = getRoot().find(
				atDescendant("class", "org.eclipse.draw2d.FigureCanvas"));
		if (to != null) {
			return (ScrollTestObject) to[0];
		} else
			return null;
	}

	public static TestObject getSashForm(TestObject parent) {
		TestObject[] forms = parent.find(atDescendant("class",
				"org.eclipse.swt.custom.SashForm"));
		if (forms != null) {
			return forms[0];
		}
		return null;
	}

	public static TopLevelTestObject getRoot() {
		Regex workspaceRegex = new Regex("Sybase WorkSpace");
		TopLevelTestObject rst = null;
		int counter = 0;
		while (rst == null && counter < WAIT_ROOT_COUNT) {
			try {
				rst = getAppWindow(workspaceRegex);
			} catch (Exception e) {
			}
			if (rst != null) {
				break;
			}
			counter++;
			sleep(0.5);
		}
		return rst;
	}

	public static String getSignature(TestObject to, String methodName) {
		MethodInfo[] m = to.getMethods();
		for (int i = 0; i < m.length; i++) {
			if (m[i].getName().equalsIgnoreCase(methodName)) {
				return m[i].getSignature();
			}
		}
		return null;
	}

	public static Object invoke(TestObject to, String command, int param) {
		String sig = getSignature(to, command);
		Object[] args = new Object[1];
		args[0] = new Integer(param);
		return to.invoke(command, sig, args);
	}

	public static Object invoke(TestObject to, String command, String param) {
		String sig = getSignature(to, command);
		Object[] args = new Object[1];
		args[0] = param;
		return to.invoke(command, sig, args);
	}

	public static GuiSubitemTestObject getMenu() {
		TestObject[] menues = getRoot().find(
				RationalTestScript.atDescendant("class",
						"org.eclipse.swt.widgets.Menu"));
		if (menues != null && menues.length > 0) {
			return (GuiSubitemTestObject) menues[0];
		} else
			return null;
	}

	public static GuiSubitemTestObject getCombo(TestObject parent, String label) {
		TestObject[] combos = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Combo"));
		if (combos != null && combos.length > 0) {
			for (int i = 0; i < combos.length; i++) {
				if (combos[i].getProperty(".priorLabel").toString()
						.equalsIgnoreCase(label)) {
					//				System.out.println("The No. "+i+"th Combo control.");
					return (GuiSubitemTestObject) combos[i];
				}
			}
			return null;
		}
		return null;
	}

public static GuiSubitemTestObject getCombo(TestObject parent) {
    
    TestObject[] combos = parent.find(RationalTestScript.atDescendant("class", "org.eclipse.swt.widgets.Combo"));
//    System.out.println(combos.length);
    if (combos != null && combos.length > 0) {
//        System.out.println(NativeInvoker.invoke(combos[0],"getItem",0));
        return (GuiSubitemTestObject) combos[0];
    } else
        return null;
}

	public static boolean ifDialogExist(String name) {
		TestObject[] dialogs = RationalTestScript.find(RationalTestScript
				.atDescendant(".domain", "Java"));
		if (dialogs != null && dialogs.length > 0) {

			for (int i = 0; i < dialogs.length; i++) {
				if (dialogs[i].getObjectClassName().equalsIgnoreCase(
						"org.eclipse.swt.widgets.Shell")
						&& dialogs[i].getProperty(".captionText").toString()
								.equalsIgnoreCase(name))
					return true;
			}
		}
		return false;

	}

	public static boolean ifTreeItemExist(TestObject tree, String path) {
		if (path != null && !path.startsWith("->") && !path.endsWith("->")) {
			//			System.out.println("here!");
			String[] items = path.split("->");
			//			for (int m = 0; m < items.length; m++) {
			//				System.out.print(items[m] + " ");
			//			}
			ITestDataTree cdTree;
			ITestDataTreeNodes cdTreeNodes;
			ITestDataTreeNode[] cdTreeNode;

			cdTree = (ITestDataTree) tree.getTestData("tree");
			cdTreeNodes = cdTree.getTreeNodes();
			cdTreeNode = cdTreeNodes.getRootNodes();
			if (cdTreeNode == null) {
				//				System.out.println("cdTreeNode is null");
				return false;
			} else {

				for (int i = 0; i < items.length; i++) {
					boolean flag = false;
					for (int j = 0; j < cdTreeNode.length; j++) {
						//						System.out.println("current tree position:
						// cdTreeNode["
						//								+ j + "]" + cdTreeNode[j].getNode().toString());
						//
						//						System.out.println("items[" + i + "].trim()= "
						//								+ items[i].trim());

						if (items[i].trim().equals(
								cdTreeNode[j].getNode().toString().trim())) {
							if (cdTreeNode[j].getChildren() != null
									&& cdTreeNode[j].getChildCount() > 0) {
								cdTreeNode = cdTreeNode[j].getChildren();

								//								System.out.println("next tree position: "
								//										+ cdTreeNode[0].getNode().toString());
							}
							flag = true;
							break;

						}
					}
					if (flag == false)
						return false;
				}
				return true;
			}
		} else
			return false;
	}

	public static void printProperties(TestObject to) {
		//		Hashtable props = to.getRecognitionProperties();
		Hashtable props = to.getProperties();
		Enumeration keys = props.keys();
		Enumeration values = props.elements();
		while (keys.hasMoreElements()) {
			System.out.println("[ " + keys.nextElement() + " ] = "
					+ values.nextElement());
		}
	}

	public static void printMethods(TestObject to) {
		MethodInfo[] m = to.getMethods();
		for (int i = 0; i < m.length; ++i) {
			if (!m[i].getDeclaringClass().equals("java.lang.Object"))
				System.out.println(m[i].getDeclaringClass() + "."
						+ m[i].getName() + "() *** signature < "
						+ m[i].getSignature() + " >");
		}
	}

	/**
	 * Description : Find dialog according to the caption of the dialog.
	 * 
	 * @param String
	 *            The caption of the dialog.
	 * @return <b>TestOject </b> The dialog that found. <code>null</code> if
	 *         not found.
	 * @version v0.1
	 * @author Eric
	 * @since July 31, 2007</br><br>
	 *        <b>Example </b></br> To close a "Properties" dialog by click the
	 *        "Cancel" button <br>
	 *        <br>
	 *        <code>getButton(getDialog("Properties")).click(atText("&Cancel"));</code>
	 */
	public static TopLevelTestObject getDialog(String caption) {
	    //Use try block to prevent it prevent exception be thrown out to BaseRunner
	    try{
		TestObject dialog = null;
		TestObject[] to = RationalTestScript.find(RationalTestScript.atChild(
				".domain", "Java"));
		for (int i = 0; i < to.length; i++) {
			if (to[i].getObjectClassName().equalsIgnoreCase(
					"org.eclipse.swt.widgets.Shell")
					&& to[i].getProperty(".captionText").toString()
							.equals(caption)) { 
				dialog = to[i];
				break;
			}
		}
		return (TopLevelTestObject) dialog;
	    }catch(Exception e){
	        return null;
	    }
	}

	public static TestObject getTextFieldByIndex(TestObject parent, int index) {
		TestObject[] texts = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Text"));
		if (texts.length >= index) {
			return texts[index];
		}
		return null;
	}

	public static TestObject getDirectChildTextField(TestObject parent) {
		TestObject[] texts = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Text"));
		if (texts != null) {
			return texts[0];
		}
		return null;
	}

	public static TestObject getStatusLine(TestObject parent) {
		TestObject[] statusLines = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.jface.action.StatusLine"));
		if (statusLines != null && statusLines.length > 0)
			return statusLines[0];
		else
			return null;
	}

	public static GuiTestObject getLabel(TestObject parent) {
		TestObject[] labels = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Label"));
		if (labels != null && labels.length > 0) {
			return (GuiTestObject) labels[0];
		}
		return null;
	}
	
	public static GuiTestObject getLabel(TestObject parent, String text) {
		TestObject[] labels = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Label"));
		if (labels != null && labels.length > 0) {
		    for(int i=0;i<labels.length;i++){
		        if(labels[i].getProperty("text").toString().equals(text))
		            return (GuiTestObject) labels[0];
		    }
		}
		return null;
	}

	public static TestObject getCLabel(TestObject parent) {
		TestObject[] labels = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.CLabel"));
		if (labels != null && labels.length > 0) {
			return labels[0];
		}
		return null;
	}

	public static TestObject getTextFieldByText(TestObject parent, String text) {
		TestObject[] texts = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Text"));
		if (texts != null && texts.length > 0) {
			for (int i = 0; i < texts.length; i++) {
				System.out.println(texts[i].getProperty("text").toString());
				if (texts[i].getProperty("text").toString() != null
						&& texts[i].getProperty("text").toString().equals(text))
					return texts[i];
			}
		}
		return null;
	}

	public static TestObject getTextField(TestObject parent) {
		TestObject[] texts = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Text"));
		if (texts != null) {
			//			System.out.println("Text found.");
			//			System.out.println(texts[0].getProperty("text").toString());
			return texts[0];
		} else
			return null;
	}

	public static TestObject getTextField(TestObject parent, String Caption) {
		TestObject[] texts = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Text"));
		for (int i = 0; i < texts.length; i++) {
			//			System.out.println("there are "+texts.length+" texts");
			//            System.out.println(i+":
			// "+texts[i].getProperty(".priorLabel").toString());
			if (texts[i].getProperty(".priorLabel") != null
					&& texts[i].getProperty(".priorLabel").toString().equals(
							Caption)) {
				return texts[i];
			}
		}
		return null;
	}



	public static TextScrollTestObject getStyledText(TestObject parent) {
		TestObject[] styledTexts = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.custom.StyledText"));
		if (styledTexts != null && styledTexts.length > 0)
			return (TextScrollTestObject) styledTexts[0];
		else
			return null;
	}

	public static GuiSubitemTestObject getSETree() {
		TestObject[] trees = getRoot().find(
				RationalTestScript.atDescendant("class",
						"org.eclipse.swt.widgets.Tree"));
		//		System.out.println(trees.length);
		for (int i = 0; i < trees.length; i++) {
			TestObject[] items = (TestObject[]) trees[i].invoke("getItems");
			if (items != null
					&& items[0].invoke("getText").toString().equals("Private")) {
				//				System.out.println("item was found");
				return (GuiSubitemTestObject) trees[i];
			}
		}
		return null;

	}

	/**
	 * Description : Find the tree under Enterprise Explorer tab of WorkSpace.
	 * 
	 * @return <b>GuiSubitemTestObject </b> The Tree Object that found.
	 *         <code>null</code> if not found.
	 * @version v0.1
	 * @author Eric
	 * @since July 31, 2007</br><br>
	 *        <b>Example </b></br> To connect MyServiceContainer in the EE.
	 *        <br>
	 *        <br>
	 *        <code>getEETree().click(right,atPath("Service Containers->MyServiceContainer"));<br>
	 * 									getContextMenu().click(atText("Connect"));</code>
	 */
	public static GuiSubitemTestObject getEETree() {
	    	getCTabFolder(getRoot(), "Enterprise Explorer").click(atText("Enterprise Explorer"));
		TestObject[] trees = getRoot().find(
				RationalTestScript.atDescendant("class",
						"org.eclipse.swt.widgets.Tree"));
		//		System.out.println(trees.length);
		for (int i = 0; i < trees.length; i++) {
			TestObject[] items = (TestObject[]) trees[i].invoke("getItems");
			if (items != null
					&& items[0].invoke("getText").toString().equals(
							"Application Servers")) {
				//				System.out.println("item was found");
				return (GuiSubitemTestObject) trees[i];
			}
		}
		return null;
	}
	
	/**
	 * Description : Find the tree under Wokspace Navigator tab of WorkSpace.
	 * 
	 * @return <b>GuiSubitemTestObject </b> The Tree Object that found.
	 *         <code>null</code> if not found.
	 * @version v0.1
	 * @author Eric
	 * @since July 31, 2007</br><br>
	 *        <b>Example </b></br> To connect MyServiceContainer in the EE.
	 *        <br>
	 *        <br>
	 *        <code>getEETree().click(right,atPath("Service Containers->MyServiceContainer"));<br>
	 * 									getContextMenu().click(atText("Connect"));</code>
	 * 
	 * Precondition: may need to reset perspective to restore to the default position
	 * Assumption:
	 * 1. EE tree is identified by "Application Server" root node
	 * 2. EE tree and WN tree is overlapped.
	 */


	public static GuiSubitemTestObject getTree(TestObject parent) {
		TestObject[] trees = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Tree"));
		if (trees != null && trees.length > 0) {
			return (GuiSubitemTestObject) trees[0];
		} else
			return null;
	}

	/**
	 * Description : Find Button according to parent TestObject and text.
	 * <i>Note: Normally, an "&" should be added in front of the text of the
	 * Button in order to find the object. </i>
	 * 
	 * @param TestObject
	 *            The parent TestObject of the Button.
	 * @param String
	 *            The text of the Button.
	 * @return <b>GuiSubitemTestObject </b> The Button Object that found.
	 *         <code>null</code> if not found.
	 * @version v0.1
	 * @author Eric
	 * @since July 31, 2007</br><br>
	 *        <b>Example </b></br> To get the "Next" toolbar of the New
	 *        Connection Profile Properties Dialog and click it. <br>
	 *        <br>
	 *        <code>getButton(getDialog("New Connection Profile Dialog Properties"),"&Next").click();</code>
	 */
	public static GuiTestObject getButton(TestObject parent, String text) {
		//		root = getRoot();
		TestObject[] buttons = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Button"));
		for (int i = 0; i < buttons.length; i++) {
			//			System.out.println(buttons[i].getProperty("text").toString());
			if (buttons[i].getProperty("text").toString().equalsIgnoreCase(text)
					&& buttons[i].invoke("isVisible").toString().equals("true")) {
				return (GuiTestObject) buttons[i];
			}
		}
		return null;
	}

	/**
	 * Description : Find CTabFolder object according to it's tab caption.
	 * <i>Note: This method is highly recommended in the WorkSpace test cause it
	 * run much faster than the static mapped object. </i>
	 * 
	 * @param TestObject
	 *            The parent control of the tree.
	 * @param String
	 *            The tab caption of the CTabFolder.
	 * @return <b>GuiSubitemTestObject </b> The CTabFolder Object that found.
	 *         <code>null</code> if not found.
	 * @version v0.11
	 * @author Eric
	 * @since July 31, 2007</br><br>
	 *        <b>Example </b></br> To get the "Enterprise Explorer" tab and
	 *        click it. <br>
	 *        <br>
	 *        <code>getTabFolder(getRoot(),"Enterprise Explorer").click(atText("Enterprise Explorer"));</code>
	 */
	public static GuiSubitemTestObject getCTabFolder(TestObject parent,
			String caption) {
		TestObject[] tabs = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.custom.CTabFolder"));
		//		System.out.println(tabs.length);
		if (tabs != null && tabs.length > 0) {
			for (int i = 0; i < tabs.length; i++) {
				if (tabs[i].getProperty(".tabs") != null
						&& tabs[i].getProperty(".tabs").toString().indexOf(
								caption) != -1 && tabs[i].invoke("isVisible").toString().equals("true"))
					return (GuiSubitemTestObject) tabs[i];
			}
		}
		return null;
	}

	public static GuiSubitemTestObject getTabFolder(TestObject parent,
			String caption) {
		TestObject[] tabs = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.TabFolder"));
		//		System.out.println(tabs.length);
		if (tabs != null && tabs.length > 0) {
			for (int i = 0; i < tabs.length; i++) {
				if (tabs[i].getProperty(".tabs").toString().indexOf(caption) != -1)
					return (GuiSubitemTestObject) tabs[i];
			}
			return null;
		}
		return null;
	}

public static GuiSubitemTestObject getTable(TestObject parent) {
    TestObject[] tables = parent.find(RationalTestScript.atDescendant("class", "org.eclipse.swt.widgets.Table"));
    if (tables != null && tables.length > 0) {
//        System.out.println("There are " + tables.length + " tables");
        return (GuiSubitemTestObject) tables[0];
    } else
        return null;
}





	//	The Table.getColumns normally returns a Array that has one more elements
	// then shows in the screen,
	// the Text of the first element is empty.
	public static GuiSubitemTestObject getTableByColumnsNames(
			TestObject parent, String[] columnNames) {
		TestObject[] tables = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Table"));
		if (tables != null && tables.length > 0) {
			for (int i = 0; i < tables.length; i++) {
				//				TableHelper.printColumns(tables[i]);
				TestObject[] columns = (TestObject[]) tables[i]
						.invoke("getColumns");
				if (columns.length != columnNames.length + 1)
					continue;
				boolean flag = true;
				for (int j = 1; j < columns.length; j++) {
					String column = columns[j].invoke("getText").toString();
					if (!column.equals(columnNames[j - 1])) {
						flag = false;
						break;
					}
				}
				if (flag)
					return (GuiSubitemTestObject) tables[i];
			}
		}
		return null;
	}

	public static ScrollTestObject getTwistie(TestObject parent) {
		TestObject[] twisties = parent.find(atChild("class",
				"org.eclipse.ui.forms.widgets.Twistie"));
		if (twisties != null && twisties.length > 0) {
			return (ScrollTestObject) twisties[0];
		}
		return null;
	}

	public static TestObject getGroup(TestObject parent, String name) {
		TestObject[] groups = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.Group"));
		if (groups != null && groups.length > 0) {
			for (int i = 0; i < groups.length; i++) {
				if (groups[i].getProperty("text").toString().indexOf(name) != -1) {
					return groups[i];
				}
			}
			return null;
		} else
			return null;
	}

	//	public static void test() {
	//		System.out.println(getDomains().length);
	//		for (int i = 0; i < getDomains().length; i++) {
	//			System.out.println(getDomains()[i].getName().toString());
	//			if (getDomains()[i].getName().equals("Java")) {
	//
	//				TestObject[] objects =
	// RationalTestScript.getDomains()[i].getTopObjects();
	//
	//				for (int j = 0; j < objects.length; j++) {
	//					System.out.print(objects[j].getProperty("class").toString()
	//							+ " : ");
	//					System.out.println(objects[j].getProperty("text")
	//							.toString());
	//					try {
	//						((TopLevelTestObject) objects[j]).inputKeys("{enter}");
	//						System.out.println("Enter key has been pushed.");
	//					} catch (Exception e) {
	//						e.printStackTrace();
	//					}
	//
	//				}
	//			}
	//		}
	//	}

	/**
	 * Description : Find context menu.
	 * 
	 * @return <b>GuiSubitemTestObject </b> The contextMenu Object that found.
	 *         <code>null</code> if not found.
	 * @version v0.1
	 * @author Eric
	 * @since July 31, 2007</br><br>
	 *        <b>Example </b></br> To get the context menu and click
	 *        "Properties" .<br>
	 *        <br>
	 *        <code>getContextMenu().click(atText("Properties"));</code>
	 */
	public static GuiSubitemTestObject getContextMenu() {
		GuiSubitemTestObject contextMenu = null;
		TestObject[] to = RationalTestScript.find(RationalTestScript.atChild(
				".domain", "Java"));
		for (int i = 0; i < to.length; i++) {
			//			System.out.println(i + ": [" + to[i].getObjectClassName() + "] -
			// "+ to[i].getProperty(".captionText").toString());
			if (to[i].getObjectClassName().equalsIgnoreCase("Java.PopupMenu")) {
				contextMenu = new GuiSubitemTestObject(to[i]);
				//				System.out.println("menu was found.");
				break;
			}
		}
		return contextMenu;
	}

	public static GuiSubitemTestObject getTree(String pattern) {
		TestObject[] trees = getRoot().find(
				atDescendant("class", "org.eclipse.swt.widgets.Tree"));
		for (int i = 0; i < trees.length; i++) {
			if (ifTreeItemExist(trees[i], pattern))
				return (GuiSubitemTestObject) trees[i];
		}
		return null;
	}

	public static boolean searchTree(String catagory, String name) {
		TestObject[] trees = getRoot().find(
				RationalTestScript.atDescendant("class",
						"org.eclipse.swt.widgets.Tree"));
		boolean findFlag = false;
		if (trees != null && trees.length > 0) {
			for (int i = 0; i < trees.length; i++) {

				TestObject parent = trees[i];

				ITestDataTree cdTree;
				ITestDataTreeNodes cdTreeNodes;
				ITestDataTreeNode[] cdTreeNode;

				cdTree = (ITestDataTree) parent.getTestData("tree");
				cdTreeNodes = cdTree.getTreeNodes();
				cdTreeNode = cdTreeNodes.getRootNodes();

				if (cdTreeNode != null) {
					for (int k = 0; k < cdTreeNode.length; k++) {
						if (cdTreeNode[k].getNode().toString().equals(catagory)) {
							int itemCount = cdTreeNode[k].getChildCount();
							ITestDataTreeNode[] items = cdTreeNode[k]
									.getChildren();
							for (int p = 0; p < itemCount; p++) {
								if (items[p].getNode().toString().equals(name))
									findFlag = true;
							}
						}
					}
				}
			}
		}
		return findFlag;
	}

	/**
	 * Description : Find ToolBar according to parent TestObject and
	 * ToolTipText.
	 * 
	 * @param TestObject
	 *            The parent TestObject of the ToolBar.
	 * @param String
	 *            The toolTipText of the ToolBar.
	 * @return <b>GuiSubitemTestObject </b> The ToolBar Object that found.
	 *         <code>null</code> if not found.
	 * @version v0.1
	 * @author Eric
	 * @since July 31, 2007</br><br>
	 *        <b>Example </b></br> To get the "Save" toolbar and click it. <br>
	 *        <br>
	 *        <code>getToolBar(getRoot(),"Save").click(atToolTipText("Save"));</code>
	 */
	public static GuiSubitemTestObject getToolBar(TestObject parent,
			String caption) {
		TestObject[] toolBars = parent.find(RationalTestScript.atDescendant(
				"class", "org.eclipse.swt.widgets.ToolBar"));
		if (toolBars != null) {
			for (int i = 0; i < toolBars.length; i++) {

				if (toolBars[i].getProperty(".itemToolTipText") != null
						&& toolBars[i].getProperty(".itemToolTipText")
								.toString().indexOf(caption) != -1) {
					return (GuiSubitemTestObject) toolBars[i];
				}
			}
			return null;
		}
		return null;
	}

	private static com.rational.test.ft.object.interfaces.TestObject getToolPallete(
			java.lang.String name) {
		com.rational.test.ft.object.interfaces.TestObject palletes[] = getRoot()
				.find(
						com.rational.test.ft.script.SubitemFactory
								.atDescendant("class",
										"com.sybase.stf.common.toolpalette.ToolPaletteContainer"));
		if (palletes != null) {
			for (int i = 0; i < palletes.length; i++)
				if (palletes[i].invoke("getText").toString().equals(name))
					return palletes[i];

			return null;
		} else {
			return null;
		}
	}

	public static com.rational.test.ft.object.interfaces.ScrollTestObject getPalleteItem(
			java.lang.String palleteName, java.lang.String itemName) {
		com.rational.test.ft.object.interfaces.TestObject pallete = getToolPallete(palleteName);
		if (pallete != null) {
			com.rational.test.ft.object.interfaces.TestObject label[] = pallete
					.find(com.rational.test.ft.script.SubitemFactory.atChild(
							"class", "org.eclipse.swt.custom.CLabel"));
			((com.rational.test.ft.object.interfaces.GuiTestObject) label[0])
					.click();
			return getToolPalleteItem(pallete, itemName);
		} else {
			return null;
		}
	}

	private static com.rational.test.ft.object.interfaces.ScrollTestObject getToolPalleteItem(
			com.rational.test.ft.object.interfaces.TestObject parent,
			java.lang.String name) {
		com.rational.test.ft.object.interfaces.TestObject palleteItems[] = parent
				.find(com.rational.test.ft.script.SubitemFactory.atDescendant(
						"class",
						"com.sybase.stf.common.toolpalette.ToolPaletteItem"));
		if (palleteItems != null && palleteItems.length > 0) {
			for (int i = 0; i < palleteItems.length; i++)
				if (((java.lang.String) palleteItems[i].invoke("getText"))
						.equals(name))
					return (com.rational.test.ft.object.interfaces.ScrollTestObject) palleteItems[i];

			return null;
		} else {
			return null;
		}
	}

	public static TestObject getSection(TestObject parent, String name) {
		TestObject[] sections = parent.find(atDescendant("class",
				"org.eclipse.ui.forms.widgets.Section"));
		if (sections != null && sections.length > 0) {
			for (int i = 0; i < sections.length; i++) {
			    if(sections[i].invoke("getText").toString().equals(name))
			        return sections[i];
			    }
		}
		return null;
	}
	
//	public static TestObject getSection(TestObject parent, String name) {
//		TestObject[] sections = parent.find(atDescendant("class",
//				"org.eclipse.ui.forms.widgets.Section"));
//		if (sections != null && sections.length > 0) {
//			for (int i = 0; i < sections.length; i++) {
//			    System.out.println(sections[i].invoke("getText").toString());
//				TestObject[] texts = sections[i].find(atChild("class",
//						"org.eclipse.swt.widgets.Label"));
//				if (texts != null && texts.length > 0
//						&& texts[0].getProperty("text").toString().equals(name)) {
//					return sections[i];
//				}
//			}
//		}
//		return null;
//	}

	public static TestObject getWrappedPageBook(TestObject parent) {
		TestObject[] pageBooks = parent.find(atDescendant("class",
				"org.eclipse.ui.internal.forms.widgets.WrappedPageBook"));
		if (pageBooks != null && pageBooks.length > 0) {
			//			System.out.println(pageBooks.length);
			//			NativeInvoker.printMethods(pageBooks[0]);
			return pageBooks[0];
		}
		return null;
	}

	public static TestObject getSection(String formName, String sectionName) {
		TestObject form = getForm(getRoot(), formName);
		if (form != null) {
			return getSection(form, sectionName);
		}
		return null;
	}
	
	
	public static TestObject getSybaseSQLObjectSelectionComponent(TestObject parent, String tabName){
	    TestObject[] objs = parent.find(atDescendant("class","com.sybase.stf.dmp.ui.objectviewer.ddlgen.wizard.components.SQLObjectSelectionComponent"));
	    if(objs!=null && objs.length>0){
	        for(int i=0;i<objs.length;i++){
	            if(objs[i].getProperty(".tabText").equals(tabName))
	                return objs[i];
	        }
	        return null;
	    }
	    return null;
	}

	public static TestObject getScrolledForm(TestObject parent, String name) {
		TestObject[] forms = parent.find(atDescendant("class",
				"org.eclipse.ui.forms.widgets.ScrolledForm"));
		if (forms != null && forms.length > 0) {
			for (int i = 0; i < forms.length; i++) {
				System.out.println(forms[i].invoke("getText").toString());
				printMethods(forms[i]);
				String text = forms[i].getProperty("tabText").toString();
				if (text.equals(name)) {
					return forms[i];
				}
			}
		}
		return null;
	}

	private static TestObject getFormHeading(TestObject parent, String name) {
		TestObject[] headings = parent.find(atChild("class",
				"org.eclipse.ui.internal.forms.widgets.FormHeading"));
		if (headings != null && headings.length > 0) {
			for (int i = 0; i < headings.length; i++) {
				String caption = headings[i].invoke("getText").toString();
				if (name.equals(caption)) {
					return headings[i];
				}
			}
		}
		return null;
	}

	public static TestObject getForm(TestObject parent, String name) {
		TestObject[] forms = parent.find(atDescendant("class",
				"org.eclipse.ui.forms.widgets.Form"));
		if (forms != null && forms.length > 0) {
			for (int i = 0; i < forms.length; i++) {
				if (getFormHeading(forms[i], name) != null) {
					return forms[i];
				}
			}
		}
		return null;
	}

	public static ScrollTestObject getInterfaceDesigner() {
		TestObject[] ids = getRoot()
				.find(
						atDescendant(
								"class",
								"com.sybase.stf.service.framework.interfacedesigner.editor.InterfaceDesignerControl"));
		if (ids != null && ids.length > 0) {
			return (ScrollTestObject) ids[0];
		}
		return null;
	}

	public static ScrollTestObject getCCombo(TestObject parent) {
		TestObject[] combos = parent.find(atDescendant("class",
				"org.eclipse.swt.custom.CCombo"));
		if (combos != null && combos.length > 0)
			return (ScrollTestObject) combos[0];
		return null;

	}
	
	public static ScrollTestObject getCCombo(TestObject parent, String priorLabel){
		TestObject[] combos = parent.find(atDescendant("class",
				"org.eclipse.swt.custom.CCombo"));
		for(int i=0;i<combos.length;i++){
		        if(combos[i].getProperty(".priorLabel").toString().equals(priorLabel)){
			        return (ScrollTestObject)combos[i];
		        }
		    }
		return null;
	}

	public static ScrollGuiSubitemTestObject getList(TestObject parent) {
		TestObject[] combos = parent.find(atDescendant("class",
				"org.eclipse.swt.widgets.List"));
		System.out.println(combos.length);
		if (combos != null && combos.length > 0)
			return (ScrollGuiSubitemTestObject) combos[0];
		return null;

	}

	//	public static ScrollTestObject getCCombo(TestObject parent, String[]
	// pattern){
	//		TestObject[] combos =
	// parent.find(atDescendant("class","org.eclipse.swt.custom.CCombo"));
	//		if(combos!=null && combos.length>0){
	//			boolean flag = true;
	//			for(int i=0;i<combos.length;i++){
	//				String[] items = CComboHelper.getItems(combos[i]);
	//				if(StringUtil.ifStrArrayContainStrArray(items,pattern))
	//					return (ScrollTestObject)combos[i];
	//			}
	//		}
	//		return null;
	//		
	//	}

	public static ScrollTestObject getImageCombo(TestObject parent) {
		TestObject[] combos = parent.find(atDescendant("class",
				"com.sybase.stf.service.framework.utils.ImageCombo"));
		if (combos != null && combos.length > 0) {
			System.out.println("there are " + combos.length + " image combo");
			//			printMethods(combos[0]);
			return (ScrollTestObject) combos[0];
		}
		return null;
	}

	//	public static ScrollTestObject getImageCombo(TestObject parent, String[]
	// pattern){
	//		TestObject[] combos =
	// parent.find(atDescendant("class","com.sybase.stf.service.framework.utils.ImageCombo"));
	//		if(combos!=null && combos.length>0){
	//			for(int i=0;i<combos.length;i++){
	//				String[] items = ImageComboHelper.getItems(combos[i]);
	//				if(items!=null && items.length>0){
	//				if(StringUtil.ifStrArrayContainStrArray(items,pattern))
	//					return (ScrollTestObject)combos[i];
	//				}
	//			}
	//		}
	//		return null;
	//	}

	public static void showAllImageCombo(TestObject parent) {
		TestObject[] combos = parent.find(atDescendant("class",
				"com.sybase.stf.service.framework.utils.ImageCombo"));
		if (combos != null && combos.length > 0) {
			for (int i = 0; i < combos.length; i++) {
				System.out.println(i
						+ ":"
						+ ((Rectangle) combos[i].invoke("getBounds"))
								.toString());
			}
		}
	}

	//	public static ScrollTestObject getInterfaceDesingerImageCombo(){
	//		TestObject[] combos =
	// getRoot().find(atDescendant("class","com.sybase.stf.service.framework.utils.ImageCombo"));
	//		int maxWidth = 9999;
	//		int index = -1;
	//		String[] pattern = {"Input","Output"};
	//		if(combos!=null && combos.length>0){
	//			for(int i=0;i<combos.length;i++){
	//				String[] items = ImageComboHelper.getItems(combos[i]);
	//				if(items!=null && items.length>0){
	//				if(StringUtil.ifStrArrayContainStrArray(items,pattern)){
	//					Rectangle rec = (Rectangle)combos[i].invoke("getBounds");
	//					if(rec.width<maxWidth){
	//						maxWidth = rec.width;
	//						index = i;
	//					}
	//				}
	//			}
	//			}
	//			return (ScrollTestObject)combos[index];
	//		}
	//		return null;
	//		
	//	}

	public static GuiTestObject getHyperLink(TestObject parent, String text) {
		TestObject[] links = parent.find(atDescendant("class",
				"org.eclipse.ui.forms.widgets.Hyperlink"));
		if (links != null && links.length > 0) {
			for (int i = 0; i < links.length; i++) {
				String str = links[i].invoke("getText").toString();
				if (text.equals(str)) {
					return (GuiTestObject) links[i];
				}
			}
		}
		return null;
	}

	public static TestObject getComposite(TestObject parent) {
		TestObject[] composites = parent.find(atDescendant("class",
				"org.eclipse.swt.widgets.Composite"));
		if (composites != null && composites.length > 0) {
			return (TestObject) composites[0];
		}
		return null;
	}
	
	public static GuiTestObject getProgressRegion(TestObject parent) {
		TestObject[] progressRegion = parent.find(atDescendant("class",
				"org.eclipse.ui.internal.progress.ProgressRegion$1"));
		if (progressRegion != null && progressRegion.length > 0) {
			return (GuiTestObject) progressRegion[0];
		}
		return null;
	}

	public static GuiTestObject getProgressBar(TestObject parent) {
		TestObject[] progressBars = parent.find(atDescendant("class",
				"org.eclipse.swt.widgets.ProgressBar"));
		if (progressBars != null && progressBars.length > 0) {
			return (GuiTestObject) progressBars[0];
		}
		return null;
	}

	public static TestObject getContainerSelectionGroup(TestObject parent) {
		TestObject[] CSGs = parent.find(atDescendant("class",
				"org.eclipse.ui.internal.ide.misc.ContainerSelectionGroup"));
		if (CSGs != null && CSGs.length > 0) {
			System.out.println("there are " + CSGs.length + " CSG");
			return CSGs[0];
		}
		return null;
	}

public static String getAncestorLine(TestObject widget){
    String ancestors = null;
    TestObject parent = (TestObject)widget.invoke("getParent");
    while(parent!=null){
//        System.out.println(parent.getProperty("class"));
        if(ancestors==null){
            ancestors = parent.invoke("getName").toString();
        } else {
//            if(parent.invoke("getName").toString().equals("Section")){
//                System.out.println(parent.invoke("getText"));
//            }
            ancestors = ancestors + "->" + parent.invoke("getName").toString();
        }
        parent = (TestObject)parent.invoke("getParent");
    }
    return ancestors;

}


public static TextScrollTestObject getCurrentFileInEditorTab(){
    TestObject[] styledTexts = DOF.getRoot().find(atDescendant("class","org.eclipse.swt.custom.StyledText"));
    for(int i=0;i<styledTexts.length;i++){
        String ancestorLine = DOF.getAncestorLine(styledTexts[i]);
        if(ancestorLine.equals(ANCESTORS_OF_FILE_STYLEDTEXT)&&styledTexts[i].invoke("isVisible").toString().equals("true")){
            return (TextScrollTestObject)styledTexts[i];
        }
    }
    return null;
}


	
	private static final double defaultAngleRange = 10;
	private static final double defaultDistanceRange = 10;
	






	/**
	 * Description : This method is used to find eclipse shell.
	 * 
	 * @param Regex
	 *            The Name of any eclipse based app. For Sybase WorkSpace,
	 *            <code> new Regex("Sybase WorkSpace")</code> is enough.
	 * @return <b>TestObject </b> The specified the app shell.
	 * @version v0.1
	 * @author Mark Nowacki
	 * @since July 31, 2007</br><br>
	 *        <b>Example </b> <br>
	 *        To get the Shell of Sybase WorkSpace <br>
	 *        <br>
	 *        <code>TestObject workSpaceShell = getAppWindow(new Regex("Sybase WorkSpace"));</code>
	 */
	public static TopLevelTestObject getAppWindow(Regex windowCaption) {
		TestObject shell = null;
		int count = -1;

		final TestObject[] to = RationalTestScript.find(atChild("class",
				"org.eclipse.swt.widgets.Shell"));

		if (null != to) {
			count = to.length;
			if (0 < count && null != windowCaption) {
				for (int i = 0; i < count; i++) {

					if (windowCaption.matches((String) to[i]
							.getProperty("text"))) {
						shell = to[i];
						break;
					}
				}
			}
		}
		return (TopLevelTestObject) shell;
	}

}


