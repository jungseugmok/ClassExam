
public class PersonText {

	public static void main(String[] args) {
		// Person Ŭ���� �׽�Ʈ
		// �����ε��� �����ڰ� ������� ����Ʈ �����ڵ� �����ؾ� ��(���� ��� ��)
		Person hu1 = new Person(); //����Ʈ ������
		Person hu2 = new Person("���¸�"); //�Ű����� 1�� ������
		Person hu3 = new Person("������" , 180 , 88);
		
		System.out.println(hu3.getName());
				
		System.out.println(hu3.getHeight());
		
		System.out.println(hu3.getWeight());
		
		
		hu3.setPerson("������", 180, 88);
		System.out.println(hu3.getHeight());
		
		
		
		hu1.setPerson("���", 150, 48); //��ü ����
		System.out.println(hu1.getName());
		
		
	
	
	
	}

}
