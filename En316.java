import java.util.Scanner;

class En316{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数A：");
		int a = stdIn.nextInt();
		
		System.out.print("整数B：");
		int b = stdIn.nextInt();

		System.out.print("整数C：");
		int c = stdIn.nextInt();

		int max = a, middle = b, min = c;
		max = a < b ? b : a;
	        max = max < c ? c : max;
		if(b != max && c != max && b < c) middle = c;
		if(a != max && b != max && b < a) middle = a;
		min = c < b ? c : b;
		min = min < a ? min : a;
			

		System.out.printf("昇順に：%d, %d, %d。\n", min, middle, max);

	}
}

