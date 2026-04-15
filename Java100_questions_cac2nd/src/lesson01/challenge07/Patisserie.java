/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println(("ただいまより開店です！！"));

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250");
		System.out.println("ショコラ　　　\\280");
		System.out.println("ピスターシュ　\\320");

		System.out.println("\nそれぞれ何個ずつ買いますか？(最大30個まで)");

		int shitoAmo = 30;
		int shokoAmo = 30;
		int pisuAmo = 30;

		System.out.println("シトロンは残り　　　" + shitoAmo + "個");
		System.out.println("ショコラは残り　　　" + shokoAmo + "個");
		System.out.println("ピスターシュは残り　" + pisuAmo + "個");
		System.out.println();

		//各お菓子の入力項目を作成
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン　　　>");
		String shitoNum = reader.readLine();

		System.out.print("ショコラ　　　>");
		String shokoNum = reader.readLine();

		System.out.print("ピスターシュ　>");
		String pisuNum = reader.readLine();
		System.out.println();

		//入力した内容をdouble型に変換
		double ishitoNum = Double.parseDouble(shitoNum);
		double ishokoNum = Double.parseDouble(shokoNum);
		double ipisuNum = Double.parseDouble(pisuNum);

		//入力内容を出力
		System.out.println("シトロン　　　" + ishitoNum + "個");
		System.out.println("ショコラ　　　" + ishokoNum + "個");
		System.out.println("ピスターシュ　" + ipisuNum + "個");
		System.out.println();

		int shitoprc = 250;//シトロン1個の金額
		int shokoprc = 280;//ショコラ1個の金額
		int pisuprc = 320;//ピスターシュ1個の金額

		//合計個数を計算
		double sumN = ishitoNum + ishokoNum + ipisuNum;

		//合計個数を出力
		System.out.println("合計個数　　　" + sumN + "個");

		//各項目で金額を計算
		double shitoC = ishitoNum * shitoprc;
		double shokoC = ishokoNum * shokoprc;
		double pisuC = ipisuNum * pisuprc;

		//合計金額を計算
		double sumC = shitoC + shokoC + pisuC;

		//合計金額を出力
		System.out.println("合計金額　　　" + (int) Math.floor(sumC) + "円");
		System.out.println();

		System.out.println("をお買い上げですね\n承りました。");

		System.out.println("\n本日のおすすめ商品");
		System.out.println();

		//購入数を在庫数から減らす処理
		double shitoresAmo = shitoAmo - ishitoNum;
		double shokoresAmo = shokoAmo - ishokoNum;
		double pisuresAmo = pisuAmo - ipisuNum;

		//最終的な在庫の数を出力
		System.out.println("シトロン　　　\\250 ・・・" + "残り" + (int) Math.floor(shitoresAmo) + "個");
		System.out.println("ショコラ　　　\\280 ・・・" + "残り" + (int) Math.floor(shokoresAmo) + "個");
		System.out.println("ピスターシュ　\\320 ・・・" + "残り" + (int) Math.floor(pisuresAmo) + "個");
	}

}
