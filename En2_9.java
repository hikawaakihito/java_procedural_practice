import java.util.Random;

class En2_9{
	public static void main(String[] args){
		Random rand = new Random();
		
		double x; 
		boolean pl_mi;
		
		for(int i = 10;i > 0; i--){
			x = rand.nextDouble();
			pl_mi = rand.nextBoolean();
			
			if(pl_mi) x = -x;

			System.out.println("乱数；" + x);
		}
	}
}
