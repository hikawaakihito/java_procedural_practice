import java.util.Scanner;

class En311{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数A：");
		int a = stdIn.nextInt();
		
		System.out.print("整数B：");
		int b = stdIn.nextInt();

		int min = a < b ? a : b;
		int max = a < b ? b : a;

		boolean test = (max - min) <= 10 ? true : false;
		if(test) System.out.println("それらの差は１０以下です。");
		else System.out.println("それらの差は１１以上です。");
	}
}

