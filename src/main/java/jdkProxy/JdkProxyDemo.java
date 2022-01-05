package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyDemo {

    interface If {
        void ordinalMethod(String s);
    }

    static class Original implements  If{

        @Override
        public void ordinalMethod(String s) {
            System.out.println(s);
        }
    }

    static class Handler implements InvocationHandler{

        private final If original;

        public Handler(If original){
            this.original = original;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Before");
            method.invoke(original,args);
            System.out.println("After");
            return null;
        }
    }

    public static void main(String[] args) {
        Original original = new Original();
        Handler handler = new Handler(original);
        If f = (If) Proxy.newProxyInstance(If.class.getClassLoader(), new Class[] { If.class}, handler);
        f.ordinalMethod("Hallo");
    }
}
