package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int hp ;
    static int Mhp;
    public static void main(String[] args) {

        List<MonsterAttributes> monsters = new ArrayList<>() ;
        monsters.add(new MonsterAttributes("Rat",2,10,2));
        monsters.add(new MonsterAttributes("Slime",3, 15, 5));
        monsters.add(new MonsterAttributes("Goblin",6,25,8));

        Scanner scan = new Scanner(System.in);

        hp = 50;
        Mhp = 30;

        int hattack=5;
        int Mattack =3;

        int potion = 10;
        boolean in = true;

        m:
        while(in==true){
            System.out.println("HEALTH: "+ hp);
            System.out.println("-------MENU---------");
            System.out.println(" 1.Enter Battle\n 2.Potions\n 3.Exit");

            int num = scan.nextInt();
            switch(num){
                case 1:
                    System.out.println("A monster appears");


                    while(hp>=0 ) {

                        if(Mhp<=0){
                            break;
                        }
                        System.out.println("Kagi HP: " + hp + "  Monster HP: " + Mhp);
                        System.out.println("1.Attack"+"2.Flee");

                        int fightCommand = scan.nextInt();

                        if(fightCommand==1) {

                            System.out.println("Monster attack: "+Mattack);
                            System.out.println("Damage dealt: "+hattack);
                            hp = hp-Mattack;
                            Mhp=Mhp-hattack;

                        }
                }
                    if(Mhp<=0){
                        Mhp=30;
                    }
                    break;
                case 2:
                    hp = hp+potion;

                    break;
                case 3:

                    break m;
            }


        }

    }
}
