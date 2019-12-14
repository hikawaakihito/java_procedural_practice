import java.util.Scanner;

class En714{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		do{
			System.out.print("整数：");
			int x = stdIn.nextInt();
			System.out.print("ビット目：");
			int pos = stdIn.nextInt();
			System.out.print("ビット数：");
			int n = stdIn.nextInt();
			
			int setx = setN(x, pos, n);
			int resetx = resetN(x, pos, n);
			int inversex = inverseN(x, pos, n);
		
			System.out.println("１にセット：" + setx);
			System.out.println("０にリセット：" + resetx);
			System.out.println("反転：" + inversex);
		}while();
	}

	static int setN(int x, int pos, int n){
		int mask = (int)Math.pow(2, n) - 1;
		mask <<= pos - 1;

		return x | mask;
	}

	static int resetN(int x, int pos, int n){
		int mask = (int)Math.pow(2, n) - 1;
		mask <<= pos - 1;
		mask &= x;

		return x ^ mask;
	}

	static int inverseN(int x, int pos, int n){
		int mask = (int)Math.pow(2, n) - 1;
		mask <<= pos - 1;

		return x ^ mask;
	}
}
