class En61{
	public static void main(String[] args){
		double[] a = new double[5];
		double[] b = new double[10];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		for(double i : a) 
			System.out.println(i);

		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}

		for(int i = 0;i < a.length;i++){
			a[i] = (i + 1) / 10.0 + (i + 1);
			System.out.println(a[i]);
		}
	}
}
