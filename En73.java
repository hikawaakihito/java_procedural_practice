import java.util.Scanner;

class En73{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");
		int a = stdIn.nextInt();

		System.out.print("整数b：");
		int b = stdIn.nextInt();


		System.out.print("整数c：");
		int c = stdIn.nextInt();

		int median = med(a, b, c);

		System.out.println("中央値は：" + median);

	}

	static int med(int a, int b, int c){
		int median = a;
		if(a < b && b <= c) median = b;
		if(a > b && b >= c) median = b;
		if(a < c && c < b) median = c;
		if(a > c && c > b) median = c;

		return median;
	}
}
