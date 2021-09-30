package list14_9;

class PortablePlayer implements Player,Skinnable{
	private int skin = BLACK;

	public PortablePlayer() {}

	@Override
	public void changeSkin(int skin) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("スキンを");
		switch(skin) {
		case BLACK: System.out.println("漆黒"); break;
		case RED: System.out.println("深紅"); break;
		case GREEN: System.out.println("柳葉"); break;
		case BLUE: System.out.println("露草"); break;
		case LEOPARD: System.out.println("豹柄"); break;
		default: System.out.println("無地"); break;
		}
		System.out.println("に変更しました。");
	}

	@Override
	public void play() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("■再生開始");
	}

	@Override
	public void stop() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("■再生終了");

	}


}
