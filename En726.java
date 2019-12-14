import java.util.Scanner;

class En726{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] a = {5, 5, 5, 5, 5,};

		System.out.print("配列aの値は：\n");
		
		for(int i = 0;i < a.length;i++){
			System.out.print((i == 0 ? "a{" : "") + a[i] + (i == a.length - 1 ? "}\n" : ", "));
		}

		System.out.print("挿入する値：");
		int x = stdIn.nextInt();

		System.out.print("挿入する位置（１から)：");
		int idx = stdIn.nextInt();

		int[] b = arrayIns(a, idx, x);

		for(int i = 0;i < b.length;i++){
			System.out.print((i == 0 ? "b{" : "") + b[i] + (i == b.length - 1 ? "}\n" : ", "));
		}
	}

	static int[] arrayIns(int[] a, int idx, int x){
		int[] aIns = new int[a.length + 1];

		for(int i = a.length;i >= idx;i--){
			aIns[i] = a[i - 1];
		}

		aIns[idx - 1] = x;

		for(int i = idx - 2;i >= 0;i--){
			aIns[i] = a[i];
		}

		return aIns;
	}
}


