import java.util.Hashtable;

import com.rational.test.ft.script.RationalTestScript;

/*
 * 创建日期 2010-8-22
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */

/**
 * @author think
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public class DialogCloser extends RationalTestScript{
	static Hashtable hash = new Hashtable();
	static{
		hash.put("","");
		hash.put("","");
	}
	
	
	public static void close(String dialogName){
		if (hash.containsKey(dialogName)) {
			String button = (String)hash.get(dialogName);
			DOF.getButton(DOF.getDialog(dialogName), button).click();
		}else{
//			throw new RuntimeException("DialogCloser don't know how to close dialog "+dialogName);
		}
	}

}
