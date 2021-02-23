package Javastudy;

public class Study5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//整数の２乗を計算
		
		int e = nijyou(3);
		System.out.println(e);
		
		System.out.println(avg(5,10)); //２つの数の平均値
		
		kuku(5);
		
		}

	static int nijyou(int x) {
		int y = x * x;
		return y;
	}
	
		//２つの数の平均値
	
	static int avg(int a,int b) {
		int c = (a + b) / 2;
		return c;
	}
	
	//九九の段
	static void kuku(int x) {
		for (int i = 1;i <=9;i++) {
			int y = x * i;
			System.out.println(x + "の段" + x + "x" + i  + "=" + y);
		}
	}

}
