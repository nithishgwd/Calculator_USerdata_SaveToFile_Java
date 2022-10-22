package nithish_221047018;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

interface MyOperations{
	/** Returns a+b */
	public String add(int a, int b);

	/** Returns a-b */
	public String subtract(int a, int b);

	/** Returns a*b */
	public String multiply(int a, int b);
	
	public String division(int a, int b);

	/** Returns minimum of a and b */
	public String min(int a, int b);

}    


public class Calculator implements MyOperations{
	public static void main(String[] args){
	    Calculator cal = new Calculator();
	    try {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("for addition                : 1");
			System.out.println("for subtraction             : 2");
			System.out.println("for multiply                : 3");
			System.out.println("for division                : 4");
			System.out.println("for minimum of number       : 5");
			System.out.println("Enter your choice here      :  ");
			int c = sc.nextInt(); 
			
			System.out.println("Enter first number : ");
			int x = sc.nextInt();
			System.out.println("Enter second number: ");
			int y = sc.nextInt();
			String data = null;
		
	    	switch(c) {
	    	case 1:
	    		data = cal.add(x, y);
	    		break;
	    	case 2:
	    		data = cal.subtract(x, y);
	    		break;
	    	case 3:
	    		data = cal.multiply(x, y);
	    		break;
	    	case 4:
	    		data = cal.division(x, y);
	    		break;
	    	case 5:
	    		data = cal.min(x, y);
	    		break;
	    	}
	    	sc.close();
	    	try{
	    		File file = new File("data.txt");
	    		FileWriter wr = new FileWriter(file, true);
	            wr.write(data);
	            wr.close();
	    	}
	    	catch(Exception e){
	    		System.out.println("e");
	    	}
	    	
            
            System.out.println(data);
           
	    }
	    catch(InputMismatchException e){
			// show if value is invalid.
			System.out.println("Invalid Input...");}
			catch(ArithmeticException e){
			// show when number is divided by 0.
			System.out.println("Error:Divide By ZERO");
		}

}
	
	public int a;
	public int b;
	public String data;

	public String add(int a, int b) {
		data = "MyOperations - add " + a + " and " + b + " = " + (a+b)+"\n";
		return data;
    }

	public String subtract(int a, int b) {
		data = "MyOperations - subtract " + a + " and " + b + " = " + (a-b)+"\n";
		return data;
	}

	public String multiply(int a, int b) {
		data ="MyOperations - multiply " + a + " and " + b+ " = " + (a*b)+"\n";
		return data;
	}
	
	public String division(int a, int b) {
		data ="MyOperations - multiply " + a + " and " + b+ " = " + (a/b)+"\n";
		return data;
	}

	public String min(int a, int b) {
		int x;
		if (a < b) {
			x = a;
		}
		else
			x = b;
		data = "MyOperations - minimum of " + a + " and " + b+" is "+x+"\n";
		return data;
	}
}

