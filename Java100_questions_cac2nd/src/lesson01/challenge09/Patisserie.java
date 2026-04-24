/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		System.out.println("合計金額　　　" + (int) sumC + "円");
		System.out.println();

		System.out.println("をお買い上げですね\n承りました。");

		System.out.println("\n本日のおすすめ商品");
		System.out.println();

		//購入数を在庫数から減らす処理
		double shitoresAmo = shitoAmo - ishitoNum;
		double shokoresAmo = shokoAmo - ishokoNum;
		double pisuresAmo = pisuAmo - ipisuNum;

		//最終的な在庫の数を出力
		System.out.println("シトロン　　　\\250 ・・・" + "残り" + (int) shitoresAmo + "個");
		System.out.println("ショコラ　　　\\280 ・・・" + "残り" + (int) shokoresAmo + "個");
		System.out.println("ピスターシュ　\\320 ・・・" + "残り" + (int) pisuresAmo + "個");

		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。\n");

		System.out.println("売り上げの割合");
		System.out.println("本日の売上　　　" + "\\" + (int) sumC);

		//各お菓子のパーセントを計算
		double shitoPer = (shitoC / sumC) * 100;
		double shokoPer = (shokoC / sumC) * 100;
		double pisuPer = (pisuC / sumC) * 100;
		//項目、各項目の合計金額、全体の割合を出力
		System.out.println("\n内訳");
		System.out.println("シトロン　　　" + "\\" + (int) shitoC + "・・・" + (int) shitoPer + "％");
		System.out.println("ショコラ　　　" + "\\" + (int) shokoC + "・・・" + (int) shokoPer + "％");
		System.out.println("ピスターシュ　" + "\\" + (int) pisuC + "・・・" + (int) pisuPer + "％");

		//シトロンの値段と金額の割合をint型に変換
		int shitoPer2 = (int) shitoPer;
		int shitoprc2 = (int) shitoprc;

		//ショコラの値段と金額の割合をint型に変換
		int shokoPer2 = (int) shokoPer;
		int shokoprc2 = (int) shokoprc;

		//ピスターシュの値段と金額の割合をint型に変換
		int pisuPer2 = (int) pisuPer;
		int pisuprc2 = (int) pisuprc;

		//各項目の全体の割合を計算する
		double shitoRation = shitoprc2 * (shitoPer2 / 100.0);
		double shokoRation = shokoprc2 * (shokoPer2 / 100.0);
		double pisuRation = pisuprc2 * (pisuPer2 / 100.0);

		//各項目の全体の割合の値を合計する
		double makaRation = shitoRation + shokoRation + pisuRation;

		//1の位を切り捨てる
		double makaprc = Math.floor(makaRation / 10) * 10;

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味は　　　・・・" + shitoPer2 + "％ ");
		System.out.println("ショコラの味は　　　・・・" + shokoPer2 + "％ ");
		System.out.println("ピスターシュの味は　・・・" + pisuPer2 + "％ ");

		System.out.println("\nが楽しめます！");

		//最終的な金額を出力
		System.out.println("\n値段は\\" + (int) makaprc + "です。");
	}

}
