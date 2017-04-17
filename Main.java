package pl.akademiakodu;

import java.util.*;
import static pl.akademiakodu.Animal.*;
import static pl.akademiakodu.Barn.*;
import static pl.akademiakodu.Statements.*;


public class Main {
    public static void main(String[] args) {

        System.out.println();
        byte number = 0;
        Animal animal = null;

        do {
            Menu.showMainMenu();
            System.out.println();
            oneOfOptions();
            System.out.println();

            Scanner sc = new Scanner(System.in);
            try {
                number = sc.nextByte();
            } catch (InputMismatchException e) {
            }

            switch (number) {
                case 1:
                    Menu.showMenuWithBarns();
                    System.out.println();
                    oneOfOptions();
                    System.out.println();
                    byte kind = 0;
                    choiceBarnToAdd(kind,sc);
                    break;

                case 2:
                    Menu.showMenuWithBarns();
                    System.out.println();
                    oneOfOptions();
                    System.out.println();
                    byte kind2 = 0;
                    choiceBarnToRemove(kind2,sc);
                    break;

                case 3:
                    Menu.showMenuWithSpecies();
                    System.out.println();
                    System.out.print("Choice species: ");
                    System.out.println();
                    byte species = 0;
                    animal.addAnimal(species, sc);
                    break;

                case 4:
                    Menu.showMenuWithBarns();
                    System.out.println();
                    oneOfOptions();
                    byte stable = 0;
                    try {
                        stable = sc.nextByte();
                    } catch(InputMismatchException e) {
                        inputRightNumber();
                        stable = sc.nextByte();
                    }
                    animal.removeAnimal(stable,sc);
                    break;

                case 5:
                    allAnimals();
                    Collections.sort(allAnimals, new TheOldestCompare());
                    System.out.println();
                    System.out.println("The oldest animal on the Farm is: "+allAnimals.get(0).toString());
                    break;

                case 6:
                    allAnimals();
                    Collections.sort(allAnimals, new TheYoungestCompare());
                    System.out.println();
                    System.out.println("The youngest animal on the Farm is: "+allAnimals.get(0).toString());
                    break;

                case 7:
                    allAnimals();
                    getMostNumSpecies(allAnimals);

                case 8:
                    break;
                default:
                    inputRightNumber();
                    System.out.println();
            }
        } while (number != 8);
    }
}
