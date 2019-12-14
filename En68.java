import java.util.Scanner;

class En68{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		final int n = stdIn.nextInt();
		double[] a = new double[n];

		for(int i = 0;i < n;i++){
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextDouble();
		}

		System.out.print("a = {");
		for(double i : a){
			System.out.print(i + ", ");
		}
		System.out.printf("\b\b}\n");

		double sum = 0, average = 0;
		for(double i : a){
			sum += i;
		}
		average = sum / n;

		System.out.println("合計は：" + sum + "\n平均は：" + average + "\n");

	}
}
