public class LinkedStack<T> {
    private Node<T> top;

    /**
     * Default constructor to initialize the top node with the value null
     */
    LinkedStack(){
        this.top = null;
    }

    /**
     * Method pushes item to the top of the stack
     * @param element It's the item to be pushed of any data type
     */
    public void push(T element){
        Node<T> newNode = new Node<>();
        newNode.setValue(element);
        newNode.setNext(top);
        this.top = newNode;
    }

    /**
     * Method to check whether the stack is empty or not
     * @return Empty or not
     */
    public boolean empty(){
        return this.top == null;
    }

    /**
     * Method pops the top item from the stack
     * @return The popped item of any data type
     */
    public T pop(){
        if(empty()) System.out.println("Stack is Empty!");
        else{
            T poppedElement = top.getValue();
            this.top = top.getNext();
            return poppedElement;
        }
        return null;
    }

    /**
     * Method displays the top item in the stack
     * @return The top item in the stack of any data type
     */
    public T peek(){
        if(empty()) System.out.println("Stack is Empty!");
        else{
            return top.getValue();
        }
        return null;
    }

    /**
     * Method displays all the items inside the stack using the notation [ item1, item2, item3, ... ]
     */
    public void elements(){
        if(!empty()){
            Node current = this.top;
            System.out.print("[ ");
            while (current != null){
                if(current.getNext()!= null) System.out.print(current.getValue() + ", ");
                else System.out.print(current.getValue());
                current = current.getNext();
            }
            System.out.print(" ]");

        }else System.out.println("Stack is Empty!");
    }
}
