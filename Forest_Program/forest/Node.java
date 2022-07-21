package forest;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Graphics;

/**
 * 樹状整列におけるノードを担うクラス
 */
public class Node extends Component {

    /**
     * ノードの大きさを記憶するフィールド
     */
	private Point extent;

    /**
     * ノードの場所を記憶するフィールド
     */
	private Point location;

    /**
     * ノード名を記憶するフィールド
     */
	private String name;

    /**
     * 樹状整列する歳のノードの状態を記憶するフィールド
     */
	private Integer status;

	/**
	 * このクラスのインスタンスを生成するコンストラクタ 
     * @param aString ノード名：ラベル文字列
	 */
	public void Node(String aString) {
        this.name = aString;
	}

	/**
	 *  ノードを描画する
     * @param aGraphics グラフィクス
	 */
	public void draw(Graphics aGraphics) {


	}

    /**
     * ノードの描画領域を応答するメソッド
     * @return ノードの描画領域
     * @Override 
     */
	public Rectangle getBounds() {
		return null;
	}

    /**
     * ノードの大きさを応答する
     */
	public Point getExtent() {
		return this.extent;
	}

    /**
     * ノードの位置を応答する
     */
	public Point getLocation() {
		return this.location;
	}

    /**
     * ノードの名前を応答する
     */
	public String getName() {
		return this.name;
	}

    /**
     * ノードの状態を応答する
     */
	public Integer getStatus() {
		return this.status;
	}

	/**
	 *  ノードの大きさを設定する
	 */
	public void setExtent(Point aPoint) {
        this.extent = aPoint;
        return ;
	}

	/**
	 *  ノードの位置を設定する
	 */
	public void setLocation(Point aPoint) {
        this.location = aPoint;
        return;
	}

	/**
	 *  ノードの名前を設定する
	 */
	public void setName(String aString) {
        this.name = aString;
        return ;
	}

	/**
	 *  ノードの状態を設定する
	 */
	public void setStatus(Integer anInteger) {
        this.status = anInteger;
        return ;
	}

	/**
	 *  文字列の高さを応答する
	 */
	public int stringHeight(String string) {
		return 0;
	}

    /*
     * 文字列の幅を応答する
     */
	public int stringWidth(String string) {
		return 0;
	}

    /**
     * 自分自身を文字列に変換する
     */
	public String toString() {
		return null;
	}

}
