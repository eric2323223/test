import com.rational.test.ft.script.RationalTestScript;

/*
 * �������� 2010-8-21
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
public class VP {
	private String name;
	private String expected;
	private String actual;
	
	public VP (String st1, String st2, String st3){
		this.name = st1;
		this.expected = st2;
		this.actual = st3;
	}
	/**
	 * @return ���� actual��
	 */
	public String getActual() {
		return actual;
	}
	/**
	 * @return ���� expected��
	 */
	public String getExpected() {
		return expected;
	}
	/**
	 * @return ���� name��
	 */
	public String getName() {
		return name;
	}

}
