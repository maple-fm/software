package forest;

import java.awt.Graphics;

/**
 * 樹状整列におけるブランチを担うクラス
 */
public class Branch extends Object {

    /**
     * ブランチの始点となるノード
     */
	private Node start;

    /**
     * ブランチの終点となるノード
     */
	private Node end;

	/**
	 *  このクラスのインスタンスを生成するコンスタンス
     * @param from ブランチの始点となるノード
     * @param to ブランチの終点となるノード
	 */
	public void Branch(Node from, Node to) {
        this.start = from;
        this.end = to;
	}

	/**
	 *  ブランチを描画する
	 */
	public void draw(Graphics aGraphics) {

	}

    /**
     * ブランチの終点となるノードを応答する
     */
	public Node end() {
		return this.end;
	}

    /**
     * ブランチの始点となるノードを応答する
     */
	public Node start() {
		return this.start;
	}

    /**
     * 自分自身を文字列に変換する
     */
	public String toString() {
		return null;
	}

}
