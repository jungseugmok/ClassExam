
public class Carclasstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Carclass c1 = new Carclass();
		
		Carclass c2 = new Carclass("�ҳ�Ÿ");
		
		System.out.println(c2.getCar());
		
		Carclass c3 = new Carclass("�׷���", 100);
		
		System.out.println("���� : " + c3.getCar() + ","  + " �ӵ��� :" + c3.getSpeed());
		
		c1.setCarclass("������", 150); 
		System.out.println("���� : " + c1.getCar() + ","  + " �ӵ��� :" + c1.getSpeed() );
		
		
		c3.speedUp(100);
		System.out.println(c3.getSpeed());
		
		c3.speedDown(50);
		System.out.println(c3.getSpeed());
		
		
		
			
		
		
		
	}

}
