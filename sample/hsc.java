/*
 * �������� 2010-10-5
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package sample;

import com.rational.test.ft.script.RationalTestScript;

/**
 * @author think
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public class hsc extends RationalTestScript{


	/* ���� Javadoc��
	 * @see com.rational.test.ft.script.RationalTestScript#callScript(java.lang.String)
	 */
	protected Object callScript(String arg0) {
		try{
			return super.callScript(arg0);
		}catch(Exception e){
			
			return null;
		}
	}
}
