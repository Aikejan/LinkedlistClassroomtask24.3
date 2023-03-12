import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        LinkedList<Character> character = new LinkedList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            character.add(c);
        }
        System.out.println(character);



        LinkedList<Integer> integers = new LinkedList<>();
        for (int a = 0; a < 10; a++) {
            integers.add(a);
        }
        System.out.println(integers);



        ArrayList<Character> characters = new ArrayList<>();
        characters.addAll(character);
        Collections.reverse(characters);
        System.out.println(characters);


        ArrayList<Integer> integers1 = new ArrayList<>();
       integers1.addAll(integers);
        Collections.reverse(integers1);
        System.out.println(integers1);
    }


}




