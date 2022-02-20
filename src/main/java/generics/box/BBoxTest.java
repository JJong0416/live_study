package generics.box;

public class BBoxTest {
    public static void main(String[] args) {
        ObjectBBox objectBBox = new ObjectBBox();
        GenericBBox<Integer> genericBBox = new GenericBBox<>();

        int a = 3;
        genericBBox.setBox(a);
    }
}
