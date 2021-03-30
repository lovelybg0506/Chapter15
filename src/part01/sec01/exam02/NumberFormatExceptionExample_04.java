package part01.sec01.exam02;

public class NumberFormatExceptionExample_04 {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

		int value1 = Integer.parseInt(data1);	// Integer.parseInt(data1) : data1에 있는 값을 정수객체로 만들어줌
		int value2 = Integer.parseInt(data2);	// 이 자체가 숫자로 구성된 문자열을 숫자로 바꿔줌.
		
		int result = value1+value2;
		System.out.println(data1+"+"+data2+"="+result);
		
	}

}
