import java.util.Scanner;
import java.util.Random;

class En427{
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
				String hint = "";

				do{
					System.out.print("10 - 99 の数字を５回以内で当てて下さい：");
					guess = stdIn.nextInt();
				}while(guess < 10 || guess > 99);
				
				if(guess == answer){
				       	System.out.println("正解です！");
				}else{
					hint = guess < answer ? "上" : "下";
				}
				
				int i = 1;
				String error = "";
	Again:
				while(guess != answer){
				
				    	System.out.print(error + "もっと" + hint + "：");
					guess = stdIn.nextInt();
					
					if(guess < 10 || guess > 99){
						error = "(10 - 99の中で)";
						continue Again;
					}else{
						error = "";
						hint = guess < answer ? "上" : "下";
					}
				
					if(guess == answer){
						       	System.out.println("正解です！");
					}
					i++;
					if(i >= 5) break Again;
				}

				if(guess != answer) System.out.println("残念でした。");

				do{
					System.out.print("もう一度しますか？（1）はい（2）やめる：");
					quit = stdIn.nextInt();
				}while(quit != 1 && quit != 2);

			}while(quit == 1);
		}
	}
}

