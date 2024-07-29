import java.util.Scanner;

public class SimpleBot {

    public static void main(String[] args) {
        // Initialize the scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the chatbot (Dummy initialization, replace with actual bot setup if available)
        ChatBot chatbot = new ChatBot();

        System.out.println("Bot: Hello! How can I help you today?");

        while (true) {
            // Get user input
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            // Break the loop if the user wants to exit
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Bot: Goodbye!");
                break;
            }

            // Get the bot's response (Dummy response, replace with actual bot response if available)
            String botResponse = chatbot.getResponse(userInput);

            // Print the bot's response
            System.out.println("Bot: " + botResponse);
        }

        // Close the scanner
        scanner.close();
    }
}

// Dummy ChatBot class to simulate the chatbot functionality
class ChatBot {
    // Dummy method to simulate getting a response from the chatbot
    public String getResponse(String userInput) {
        return "This is a dummy response for: " + userInput;
    }
}
