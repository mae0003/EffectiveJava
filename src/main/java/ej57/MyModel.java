package ej57;

public class MyModel {

	private final static int INVALID_ID = 999;

	/**
	 * ID に一致した文字列を取得します。
	 * 
	 * @param id
	 * @return ID に一致した文字列
	 * @throws MyException
	 * @throws Myexceptoon
	 *             ○○の場合
	 */
	public String getString(int id) throws MyException {

		if (id == INVALID_ID)
			throw new MyException(null);
		return Integer.toString(id);
	}
}
