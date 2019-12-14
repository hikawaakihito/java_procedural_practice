import java.util.Scanner;

class En37{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int a = stdIn.nextInt();

		if(a % 3 == 0){
			System.out.println("その値は3で割り切れます。");
		}else{
			int r = a % 3;
			System.out.printf("その値を３で割ったあまりは%dです。", r);
		}
	}
}

