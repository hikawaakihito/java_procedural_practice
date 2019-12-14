import java.util.Scanner;

class En619{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("クラス数：");
		int nr = stdIn.nextInt();
		int[][] score = new int[nr][];

		System.out.println();

		for(int i = 0;i < nr;i++){
			System.out.print((i + 1) + "組の人数：");
			int nc = stdIn.nextInt();
			score[i] = new int[nc];

			for(int j = 0;j < nc;j++){
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数：");
				score[i][j] = stdIn.nextInt();
			}

			System.out.println();
		}

		System.out.printf("%3s\t｜\t%s\t%s\n", "組", "合計", "平均");
		System.out.printf("--------＋------------------\n");
		
		int sum = 0;
		double ave = 0.0;
		int sumtotal = 0;
		double avetotal = 0.0;

		for(int i = 0;i < nr;i++){
			for(int j : score[i]){
				sum += j;
			}
			
			ave = (double)sum / score[i].length;
			
			System.out.printf("%2d組\t｜\t%4d\t%2.1f\n", i + 1, sum, ave);

			sumtotal += sum;
			avetotal += ave;

			ave = sum = 0;
		}

		System.out.printf("--------＋------------------\n");
		System.out.printf("%3s\t｜\t%4d\t%2.1f\n", "計", sumtotal, avetotal / nr);
	}
}
		




					
