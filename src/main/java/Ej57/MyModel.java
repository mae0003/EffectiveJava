package Ej57;

public class MyModel {

	private final static int INVALID_ID = 999;

	/**
	 * ID に一致した文字列を取得します。
	 * 
	 * @param id
	 * @return ID に一致した文字列
	 */
	public String getString(int id) {
		return Integer.toString(id);
	}
}
