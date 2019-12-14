import java.util.Scanner;

class En424{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		int i = 2;
		while(i <= n / 2){
			if(n % i++ == 0){
				System.out.println("その値は素数ではありません。");
				break;
			}
		}

		if(i >= n / 2 + 1) System.out.println("その値は素数です。");
	}
}
