
public class Carclass {

	String car;
	int speed;
	
	
	public Carclass() {
		
	}
	
	public Carclass(String CarName) {
				
		car = CarName;
	}
		
		
	
	public Carclass(String CarName, int pSpeed) {
		car = CarName;
		speed = pSpeed;
	}
	
	public String getCar() {
		return car;
	}

	public int getSpeed() {
		return speed;
	}


	public void setCarclass(String CarName, int pSpeed) {
		car = CarName;
		speed = pSpeed;
		return;

	}

	public void speedUp(int pSpeed){
		speed += pSpeed;
		
	}
		
	public void speedDown(int dSpeed) {
		speed -= dSpeed;
	}
	
		
				
	}
	
	


