/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。\n");

		System.out.println("売り上げの割合");
		System.out.println("本日の売上　　　" + "\\" + (int) Math.floor(sumC));

		//各お菓子のパーセントを計算
		double shitoPer = (shitoC / sumC) * 100;
		double shokoPer = (shokoC / sumC) * 100;
		double pisuPer = (pisuC / sumC) * 100;
		//項目、各項目の合計金額、全体の割合を出力
		System.out.println("\n内訳");
		System.out.println("シトロン　　　" + "\\" + (int) Math.floor(shitoC) + "・・・" + (int) Math.floor(shitoPer) + "％");
		System.out.println("ショコラ　　　" + "\\" + (int) Math.floor(shokoC) + "・・・" + (int) Math.floor(shokoPer) + "％");
		System.out.println("ピスターシュ　" + "\\" + (int) Math.floor(pisuC) + "・・・" + (int) Math.floor(pisuPer) + "％");
	}

}
