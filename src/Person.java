
public class Person {

	String name;
	int height;
	int weight;
	
	
	//�����ڰ� �Ѱ��� ������� ����Ʈ �����ڰ� ������
	
	
	
	//������ �ۼ���Ģ
	//Ŭ������� ����
	//��ȯŸ���� ����(��������)
	//��������� ����Ʈ ������ �ʿ�
	public Person() {
		
	}
	
	//�����ε��� ������
	public Person(String pName) {  //������ �̸��� �����ϸ鼭 �Ű����� �ٸ� (����, Ÿ��, ����)
		name = pName;
	}
	
	public Person(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
	//�ż���
	public String getName() {
		return name;
	}

	//Ű�� �����Ը� ���� �����Ҽ� �ִ� �޼��� �߰�
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}	
		
			
	//����, Ű ������ �ѹ��� �����Ҽ� �ִ� �޼��� �߰� 
	
	public void setPerson(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
		return;
	}
	
	
}
