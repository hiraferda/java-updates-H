package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add("Apple");


        printDouble(items);

        System.out.println("********************");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("LiverPool");

//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

    }

    private static void printDouble(ArrayList items) {
        for (Object i: items){
            System.out.println((Integer)i*2);
        }
    }
}
