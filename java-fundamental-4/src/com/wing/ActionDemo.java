package com.wing;

import com.wing.classes.eatAction;
import com.wing.classes.moveAction;

/**
 * @author memory125
 */
public class ActionDemo {
    public static void main(String[] args) {
        eatAction eatAction = new eatAction();
        eatAction.doAction1();

        moveAction moveAction = new moveAction();
        moveAction.doAction2();
    }
}
