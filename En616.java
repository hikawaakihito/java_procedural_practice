import java.util.Scanner;

class En616{
	public static void main(String[] args){

		Scanner stdIn = new Scanner(System.in);

		System.out.println("行列の値を入力してください。");

		int[][] a = new int[4][3];
		int[][] b = new int[3][4];

		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				System.out.print("a[" + i + "][" + j + "]：");
				a[i][j] = stdIn.nextInt();
			}
		}


		for(int i = 0;i < b.length;i++){
			for(int j = 0;j < b[i].length;j++){
				System.out.print("b[" + i + "][" + j + "]：");
				b[i][j] = stdIn.nextInt();
			}
		}

		int[][] seki = new int[4][4];

		for(int i = 0;i < a.length;i++){
			int sum = 0;
			for(int j = 0;j < b[0].length;j++){
				for(int k = 0;k < a[i].length;k++){
					sum += b[k][j] * a[i][k];
				}
				seki[i][j] = sum;
				sum = 0;
			}
		}
		
		System.out.printf("\n\n");
		
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				System.out.printf("%5d ", a[i][j]);
			}
			System.out.printf("\n\n");
		}

		System.out.printf("Ｘ\n\n");

		for(int i = 0;i < b.length;i++){
			for(int j = 0;j < b[i].length;j++){
				System.out.printf("%5d ", b[i][j]);
			}
			System.out.println();
		}

		System.out.printf("＝\n\n");

		for(int i = 0;i < seki.length;i++){
			for(int j = 0;j < seki[i].length;j++){
				System.out.printf("%5d ", seki[i][j]);
			}
			System.out.println();
		}

	

	}
}
			


