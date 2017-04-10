package pl.akademiakodu;

import java.util.Comparator;

/**
 * Created by Ola on 2017-04-06.
 */
public class TheYoungestCompare implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getAge()<=o2.getAge()){
            return -1;
        }else {
            return 1;
        }
    }
}
