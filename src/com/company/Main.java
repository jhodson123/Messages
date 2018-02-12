package com.company;

import java.util.*;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;
        MessageList chat = null;
        while (running) {

            System.out.println("Enter 1 to Start a new Chat, Enter 2 to Find existing Chat, Enter 0 to exit:");
            int f = input.nextInt();

            if (f == 1) {

                System.out.println("Enter Your Name:");
                String ThisBugisDumb = input.nextLine();
                String sender = input.nextLine();

                System.out.println("Who are you sending to:");
                String receiver = input.nextLine();

                System.out.println("What is your message");
                String message = input.nextLine();

                chat = new MessageList(sender,receiver,message);

                chatRoom(chat);
            }else if (f == 2){

                try{
                    System.out.println("What is your name:");
                    String ThisBugisDumb = input.nextLine();
                    String receiver = input.nextLine();

                    System.out.println("Who are you receiving from:");
                    String sender = input.nextLine();

                    System.out.println(sender + " sent you:");
                    chat.view();

                    System.out.println("What your response " + receiver);
                    chat.messages.clear();
                    chatRoom(chat);
                }catch (NullPointerException e) {
                    System.out.println("No chats exist");
                }

            }else {
                System.exit(0);
            }
        }
    }


    public static void chatRoom(MessageList chat) {


        String message = input.nextLine();
        if (message.equals("exit")) {

        } else{
            chat.add(message);
        chatRoom(chat);
        }
    }
}
