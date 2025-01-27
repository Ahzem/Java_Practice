class Fiend {
    public void show() {
        System.out.println("Peter, you are my best friend");
    }
}

public class ClassMate extends Fiend {
    @Override
    public void show() {
        System.out.println("I am Harry and we are classmates");
        super.show();
    }
    public static void main(String[] args) {
        ClassMate cm = new ClassMate();
        cm.show();
    }

}
