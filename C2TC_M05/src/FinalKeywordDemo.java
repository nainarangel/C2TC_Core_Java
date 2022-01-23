class Car{
	 final int max_speed=120;
	void ControlSpeed() {
		//max_speed=180;
		System.out.println("Max speed : " + max_speed);
	}
}
public class FinalKeywordDemo {

	public static void main(String[] args) {
		Car obj=new Car();
		obj.ControlSpeed();

	}

}
