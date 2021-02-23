package Javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		int maxNum = 5;
//		String[] names = {"青木","井上","太田","加藤","佐藤"};
//		for(int num=0;num<maxNum;num++) {
////			System.out.print(names[num]+"くんいる？");
//			System.out.print(names[2] + "さん");
//		}
		
//		Scanner scan = new Scanner(System.in); 
//		int num = scan.nextInt();  
//		System.out.println(num* 100);
//		String z = scan.nextLine(); //でString型の代入可能
//		System.out.println(z + "さんこんにちは");
		
//		Random ran = new Random();
//		 int num2 = ran.nextInt(3)+1; 
//		 System.out.println(num2);
		
		
//		Scanner scan = new Scanner(System.in); 
//		int num = scan.nextInt();  
//		Random ran = new Random();
//		int num2 = ran.nextInt(3); 
//		if (num == num2) {
//			System.out.print("あたり");
//		} else {
//			System.out.print("はずれ");
//		}
//		System.out.print(num2);
		
		//課題1
//		2つの1~10のランダムな数字の合計値が11以上かどうかを予測して入力「あたり」「はずれ」を表示
//		(11以上の時:1 ,  11以下の時:2 で入力など)
		
//		Scanner scan = new Scanner(System.in); 
//		 int num = scan.nextInt();
//		Random ran = new Random();
//		 int num1 = ran.nextInt(9)+1;
//		 int num2 = ran.nextInt(9)+1;
//		 int sum = num1 + num2;
//		 if (sum < 11 && num == 2) {
//			 System.out.println("あたり");
//		 } else if(sum > 11 && num == 1) {
//			 System.out.println("あたり");
//		 } else {
//			 System.out.println("はずれ");
//		 }
//		     System.out.println(num1);
//		     System.out.println(num2);
//		     System.out.print("合計は" + sum);
		
		//課題２
//		数字の入力を5回繰り返して、合計した値を表示させる
//		※s.nextInt　の記述は1回だけ
		
//		Scanner scan = new Scanner(System.in); 
//			System.out.println("数値を入力してください");
//			int sum = 0;
//			for (int i = 0; i < 5; i++) {
//			System.out.print(i + 1 + "つ目の数値 = ");
//			sum += scan.nextInt();
//			}
//			System.out.println("合計 = " + sum);
		
		
		
//			int num = scan.nextInt(); 
//			int total = 0;
//			  for(int i=  1;i < 5;i++) {
//				  total = total + i;
//			  }
//			   System.out.print(total);
//		int total = 0;
//		for(int i = 1;i < 5;i++){
//			total = num + i;
//        }
//		System.out.println(total);
		
//			long count; 
//			count = 0;
//			for(int i = 0; i < 5; i++) if('x' == num.int(i)) count++;
//			System.out.println("5. count = " + count);
			
//			   int i = 0;
//			   int num = i++;
//			   int sum=0;
//
//			    while(true) {
//			      // 入力
//			      System.out.println("数値を入力してください");
//			      i = scan.nextInt();
//
//			       // 入力が負の時は，break文によってwhile文から抜ける．
//			      if( i < 5) break;
//
//			      // sumにnumの値を足し込む
//			      sum=sum+num;
//			    }
//			     // 表示する
//			    System.out.println("合計は"+sum+"です");
		
		
		//  [問題] 0(表),1(裏)を10回入力してその回数を表示する
		
//			Scanner scan = new Scanner(System.in);
//			System.out.println("数値を入力してください");
//			int omote = 0;  //表の回数
//			int ura = 0;    //裏の回数
//			for (int i = 0;i < 10;i++) {
//				int num = scan.nextInt(2); //数値入力
//				if(num == 0) {
//					System.out.println();
//					omote++;
//				} else {
//					System.out.println();
//					ura++;	
//				}
//			}
//					System.out.println("表は" + omote + "回");
//					System.out.println("裏は" + ura + "回");
		
		//課題
		//①おみくじで大吉が出るまで引き続ける(random使用)
		//②何回引いたかを出す
		
        Random rand=new Random();
        System.out.println("おみくじを引く");
        int total = 0;
        
        for(int count = 0;count <= total;count++) {  //引いた回数をカウント
        	while(true){
        		count = count + 1;
	            int omikuji=rand.nextInt(6)+1;
	            if(omikuji == 1){
	                System.out.println("大吉");
	                break;                       //大吉が出たら終了
	            }
	            else if(omikuji == 2){
	                System.out.println("中吉");
	            }
	            else if(omikuji == 3){
	                System.out.println("末吉");
	            }
	            else if(omikuji == 4){
	                System.out.println("吉");
	            }
	            else if(omikuji == 5){
	                System.out.println("凶");
	            }
	            else if(omikuji == 6){
	                System.out.println("大凶");
	            }
	          }
        			System.out.print("引いた回数" + (" : "));
        			System.out.println(count + "回引きました");
        }
	}

}
