package com.example.cloudchat.model;

public class Message {

    String uidMessage;   // unique ID for each Message
    String message;
    String uidSender;
    String uidReceiver;
    String dateTime;
    String status;    // sent, Delivered, seen, deleted
}
