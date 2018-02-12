package com.company;

public class MessageList extends Message {

    public MessageList(String sender, String receiver, String message){

        super(sender, receiver, message);
    }

    public void add(String m){

        super.messages.add(m);
    }

    public void view(){

        System.out.println(super.messages);
    }
}
