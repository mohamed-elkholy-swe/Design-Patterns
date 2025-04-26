package org.example.community;

public class Follower implements Observer {
    String name;

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println(name + "! you have a notification " + message);
    }
}
