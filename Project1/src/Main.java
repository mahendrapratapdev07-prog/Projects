import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner reads the line that the user types.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Logic: Hello! I am a simple chatbot.");
        System.out.println("Logic: Type help to see examples, or exit to stop.");

        // This loop keeps the chatbot running until the user chooses to leave.
        while (true) {
            System.out.print("You: ");
            String message = keyboard.nextLine().trim();

            // Check exit commands first so the loop can stop.
            if (message.equalsIgnoreCase("exit")
                    || message.equalsIgnoreCase("quit")
                    || message.equalsIgnoreCase("bye")
                    || message.equalsIgnoreCase("goodbye")) {
                System.out.println("Logic: Goodbye! It was nice chatting with you.");
                break;
            } else if (message.equalsIgnoreCase("hello")) {
                System.out.println("Logic: Hi there! What would you like to talk about?");
            } else if (message.equalsIgnoreCase("hi")) {
                System.out.println("Logic: Hello! How can I help?");
            } else if (message.equalsIgnoreCase("hey")) {
                System.out.println("Logic: Hey! What can I help you with?");
            } else if (message.equalsIgnoreCase("how are you")) {
                System.out.println("Logic: I am doing well, thanks for asking. How are you?");
            } else if (message.equalsIgnoreCase("what is your name")
                    || message.equalsIgnoreCase("who are you")) {
                System.out.println("Logic: I am Logic, a simple rule-based chatbot.");
            } else if (message.equalsIgnoreCase("what can you do")) {
                System.out.println("Logic: I can greet you and answer a few simple questions.");
            } else if (message.equalsIgnoreCase("thank you")
                    || message.equalsIgnoreCase("thanks")) {
                System.out.println("Logic: You are welcome!");
            } else if (message.equalsIgnoreCase("help")) {
                System.out.println("Logic: Try hello, how are you, what is your name, or thanks.");
                System.out.println("Logic: Type exit when you want to stop.");
            } else {
                System.out.println("Logic: I do not know that one yet. Type help to see examples.");
            }
        }

        keyboard.close();
    }
}
