package com.zoo;

import com.zoo.animal.*;




public class Main {

    public static void main(String[] args) {
    Animal ln = new Lion("Lion", 10, "orange");
    Animal mn = new Monkey("Monkey", 7, "brown");
    Animal pk = new Peacock("dfd", 6,"fdgdf");
    Animal pk2 = new Peacock("dfd", 6,"fdgdf");
    Cages cg = new Cages();
    cg.createCages();
    cg.addAnimal(1,mn);
    cg.addAnimal(1,pk);
    cg.addAnimal(1,pk);


    }
}
