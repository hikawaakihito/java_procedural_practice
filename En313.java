import java.util.Scanner;

class En313{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数A：");
		int a = stdIn.nextInt();
		
		System.out.print("整数B：");
		int b = stdIn.nextInt();

		System.out.print("整数C：");
		int c = stdIn.nextInt();

		int max = a, middle = b, min = c;
		if(a < b) max = b;
		if(a < b && b < c) max = c;
		if(max != a && a < c) min = a;
		if(max != a && c < a) min = c;
		if(b < c && b < a) min = b;
		if((max != c) && (min != c)) middle = c;
		if((max != b) && (min != b)) middle = b;
		if((max != a) && (min != a)) middle = a;


		System.out.println("中央値は：" + middle + "です。");

	}
}

