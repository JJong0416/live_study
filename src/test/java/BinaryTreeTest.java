import binary.BinaryTree;
import binary.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {
    private static Node root;
    private static BinaryTree binaryTree;

    @BeforeEach
    void setUp() {
        Node node10 = new Node(null,null,10);
        Node node9 = new Node(null,null,9);
        Node node8 = new Node(node10,null,8);
        Node node7 = new Node(null,node9,7);
        Node node6 = new Node(node8,null,6);
        Node node5 = new Node(null,null,5);
        Node node4= new Node(node7,null,4);
        Node node3 = new Node(node5,node6,3);
        Node node2 = new Node(node4,null,2);
        Node node1 = new Node(node2,node3,1);

        binaryTree = new BinaryTree(node1);
        root = binaryTree.getRoot();
    }

    @Test
    @DisplayName("root 값 가져오기")
    void getRoot() {
        Assertions.assertEquals(1,binaryTree.getRoot().getValue());
    }

    @Test
    @DisplayName("BFS 테스트, 레벨오더")
    void BFS() {
        System.out.println(1+" "+2+" "+3+" "+4+" "+5+" "+6+" "+7+" "+8+" "+9+" "+10);
        binaryTree.BFS(root);
    }

    @Test
    @DisplayName("DFS 테스트, Inorder")
    void DFS() {
        System.out.println(7+" "+9+" "+4+" "+2+" "+1+" "+5+" "+3+" "+10+" "+8+" "+6);
        binaryTree.DFS(root);
    }
}