package com.zoo;
import java.util.HashMap;
public class Cages {
    HashMap<Integer, Cage> hm = new HashMap<>();
    public void createCages() {
    Cage cage1 = new Cage();
    Cage cage2 = new Cage();
    hm.put(1, cage1);
    hm.put(2, cage2);
    }
    public void addAnimal(Integer k, Object v){
        Cage obj=hm.get(k);
        obj.addAnimal(v);
        System.out.println(obj.hs);
    }

}
