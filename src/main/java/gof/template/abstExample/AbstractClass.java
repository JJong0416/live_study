package gof.template.abstExample;

public abstract class AbstractClass {
    protected abstract void hook1();

    protected abstract void hook2();

    public void templateMethod() {
        hook1();
        hook2();
    }
}
