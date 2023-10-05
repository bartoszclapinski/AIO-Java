package InnerClasses;

public class Outer {
    private int x;

    public void doSomething() {
        final int localVar = 5;

        class Inner {
            public void innerMethod() {
                x = 10;
                System.out.println(localVar); // localVar must be final or effectively final
            }
        }

        new Inner().innerMethod();
    }
}
