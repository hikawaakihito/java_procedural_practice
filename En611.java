import java.util.Scanner;
import java.util.Random;

class En611{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("要素数：");
		final int n = stdIn.nextInt();
		int[] a = new int[n];

		final int range = 10;
		int[] check = new int[range];

		final int shuffle = 10;

		for(int i = 0;i < range;i++){
			check[i] = i + 1;
		}

		for(int i = 0;i < n;i++){
			do{
				a[i] = rand.nextInt(range) + 1;
			}while(check[a[i] - 1] == -1);
			
			check[a[i] - 1] = -1;

			System.out.println("a[" + i + "] = " + a[i]);
		}

		System.out.println("要素の並びをシャッフルしました。");
		
		for(int i = 0;i < shuffle;i++){
			int idx1 = rand.nextInt(n);
			int idx2 = rand.nextInt(n);
			int temp = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = temp;
		}

		for(int i = 0;i < n;i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}




	}
}
