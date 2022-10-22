package nithish_221047018;

interface ICalculator{

/** Returns a+b */
public int add(int a, int b);

/** Returns a-b */
public int subtract(int a, int b);

/** Returns a*b */
public int multiply(int a, int b);

/** Returns minimum of a and b */
public int min(int a, int b);

/** Calculate cross sum */
public int crosssum(int a);
}    


public class File implements ICalculator {
	public static void main(String[] args) {
	     File cal = new File();
	
	     cal.add(5, 4);
	     cal.subtract(6, 0);
	     System.out.println(cal.add(5,4));
}
public int a;
public int b;


public int add(int a, int b) {
    System.out.println("ICalculator - add " + a + " und " + b);
    return a + b;
    }

public int subtract(int a, int b) {
    System.out.println("ICalculator - subtract " + a + " und " + b);
    return a - b;
}

public int multiply(int a, int b) {
    System.out.println("ICalculator - multiply " + a + " und " + b);
    return a * b;
}

public int min(int a, int b) {
    System.out.println("ICalculator - min " + a + " und " + b);
    if (a < b)
        return a;
    else
        return b;
}

public int crosssum(int a) {
    System.out.println("ICalculator - crosssum " + a);
    int sum = 0;
    while (0 != a) {
        sum = sum + (a % 10);
        a = a / 10;
    }
    return sum;
}
}
