import java.util.Scanner;

class En31{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数Ａ：");
		int a = stdIn.nextInt();

		System.out.print("整数Ｂ：");
		int b = stdIn.nextInt();

		if(b < a && a % b == 0){
			System.out.println("BはAの約数です。");
		}else{
			System.out.println("BはAの約数ではありません。");
		}
	}
}

