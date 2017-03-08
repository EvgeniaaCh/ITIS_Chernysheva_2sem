import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String stroka=sc.nextLine();
        Stack bracket= new Stack(stroka.length());
        System.out.println(stroka.length());
        int flag=0;
//        for (int i = stroka.length()-1; i >=0; i--) {
//            bracket.addElement(stroka.charAt(i));
//        }
//        for (int i = 0; i < stroka.length(); i++) {
//            System.out.println(bracket.readTop());
//            bracket.deleteElement();
//        }
        if (stroka.charAt(0)=='(' ){
            bracket.addElement(stroka.charAt(0));
            for (int i = 1; i < stroka.length(); i++) {
                    if (stroka.charAt(i)=='(' ){
                        bracket.addElement(stroka.charAt(i));
                    }else{
                        if (stroka.charAt(i)==')') {
                            bracket.deleteElement();
                        }
                    }
            }
        }else{
            System.out.println("Последовательность неверна");
        }
        if (bracket.isEmpty()) {
            System.out.println("Последовательность верна");
        }else{
            System.out.println("Последовательность неверна");
        }



    }
}
