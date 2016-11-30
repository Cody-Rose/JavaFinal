/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Item2 {
    private int numItems, bulkQuantity, newAmount;
    private double bulkDiscount, totalSales, totalDiscount, itemCost;
    
    public Item2(int bulkQuantity, double bulkDiscount, double itemCost)
    {
        numItems = 0;
        totalSales = 0.0;
        totalDiscount = 0.0;
        this.bulkQuantity = bulkQuantity;
        this.bulkDiscount = bulkDiscount;
        this.itemCost = itemCost;
    }   
    
    public void Sales(int n)
    {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner keyboard = new Scanner(System.in);
        String responce;
        
       numItems += n;
       if(n < bulkQuantity) //Determins if a discount is applied.
       {
           totalSales = numItems * itemCost;
       }
       else
       {
           totalSales = numItems * itemCost;
           totalDiscount = totalSales * bulkDiscount;
           totalSales = totalSales - totalDiscount;
       }
       
    }
    
    public void recipt() //Don't forget to add the name string before calling this.
    {
       DecimalFormat df = new DecimalFormat("#.00");
       Scanner keyboard = new Scanner(System.in); 
       System.out.print("You bought " + numItems + " of them. Your total is $"
           + df.format(totalSales) + ". With a total discount of $"
           + df.format(totalDiscount) + ".");
    }
}
