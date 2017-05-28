import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Company company = new Company();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        while (true) {
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int operation = sc.nextInt();
                if (operation == 1) {
                    company.add(getFlat());
                }
                if (operation == 2) {
                    company.remove(getFlat());
                }
                if (operation == 3) {
                    company.check(getFlat());
                }
                if (operation == 4) {
                    company.getAll();
                }
            }
//        }
    }

    private static Flat getFlat() {
        int numberHouse = sc.nextInt();
        String numberKorpus = sc.next();
        int numberStructure = sc.nextInt();
        int numberFlat = sc.nextInt();

        if (!numberKorpus.equals("-") && numberStructure != 0) {
            return new Flat(numberHouse, numberKorpus, numberStructure, numberFlat);
        }
        if (numberKorpus.equals("-")) {
            return new Flat(numberHouse, numberStructure, numberFlat);
        }
        if (numberStructure == 0) {
            return new Flat(numberHouse, numberKorpus, numberFlat);
        }
        return new Flat(numberHouse, numberFlat);

    }
}
