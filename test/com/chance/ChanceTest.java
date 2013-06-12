package com.chance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/12/13
 * Time: 7:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class ChanceTest
{

    @Test

    public void should_be_equal_to_itself()
    {
        Chance chance = new Chance(0.5);

        assertThat(chance.equals(chance), is(true));
    }

    @Test

    public void should_not_be_null()
    {

        Chance chance = new Chance(0.6);

        assertThat(chance.equals(null), is(false));

    }

    @Test

    public void should_not_be_equal_non_Chance_object()
    {

        Chance chance = new Chance(0.7);
        Bird bird = new Bird();

        assertThat(bird.equals(chance), is(false));
    }

    @Test

    public void should_not_be_equal_to_chance_with_dif_probability()
    {

        Chance chance = new Chance(0.6);
        Chance anotherChance = new Chance(0.7);

        assertThat(chance.equals(anotherChance), is(false));

    }

    @Test

    public void should_be_equal_to_another_chance_with_same_probability()
    {
        Chance chance = new Chance(0.7);
        Chance anotherChance = new Chance(0.7);

        assertThat(chance.equals(anotherChance), is(true));
    }



}

