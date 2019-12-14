import java.util.Scanner;
import java.util.Random;

class En615{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		String[][] day = {{"sunday", "日曜日",}, {"monday", "月曜日",}, {"tuesday", "火曜日",}, {"wednesday", "水曜日",}, {"thursday", "木曜日",}, {"friday", "金曜日",}, {"saturday", "土曜日",},};


		System.out.println("英語の曜日を小文字で入力して下さい。");
		
		int again = 1;

		do{
			int ansid = rand.nextInt(7);
			String guess;

			do{
				System.out.print(day[ansid][1] + "：");
				guess = stdIn.next();
				
				if(day[ansid][0].equals(guess)){
					System.out.print("正解です。");
				}else{
					System.out.println("違います。");
				}
			}while(!(day[ansid][0].equals(guess)));

			System.out.print("もう一度？1… Yes／0… No：");
			again = stdIn.nextInt();

		}while(again != 0);

	}
}
			


