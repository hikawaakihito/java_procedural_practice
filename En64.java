import java.util.Scanner;
import java.util.Random;

class En64{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for(int i = 0;i < n;i++){
			a[i] = rand.nextInt(10);
		}

		int max = a[0];
		for(int i : a){
			max = i > max ? i : max;
		}

		for(int j = max;j >= -2;j--){
			for(int i = 0;i < n;i++){
				if(j > a[i] && j >= 0) System.out.print(" ");
				else if(j <= a[i] && j >= 0) System.out.print("*");
				else if(j == -1) System.out.print("-");
				else System.out.print(i % 10);
			}

			System.out.println();
		}
	}
}


