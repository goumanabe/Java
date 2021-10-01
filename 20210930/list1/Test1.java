package list1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("数字を入力してください");
		int x=0;
		boolean loop = true;
		while(loop) {
			try {
				x = stdIn.nextInt();
				System.out.println("値が入力されたよ");
				loop= false;
			}catch(InputMismatchException e) {
				System.out.println("不正入力です、もう一度入力してください");
				stdIn.nextLine();
			}catch(IllegalStateException e) {
				System.out.println("すでにクローズされています。");

			}
		}
		System.out.println("入力された値は、"+x);
	}

}
//			stdIn.next();の場合は下記のとおり、スペースも読み込んでしまって二回キャッチする
//			数字を入力してください
//			aaa aaa
//			不正入力です、もう一度入力してください
//			不正入力です、もう一度入力してください