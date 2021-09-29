package list12_6;

class Account {
	private String name;				// 口座名義
	private String no;					// 口座番号
	private long balance;				// 預金残高

	//--- コンストラクタ ---//
	Account(String n, String num, long z) {
		name = n;													// 口座名義
		no = num;													// 口座番号
		balance = z;											// 預金残高
	}

	//--- 口座名義を調べる ---//
	String getName() {
		return name;
	}

	//--- 口座番号を調べる ---//
	String getNo() {
		return no;
	}

	//--- 預金残高を調べる ---//
	long getBalance() {
		return balance;
	}


	//--- k円預ける ---//
	void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	void withdraw(long k) {
		balance -= k;
	}

}
