package com.example.sp.model;

public class Message {
    private String text;

    // Constructor
    public Message(String text) {
        this.text = text;
    }

    // Getter (important for JSON output)
    public String getText() {
        return text;
    }

    // Setter (optional but good practice)
    public void setText(String text) {
        this.text = text;
    }
}
