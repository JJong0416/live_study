package reflection;

public class Child extends Parent {
    public String c_str1 = "1";
    private String c_str2 = "2";

    public Child() {
    }

    private Child(String str) {
        c_str1 = str;
    }

    public int method4(int n) {
        System.out.println("method4: " + n);
        return n;
    }

    private int method5(int n) {
        System.out.println("method5: " + n);
        return n;
    }
}