package org.example.community;

import java.util.ArrayList;
import java.util.List;

public class Blogger implements Page {
    private String name;
    private List<Observer> observers = new ArrayList<>();

    public Blogger(String name){
        this.name = name;
    }

    public Blogger(){}
    @Override
    public void addFollower(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeFollower(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyFollowers(String message) {
        for (var e: observers) {
            e.notify("Blogger: " + this.name + " has uploaded a new video( " + message + " )");
        }
    }
}
