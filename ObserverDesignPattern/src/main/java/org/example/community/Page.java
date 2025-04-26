package org.example.community;

public interface Page {
    void addFollower(Observer observer);
    void removeFollower(Observer observer);
    void notifyFollowers(String message);
}
