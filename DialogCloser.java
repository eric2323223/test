import java.util.Hashtable;

import com.rational.test.ft.script.RationalTestScript;

/*
 * �������� 2010-8-22
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */

/**
 * @author think
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
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
