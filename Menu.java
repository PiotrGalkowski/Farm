package pl.akademiakodu;

import java.util.List;
import static pl.akademiakodu.Barn.*;

public class Menu{
    public static void showMainMenu() {
        System.out.println("***************** FARM **********************");
        System.out.println();
        System.out.print("The number of animals is: " + Animal.numberOfAnimals);
        System.out.println();
        System.out.println();
        System.out.println("----------------- MENU ----------------------");
        System.out.println("1 - Add barn");
        System.out.println("2 - Remove barn");
        System.out.println("3 - Add animal");
        System.out.println("4 - Remove animal");
        System.out.println("---------------------------------------------");
        System.out.println("5 - Show the oldest");
        System.out.println("6 - Show the youngest");
        System.out.println("7 - Show the most numerous species of animals");
        System.out.println("8 - Exit");
        System.out.println("---------------------------------------------");
    }

    public static void showMenuWithBarns() {
        System.out.println("Kinds of barns");
        System.out.println("1 - for dogs and cats");
        System.out.println("2 - for horses and cows");
        System.out.println("3 - for hens and ducks");
        System.out.println("4 - for sheeps");
    }

    public static void showMenuWithSpecies() {
        System.out.println("Species");
        System.out.println("1 - dog");
        System.out.println("2 - cat");
        System.out.println("3 - horse");
        System.out.println("4 - cow");
        System.out.println("5 - hen");
        System.out.println("6 - duck");
        System.out.println("7 - sheep");

    }

    public static void showListOfAnimals(List<Animal> barns) {
        if(barns!=null) {
            byte n = 0;
            for (Animal animal : barns) {
                n++;
                System.out.println(n + " - " + animal.toString());
            }
        }else {
            System.out.println("Animals don't exist in this barn");
        }
    }

    public static void showListOfAnimals(byte barn) {
        switch (barn) {
            case 1:
                showListOfAnimals(dogsAndCats);
                break;
            case 2:
                showListOfAnimals(horsesAndCows);
                break;
            case 3:
                showListOfAnimals(hensAndDucks);
                break;
            case 4:
                showListOfAnimals(sheeps);
                break;
            default:
                System.out.println("Please input the right number(1-4)");
                break;
        }
    }
}
