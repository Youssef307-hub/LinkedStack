public class Main {
    public static void main(String[] args) {

        LinkedStack<Integer> stack= new LinkedStack<>();

        System.out.println("Trying to pop an empty stack... ");
        stack.pop();

        System.out.println();

        System.out.println("Checking if the stack is empty... \n" + stack.empty());

        System.out.println();

        System.out.println("Adding items to stack...");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println();

        System.out.print("Displaying the stack items: ");
        stack.elements();

        System.out.println();
        System.out.println();

        System.out.print("Displaying the top item in the stack: ");
        System.out.print(stack.peek());

        System.out.println();
        System.out.println();

        System.out.println("Popping the top item form the stack... ");
        stack.pop();

        System.out.println();

        System.out.print("Displaying the top item in the stack after popping: ");
        System.out.print(stack.peek());

        System.out.println();
        System.out.println();

        System.out.print("Displaying the stack items after popping: ");
        stack.elements();

        System.out.println();
    }
}