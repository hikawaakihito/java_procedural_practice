class En733{
	public static void main(String[] args){
		int[][] a2 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
		int[]   a1 = {1, 2, 3, 4, 5};

		printArray(a1);
		printArray(a2);
	}

	static void printArray(int[] a){
		for(int i = 0;i < a.length;i++){
			System.out.printf("%5d ", a[i]);
		}
		System.out.printf("\n\n");
	}

	static void printArray(int[][] b){
		for(int i = 0;i < b.length;i++){
			for(int j = 0;j < b[i].length;j++){
				System.out.printf("%5d ", b[i][j]);
			}
			System.out.printf("\n\n");
		}

	}

}

		
