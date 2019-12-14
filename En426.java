import java.util.Scanner;

class En426{

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか：");
		int n = stdIn.nextInt();

		int sum = 0;
		for(int i = 0;i < n;i++){
			System.out.print("整数：");
			int t = stdIn.nextInt();
			if(t < 0){
				System.out.println("負の数は加算しません。");
				continue;
			}
			sum += t;
		}

		double ave = sum / 2.0;

		System.out.printf("合計は%d、平均は%.2fです。\n", sum, ave);
	}
}
