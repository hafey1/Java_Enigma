import java.util.Arrays; // delete these after testing
import java.util.Collections; // delete these after testing
import java.util.Scanner;


public class Test_Enigma {

//    public static Character[] psetget() {
//// this needs to be a helper functio
//        // this is some bullshit to turn a string into a Character array idk how to make this work or even if I need to make it work like that
//        // it does not work right now YAYA
//        // its purpose is to test out other classes
//    Scanner plug_set = new Scanner(System.in);
//    String plg_input = plug_set.nextLine();
//    char[] interm = plg_input.toCharArray();
//    Character[] characters= new Character[interm.length];
//    for (int i = 0; i < interm.length; i++) {
//        characters[i] = interm[i];
//        System.out.println(interm[i]);
//    }
//        return characters;
//    }


    public static void main(String[] args) {

        Character[] l = new Character[26];
        Collections.shuffle(Arrays.asList(l));



        Character[] plugport = {'a', 'b', 'c', 'd'};
        Plugboard plug = new Plugboard(plugport);
        plug.encode(plugport[0]);
    }
}
