import java.util.Scanner;
import java.util.Random;

class En42{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int quit;

		do{
		System.out.print("数字当てゲーム：（1）始める（2）やめる：");
		quit = stdIn.nextInt();
		}while(quit != 1 && quit != 2);
		
		if(quit == 1){

			do{
				int a1 = rand.nextInt(10);
				int a2 = rand.nextInt(10);
				int answer = a1 + a2 * 10;
				int guess;

				do{
					System.out.print("10 - 99 の数字を当てて下さい：");
					guess = stdIn.nextInt();
				}while(guess < 10 || guess > 99);
				
				if(guess == answer){
				       	System.out.println("正解です！");
				}
			
				while(guess != answer){
					String hint = guess < answer ? "上" : "下";
				
					do{
					    	System.out.print("もっと" + hint + "：");
						guess = stdIn.nextInt();
					}while(guess < 10 || guess > 99);
				
					if(guess == answer){
						       	System.out.println("正解です！");
					}
				}

				do{
					System.out.print("もう一度しますか？（1）はい（2）やめる：");
					quit = stdIn.nextInt();
				}while(quit != 1 && quit != 2);

			}while(quit == 1);
		}
	}
}

