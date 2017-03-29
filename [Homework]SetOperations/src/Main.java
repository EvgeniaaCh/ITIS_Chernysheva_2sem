import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main  {
    public static void main(String[] args) {
        Set<Object> arraySet = new LinkedHashSet<Object>();
        Set<Object> arraySetTwo = new LinkedHashSet<Object>();
        SetOperations setOperations=new SetOperations();
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int n = sc.nextInt(); // количество элементов 1
        int m=sc.nextInt(); // количество элементов 2
        for (int i = 0; i < n; i++){
            arraySet.add(rm.nextInt(10));
        }
        for (int i = 0; i <m ; i++) {
            arraySetTwo.add(rm.nextInt(10));
        }
        System.out.println(arraySet);
        System.out.println(arraySetTwo);

        System.out.println(setOperations.subtraction(arraySet,arraySetTwo));
    }
}
