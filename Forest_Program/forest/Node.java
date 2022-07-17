package forest;

import java.util.ArrayList;

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
    private boolean visit
}
