package LeetCode;
import java.util.ArrayList;


class Node {
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

public class NodeToPath {
    // variable
    static ArrayList<ArrayList<Integer>> res;


    public static void main(String[] args) {

        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(4);
        node.right = new Node(3);
        node.right.left = new Node(6);
        node.right.right = new Node(9);

        // declaring the variable
        res = new ArrayList<>();

        paths(node);
        for(ArrayList<Integer> list : res){
            for(int val: list){
                System.out.print(val);
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> paths(Node root) {
        dfs(root, new ArrayList<>());
        return res;
    }

    public static void dfs(Node root, ArrayList<Integer> list) {
        if (root == null) return;

        list.add(root.data);

        if (root.left == null && root.right == null) {
            res.add(new ArrayList<>(list));
        } else {
            if (root.left != null) dfs(root.left, list);
            if (root.right != null) dfs(root.right, list);
        }

        list.remove(list.size() - 1);
    }
}
