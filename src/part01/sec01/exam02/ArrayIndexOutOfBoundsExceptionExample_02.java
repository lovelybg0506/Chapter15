package part01.sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample_02 {

	public static void main(String[] args) {
//		String data1 = args[0];
//		String data2 = args[1];
		

		if(args.length == 2) {
//			System.out.println("args[0]: "+data1);
//			System.out.println("args[1]: "+data2);
			System.out.println("args[0]: "+args[0]);
			System.out.println("args[1]: "+args[1]);
		}else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("값1 값2");
		}
		
	}

}
