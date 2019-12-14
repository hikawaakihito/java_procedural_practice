import java.util.Scanner;

class En423{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("nの値：");
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n;i++){
			for(int j = 1;j <= n * 2 - 1;j++){
				if(j > n - i && j < n + i){
					System.out.print(i);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
