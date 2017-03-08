class Stack{
    private int size;
    private char [] StackArray;
    private int top;

    public Stack(int m) {
        this.size = m;
        StackArray = new char[size];
        top = -1;
    }
    public void addElement(char element) {     // добавляет элемент сверху
        StackArray[++top] = element;
    }
    public char deleteElement() {              // удаляет верхний элемент
        return StackArray[top--];
    }
    public char readTop() {                    // возвращает верхний элемент
        return StackArray[top];
    }
    public boolean isEmpty() {                // проверяет пустой ли стек: true, если да
        return (top == -1);
    }
    public boolean isFull() {                 // true: стек заполнен и некуда добавлять новые значения
        return (top == size - 1);
    }
}