package list12_6;

//定期預金付き銀行口座クラス【試作版】

class TimeAccount extends Account {
	private long timeBalance;		// 預金残高（定期預金）

	//--- コンストラクタ ---//
	TimeAccount(String n, String num, long z, long timeBalance) {
		super(n, num, z);
		this.timeBalance = timeBalance;		// 預金残高（定期預金）
	}
	//--- 定期預金残高を調べる ---//
	long getTimeBalance() {
		return timeBalance;
	}

	//--- 定期預金を解約して全額を普通預金に移す ---//
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
}
