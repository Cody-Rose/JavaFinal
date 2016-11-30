/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2;

import java.util.Scanner;
public class Final2 {

    public static void main(String[] args) {
      
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will create an item to be purchased.");
        System.out.println("You decide how many of the item needs to be bought before "
                + "you will add a discont to it.\n");
        
        System.out.println("Your item is Video Games"); 
        System.out.println("What is the cost of this item?");
        double itemCost = keyboard.nextDouble();
        System.out.println("How much of the item needs to be bought before a "
                + "discount will be applied.");
        int bulkQuantity = keyboard.nextInt();
        System.out.println("Please enter what the discount would be as a %");
        double bulkDiscount = (keyboard.nextDouble()/100);
        
        Item2 videoGames = new Item2(bulkQuantity, bulkDiscount, itemCost);//Calls Item class.
        videoGames.Sales(2);
        System.out.println("\nYou bought Video Games");
        videoGames.recipt();
        videoGames.Sales(5);
        System.out.println("\nYou bought Video Games");
        videoGames.recipt();
    }
    
}
