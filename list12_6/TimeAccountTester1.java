package list12_6;

class TimeAccountTester1 {
	static int compBalance(Account a, Account b) {
		if(a.getBalance()>b.getBalance()) {
			return 1;
			}else if(a.getBalance()<b.getBalance()) {
				return -1;
			}
		return 0;
	}
}
