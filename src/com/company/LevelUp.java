package com.company;

import java.util.Scanner;

/**
 * Created by jammis01 on 6/24/2016.
 */
public class LevelUp extends MainCharacter {

    public void levelingUpSystem(){
        super.setLevel(super.level+1);
        int points= 0;

        System.out.println("What attribute would you like to level-up:\n" +
                "(1): Health    [10+]"+
                "(2): Damage    [1+]"+
                "(3): Defense   [1+]");

        while(points<2){
            Scanner scan = new Scanner(System.in);

            int attr = scan.nextInt();

            switch(attr){
                case 1:
                    super.setHealth(+10);
                    points++;
                    break;

                case 2:
                    super.setDamage(+1);
                    points++;
                    break;

                case 3:
                    super.setDefense(+1);
                    points++;
                    break;

                default:
                    System.out.println("Please choose from the given numbers");

            }


        }
    }


}
