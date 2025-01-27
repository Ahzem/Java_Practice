public class QI {
    public static void main(String[] args) { 
        int a = -5;
        int p = a += 2 + --a; 
        String s = p <= 6 ? "TIC" : "TOC";
        System.out.println(s);
    }
}