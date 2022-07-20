package forest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JLabel;

public class Node extends JLabel {
    
    /*
     * ノード番号を束縛する
     */
    private int nodeNumber;

    /*
     * ノードの名前を束縛する
     */
    private String nodeName;

    /*
     * ノードの親インスタンスを束縛する
     */
    private Node parent;

    /*
     * ノードの子インスタンスを束縛する
     */
    private ArrayList<Node> children; 

    /*
     * 探索済みかどうかを判別
     */
    private boolean visit;

    /*
     * ノードのインスタンスの生成
     * @param number ノード番号
     * @param name ノードの名前
     */
    Node(int number, String name) {
        this.nodeNumber = number;
        this.nodeName = name;
        this.parent = null;
        this.children = new ArrayList<Node>();
        this.visit = false;
    }

    /*
     * ノード番号を応答する。
     */
    public int getNumber() {
        return this.nodeNumber;
    }

    /*
     * ノードの名前を応答する。
     */
    public String getName() {
        return this.nodeName;
    }

    /*
     * 親ノードのインスタンスを応答する。
     */
    public Node getParent() {
        return this.parent;
    }

    /*
     * 子ノードのインスタンスを応答する。
     */
    public ArrayList<Node> getChildren() {
        return this.children;
    }

    /*
     * 親ノードのインスタンスを設定する。
     */
    public void setParent(Node aNode) {
        this.parent = aNode;
        return;
    }

    /*
     * 子ノードのインスタンスを設定する。
     */
    public void setChildren(Node aNode) {
        this.children.add(aNode);
        Collections.sort(this.children, new NodeComparator());
        return;
    }

    /*
     * 探索済みかどうかを応答する。
     */
    public boolean getVisit() {
        return this.visit;
    }

    /*
     * 探索状態を設定する。
     */
    public void setVisit(boolean flag) {
        this.visit = flag;
        return;
    }

}

class NodeComparator implements java.util.Comparator {
    public int compare(Object node1, Object node2) {
        return ((Node)node1).getName().compareTo((Node)node2).getName();
    }
}
