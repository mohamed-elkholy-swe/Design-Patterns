package org.example;

import org.example.community.Blogger;
import org.example.community.Follower;

public class Main {
    public static void main(String[] args) {
        // intalize followers
        Follower f1 = new Follower("Mohamed");
        Follower f2 = new Follower("Ahmed");
        Follower f3 = new Follower("Ibrahim");
        Follower f4 = new Follower("Karim");

        // intalize bloggers
        Blogger blogger1 = new Blogger("Ahmed Metwally");
        Blogger blogger2 = new Blogger("Ahmed Fathy");

        // followers follow bloggers
        blogger1.addFollower(f1);
        blogger1.addFollower(f3);
        blogger1.addFollower(f4);

        blogger2.addFollower(f2);

        blogger1.notifyFollowers("Observer Design Pattern");
        blogger2.notifyFollowers("LinkedList in action");

        blogger1.removeFollower(f3);
        blogger2.addFollower(f3);

        blogger1.notifyFollowers("Dynamic Programming tutorial");
        blogger2.notifyFollowers("Graph Theory tutorial");

    }
}