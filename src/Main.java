import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> popularNames = new ArrayList<>();
        popularNames.add("Matas");
        popularNames.add("Rimantas");
        popularNames.add("Mantvydas");
        System.out.println("Sveiki atvyke į popuiariausių vardų sąrašą");
        intro();

        Scanner sc = new Scanner(System.in);

        int choise = 0;
        switch (choise) {
            case 1:
                for (int i = 0; i < popularNames.size(); i++) {
                    System.out.println(i + 1) + ". " + popularNames.get(i));
                    break;
                    case 2:


                }


        }

        public static void intro () {
            System.out.println("Pasirinkite ka norite daryti");
            System.out.println("1.Pamatyti vardus.");
            System.out.println("2.Prideti vardus.");
            System.out.println("3.Redaguoti vardą.");
            System.out.println("4.Ištrinti vardą.");
            System.out.println("5.Išeiti iš programos vardą.");

        }
//
//    public static void show(ArrayList<String> popularNames) {
//        for (int i = 0; i < ; i++) {
//
//        }
//
//    }
    }