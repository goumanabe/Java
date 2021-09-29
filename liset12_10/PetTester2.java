package liset12_10;

class PetTester2 {

	static void intro(Pet p) {
		p.introduce();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Pet[] a = {
				new Pet("kurt","アイ"),
				new RobotPet("R2D2","ルーク"),
				new Pet("マイケル","英男")
		};

		for(Pet p : a) {
			intro(p);
			System.out.println();
		}
	}
}
