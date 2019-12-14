import java.util.Scanner;
import java.util.Random;

class En317{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("（０）グー　（１）チョキ　（２）パー：");
		int u = stdIn.nextInt();

		switch(u){
			case 0:
				System.out.println("あなた：グー");
				break;
			case 1:
				System.out.println("あなた：チョキ");
				break;
			case 2:
				System.out.println("あなた：パー");
				break;
		}

		int x = rand.nextInt(3);

		switch(x){
			case 0:
				System.out.println("CP1：グー");
				break;
			case 1:
				System.out.println("CP1：チョキ");
				break;
			case 2:
				System.out.println("CP１：パー");
				break;
		}
	}
}
