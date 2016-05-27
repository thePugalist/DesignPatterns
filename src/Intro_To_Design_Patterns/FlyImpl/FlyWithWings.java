package Intro_To_Design_Patterns.FlyImpl;

/**
 * Created by jordan on 5/18/16.
 */

import Intro_To_Design_Patterns.Interfaces.*;

/**
 * Flying behavior implementation for ducks that DO fly
 */
public class FlyWithWings implements FlyBehavior{

    public void fly(){
        System.out.println("I'm flying!");
    }

}
