/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		int shitoNum = 30;
		int shokoNum = 30;
		int pisuNum = 30;

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println(("ただいまより開店です！！"));

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250");
		System.out.println("ショコラ　　　\\280");
		System.out.println("ピスターシュ　\\320");

		System.out.println("\n本日のおすすめ商です。\n");
		System.out.println("シトロン　　　" + " ・・・" + "残り" + shitoNum + "個");
		System.out.println("ショコラ　　　" + " ・・・" + "残り" + shokoNum + "個");
		System.out.println("ピスターシュ　" + " ・・・" + "残り" + pisuNum + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？(最大30個まで)\n");

		System.out.print("シトロン　　　>");
		String shitobuyNum = reader.readLine();

		System.out.print("ショコラ　　　>");
		String shokobuyNum = reader.readLine();

		System.out.print("ピスターシュ　>");
		String pisubuyNum = reader.readLine();

		System.out.println("\nシトロン　　　" + shitobuyNum + "個");
		System.out.println("ショコラ　　　" + shokobuyNum + "個");
		System.out.println("ピスターシュ　" + pisubuyNum + "個");

		int shitoprc = 250;//シトロン1個の金額
		int shokoprc = 280;//ショコラ1個の金額
		int pisuprc = 320;//ピスターシュ1個の金額

		//入力した内容をint型に変換
		int ishitoNum = Integer.parseInt(shitobuyNum);
		int ishokoNum = Integer.parseInt(shokobuyNum);
		int ipisuNum = Integer.parseInt(pisubuyNum);

		//合計個数を計算
		int sumN = ishitoNum + ishokoNum + ipisuNum;

		//合計個数を出力
		System.out.println("\n合計個数　　　" + sumN + "個");

		//各項目で金額を計算
		int shitoC = ishitoNum * shitoprc;
		int shokoC = ishokoNum * shokoprc;
		int pisuC = ipisuNum * pisuprc;

		//合計金額を計算
		int sumC = shitoC + shokoC + pisuC;

		//合計金額を出力
		System.out.println("合計金額　　　" + sumC + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

	}

}
