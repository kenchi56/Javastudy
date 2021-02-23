package Javastudy;

import java.util.Random;
import java.util.Scanner;

public class dicegame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//ゲーム開始時に自分の名前を入力。
		//サイコロ二つを振り合計値が先に20ぴったりになった方が勝ち
		//(合計ちが20以上になったら0からスタート)
				
		Scanner scan = new Scanner(System.in);
			System.out.println("あなたの名前は？");
			String myname = scan.next();
			System.out.println("サイコロゲームを開始");
			System.out.println("(サイコロを2つ振って合計が先に20ぴったりになった方が勝ち)");
			System.out.println("サイコロを振る");
			int dice = 6;
			int mydice = 0;
			int cpudice = 0;
			game(myname,dice,mydice,cpudice);

	}
	
	public static void game(String myname,int dice,int mydice,int cpudice) {
		Random ran = new Random();
		while(mydice != 20 && cpudice != 20) {
			int dice1 = ran.nextInt(dice)+1;
			int dice2 = ran.nextInt(dice)+1;
			int dice3 = ran.nextInt(dice)+1;
			int dice4 = ran.nextInt(dice)+1;
			int total1 = (dice1 + dice2);
			int total2 = (dice3 + dice4);
			mydice = total1 + mydice;
			cpudice = total2 + cpudice;
			System.out.println("1つめ" + dice1 +  ":" + "2つめ" + dice2 + ":" + "合計は" + mydice + "です");
			System.out.println("1つめ" + dice3 +  ":" + "2つめ" + dice4 + ":" + "合計は" + cpudice + "です");
			
			if(mydice == 20 && cpudice != 20) {
				System.out.println(myname + "の勝ちです");
			} else if(mydice != 20 && cpudice == 20) {
				System.out.println("CPUの勝ちです");
			} else if(mydice < 20) {
				System.out.println(myname + "はもう一度振る");
				
				if(cpudice < 20) {
					System.out.println("CPUはもう一度振る");
				} else if(cpudice > 20) {
					System.out.println("CPUは0に戻る");
					cpudice = 0;
				}
			} else if(mydice > 20) {
				System.out.println(myname + "は0に戻る");
				mydice = 0;
				if(cpudice < 20) {
					System.out.println("CPUはもう一度振る");
				} else if(cpudice > 20) {
					System.out.println("CPUは0に戻る");
					cpudice = 0;
				}
			}
			
			
		}
	}
	
	

}
