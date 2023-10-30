import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        
        LinkedList<Integer> nums = new LinkedList<Integer>();
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }
        
        
        int sum = 0;
        //your code goes here
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            int value = it.next();
            sum += value;
        }
        
        System.out.println(sum);
    }
}