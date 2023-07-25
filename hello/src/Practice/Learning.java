package Practice;

class Node{
    int data;
    Node left,right;
}
public class Learning {
    static Node built(int key){
        Node node=new Node();
        node.data=key;
        node.left=null;
        node.right=null;
        return node;
    }
    static void printKpath(Node root){
        Node temp=root;
        while(root!=null){
            System.out.println(root.data);
            if (root.left!=null){
                root=root.left;
            }
            else if (root.right!=null){
                root=root.right;
            }
            
        }
    }

    public static void main(String[] args) {

        Node root= built(4);
        root.left=built(5);
        root.left.left = built(2);
        root.left.right = built(1);
        root.left.right.left = built(1);
        root.right = built(-1);
        root.right.left = built(4);

        printKpath(root);
    }

}
