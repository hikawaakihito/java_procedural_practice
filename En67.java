import java.util.Scanner;
import java.util.Random;

class En67{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		final int n = 12;
		int[] a = new int[n];
		
		for(int i = 0;i < n;i++){
			a[i] = rand.nextInt(10);
		}

		System.out.print("配列aの全要素の値\n{ ");
		for(int i : a){
			System.out.print(i + " ");
		}
		System.out.println("}");

		System.out.print("探す数値：");
		int key = stdIn.nextInt();

		int i;
		for(i = n - 1;i >= 0;i--){
			if(a[i] == key)
			       	break;
		}

		if(i >= 0){
			System.out.println("それはa[" + i + "]にあります。");
		}else{
			System.out.println("それはありません。");
		}

	}
}
