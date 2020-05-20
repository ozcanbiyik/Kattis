package com.company;
import java.util.Scanner;

public class Main {


    // Input  : Özcan-Bıyık olan bir ifadeyi
    // Output : ÖB olarak döndüren algoritma sorusunun çözümü.

    public static void main(String[] args) {

        System.out.println("Lütfen Input Girdisini Giriniz : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split("-");
        String output = Character.toString(splitInput[0].charAt(0));
        for(int i = 1; i<splitInput.length; i++){
            output += splitInput[i].charAt(0);
        }
        System.out.println("Çıktı : " + output);
    }
}
