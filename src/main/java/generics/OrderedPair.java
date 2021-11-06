package generics;

interface Pair <K, V> {
    public K getKey();
    public V getValue();
}

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        //다음 코드는 OrderedPair 클래스의 두 인스턴스를 만든다.
        //선언에서 K 및 V 의 타입을 유추 할 수 있으므로 다이아몬드 표기법을 사용하여 코드를 단축할 수 있다.
        //p1에서 두번째 인자로 받은 타입은 사실 int 이지만 오토박싱에 의하여 자동으로 Integer로 변환된다.
        Pair <String, Integer> p1 = new OrderedPair <> ( "Even", 8);
        Pair <String, String> p2 = new OrderedPair <> ( "hello", "world");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

    @Override
    public String toString(){
        return "key = " + key + ", value = " + value;
    }
}
