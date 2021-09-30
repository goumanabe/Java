package list13_1;

class Rectangle extends Shape{
	private int width;
	private int height;

	Rectangle(int width ,int height){//コンストラクタ
		this.width = width;
		this.height = height;
	}

	@Override
	void draw() {//描画
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i<=height ; i++) {
			for(int j = 1; j<=width ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
