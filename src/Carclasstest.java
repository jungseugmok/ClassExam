
public class Carclasstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Carclass c1 = new Carclass();
		
		Carclass c2 = new Carclass("소나타");
		
		System.out.println(c2.getCar());
		
		Carclass c3 = new Carclass("그렌져", 100);
		
		System.out.println("차명 : " + c3.getCar() + ","  + " 속도는 :" + c3.getSpeed());
		
		c1.setCarclass("말리부", 150); 
		System.out.println("차명 : " + c1.getCar() + ","  + " 속도는 :" + c1.getSpeed() );
		
		
		c3.speedUp(100);
		System.out.println(c3.getSpeed());
		
		c3.speedDown(50);
		System.out.println(c3.getSpeed());
		
		
		
			
		
		
		
	}

}
