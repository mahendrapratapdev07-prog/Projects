# Simple Java Chatbot

This is a small beginner project. The chatbot uses one Java library class, `Scanner`, to read what you type. Its answers are written as simple `if` and `else if` rules. It does not use maps, extra packages, or machine learning.

## What you need

Install a Java Development Kit (JDK). It includes the tools needed to compile and run Java programs. Check that the compiler is available by opening a terminal and entering:

```text
javac --version
```

## Run the chatbot

Open a terminal in the folder containing `Main.java`, then compile the code:

```text
javac Main.java
```

Start the chatbot:

```text
java Main
```

## Example

```text
Logic: Hello! I am a simple chatbot.
Logic: Type help to see examples, or exit to stop.
You: hello
Logic: Hi there! What would you like to talk about?
You: exit
Logic: Goodbye! It was nice chatting with you.
```

## How it works

- `Scanner keyboard` reads your message from the keyboard.
- `while (true)` repeats the conversation.
- The `if` and `else if` lines compare your message with known phrases.
- `break` ends the loop when you type `exit`, `quit`, `bye`, or `goodbye`.
- The final `else` gives a reply when the chatbot does not recognize your message.

To teach the chatbot a new phrase, add another `else if` before the final `else`. For example:

```java
} else if (message.equalsIgnoreCase("what is java")) {
    System.out.println("Logic: Java is a programming language.");
```
