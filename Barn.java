package pl.akademiakodu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Barn{
    public static List<Animal> dogsAndCats;
    public static List<Animal> horsesAndCows;
    public static List<Animal> hensAndDucks;
    public static List<Animal> sheeps;


    public static void warningNullOfBarn(){
        System.out.println("At first add the barn for dogs and cats");
        System.out.println("And then you can add an animal");
    }

    public static void barnIsExistInfo(String b){
        if(b=="null"){
            System.out.println("The barn doesn't exist!!!");
        }
    }

    public static void barnIsExistInfo(){
        System.out.println("The barn is already exist!!!");
    }

    public static void barnIsAddedInfo(){
        System.out.println("You added the new barn.");
    }

    public static void barnIsRemovedInfo(){
        System.out.println("The barn was succesfully removed!");
    }

    public static void choiceBarnToAdd(byte kind, Scanner sc){
        try {
            kind = sc.nextByte();
        } catch (InputMismatchException e) {
        }
        switch (kind) {
            case 1:
                if (dogsAndCats != null) {
                    barnIsExistInfo();
                } else {
                    dogsAndCats = new ArrayList<>();
                    barnIsAddedInfo();
                    System.out.println();
                    break;
                }
            case 2:
                if (horsesAndCows != null) {
                    barnIsExistInfo();
                } else {
                    horsesAndCows = new ArrayList<>();
                    barnIsAddedInfo();
                    System.out.println();
                    break;
                }
            case 3:
                if (hensAndDucks != null) {
                    barnIsExistInfo();
                } else {
                    hensAndDucks = new ArrayList<>();
                    barnIsAddedInfo();
                    System.out.println();
                    break;
                }
            case 4:
                if (sheeps != null) {
                    barnIsExistInfo();
                } else {
                    sheeps = new ArrayList<>();
                    barnIsAddedInfo();
                    System.out.println();
                    break;
                }
            default:
                System.out.println("Please input a number (1-4)");
                choiceBarnToAdd(kind, sc);
        }

    }

    public static void choiceBarnToRemove(byte kind2, Scanner sc) {
        try {
            kind2 = sc.nextByte();
        } catch (InputMismatchException e) {
        }
        switch (kind2) {
            case 1:
                if (dogsAndCats == null) {
                    barnIsExistInfo(null);
                } else {
                    dogsAndCats.remove(dogsAndCats);
                    barnIsRemovedInfo();
                }
            case 2:
                if (horsesAndCows == null) {
                    barnIsExistInfo(null);
                } else {
                    horsesAndCows.remove(horsesAndCows);
                    barnIsRemovedInfo();
                }
            case 3:
                if (hensAndDucks == null) {
                    barnIsExistInfo(null);
                } else {
                    hensAndDucks.remove(hensAndDucks);
                    barnIsRemovedInfo();
                }
            case 4:
                if (sheeps == null) {
                    barnIsExistInfo(null);
                } else {
                    sheeps.remove(sheeps);
                    barnIsRemovedInfo();
                }
            default:
                System.out.println("Please input a number (1-4)");
                choiceBarnToRemove(kind2, sc);
        }
    }
}
