import java.util.Scanner;
import java.util.Random;

class En613{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("要素数：");
		final int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		final int range = 100;
		int[] check = new int[range];

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

		for(int i = 0;i < n;i++){
			//b[i] = rand.nextInt(range) + 1;
			System.out.println("b[" + i + "] = " + b[i]);
		}

		System.out.println("要素をコピーしました。");
		
		for(int i = 0;i < n;i++){
			b[i] = a[i];
		}

		for(int i = 0;i < n;i++){
			System.out.println("b[" + i + "] = " + b[i]);
		}




	}
}
