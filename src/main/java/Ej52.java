import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

/**
 * Ej52 インターフェースでオブジェクトを参照する。
 * 
 * @author Hiroyuki
 *
 */
public class Ej52 {

	List<String> names;

	public Ej52(List<String> names) {
		this.names = names;
	}

	public Ej52() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public List<String> getNames()
	{
		return this.names;
	}

	public List<String> getNameOfStartWithM() {
		List<String> startWithMs = new ArrayList<String>();
		this.names.stream().filter(item -> item.toUpperCase().startsWith("M")).forEach(item2 -> startWithMs.add(item2));

		TimerTask task;
		return startWithMs;
	}
}
