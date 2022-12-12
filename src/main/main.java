package main;

import java.util.Scanner;

public class main {

        public static void main(String[] args) {

            System.out.println("Hello world!");
            Scanner scan = new Scanner(System.in);
            switch (scan.nextLine()){
                case"hello": System.out.println("Hello world!"); break;
                case "info":
                    System.out.println("Szia"); break;
                case"exit":System.exit(1); break;
                case"help": System.out.println("exit:help:info:hello");


            }
        }

}
