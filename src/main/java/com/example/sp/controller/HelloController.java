package com.example.sp.controller;

import com.example.sp.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    // Old single message
    @GetMapping("/json")
    public Message getJsonMessage() {
        return new Message("This is a JSON response!");
    }

    // New: Multiple real-world messages
    @GetMapping("/notifications")
    public List<Message> getNotifications() {
        return Arrays.asList(
                new Message("🔔 You have 3 new friend requests"),
                new Message("📦 Your order #1234 has been shipped"),
                new Message("⚡ System update available, please restart your app")
        );
    }
}
