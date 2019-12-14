class En715{
	public static void main(String[] args){
		int[] a = {5, 5, 5, 5,};

		int sum = sumOf(a);

		System.out.printf("配列aの要素の合計は：%d\n", sum);

	}

	static int sumOf(int[] a){
		int sum = 0;

		for(int i : a){
			sum += i;
		}

		return sum;
	}
}
