package com.simedia.demo;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        char upLeft = '\u0000';
        char upMiddle = '\u0000';
        char upRight = '\u0000';
        char middleLeft = '\u0000';
        char middleMiddle = '\u0000';
        char middleRight = '\u0000';
        char downLeft = '\u0000';
        char downMiddle = '\u0000';
        char downRight = '\u0000';

        String pozitie = null;

        System.out.println("     a     b     c");
        System.out.println("  ZZZZZZZZZZZZZZZZZZZ");
        System.out.println("1 Z  " + upLeft + "   Z  " + upMiddle + "   Z  " + upRight + "   Z");
        System.out.println("  ZZZZZZZZZZZZZZZZZZZ");
        System.out.println("2 Z  " + middleLeft + "   Z  " + middleMiddle + "   Z  " + middleRight + "   Z");
        System.out.println("  ZZZZZZZZZZZZZZZZZZZ");
        System.out.println("3 Z  " + downLeft + "   Z  " + downMiddle + "   Z  " + downRight + "   Z");
        System.out.println("  ZZZZZZZZZZZZZZZZZZZ");

        for (int i = 0; i < 9 ; i++) {

            int wrong = 0;

            if (i%2==0){
                System.out.println("Specificati pozitia unde vreti sa plasati X-ul (Ex: a1, b3. c2): ");
                pozitie = scanner.next();

                if(pozitie.equals("a1")){
                    if (upLeft == '\u0000'){
                        upLeft = 'X';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("a2")){
                    if (middleLeft == '\u0000'){
                        middleLeft = 'X';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("a3")){
                    if (downLeft == '\u0000'){
                        downLeft = 'X';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("b1")){
                    if (upMiddle == '\u0000'){
                        upMiddle = 'X';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("b2")){
                    if (middleMiddle == '\u0000'){
                        middleMiddle = 'X';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("b3")){
                    if (downMiddle == '\u0000'){
                        downMiddle = 'X';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("c1")){
                    if (upRight == '\u0000'){
                        upRight = 'X';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("c2")){
                    if (middleRight == '\u0000'){
                        middleRight = 'X';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("c3")){
                    if (downRight == '\u0000'){
                        downRight = 'X';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(!pozitie.equals("a1")&&!pozitie.equals("a2")&&!pozitie.equals("a3")&&!pozitie.equals("b1")&&!pozitie.equals("b2")&&!pozitie.equals("b3")&&!pozitie.equals("c1")&&!pozitie.equals("c2")&&!pozitie.equals("c3")){
                    System.out.println("Ati introdus o valoare gresita!");
                    wrong++;
                }

            }
            else {
                System.out.println("Specificati pozitia unde vreti sa plasati 0-ul (Ex: a1, b3. c2): ");
                pozitie = scanner.next();
                if(pozitie.equals("a1")){
                    if (upLeft == '\u0000'){
                        upLeft = '0';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("a2")){
                    if (middleLeft == '\u0000'){
                        middleLeft = '0';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("a3")){
                    if (downLeft == '\u0000'){
                        downLeft = '0';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("b1")){
                    if (upMiddle == '\u0000'){
                        upMiddle = '0';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("b2")){
                    if (middleMiddle == '\u0000'){
                        middleMiddle = '0';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("b3")){
                    if (downMiddle == '\u0000'){
                        downMiddle = '0';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("c1")){
                    if (upRight == '\u0000'){
                        upRight = '0';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("c2")){
                    if (middleRight == '\u0000'){
                        middleRight = '0';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(pozitie.equals("c3")){
                    if (downRight == '\u0000'){
                        downRight = '0';
                    }
                    else {
                        System.out.println("Pozitia este ocupata. Va rugam sa alegeti una goala.");
                        wrong++;
                    }
                }
                if(!pozitie.equals("a1")&&!pozitie.equals("a2")&&!pozitie.equals("a3")&&!pozitie.equals("b1")&&!pozitie.equals("b2")&&!pozitie.equals("b3")&&!pozitie.equals("c1")&&!pozitie.equals("c2")&&!pozitie.equals("c3")){
                    System.out.println("Ati introdus o valoare gresita!");
                    wrong++;
                }

            }
            if (wrong>0){
                i--;
            }
            System.out.println("     a     b     c");
            System.out.println("  ZZZZZZZZZZZZZZZZZZZ");
            System.out.println("1 Z  " + upLeft + "   Z  " + upMiddle + "   Z  " + upRight + "   Z");
            System.out.println("  ZZZZZZZZZZZZZZZZZZZ");
            System.out.println("2 Z  " + middleLeft + "   Z  " + middleMiddle + "   Z  " + middleRight + "   Z");
            System.out.println("  ZZZZZZZZZZZZZZZZZZZ");
            System.out.println("3 Z  " + downLeft + "   Z  " + downMiddle + "   Z  " + downRight + "   Z");
            System.out.println("  ZZZZZZZZZZZZZZZZZZZ");

            if(i>3){
                if(upLeft == upMiddle && upMiddle == upRight && upLeft != '\u0000'){
                    System.out.println("Felicitari! " + upLeft + " a castigat!");
                    i=9;
                }
                if(middleLeft == middleMiddle && middleMiddle == middleRight && middleLeft != '\u0000'){
                    System.out.println("Felicitari! " + middleLeft + " a castigat!");
                    i=9;
                }
                if(downLeft == downMiddle && downMiddle == downRight && downLeft != '\u0000'){
                    System.out.println("Felicitari! " + downLeft + " a castigat!");
                    i=9;
                }
                if(upLeft == middleLeft && middleLeft == downLeft && upLeft != '\u0000'){
                    System.out.println("Felicitari! " + upLeft + " a castigat!");
                    i=9;
                }
                if(upMiddle == middleMiddle && middleMiddle == downMiddle && upMiddle != '\u0000'){
                    System.out.println("Felicitari! " + upMiddle + " a castigat!");
                    i=9;
                }
                if(upRight == middleRight && middleRight == downRight && upRight != '\u0000'){
                    System.out.println("Felicitari! " + upRight + " a castigat!");
                    i=9;
                }
                if(upLeft == middleMiddle && middleMiddle == downRight && upLeft != '\u0000'){
                    System.out.println("Felicitari! " + upLeft + " a castigat!");
                    i=9;
                }
                if(upRight == middleMiddle && middleMiddle == downLeft && upRight != '\u0000'){
                    System.out.println("Felicitari! " + upRight + " a castigat!");
                    i=9;
                }
                if (i==8){
                    System.out.println("Remiza!");
                }
            }

        }



    }
}
