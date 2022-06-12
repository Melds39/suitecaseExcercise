package com.mycompany.suitcase;
//Test methods here
public class Main {

    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Galaxy S22", 1);
        Item brick = new Item("brick", 5);

        Suitcase lucysCase = new Suitcase(10);
        lucysCase.addItem(book);
        lucysCase.addItem(phone);

        Suitcase jakesCase = new Suitcase(10);
        jakesCase.addItem(brick);
        
        Item heaviest = lucysCase.heaviestItem();
        System.out.println("Heaviest item on Lucys case: " + heaviest);
        System.out.println("");
        
        Hold hold = new Hold(100);
        hold.addSuitcase(lucysCase);
        hold.addSuitcase(jakesCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
        
    }

}

