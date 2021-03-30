package part01.sec01.exam02;

public class MultiCatchExample_09 {

	public static void main(String[] args) {
		try {
			String data1=args[0];
			String data2=args[1];
			
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			
			System.out.println(data1+"+"+data2+"="+result);
		
		
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
		
		}catch(Exception e) {	 
			System.out.println("실행에 문제가 있습니다.");   
		
		}finally {
			System.out.println("다시 실행하세요.");
		}

	}

}

/*
 * if ( 10<5 && 4>1 ) && 연산은 앞부분 결과가 false이므로 뒷부분은  체크하지 않는다.
 * if ( 10<5 & 4>1 ) 무조건 둘다 체크.
 */