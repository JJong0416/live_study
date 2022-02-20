package generics.box;

public class GenericBBox<E> {
    private E e;

    public void setBox(E e) {
        this.e = e;
    }

    public E getBox() {
        return e;
    }
}
