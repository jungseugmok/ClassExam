
public class PersonText {

	public static void main(String[] args) {
		// Person 클래스 테스트
		// 오버로딩된 생성자가 있을경우 디폴트 생성자도 구현해야 함(내용 없어도 됨)
		Person hu1 = new Person(); //디폴트 생성자
		Person hu2 = new Person("정승목"); //매개변수 1개 생성자
		Person hu3 = new Person("정영하" , 180 , 88);
		
		System.out.println(hu3.getName());
				
		System.out.println(hu3.getHeight());
		
		System.out.println(hu3.getWeight());
		
		
		hu3.setPerson("정영하", 180, 88);
		System.out.println(hu3.getHeight());
		
		
		
		hu1.setPerson("김신", 150, 48); //객체 수정
		System.out.println(hu1.getName());
		
		
	
	
	
	}

}
