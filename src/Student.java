
public class Student {
	//��� ����
	int studentID;
	String studentName;
	int grade;
	String address;
	//������
	
	//�����ε��� ������
	
	//�޼���
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
		return;
		
	}
	//�����ε��� �޼���
	//������(main), �ü������ ���α׷� ȣ��
	public static void main(String args[]) {
		//Ŭ������ ������ = new ������()
		Student st1 = new Student();  //��ü����
		st1.setStudentName("���¸�");
		
		System.out.println(st1.studentName); //�ɹ����� ���
		System.out.println(st1.getStudentName()); //�ż��带 Ȱ���ؼ� ���
	}
	
	
}
// �� �� ���� ������� ȿ��