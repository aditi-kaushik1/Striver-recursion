import java.util.*;

class Main {
	public static void main(String args[]) {
		//printName("Aditi", 1);
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//printTillN(1, n);
        //printFromN(10);
        //printTillNBacktracking(1, 3);
        //printFromNBacktracking(1, 3);
        //sumTillN(5, 0);
        factorial(4);
	}
    
    public static void 
    
    public static void sumTillN(int n, int sum) {
        if(n < 1) {
            System.out.println(sum);
            return;
        }
        sumTillN(n - 1, sum + n);
    }
    
    public static void printFromNBacktracking(int end, int start) {
        if(start < end)
            return;
        printFromNBacktracking(end + 1, start);
        System.out.println(end);
    }
	
	public static void printName(String name, int count) {
		if(count > 5)
			return;
		System.out.println(name + count);
		printName(name, ++count);
	}
	
	public static void printTillN(int current, int n) {
		if(current > n)
			return;
		System.out.println(current++);
		printTillN(current, n);
	}
    
    public static void printFromN(int current) {
        if(current < 1)
            return;
        System.out.println(current--);
        printFromN(current);
    }
    
    public static void printTillNBacktracking(int start, int end) {
        if(start > end)
            return;
        printTillNBacktracking(start, end - 1);
        System.out.println(end);
    }
}
