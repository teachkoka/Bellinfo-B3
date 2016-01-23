
public class CardInvalidException extends RuntimeException {
	String number;
	
	CardInvalidException(){
		
	}
	CardInvalidException(String cardNumber){
		number = cardNumber;
	}
	
	public String toString(){
		if(number !=null){
			return "invalid card number entered"+ number +" card number must be of size 16";
		}
		return "invalid card number. Enter valid Card Number of size 16";
	}
}
