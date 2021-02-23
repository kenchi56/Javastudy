package Javastudy;

public class Study4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//↘️　mainメソッドに書くほう
		
		System.out.println(add(5,10,"数字")); // f　引数３つあり
		
		System.out.println(sanjo(4)); //e　引数＆戻り値あり
		
		int e =sanjo(4);
		System.out.println(e); //　e 変数に代入してもok
		
		hello(3); //d 引数だけ （int）
		
		kon("佐藤"); //c 引数だけ(String)
		
		System.out.println(num());  //b 戻り値だけ
		
		hello();  //a 戻り値、引数ともに無し
		
	}
		// f 引数が複数あるパターン
		  static int add(int x, int y, String s) {
		   System.out.println(s+"を受け取りました。");
		   int i = x+y;
		   return x+y;
		  }

		  // e 戻り値もあって引数もある
		  static int sanjo(int x) {
		   System.out.println(x+"の3乗した値を返したよ");
		   int result = x * x * x;
		   return result;
		 //  return x*x*x;

		  }

		  // d 戻り値はなし。引数あり
		  static void hello(int x) {
		   for (int i = 0; i < x; i++) {
		    System.out.println("こんにちは！");
		   }
		  }

		  // c 戻り値はなし。引数あり
		  static void kon(String name) {
		   System.out.println(name + "さんこんにちは！");
		  }

		  // b戻り値はある。引数なし。呼び出されたら処理を実行して値を返す。
		  static int num() {
		   System.out.println("値をメインに渡しました");
		   int result = 1;
		   for (int i = 1; i <= 8; i++) {
		     result *= 2;
		    }
		   return result;
		   }

		  // a戻り値はなし。引数なし。呼び出されたら実行するだけ
		  static void hello() {
		   System.out.println("hello");
		   System.out.println("こんにちは");
		   System.out.println("おはよう");
		   System.out.println("こんばんは");
		  }
		  
		         
		  // メイン→メソッド 引数 0 or 複数個でもOK
		  // メソッド→メイン 戻り値 0 or 1個(型はなんでも)

		 }

		 
		 // static 戻り値の型 メソッド名（引数の型 変数名）｛
		 //  実行したい処理
		 //  実行したい処理
		 //  実行したい処理
		 //  return 戻したい値 
	

		  
		 

	


