package list12_01;

class Point3D  extends Point2D{
	int z;
	int x;

	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
		this.x = x;
	}

	void setZ(int z) {this.z = z;}
	int getZ() {return z;}
}

