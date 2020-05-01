package coba;

import java.util.Scanner;

public class Coba1 {
    public static void main(String[] args) {

        int nilai;
        String coba;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan nilai: ");
        nilai = scan.nextInt();

        // higung gradenya
        if ( nilai >= 90 ) {
            coba = "A";
        } else if ( nilai >= 80 ){
            coba = "B+";
        } else if ( nilai >= 70 ){
            coba = "B";
        } else if ( nilai >= 60 ){
            coba = "C+";
        } else if ( nilai >= 50 ){
            coba = "C";
        } else if ( nilai >= 40 ){
            coba = "D";
        } else {
            coba = "E";
        }

        // cetak hasilnya
        System.out.println("Coba1: " + coba);
    }
}
