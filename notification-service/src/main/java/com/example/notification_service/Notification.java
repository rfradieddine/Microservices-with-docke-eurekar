package com.example.notification_service;

public class Notification {
    private int id;
    private String message;
    private boolean isRead;

    public Notification() {}

    public Notification(int id, String message, boolean isRead) {
        this.id = id;
        this.message = message;
        this.isRead = isRead;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }
}
