package com.zoo;

import com.zoo.exception.CageIsFullException;
import com.zoo.exception.IdenticAnimalException;

import java.util.HashSet;

public class Cage {
    HashSet<Object> hs = new HashSet<>();

    public void addAnimal(Object animal){
        try {
            if (!hs.add(animal))
                throw new IdenticAnimalException("Same animal");
            else if (hs.size()>3){
                hs.remove(animal);
                throw new CageIsFullException("Cage is full");}
            else hs.add(animal);

        }catch (IdenticAnimalException | CageIsFullException e){
            System.out.println(e.getMessage());
        }

    }
}
