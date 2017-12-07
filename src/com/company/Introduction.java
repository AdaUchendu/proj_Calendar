package com.company;

/**
 * Created by adakuuchendu on 12/6/17.
 */


public class Introduction {

    public String Message() {
        String messages = "Welcome to our Calendar user Interface.";
        return messages;
    }

    public String Message(int num, String message) {
        if (num <= 1)
            return message;
        else
            return Message(num-1, message);
    }

}
