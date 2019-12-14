import java.util.Random;
import java.util.Scanner;

class En2_8{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int inNum = stdIn.nextInt();
		
		int x = rand.nextInt(10);
		x = x - 5;

		System.out.println("その値の±５の乱数を生成しました。それは" + (inNum + x) + "です。");
	}
}
