package com.example.kynansong.drinkable;

import com.example.kynansong.drinkable.Models.Cocktails;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kynansong on 22/11/2017.
 */

public class CocktailsTest {

    Cocktails cocktails;

    @Before
    public void before() {
        cocktails = new Cocktails(1,"Daiquiri", "50ml Rum, 25ml lime, 10ml sugar",
                "Shake and strain");
    }

    @Test
    public void canGetIDTest(){
        assertEquals((Integer)1, cocktails.getCocktailID());
    }

    @Test
    public void canGetNameTest(){
        assertEquals("Daiquiri", cocktails.getCocktailName());
    }

    @Test
    public void canGetMeasurementsTest() {
        assertEquals("50ml Rum, 25ml lime, 10ml sugar", cocktails.getCocktailMeasurements()); }

    @Test
    public void canGetDescriptionTest() {
        assertEquals("Shake and strain", cocktails.getCocktailDescription());
    }

    @Test
    public void canSetNameTest() {
        cocktails.setCocktailName("Sidecar");
        assertEquals("Sidecar", cocktails.getCocktailName());
    }
}
