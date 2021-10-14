package javapackage;

// 같은 패키지 안에 있으므로, import 패키지가 아닌 가 아닌 import static 으로 가져오자.
import static javapackage.SubStatic.CLASS_NAME;
import static javapackage.SubStatic.subStaticMethod;

public class Package {
    Package(){}

    public static void main(String[] args) {
        Sub sub = new Sub(); // 같은 Package 안에 있으면, import 할 필요가 없다.
        sub.subClassMethod();
        System.out.println("=====Static CASE=====");
        System.out.println(CLASS_NAME);
        subStaticMethod();
    }
}
