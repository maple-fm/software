package forest;

import java.awt.Rectangle;
import java.awt.Point;
import java.util.ArrayList;


/**
 * 樹状整列におけるフォレストを担うクラス
 */
public class Forest extends Object {

	/**
	 * 樹状整列したフォレストの領域を記憶するフィールド
	 */
	private Rectangle bounds;

	/**
	 * ブランチ群を記憶するフィールド
	 */
	private ArrayList<Branch> branches;

	/**
	 * ノード群を記憶するフィールド
	 */
	private ArrayList<Node> nodes;

	/**
	 * このクラスのインスタンスを生成するコンスタンス
	 */
	public Forest() {

	}

	/**
	 *  ブランチを追加する
	 * @param aBranch ブランチ
	 */
	public void addBranch(int aBranch) {
		branches.add(aBranch);
		return;
	}

	/**
	 *  ノードを追加する
	 * @param aNode ノード
	 */
	public void addNode(Node aNode) {
		nodes.add(aNode);
		return;
	}

	/**
	 *  樹状整列するトップ
	 */
	public void arrange() {

	}

	/**
	 *  樹状整列する再帰レベル
	 * @param aNode ノード
	 * @param aPoint ノードの位置
	 * @param aModel モデル
	 * @return 樹状整列に必要だった大きさ
	 */
	protected Point arrange(Node aNode, Point aPoint, SpiroModel aModel) {

	}

	/**
	 *  樹状整列するセカンドレベル
	 * @param aModel モデル
	 */
	public void arrange(SpiroModel aModel) {

	}

	/**
	 * フォレストの領域を応答する
	 * @return aGrophics フォレスト領域
	 */
	public Rectangle bounds() {
		return this.bounds;
	}

	/**
	 *  フォレストを描画する
	 * @param aGraphics ブラフィクス
	 */
	public void draw(Graphics aGraphics) {

	}

	/**
	 * フォレストの領域をチャラにする
	 */
	public void flushBounds() {

	}

	/**
	 *  チックタックの間、スリープし、モデルが変化した、と騒ぐ
	 * @param aModel モデル
	 */
	protected void propagate(SpiroModel aMode) {

	}

	/**
	 * フォレストの根元となるノード群を応答する
	 * @return ルートノード群
	 */
	public ArrayList<Node> rootNodes() {
		return null;
	}

	/**
	 * 引数で指定されたノード群をノード名でソートする
	 * @param nodeCollection ノード群
	 * @return ソートされたノード群
	 */
	protected ArrayList<Node> sortNodes(ArrayList<Node> nodeCollection) {
		return Collections.sort(nodeCollection);
	}

	/**
	 * 引数で指定されたノードのサブノード群を応答する
	 * @param aNode ノード
	 * @return サブノード群
	 */
	public ArrayList<Node> subNodes(Node aNode) {
		return null;
	}

	/**
	 * 引数で指定されたノードのスーパーノード群を応答する
	 * @param aNode ノード
	 * @return スーパーノード群
	 */
	public ArrayList<Node> superNodes(Node aNode) {
		return null;
	}

	/**
	 * 自分自身を文字列に変換する
	 * @Override
	 * @return 自分自身を表す文字列
	 */
	public String toString() {
		return null;
	}

	/**
	 * 指定された位置にノードが存在するかを調べる
	 * @param aPoint 位置
	 * @return ノード、もしも見つからなかった場合にはnullを応答する
	 */
	public Node whichOfNodes(Point aPoint) {
		return null;
	}

}
