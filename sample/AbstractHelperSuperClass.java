/*
 * �������� 2010-9-30
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
public class AbstractHelperSuperClass extends RationalTestScript {

	public void testMain(Object[] args){
		try{
			repare();
			run();
			cleanUp();
		}catch(Exception e){
			
		}
		
	}

	/**
	 * 
	 */
	public void cleanUp() {
		// TODO �Զ����ɷ������
		
	}

	/**
	 * 
	 */
	public void run() {
		logInfo("hello");
		
	}

	/**
	 * 
	 */
	public void repare() {
		// TODO �Զ����ɷ������
		
	}
	
}
