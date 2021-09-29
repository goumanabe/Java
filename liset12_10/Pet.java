package liset12_10;

public class Pet {
	private String name;
	private String masterName;
	public Pet(String name, String masterName) {
		super();
		this.name = name;
		this.masterName = masterName;
	}
	public String getName() {
		return name;
	}
	public String getMasterName() {
		return masterName;
	}

	public void introduce() {
		System.out.println("■僕の名前は" + this.name + "です！");
		System.out.println("■ご主人様は" + this.masterName + "です！");
	}
}
