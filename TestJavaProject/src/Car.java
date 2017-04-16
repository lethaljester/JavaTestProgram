
public class Car {

	public Car(int i, String append) {
		// TODO Auto-generated constructor stub
		message = "I am a car";
		carname = Integer.toString(i) + append;
	}
	private String message, carname;
	public String getCarName(){
		return carname;
	}
	public String getMessage(){
		return message;
	}
}
