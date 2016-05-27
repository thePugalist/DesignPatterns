package Intro_To_Design_Patterns.QuackImpl;

import Intro_To_Design_Patterns.Interfaces.QuackBehavior;

/**
 * Created by jordan on 5/18/16.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
