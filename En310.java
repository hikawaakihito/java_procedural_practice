import java.util.Scanner;

class En310{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数A：");
		int a = stdIn.nextInt();
		
		System.out.print("整数B：");
		int b = stdIn.nextInt();

		int min = a < b ? a : b;
		int max = a < b ? b : a;

		System.out.printf("その差は%dです。\n", max - min);
	}
}

