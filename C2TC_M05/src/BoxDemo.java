
class Box{
	float height;
	float width;
	float depth;
	String color;
	float calcVol() {
		System.out.println("Color of the box :" + color);
		return width*height*depth;
	}
}

public class BoxDemo {

	public static void main(String[] args) {
		Box box1=new Box();
		
		box1.width=3.4f;
		box1.height=2.2f;
		box1.depth=1.4f;
		box1.color="red";
		float vol=box1.calcVol();
		System.out.println("Volume of box1 is: "+vol);
		System.out.println();
		
		Box box2=new Box();
		box2.width=1.4f;
		box2.height=2.2f;
		box2.depth=1.3f;
		box1.color="blue";
		float vol2=box2.calcVol();
		System.out.println("Volume of box2 is: "+vol2);
	}

}
