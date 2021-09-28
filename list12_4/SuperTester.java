package list12_4;

public class SuperTester {
	public static void main(String[] args) {
		Base a = new Base(10);//インスタンス生成
		System.out.println("----a-----"); 
		a.print();
		System.out.println(a);

		Derived b = new Derived(20,30);//インスタンス生成
		System.out.println("----b-----"); 
		b.print();

		Base c = new Base();//インスタンス生成
		System.out.println("----c-----"); 
		c.print();
	}

}
