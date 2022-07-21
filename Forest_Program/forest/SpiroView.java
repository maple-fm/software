package forest;

import mvc.View;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.Container;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;

/**
 * 樹状整列におけるMVCのビューを担うクラス
 */
public class SpiroView extends View {

	/**
	 *  このクラスのインスタンスを生成するコンスタンス
	 * @param aModel モデル
	 */
	public void SpiroView(SpiroModel aModel) {

	}

	/**
	 *  このパネルの描画が必要になったときに動作する
	 * @Override
	 * @param aGraphics グラフィックス
	 */
	public void paintComponent(Graphics aGraphics) {

	}

	/**
	 *  指定された位置にノードが存在するかどうかを調べる
	 * @param aPoint 位置
	 * @return ノード、見つからなかった場合にはnullを応答
	 */
	public void whichOfNodes(Point aPoint) {

	}

}
