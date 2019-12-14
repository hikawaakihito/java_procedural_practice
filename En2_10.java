import java.util.Scanner;

class En2_10{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("姓；");
		String lname = stdIn.next();

		System.out.print("名；");
		String fname = stdIn.next();

		System.out.println("こんにちは、" + lname + fname + "さん。");
	}
}

