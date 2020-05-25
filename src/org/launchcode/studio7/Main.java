package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD History = new CD("History", 10.0, new ArrayList<>(), "CD");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        History.storeData("Scream", 8.0);
        System.out.println(History.toString());
    }
}
