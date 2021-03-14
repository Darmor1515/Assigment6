package com.assigment;
import com.assigment.Builder.*;
import com.assigment.Factory.Button;
import com.assigment.Factory.Dialog;
import com.assigment.Factory.HtmlDialog;
import com.assigment.Factory.WindowDialog;

import java.util.InputMismatchException;
import static com.assigment.Singleton.createManga;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello put 1-3");
        System.out.println("1- SingleTon");
        System.out.println("2-FactoryMethod");
        System.out.println("3-Builder");
        try {
            int option = scanner.nextInt();
            if (option == 1) {
                Singleton damir = createManga();
                damir.ReadManga("Fight");
                Singleton damir2 = createManga();
                damir2.ReadManga("Go");
                System.out.println(damir.ReadManga("Fight"));
                System.out.println("I was here");
                System.out.println(damir2.ReadManga("Go"));
            } else if (option == 2) {
                System.out.println("Hello it is fabric method");
                System.out.println("Write Window or Html to open their dialogs");
                String a = scanner.nextLine();
                Dialog dialog;
                if (a=="Window"){  dialog = new WindowDialog();}else if (a=="Html"){ dialog = new HtmlDialog();}else{ throw new Exception("Please write big letter first");
                };
                //And here dialog must do something i think
            } else if (option == 3) {
               Director director = new Director();

                CarBuilder builder = new CarBuilder();
                director.ConstructSportCar(builder);
//Sorry without println time out
                director.ConstructEasyCar(builder);
                String car2 = builder.getProduct(5,5,10,0);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }






}

