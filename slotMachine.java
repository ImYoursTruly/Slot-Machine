package com.mycompany.activity1;

import java.util.*;

public class slotMachine{
    
    public static void main(String[] args){
        
        Random rand = new Random();
        Scanner inp = new Scanner(System.in);
        int attempts = 0;
        
        System.out.print("Enter how much money hou have: ");
            int money = inp.nextInt();
        System.out.println("Enter 1 to say 'YES', 0 if 'NO'.");
        
        while(true){
            System.out.print("Money: " + money + ". Pull the lever? ");
                int user = inp.nextInt();
                int AI1 = rand.nextInt(3) + 1;
                int AI2 = rand.nextInt(3) + 1;
                int AI3 = rand.nextInt(3) + 1;   
                int reward = rand.nextInt(10) + 1;
            
            System.out.println("");    
              
            if(money == 0){
                System.out.print("You've got 0 money left. Continue? ");
                    int confirmation = inp.nextInt();
                        if(confirmation == 0){
                            System.out.print("Thanks for playing!");
                            break;
                        }
                        else if(confirmation == 1){
                            System.out.print("How much money will you add? ");
                                money += inp.nextInt();
                        }
            }
            else{
                if(user == 0)
                    break;
                else if(user == 1){
                    attempts++;
                    money--;
                    System.out.println(AI1 + " " + AI2 + " " + AI3);
                    if(AI1 == AI2 && AI2 == AI3 && AI3 == AI1){
                        System.out.println("----- YOU WON! ------");
                        System.out.println("Attempts: " + attempts);
                        System.out.println("Reward: " + reward + " pesos");
                        money += reward;  
                    }
                    else{
                        System.out.println("----- You Lost! -----");
                        System.out.println("Current attempts: " + attempts);                      
                    }
                }
            }
        }
        
        inp.close();
        System.exit(0);
    }
}
