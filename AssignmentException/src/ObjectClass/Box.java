package ObjectClass;

public class Box {
	
	private int width;
	private int height;
	private int depth;
	
	/* public Box() {}; */
	
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getDepth() {
		return depth;
	}


	public void setDepth(int depth) {
		this.depth = depth;
	}


	public int volumeofBox() {
		
		int vol= width*height*depth;
		return vol;
		
	}

	
	public static void main(String[] args) {
		Box b= new Box(5,2,3);
            int volume=b.volumeofBox()	;
            System.out.println("Volume of Box--"+volume);
	}
}
