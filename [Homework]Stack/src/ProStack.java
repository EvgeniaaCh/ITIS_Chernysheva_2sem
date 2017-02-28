public class ProStack {
    public static void main(String[] args) {
        Stack ProStack=new Stack(5);
        ProStack.addElement(1);
        ProStack.addElement(2);
        ProStack.addElement(3);
        ProStack.addElement(4);
        ProStack.addElement(5);

        while (!ProStack.isEmpty()){
            int value = ProStack.deleteElement();
            System.out.print(value);
            System.out.print(" ");
        }

    }
}
