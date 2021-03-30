package part01.sec01.exam02;

public class CatchOrderExample_08 {

	public static void main(String[] args) {
		try {
			String data1=args[0];
			String data2=args[1];
			
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			
			System.out.println(data1+"+"+data2+"="+result);
		
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
		
		}catch(Exception e) {	// number예외뿐이 아니라 문자열로 잘못넣거나 다른 예외일경우를 대비해서 좀 더 포괄적인 Exception을쓴다.
			System.out.println("실행에 문제가 있습니다.");  //하지만 Exception이 가장 상위클래스라 가장마지막에 검사하도록 마지막에쓴다.
		
		}finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
