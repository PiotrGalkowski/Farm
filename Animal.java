package pl.akademiakodu;

import lombok.Data;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import static pl.akademiakodu.Barn.*;

@Data
public class Animal {

    private String species;
    private String name;
    private byte age;
    public static int numberOfAnimals = 0;
    public static List<Animal> allAnimals;

    public Animal(String species, String name, byte age) {
        this.species = species;
        this.name = name;
        this.age = age;
        numberOfAnimals++;
    }

    public Animal() {
    }

    public String inputName(Scanner sc) {
        System.out.print("Input name of the animal: ");
        try {
            name = sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input the right name!!!");
            inputName(sc);
        }
        return name;
    }

    public byte inputAge(Scanner sc) {
        System.out.print("Input age of the animal: ");
        try {
            age = sc.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Input the right age!!!");
            inputAge(sc);
        }
        return age;
    }

    public void addAnimal(byte species, Scanner sc) {
        try {
            species = sc.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Please input the right number(1-7)");
            addAnimal(species, sc);
        }
        switch (species) {
            case 1:
                if (dogsAndCats == null) {
                    warningNullOfBarn();
                    break;
                } else {
                    dogsAndCats.add(new Animal("dog", inputName(sc), inputAge(sc)));
                    break;
                }
            case 2:
                if (dogsAndCats == null) {
                    warningNullOfBarn();
                    break;
                } else {
                    dogsAndCats.add(new Animal("cat", inputName(sc),inputAge(sc)));
                    break;
                }
            case 3:
                if (horsesAndCows == null) {
                    warningNullOfBarn();
                    break;
                } else {
                    horsesAndCows.add(new Animal("horse", inputName(sc), inputAge(sc)));
                    break;
                }
            case 4:
                if (horsesAndCows == null) {
                    warningNullOfBarn();
                    break;
                } else {
                    horsesAndCows.add(new Animal("cow", inputName(sc), inputAge(sc)));
                    break;
                }
            case 5:
                if (hensAndDucks == null) {
                    warningNullOfBarn();
                    break;
                } else {
                    hensAndDucks.add(new Animal("hen", inputName(sc), inputAge(sc)));
                    break;
                }
            case 6:
                if (hensAndDucks == null) {
                    warningNullOfBarn();
                    break;
                } else {
                    hensAndDucks.add(new Animal("duck", inputName(sc), inputAge(sc)));
                    break;
                }
            case 7:
                if (sheeps == null) {
                    warningNullOfBarn();
                    break;
                } else {
                    sheeps.add(new Animal("sheep", inputName(sc), inputAge(sc)));
                    break;
                }
            default:
                System.out.println("Please input the right number (1-7)!!!!!!");
                addAnimal(species, sc);
        }
    }

    public void removeAnimal(byte barn, Scanner sc) {
        Menu.showListOfAnimals(barn);
        System.out.println();
        System.out.print("Choice the number of the animal: ");
        int num = 0;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please input the right number!!!");
            num = sc.nextInt();
        }
        switch (barn) {
            case 1:
                for (Animal animal : dogsAndCats) {
                    if ((num--) == dogsAndCats.indexOf(dogsAndCats)) {
                        dogsAndCats.remove(num--);
                        numberOfAnimals--;
                    }
                }
                break;

            case 2:
                for (Animal animal : horsesAndCows) {
                    if ((num--) == horsesAndCows.indexOf(horsesAndCows)) {
                        horsesAndCows.remove(num--);
                        numberOfAnimals--;
                    }
                }
                break;

            case 3:
                for (Animal animal : hensAndDucks) {
                    if ((num--) == hensAndDucks.indexOf(hensAndDucks)) {
                        hensAndDucks.remove(num--);
                        numberOfAnimals--;
                    }
                }
                break;

            case 4:
                for (Animal animal : sheeps) {
                    if ((num--) == sheeps.indexOf(sheeps)) {
                        sheeps.remove(num--);
                        numberOfAnimals--;
                    }
                }
                break;

            default:
                System.out.println("Input the right number(1-4)!!!");
                removeAnimal(barn, sc);
        }
    }

    public static List<Animal> allAnimals(){
        allAnimals.addAll(dogsAndCats);
        allAnimals.addAll(horsesAndCows);
        allAnimals.addAll(hensAndDucks);
        allAnimals.addAll(sheeps);
        return allAnimals;
    }

    public static void getMostNumSpecies(List<Animal> allAnimals){
        String species = null;
        int [] animals = {0,0,0,0,0,0,0};
        for(Animal spec: allAnimals){
            int i = 0;
            species = allAnimals.get(i).getSpecies();
            switch (species){
                case "dog":
                    animals[0]++;
                    break;

                case "cat":
                    animals[1]++;
                    break;

                case "horse":
                    animals[2]++;
                    break;

                case "cow":
                    animals[3]++;
                    break;

                case "hen":
                    animals[4]++;
                    break;

                case "duck":
                    animals[5]++;
                    break;

                case "sheep":
                    animals[6]++;
                    break;
            }
            i++;
        }

        int max = 0;
        String sp = null;
        for(int an: animals){
            int i = 0;
            if (animals[i]>max){
                max = animals[i];
                sp = "animals["+i+"]";
            }
            i++;
        }

        switch (sp){
            case "animals[0]":
                species = "dog";
                break;

            case "animals[1]":
                species = "cat";
                break;

            case "animals[2]":
                species = "horse";
                break;

            case "animals[3]":
                species = "cow";
                break;

            case "animals[4]":
                species = "hen";
                break;

            case "animals[5]":
                species = "duck";
                break;

            case "animals[6]":
                species = "sheep";
                break;
        }

        System.out.println("The most numerous species is: "+species+"("+max+")");
    }
}
