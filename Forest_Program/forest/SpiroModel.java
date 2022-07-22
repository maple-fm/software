package forest;

import mvc.Model;
import java.io.File;
import java.util.ArrayList;

/**
 * 樹状整列におけるMVCのモデルを担うクラス
 */
public class SpiroModel extends Model {

	/**
	 * 樹状整列それ自信を記憶しておくフィールド
	 */
	private Forest forest;

	/**
	 *  このクラスのインスタンスを生成するコンスタンス
	 * @param aFile 樹状整列データファイル
	 */
	public void ForestModel(File aFile) {

	}

	/**
	 *  アニメーションを行う
	 */
	public void animate() {

	}

	/**
	 *  樹状整列を行う
	 */
	public void arrange() {

	}

	/**
	 *  自分自身が変化したことを依存仏たちにupdateを依頼する
	 * @Override
	 */
	public void changed() {

	}

	/**
	 * 樹状整列それ自身を応答する
	 * @return 樹状整列それ自身
	 */
	public Forest forest() {
		return this.forest;
	}

	/**
	 *  樹状整列データファイルから樹状整列それ自身を生成する
	 * @param aFile 樹状整列データファイル
	 */
	public void read(File aFile) {

	}

	/**
	 * 樹状整列の根元になるノードを探し出して応答する
	 * @return ルートノード、見つからない時はnull
	 */
	public Node root() {
		return null;
	}

	/**
	 * 樹状整列の根元になるノード群を探し出して応答する
	 * @return ルートノード群、見つからない時は空リストs
	 */
	public ArrayList<Node> roots() {
		return null;
	}

}
