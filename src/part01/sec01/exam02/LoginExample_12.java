package part01.sec01.exam02;

class NotExistIDException extends Exception{
	NotExistIDException(){}
	NotExistIDException(String message){
		super(message);
	}
}

class WrongPasswordException extends Exception{
	WrongPasswordException(){}
	WrongPasswordException(String message){
		super(message);
	}
}

public class LoginExample_12 {

	public static void main(String[] args) {
		try {
			login("white","12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue","54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void login(String id, String password)throws NotExistIDException,WrongPasswordException {
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if(!password.equals("12345")){
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}

}
