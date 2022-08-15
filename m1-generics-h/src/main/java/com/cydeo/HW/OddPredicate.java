package com.cydeo.HW;

public class OddPredicate implements UnaryPredicate{

    @Override
    public boolean test(Object obj) {
        if((Double)obj % 2 != 0){
            return true;
        }
        return false;
    }
}
