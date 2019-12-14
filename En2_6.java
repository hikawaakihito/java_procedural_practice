import java.util.Scanner;

class En2_6{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("三角形の面積を求めます。\n");
		
		System.out.print("底辺：");
		double base = stdIn.nextDouble();

		System.out.print("高さ：");
		double height = stdIn.nextDouble();

		System.out.printf("面積は%fです。\n",base * height / 2);
	}
}

