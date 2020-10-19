package com.learning.oops.chapter1;

import com.learning.oops.chapter1.duckBehaviour.FlyRocketSpeed;
import com.learning.oops.chapter1.ducks.MallardDuck;
import com.learning.oops.chapter1.ducks.RubberDuck;
import com.learning.oops.chapter1.ducks.SuperDuck;

public class mainClass {
    public static void main(String[] args) {
        // using different object

        // mallard duck
        MallardDuck mallardDuck= new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        //rubber duck
        RubberDuck rubberDuck= new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        //new duck and we will set its behaviour dynamically as client is changing its need and giving more ways and algo to make duck fly and quack
        SuperDuck superDuck= new SuperDuck();
        superDuck.display();
        superDuck.performFly();
        //setting fly behaviour
        superDuck.setFlyBehaviour(new FlyRocketSpeed());
        superDuck.performFly();
    }
}
