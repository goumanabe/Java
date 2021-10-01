package list15_4;
import java.util.Scanner;

public class ThrowAndCatch {
	
	static void hoge() {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		System.out.println("入力された値は"+a+"です");
	}

//	static void check(int sw)throws Exception{
//	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("hoge呼び出し");
		hoge();
		System.out.println("hoge終わり");
	}

}
