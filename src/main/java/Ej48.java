import java.math.BigDecimal;

public class Ej48 {
	float base = 0.1F;

	/**
	 * ２つの数字の差分が 0.1 以内に収まっているか判定します。
	 * 
	 * @param f1
	 * @param f2
	 * @return 0.1以内に収まっている場合 true を返します。
	 */
	public boolean check1(float f1, float f2) {
		System.out.println(String.format("f1 -> %f", f1));
		System.out.println(String.format("f2 -> %f", f2));
		System.out.println(String.format("ABS -> %f", Math.abs(f1 - f2)));

		return (base >= Math.abs(f1 - f2));
	}

	public boolean check2(BigDecimal f1, BigDecimal f2) {
		BigDecimal bbase = new BigDecimal("0.1");
		BigDecimal absValue = (f1.subtract(f2)).abs();
		return (bbase.compareTo(absValue) >= 0);
	}

}
