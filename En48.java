import java.util.Scanner;

class En48{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int x = stdIn.nextInt();
		
		int j = 1;
		for(int k = 1;k <= x;k++){
			j *= k;
		}
		
		int y = 0;
		int i = 0;
		while(x > 0){
			y *= 10;
			y += x % 10;
			x /= 10;
			i++;
		}

		System.out.println("その値の桁の順番を逆にした値は：" + y);
		System.out.println("その値の桁数は：" + i);
		System.out.println("その値の階乗は：" + j);
	}
}
			 
