package forest;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Forestクラス
 */
public class Forest extends Object{
    /*
     * Modelのインスタンスを束縛
     */
    private ForestModel model;

    /*
     * ルートのインスタンスを束縛
     */
    private static ArrayList<Node> rootNodes;

    /*
     * ノードのインスタンスを束縛
     */
    private HashMap<Integer, Node> nodes;

    /*
     * ブランチのインスタンスを束縛
     */
    public static ArrayList<Branch> branches;

    /*
     * インタンスを生成し、初期化して応答する
     */
    public Forest() {
        this.model = null;
        this.rootNodes = new ArrayList<Nodes>();
        this.nodes = new HashMap<Integer, Node>();
        this.branches = new ArrayList<Branch>();
    }

}
