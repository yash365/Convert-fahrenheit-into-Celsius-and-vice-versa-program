import java.util.Scanner;

class ConvertTempr {
	public static void main(String args[]){
		double temp;
		
		System.out.println("Enter temperature in fahrenheit: ");
		Scanner input = new Scanner(System.in);
		temp = input.nextDouble();
		convertC(temp);           // method() to convert fahrenheit into Celsius
		
		System.out.println("Enter temperature in Celsius: ");
		temp = input.nextDouble();
		convertF(temp);				// method() to convert celsius into fahrenhiet
		
		input.close();      		// to close the input object of Scanner class
	}
	
		static void convertC (double t) {
			double f,c;
			f = t;
			c = (f-32)/1.8;                    // formula to convert fahrenheit to celsius
			System.out.println("Temperature in Celsius: " + c);			
		}
		
		static void convertF (double t) {
			double f,c;
			c = t;
			f = (1.8 * c) + 32;					// formula to convert celsius to fahrenheit
			System.out.println("Temperature in Fahrenheit: " + f);			
		}
}
