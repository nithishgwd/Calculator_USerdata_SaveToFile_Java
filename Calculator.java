package nithish_221047018;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalTime;

interface MyOperations{
	// Returns a+b 
	public String add(int a, int b);

	// Returns a-b 
	public String subtract(int a, int b);

	// Returns a*b 
	public String multiply(int a, int b);
	
	public String division(int a, int b);

	// Returns minimum of a and b 
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
			//Asking user type of operation
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
	    	int j;
	    	String s = "";
	    	LocalTime i;
	    	try{
	    		//Creating Data file
	    		File file = new File("data.txt");
	    		//Saving user data without loosing old data
	    		FileWriter wr = new FileWriter(file, true);
	    		
	    		//Time for Reference 
	    		i=java.time.LocalTime.now();
	            
	            wr.write(i.toString());
	            wr.write("\n");
	            wr.write(data);
	            wr.write("\n");
	            wr.close();
	            
	            //Reading the data from file with previous history
	            FileReader f2r = new FileReader("data.txt");
	            while((j=f2r.read())!=-1) {
	                s += (char)j;
	            }
	            System.out.println("\nFile data history: \n");
	            System.out.println(s);
	            f2r.close();
	    	}
	    	catch(Exception e){
	    		System.out.println("e");
	    	}
	    	
            
            //System.out.println(data);
           
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

