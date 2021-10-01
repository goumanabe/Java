package list15_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//検査例外のため、必ずcatchしないと使えないメソッドも存在する

public class ExceptionSample3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=null;

		try {
			s = br.readLine();
			//readLineメソッドはIOExceptionをスローするメソッド
			//IOExceptionは検査例外のため、必ずcatchしないと使えない（またはthrowを記述する）
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		System.out.println("入力したデータ:"+s);
	}

}
