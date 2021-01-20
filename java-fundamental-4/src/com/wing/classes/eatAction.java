package com.wing.classes;

import com.wing.parent.Action;

/**
 * @author memory125
 */
public class eatAction extends Action {
    @Override
    public void doAction1() {
        System.out.println(this.getClass() + ": doAction1");
    }

    @Override
    public void doAction2() {
        System.out.println(this.getClass() + ": doAction2");
    }

    @Override
    public void doAction3() {
        System.out.println(this.getClass() + ": doAction3");
    }

    @Override
    public void doAction4() {
        System.out.println(this.getClass() + ": doAction4");
    }

    @Override
    public void doAction5() {
        System.out.println(this.getClass() + ": doAction5");
    }
}
