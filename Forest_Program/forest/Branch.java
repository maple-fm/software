package forest;

/*
 * ブランチクラス
 */
public class Branch extends Objact {
    /*
     * 枝に繋がっている親クラスのインスタンスを生成
     */
    private Node parentNode;
    
    /*
     * 枝に繋がっている子クラスのインスタンスを生成
     */
    private Node childNode;

    /*
     * ブランチのインスタンスを生成
     * @param parentNode 親ノード
     * @param childNode 子ノード
     */
    public Branch(Node parentNode, Node childNode) {
        this.parentNode = parentNode;
        this.childNode = childNode;
    }

    /*
     * 親ノードを応答する。
     */
    public Node getParentNode() {
        return this.parentNode;
    }

    /*
     * 子ノードを応答する。
     */
    public Node getChildNode() {
        return this.childNode;
    }
}
