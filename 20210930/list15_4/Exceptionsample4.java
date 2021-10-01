package list15_4;

import java.io.IOException;

//p436の内容を確認する
public class Exceptionsample4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a =0;

		try {
		hoge(a);
		}
//		catch(Exception e) {
//			System.out.println("Exception!!");
//		}Exceptionは親玉なので、先に書くとそのほかが未到達になる
		//書くとしたら、最後に書いて予想外の例外をキャッチできるようにするとか
		catch(IOException e) {
			System.out.println("例外が発生しました。");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外２が発生しました。");
		}
	}
//ex...IOException,InputMismatchException,IllegalStateException,NoSuchElementException
	//throwsは飛んでくるかもしれない、じゃあtry catchで囲まないといけないよねってエラーが出る
	static void hoge(int x) throws IOException{//throws IOExceptionは例外発生させますという宣言
		System.out.println("ほげが呼ばれました");
		//x = 1の場合はIOExceptionが発生、それ以外はArrayIndexOutOfBoundsException();
		if(x == 1) {
		throw new IOException();//自らthrow できる、例外発生させる、IOExceptionを
		}else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}
