import java.util.Scanner;

class En418{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("nの値：");
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n;i++){
			System.out.printf("%dの２乗は%f\n", i, Math.pow(i, 2));
		}
	}
}
