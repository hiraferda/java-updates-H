package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {//T-Should accept only Player or its subclasses
    private String name;
    private List<Player>members = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(((Player)player).getName() +" is already on the team");
            return false;
        }else{
            members.add((Player) player);
            System.out.println(((Player)player).getName() +" is added to the team "+this.name);
            return true;
        }
    }
}
