package pl.sda.findFirst;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfRandomNumbers = new ArrayList<>();
        for(int i=0; i<10; i++){
            int number = new Random().nextInt(20);
            listOfRandomNumbers.add(number);
        }
        Optional<Integer> any = listOfRandomNumbers.stream().filter(number -> number % 2 == 0).findAny();
        any.ifPresentOrElse(System.out::println, () -> System.out.println(" Nie ma"));
    }
}
