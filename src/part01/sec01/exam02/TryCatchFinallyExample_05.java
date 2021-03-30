package part01.sec01.exam02;

public class TryCatchFinallyExample_05 {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

		
		try {
			Class clazz = Class.forName("java.lang.String2");
		}catch(Exception e) {		// 어떤 예외가 발생했는지 생각이 안나면 모든 예외의 상위클래스인 Exception을 사용하면된다.
			System.out.println("클래스가 존재하지 않습니다.");
		}
		

	}

}
