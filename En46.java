import java.util.Scanner;

class En46{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int x;
		do{
			System.out.print("何個表しますか：");
			x = stdIn.nextInt();
		}while(x < 1);

		for(int i = 1;i <= x;i++){
			if(i % 2 == 0) System.out.print("+");
			else System.out.print("*");
		}

		System.out.println();

	}
}
