class En729{
	public static void main(String[] args){
		int[][] a = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				System.out.printf("%5d ", a[i][j]);
			}
			System.out.printf("\n\n");
		}

		System.out.printf("\n\n");

		int[][] b = aryCln2d(a);

		for(int i = 0;i < b.length;i++){
			for(int j = 0;j < b[i].length;j++){
				System.out.printf("%5d ", b[i][j]);
			}
			System.out.printf("\n\n");
		}

	}

	static int[][] aryCln2d(int[][] a){
		int[][] aCln = new int[a.length][];
	        for(int i = 0;i < a.length;i++){
		       aCln[i] = new int[a[i].length];
		       for(int j = 0;j < aCln[i].length;j++){
			       aCln[i][j] = a[i][j];
		       }
		}
		return aCln;
	}
}

		
