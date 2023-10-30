class Main {
    public static void main(String[ ] args) {
        
        Welcome welcome = new Welcome();
        Name name = new Name();
        
        welcome.setPriority(7);
        name.setPriority(5);
        
        welcome.start();
        name.start();
        
    }
}

//extend the Thread class
class Welcome extends Thread{
    public void run() {
        System.out.println("Welcome!");
    }
}

//extend the Thread class
class Name extends Thread{
    public void run() {
        System.out.println("Please enter your name");
    }
}