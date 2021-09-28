package list12_4;

class Base {
	protected int x;

	Base(){//引数なしのコンストラクタ
		this.x = 0;
	}

	Base(int x){//引数ありのコンストラクタ
		this.x = x;
	}

	void print() {//メソッド
		System.out.println("Base.x = "+ x);
	}

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "toStringメソッド";
	}

	
	
}