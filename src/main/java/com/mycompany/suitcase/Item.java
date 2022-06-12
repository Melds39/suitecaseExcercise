package com.mycompany.suitcase;

public class Item {
    private final int weight;
    private final String name;
    
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return this.name + " (" + this.weight + " kg)";
    }
}

