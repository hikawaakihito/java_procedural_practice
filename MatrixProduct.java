/**
 * このプログラムは数値の行列の乗算を行います。行列の数、行数、列数、値は任意です。
 * また、整数もしくは実数を選択できます。コンソール画面に結果を表示します。
 *
 * 主にJavaの基本（oopなしで）とアルゴリズムを練習するために作ったプログラムですので、
 * 入力チェックを厳しくしておりません。文字を入力したりするとエラーになります。　
 * */

import java.util.Scanner;

class MatrixProduct{
	//複数のメソッドで使用できるようにここで生成します。
	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args){
		//整数か実数を意味する値を入力によって受ける変数です。
		int iord;
		//最初の説明を表示します。
		System.out.println("2～5個までの行列の積を求めます。\n行列数は10 x 10まで、" +
			"各要素の値は-10 ～ 10まで受け付けできます。");
		
		//何回も最初からできるようにします。
		do{
			//入力された数値は範囲外であればエラーメッセージを受ける変数です。
			String error0 = "";
			//整数か実数のiordの入力チェックです。
			do{
				System.out.print(error0 + "整数… 1／実数… 2：");
				iord = stdIn.nextInt();
				error0 = "（1か2）";
			}while(iord != 1 && iord != 2);
			
			//行列の数を入力によって受ける変数です。
			int nm;
			//入力エラーメッセージです。
			String error1 = "";
			//入力チェックです。
			do{
				System.out.print(error1 + "行列を何個乗算しますか？");
				nm = stdIn.nextInt();
				error1 = "（2～5まで）";
			}while(nm < 2 || nm > 5);

			/*
			 * mai, mad：後で入力される二次元の行列を格納する配列、
			 * つまり三次元配列を一応整数のためにも実数のためにも用意します。
			 * prodi, prodd：積を格納していく作業用の三次元配列
			 * も生成しておきます。
		 	 */
			int[][][] mai = new int[nm][][];
			int[][][] prodi = new int[nm -1][][];
			double[][][] mad = new double[nm][][];
			double[][][] prodd = new double[nm - 1][][];
		
			if(iord == 1){//（整数）
				//すべての行列の入力を行います。
			       	inMatrix(mai, nm);
				//行列の積を求めます。
				matrixProd(mai, prodi, nm);
				//入力された行列全てと、最後の積を表示します。
				printMatAll(mai, prodi, nm);
			}else{//（実数）
				inMatrix(mad, nm);
				matrixProd(mad, prodd, nm);
				printMatAll(mad, prodd, nm);
			}
		}while(confirmRetry());
	}
	
	//行列の入力を行います。maは行列の配列です。nmは行列の数です。
	static void inMatrix(int[][][] ma, int nm){
		//列数を入力によって受けるための変数です。
		int nc1 = 0;
		int nc2 = 0;
		boolean rcmatch;
		
		//行列の個数分だけ入力を行います。
		for(int i = 0; i < nm;i++){
			/*最初の行列だけは行数も列数も指定し、２つ目以降は行数が一個前の列数と一致していないと基本的な乗算がでません
			 *ので、２つ目以降は列数のみを指定させます。その旨のメッセージを表示します。
			 */
			if(i > 0) System.out.println("行列" + (i + 1) + "の行数は行列" + i + "の列数と一致しなければなりません。" + 
					"列数のみ入力して下さい。");

			/*偶数目の行列かどうか判断します。これによって、nc1とnc2を交代交代で使って、列数を入力させます。
			 *それで入力を行わないで一個前の列数を現在の行数にできます。
			 *
			 *～例～
			 *1個目：(行数1)nc2 = 4(入力）, (列数1)nc1 = 3(入力）
			 *2個目：(行数2)nc1 = 3 , (列数2)nc2 = 5(入力)
			 *3個目：(行数3)nc2 = 5 , (列数3)nc1 = 2(入力)
			 *　
			 */
			if(i % 2 == 0){
				//最初の行列の場合は行数から入力させます。
				if(i == 0){
					String error2 = "";
					do{
						System.out.print(error2 + "行列" + (i + 1) + "の行数：");
						nc2 = stdIn.nextInt();
						error2 = "（１～１０)";
					}while(nc2 < 1 || nc2 > 10);
				}
				String error3 = "";
				do{
					System.out.print(error3 + "行列" + (i + 1) + "の列数：");
					nc1 = stdIn.nextInt();
					error3 = "（１～１０)";
				}while(nc1 < 1 || nc1 > 10);

				ma[i] = new int[nc2][nc1];
			}else{
				String error3 = "";
				do{
					System.out.print(error3 + "行列" + (i + 1) + "の列数：");
					nc2 = stdIn.nextInt();
					error3 = "（１～１０)";
				}while(nc2 < 1 || nc2 > 10);

				ma[i] = new int[nc1][nc2];
			}
			//一つの行列の行数と列数が決まったら、値を入力させます。
			getValues(ma[i], i);
		}
	}

	//多重定義です。実数版で上記と同じです。
	static void inMatrix(double[][][] ma, int nm){
		int nc1 = 0;
		int nc2 = 0;
		boolean rcmatch;
		
		for(int i = 0; i < nm;i++){
			if(i > 0) System.out.println("行列" + (i + 1) + "の行数は行列" + i + "の列数と一致しなければなりません。" + 
					"列数のみ入力して下さい。");
			if(i % 2 == 0){
				if(i == 0){
					String error2 = "";
					do{
						System.out.print(error2 + "行列" + (i + 1) + "の行数：");
						nc2 = stdIn.nextInt();
						error2 = "（１～１０)";
					}while(nc2 < 1 || nc2 > 10);
				}
				String error3 = "";
				do{
					System.out.print(error3 + "行列" + (i + 1) + "の列数：");
					nc1 = stdIn.nextInt();
					error3 = "（１～１０)";
				}while(nc1 < 1 || nc1 > 10);

				ma[i] = new double[nc2][nc1];
			}else{
				String error3 = "";
				do{
					System.out.print(error3 + "行列" + (i + 1) + "の列数：");
					nc2 = stdIn.nextInt();
					error3 = "（１～１０)";
				}while(nc2 < 1 || nc2 > 10);

				ma[i] = new double[nc1][nc2];
			}

			getValues(ma[i], i);
		}
	}
	
	//行列の値を読み込みます。maは行列です。hは行列の順番を表す番号です。
	static void getValues(int[][] ma, int h){
		for(int i = 0;i < ma.length;i++){
			for(int j = 0;j < ma[i].length;j++){
				do{
					System.out.print("行列" + (h + 1) + "[" + (i + 1) + "][" + (j + 1) + "]：");
					ma[i][j] = stdIn.nextInt();
				}while(ma[i][j] < -10 || ma[i][j] > 10);
			}
		}
	}
	
	//上記の実数版です。同じです。
	static void getValues(double[][] ma, int h){
		for(int i = 0;i < ma.length;i++){
			for(int j = 0;j < ma[i].length;j++){
				do{
					System.out.print("行列" + (h + 1) + "[" + (i + 1) + "][" + (j + 1) + "]：");
					ma[i][j] = stdIn.nextDouble();
				}while(ma[i][j] < -10.0 || ma[i][j] > 10.0);
			}
		}
	}
	
	//行列の積を求めます。maは入力済みの行列の配列です。prodは行列の積を格納していく配列です。nmは行列の数です。
	static void matrixProd(int[][][] ma, int[][][] prod, int nm){
		//まずは最初の積の行数と列数を設定します。最初の二つの入力済み行列によります。
		prod[0] = new int[ma[0].length][ma[1][0].length];
		//次はそれからの積の行数と列数を設定します。一個前の積と、一個先の入力済み行列によります。
		for(int i = 1; i < nm - 1;i++){
			prod[i] = new int[prod[i -1].length][ma[i + 1][0].length];
		}
		//hは入力済み行列の配列と、積の行列の配列を走査します。
		for(int h = 0;h < nm - 1;h++){
			/*最初だけは入力済み行列　×　入力済み行列で、2回目からは
			 *積の行列　×　入力済み行列ですので、2回目から(左の項の）行列への参照を切り替えられる
			 *ように変数を用意します。
			 */
			int[][] pointer;
			if(h == 0) pointer = ma[h];
			else pointer = prod[h - 1];
			//左の項の行列の行数を走査します。
			for(int i = 0;i < pointer.length;i++){
				//値の積の総和を格納する変数です。
				int sum = 0;
				//右の項の行列の列数を走査します。
				for(int j = 0;j < ma[h + 1][0].length;j++){
					/*右の項の行列のある列の行数を走査しながら、左の項の行列のi行k列の値
					 *と右の項の行列のk行j列の値の積を求めて、総和に足します。
					 */
					for(int k = 0;k < ma[h + 1].length;k++){
						sum += pointer[i][k] * ma[h + 1][k][j];
					}
					//総和を積の行列に格納し、総和変数をリセットします。
					prod[h][i][j] = sum;
					sum = 0;
				}
			}
		}
	}

	//上記の実数版です。同じです。
	static void matrixProd(double[][][] ma, double[][][] prod, int nm){
		prod[0] = new double[ma[0].length][ma[1][0].length];
		for(int i = 1; i < nm - 1;i++){
			prod[i] = new double[prod[i -1].length][ma[i + 1][0].length];
		}
		for(int h = 0;h < nm - 1;h++){
			double[][] pointer;
			if(h == 0) pointer = ma[h];
			else pointer = prod[h - 1];
			for(int i = 0;i < pointer.length;i++){
				double sum = 0;
				for(int j = 0;j < ma[h + 1][0].length;j++){
					for(int k = 0;k < ma[h + 1].length;k++){
						sum += pointer[i][k] * ma[h + 1][k][j];
					}
					prod[h][i][j] = sum;
					sum = 0;
				}
			}
		}
	}

	//入力済み行列と最後の積の行列を表示します。maは入力済み行列、prodは積の行列です。nmは行列の数です。
	static void printMatAll(int[][][] ma, int[][][] prod, int nm){
		System.out.printf("\n\n");
		
		for(int h = 0;h <= nm;h++){
			/*最後だけは積の行列を表示しますので、切り替え用の変数を用意します。
			 *hが入力済み行列の配列maの終わりを過ぎたら、最後に最後の積を参照します。
			 */
			int[][] pointer = h < nm ? ma[h] : prod[h - 2];
			for(int i = 0;i < pointer.length;i++){
				for(int j = 0;j < pointer[i].length;j++){
					System.out.printf(" %7d ", pointer[i][j]);
				}
				System.out.printf("\n\n");
			}
			
			if(h < nm -1) System.out.printf("　Ｘ\n\n");
			else System.out.printf((h == nm - 1 ? "　＝" : "") + "\n\n");
		}
	}
	
	//上記の実数版です。同じです。
	static void printMatAll(double[][][] ma, double[][][] prod, int nm){
		System.out.printf("\n\n");
		
		for(int h = 0;h <= nm;h++){
			double[][] pointer = h < nm ? ma[h] : prod[h - 2];
			for(int i = 0;i < pointer.length;i++){
				for(int j = 0;j < pointer[i].length;j++){
					System.out.printf(" %7.2f ", pointer[i][j]);
				}
				System.out.printf("\n\n");
			}
			
			if(h < nm -1) System.out.printf("　Ｘ\n\n");
			else System.out.printf((h == nm - 1 ? "　＝" : "") + "\n\n");
		}
	}
	
	//もう一度行列の乗算を行うか確認します。しないならプログラムは終了します。
	static boolean confirmRetry(){
		int retry;
		do{
			System.out.print("もう一度しますか?（１）はい　（２）やめる：");
			retry = stdIn.nextInt();
		}while(retry != 1 && retry != 2);

		if(retry == 1) return true;
		else return false;
	}

}
			


