package com.mycompany.suitcase;
import java.util.ArrayList;

public class Suitcase {

    private final int maxWeight;
    private int totalItems;
    private int currentWeight;
    
    //Object ArrayList to store every item created in suitcase
    private final ArrayList<Item> item;

    
    public Suitcase(int weight) {
        this.maxWeight = weight;
        this.item = new ArrayList<>();
    }

    public void addItem(Item item) {
        //Check if current weight plus item weight is equal to or less than max suitcase weight, then adds current item to suitcase
            if (currentWeight + item.getWeight() <= this.maxWeight ){
                this.currentWeight += item.getWeight();
                this.item.add(item);
                this.totalItems++;
                
            }
      
    }
    
    public void printItems(){
        
        //Iterate through list and call Item class toString to print each item
        for (Item list: this.item){
            System.out.println(list.toString());
        }
    }
    
    public int totalWeight(){
        return this.currentWeight;
        
    }
    
    public Item heaviestItem(){
        if (this.item.isEmpty()){
            return null;
        }
        //Iterate through list comparing each item weight returning heaviest. we don't care if two ore more are the same weight for this program
        Item heaviest = this.item.get(0);
        for(Item list: this.item){
            if (heaviest.getWeight() < list.getWeight()){
                heaviest = list;
            }
        }
        return heaviest;
    }
    
    @Override
    public String toString(){
        if (this.item.isEmpty()){
            return "no items (0 kg)";
        }
        if (this.item.size()== 1){
            return this.totalItems + " item " + "(" + this.currentWeight + " kg)";
        }
        
        return this.totalItems + " items " + "(" + this.currentWeight + " kg)";
        
    }

}