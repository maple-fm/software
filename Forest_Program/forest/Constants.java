package forest;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

/**
 * 定数たち：すべてパブリック＆スタティック＆ファイナルの宣言で、このクラスのクラス変数（フィールド）としてアクセス（読み取りが）できます。 樹状整列で用いるリテラル（定数）項の散在を防止するために、このクラスにまとめています。
 */
public class Constants extends Object {

	/**
	 * ノードを描く際のラベルの背景色を表します
	 */
	public static final Color BackgroundColor() {
		return Color.WHITE;
	}

	/**
	 * ノードを描く際のラベルのフォントを表します
	 */
	public static final Font DefaultFont() {
		return Font.PLAIN;
	}

	/**
	 * ノードを描く際のラベルの色を表します
	 */
	public static final Color ForegroundColor() {
		return Color.BLACK;
	}

	/**
	 * ノード群を樹状に整列させる際にノード同士の間隔を表します
	 */
	public static final Point Interval() {
		return Point(25, 2);
	}

	/**
	 * ノードにおいてラベルを描く際の枠縁からマージンを表します
	 */
	public static final Point Margin() {
		return null;
	}

	/**
	 * 樹状整列アニメーションの時間間隔を表します
	 */
	public static final Integer SleepTick() {
		return 0.5;
	}

	/**
	 * 樹状整列データファイルの中の「ブランチ」を表します
	 */
	public static final String TagOfBranches() {
		return "ブランチ";
	}

	/**
	 * 樹状整列データファイルの中の「ノード」を表します
	 */
	public static final String TagOfNodes() {
		return "ノード";
	}

	/**
	 * 樹状整列データファイルの中の「ツリー」を表します
	 */
	public static final String TagOfTrees() {
		return "ツリー";
	}

	/**
	 * ノード群を深さ優先に辿るさいの状態「未定」を表します
	 */
	public static final Integer Unknown() {
		return null;
	}

	/**
	 * ノード群を深さ優先に辿るさいの状態「未訪問」を表します
	 */
	public static final Integer UnVisited() {
		return null;
	}

	/**
	 * ノード群を深さ優先に辿るさいの状態「訪問済」を表します
	 */
	public static final Integer Visited() {
		return null;
	}


}
