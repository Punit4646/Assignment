abstract class Parent {
    public abstract void message();
}

class FirstSubclass extends Parent {
    public void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {
    public void message() {
        System.out.println("This is second subclass");
    }
}
