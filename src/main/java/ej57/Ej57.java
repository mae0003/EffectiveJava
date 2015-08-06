package ej57;

import org.apache.commons.lang3.math.NumberUtils;

public class Ej57 {

	/**
	 * パラメータの文字列が数値に変換できるか判定します。
	 * 
	 * @param value
	 *            検査文字列
	 * @return 数値に変換できる場合 true
	 */
	public boolean validateNumber(String value) {
		return NumberUtils.isNumber(value);
	}

	public boolean validateNumber1(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
