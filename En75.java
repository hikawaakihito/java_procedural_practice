import java.util.Scanner;
import java.util.Random;

class En75{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("表示しますか？１… Yes／２… No");
		int yn = stdIn.nextInt();

		if(yn == 1){
			if(checknumber()){
				System.out.println("positive");
			}
		}


	}

	static boolean checknumber(){
		System.out.printf("整数値：");
		Scanner stdIn = new Scanner(System.in);
		int n;
		do{
			n = stdIn.nextInt();
		}while(n <= 0);

		return true;
	//	goodbye();

	}

	static void goodbye(){
		Random rand = new Random();
		int r = rand.nextInt(99 - 10) + 10;
		System.out.println(r);
		System.out.println("bye");

		return;
	}
}
