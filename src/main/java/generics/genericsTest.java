package generics;

import generics.box.GenericBBox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

class Box<E> {

    private E element;    // 제네릭 타입 변수

    void setBox(E element) {    // 제네릭 파라미터 메소드
        this.element = element;
    }

    E getBox() {    // 제네릭 타입 반환 메소드
        return element;
    }
}

class genericsTest {
    public static void main(String[] args) {
        GenericBBox<String> a = new GenericBBox<String>();
        GenericBBox<Integer> b = new GenericBBox<Integer>();

        a.setBox("10");
        b.setBox(10);

        System.out.println("a data : " + a.getBox());
        // 반환된 변수의 타입 출력
        System.out.println("a E Type : " + a.getBox().getClass().getName());

        System.out.println();
        System.out.println("b data : " + b.getBox());
        // 반환된 변수의 타입 출력
        System.out.println("b E Type : " + b.getBox().getClass().getName());


    }
}
/* 출력
 * a data : 10
 * a E Type : java.lang.String
 *
 * b data : 10
 * b E Type : java.lang.Integer */
