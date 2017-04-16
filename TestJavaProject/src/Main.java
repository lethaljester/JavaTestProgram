
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Garage home1 = new Garage("garage1","alpha");
		Garage home2 = new Garage("garage2","beta");
		//Garage home3 = new Garage("garage3","gamma");
		home1.getCarList();
		home2.getCarList();
		//home3.getCarList();
		
		home1.moveCar("0alpha", home2);
		home1.moveCar("1alpha", home2);
		
		home1.getCarList();
		home2.getCarList();
		//home3.getCarList();
	}
}
