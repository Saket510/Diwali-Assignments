package study;

public class Calculator {
	static int calculate(int num1, int num2, String operator) throws WrongOperator {
	
		
		switch(operator) {
		case "+": return num1+num2;
		case "-": return num1-num2;
		case "*": return num1*num2;
		case "/": return num1/num2;
		
		default : throw new WrongOperator("Invalid operation");
		
		
		}
		
		

		
	}

	

}
