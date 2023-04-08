import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task2 {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    public void addNumbers(int n) {
        while (numbers.size() < n){
            System.out.println("Введите число: ");
            int m = sc.nextInt();
            numbers.add(m);
        }
        System.out.println(numbers);


        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}