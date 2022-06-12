package com.mycompany.suitcase;
import java.util.ArrayList;
//Class to hold suitcases in
public class Hold {
  
    //Object ArrayList to hold all suitcases - which may hold items inside
    private final ArrayList<Suitcase> suitcase;
    private final int maxWeight;
    private int currentWeight;
    

    public Hold(int weight){
        this.maxWeight = weight;
        this.suitcase = new ArrayList();
    }
    
    public void addSuitcase(Suitcase suitcase){
        //compare total weight of suitcase to Hold max weight before adding suitcase
        if (suitcase.totalWeight() + this.currentWeight <= this.maxWeight){
            this.suitcase.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }
    //Iterate through each suitcase and call Suitcase printItem() to list all items inside
    public void printItems(){
        
        for (Suitcase suit: this.suitcase){
            suit.printItems();
        }
    }
    
    @Override
    public String toString(){
        if(this.suitcase.isEmpty()){
            return null;
        }
        if(this.suitcase.size() == 1){
            return "1 " + "suitcases " + "(" + this.suitcase.get(0).totalWeight() + " kg)";
        }
        int totalWeight =0;
        for (Suitcase suit: this.suitcase){
            totalWeight += suit.totalWeight();
        }
        return this.suitcase.size() + " suitcases " + "(" +totalWeight + " kg)";
    }
}