package list13_0;

//--- 動物クラスのテスト ---//
public class AnimalTester {

	public static void main(String[] args) {
//		Animal animal = new Animal();中身がないから、中身のないインスタンスの生成はできない
		Animal[] a = {
			new Dog("タロー", "柴犬"),		// 犬
			new Cat("マイケル", 7),				// 猫
			new Dog("ハチ公", "秋田犬"),	// 犬
		};

		for (Animal k : a) {
			k.introduce();				// kの参照しているインスタンスの型に応じた
			System.out.println();	// 								メソッドが呼び出される
		}
	}
}
