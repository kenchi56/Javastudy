package Javastudy;

public class Study2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		 x = 300;
//		 y = 300;
	
//		if (x < y) {
//			System.out.println (y);
//		} else if (x > y) {
//			System.out.println (x);
//		} else {
//			System.out.println ("同じです");
//		}

//		if (x == y) {
//			System.out.println ("等しい");
//		} else {
//			System.out.println ("違います");
//		}
		
//		 age = 20;
		
//		if (age < 20) {
//			System.out.println ("未成年です");
//		} else if (age < 30) {
//			System.out.println ("20代です");
//		} else if (age < 40) {
//			System.out.println ("30代です");
//		} else {
//			System.out.println ("40代です");
//		}
		
//		if (age >= 20 && age < 30) {
//			System.out.println ("20代です");
//		} else {
//			System.out.println ("それ以外です");
//		}

		
//		 a = 39;
//		 if (!(a >= 10 && a <= 20)) {
//		  System.out.println ("10から20ではありません");
//		 }
		
	// 課題１
//		int x = 30;
//		int y = 10;
//		
//		if (x + y >= 160) {
//			System.out.println ("優");
//		} else if (x + y >= 140) {
//			System.out.println ("良");
//		} else if (x < 40 || y < 40) {
//			System.out.println ("追試");
//		} else if (x + y >= 100) {
//			System.out.println ("可");
//		} else {
//			System.out.println ("追試");
//		}
		
		
//		String[] subject = {"国語","数学"};
//		int[] score = {"x","y"};
//		
//		if (x + y >= 160) {
//			System.out.println ("優");
//		} else if (x + y >= 140) {
//			System.out.println ("良");
//		} else if (x < 40 || y < 40) {
//			System.out.println ("追試");
//		} else if (x + y >= 100) {
//			System.out.println ("可");
//		} else {
//			System.out.println ("追試");
//		}
		
	// 課題２−１
//		int x = 81;
//		
//		if (x %  2 == 0) {
//			System.out.println ("偶数");
//		} else {
//			System.out.println ("奇数");
//		}
	// 課題２−２
//		int x = -10;
//		
//		if (x % 2 == 0 && x >= 0) {
//			System.out.println ("正の偶数");
//		} else if (x % 2 == 0 && x < 0) {
//			System.out.println ("負の偶数");
//		} else if (x % 2 == 1 && x >= 0) {
//			System.out.println ("正の奇数");
//		} else {
//			System.out.println ("負の奇数");
//		}
		
//		for(int i = 0;i <= 100;i++) {
//			if (i % 3 == 0) {
//				System.out.println (i);	
//			}
//		}
		
//		int i= 0;
//		while(i <100) {
//			System.out.println (i + "回目の繰り返しです");
//			i++;
//		}
//		
			
//		int i = 120;
//		do {
//			System.out.println (i + "回目の繰り返しです");
//			i++;
//		} while (i<100);
		
		//課題１
//		int x = 7;
//	    for(int y = 1; y < 10; y++) {
//	    int z = x * y;
//	    System.out.println(x + "×" + y + "=" + z);
//	        }
//		課題２
//		int x = 1;
//
//		for(int i = 1;i <=8;i++){
//		x *= 2;
//		System.out.println (x);
//		}
		
		//ひし形
//        int x, y;
//        int max = 9;
//        int z = max / 2 + 1;
//        int left = z;
//        int right = z;
//
//        for (x = 1; x <= max; x++) {
//            for (y = 1; y <= max; y++) {
//                if (y >= left && y <= right) {
//                    System.out.print("■");
//                } else {
//                    System.out.print("□");
//                }
//            }
//            System.out.println();
//            if (x < z) {
//                left--;
//                right++;
//            } else {
//                left++;
//                right--;
//            }
//        }
		
//		int siro=4;
//		int kuro=1;
//		//　１～5段目の処理
//		for(int row=1; row<=5; row++) { //　rou=〇段目
//		  for(int i =1; i<=siro ; i++){ //point 一段表示し終えたらiは初期化（１）される。
//		    System.out.print("　□　"); //syso=print にするのに注意
//		    }
//		  for(int i =1;i<=kuro;i++) {
//		    System.out.print("　■　");
//		    }
//		  for(int i =1; i<=siro ; i++){
//		    System.out.print("　□　");
//		    }
//		siro--;
//		  kuro+=2;
//		System.out.print("\n"); //改行 //バックスラッシュになってるの注意
//		 }
//		// 　6～9段目の処理
//		siro=1;
//		kuro=7;
//		 for(int rowb=1;rowb<=4; rowb++) {  //rowb=〇段目（下半分６段目以下）
//		   for(int i =1; i<=siro ; i++){
//		    System.out.print("　□　");
//		    }
//		   for(int i =1;i<=kuro;i++) {
//		    System.out.print("　■　");
//		    }
//		   for(int i =1; i<=siro ; i++){
//		    System.out.print("　□　");
//		    }
//		   siro++;
//		   kuro-=2;
//
//		  System.out.print("\n");  
//		   }
		
	}

}
