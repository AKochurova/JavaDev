package com.zoo;

import com.zoo.animal.*;
import com.zoo.exception.EmptyNameException;
import com.zoo.exception.NegativeValueException;

public class Main {

    public static void main(String[] args) {
    Animal ln = new Lion("Lion", 10, "orange");
    Animal mn = new Monkey("Monkey", 7, "brawn");
    mn.setAge(-1);
    mn.setName(null);
    }
}
