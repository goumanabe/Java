package list12_4;

class Derived extends Base{
	int x;

	Derived(int x1,int x2){//コンストラクタ（引数二つ）
		super.x = x1; this.x = x2;
	}
	void print() {//メソッド、Baseと同じ名前、シグネチャも同じ
		super.print();
		System.out.println("Driver.x = "+ x);
	}
}