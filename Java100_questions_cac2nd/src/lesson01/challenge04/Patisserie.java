/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

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

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

	}

}
