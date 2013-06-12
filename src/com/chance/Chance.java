package com.chance;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/12/13
 * Time: 7:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class Chance {
    private double probability;

    public Chance(double probability) {

        this.probability = probability;
    }

    @Override
    public boolean equals(Object another)
    {

        if(probability == ((Chance) another).probability)
            return true;
        else
            return false;
    }
}
