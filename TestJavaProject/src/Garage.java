import java.util.*;

public class Garage {
	public Garage(){
		
	}
	public Garage(String name, String append) {
		for (int i=0; i<9; i++){
			carlist.add(new Car(i, append));
			garageName = name;
		}
	}
	private List<Car> carlist = new ArrayList<Car>();
	private String garageName;
	
	public List<Car> carList(){
		return carlist;
	}
	public void getCarList(){
		
		for (int i=0; i<carlist.size(); i++){
			System.out.println(carlist.get(i).getCarName() + " in " + garageName);
		}
		
	}
	public void moveCar(String carName, Garage newLocation){
		int index = -1;
		for (int i=0; i<carlist.size(); i++){
				if (carlist.get(i).getCarName().equals(carName)){
					index = i;
				}
		}
		if (index == -1){
			System.out.println("Cannot Find Car");
		}else{
			newLocation.carList().add(carlist.get(index));
			System.out.println(carlist.get(index).getCarName() + "ghhhhh");
			carlist.remove(index);
		}
	}
}
