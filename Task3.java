import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> myList = new ArrayList<Integer>();

    public void addNumbers(int n) {
        while (myList.size() < n){
            System.out.println("Введите число: ");
            int m = sc.nextInt();
            myList.add(m);
        }
        System.out.println(myList);

    }
    public void getMinMaxMiddle() {
        int min = Collections.min(myList);
        int max = Collections.max(myList);
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        int sum = 0;
        for(int element : myList){
            sum += element;
        }
        System.out.println("Среднее значение: " + (double) sum / (double) myList.size());
    }

}




