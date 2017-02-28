class Stack{
    private int size;
    private int[] StackArray;
    private int top;

    public Stack(int m) {
        this.size = m;
        StackArray = new int[size];
        top = -1;
    }
    public void addElement(int element) {     // добавляет элемент сверху
        StackArray[++top] = element;
    }
    public int deleteElement() {              // удаляет верхний элемент
        return StackArray[top--];
    }
    public int readTop() {                    // возвращает верхний элемент
        return StackArray[top];
    }
    public boolean isEmpty() {                // проверяет пустой ли стек: true, если да
        return (top == -1);
    }
    public boolean isFull() {                 // true: стек заполнен и некуда добавлять новые значения
        return (top == size - 1);
    }
}