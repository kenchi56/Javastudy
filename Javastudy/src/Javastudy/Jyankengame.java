package Javastudy;

import java.util.Random;
import java.util.Scanner;

public class Jyankengame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//じゃんけんゲーム
		//｢自分が3勝した時におみくじを引ける。おみくじの結果まで出す｣
		
		Scanner scan = new Scanner(System.in);
			System.out.println("じゃんけんスタート (グーが0 チョキが 1 パーが 2)");
			String[] jyanken = {"グー", "チョキ", "パー"};
			Random ran = new Random();
				int win = 0;
				int lose = 0;
			
			while(win < 3 && lose < 3) {
				int myhand = scan.nextInt(3); //自分の出した手
				int hand = ran.nextInt(3); //相手の出した手
				System.out.println("相手は" + jyanken[hand] + "でした");
				

			if(myhand ==  hand) {
				System.out.println("あいこ");
			} else if((myhand == 0 && hand == 2) || (myhand == 1 && hand == 0) || (myhand == 2 && hand == 1)) {
				System.out.println("負け");
				lose++;
			} else if((myhand == 0 && hand == 1) || (myhand == 1 && hand == 2) || (myhand == 2 && hand == 0)) {
				System.out.println("勝ち");
				win++;
			} 
			
			System.out.println(win + "勝" + lose + "敗"); //勝敗表示
			String[] omikuji = {"大吉","中吉","末吉","吉","凶","大凶"};
			Random ran2 = new Random();
			int kuji = ran2.nextInt(6);
			
			if (win == 3) {
				System.out.println("おみくじを引く");
				System.out.println("おみくじの結果は" + ":" + omikuji[kuji]);
				
			}
				
		
			}

	}

}
