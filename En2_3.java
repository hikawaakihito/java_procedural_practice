import java.util.Scanner;

class En2_3{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("値１：");
		int a = stdIn.nextInt();
		
		System.out.println("１０に値１を加えた値は：" + (a + 10) + "\n値１から１０を減じた値は；" + (a - 10));

	}
}


