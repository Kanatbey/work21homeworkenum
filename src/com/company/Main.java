package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Days[] days1 = {Days.DYISHOMBY, Days.SHEISHEMBI, Days.SHARSHEMBI, Days.BEISHEMBI, Days.JUMA, Days.ISHEMBI, Days.JEKSHEMBI};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kundun atyn jazynyz! :");

        String days = scanner.nextLine();
        if (days.equals("DYISHOMBY")) {
            System.out.println("Duishombu kunu 9 ga kurska baram.");
        } else if (days.equals("SHEISHEMBI")) {
            System.out.println("Sheishembe kunu soft skill jana java praktika bolot.");
        } else if (days.equals("SHARSHEMBI")) {
            System.out.println("Sharshembi kunu kechinde kino korom.");
        } else if (days.equals("BEISHEMBI")) {
            System.out.println("Beishembi kunu praktika jana english sabagyna baram.");
        } else if (days.equals("JUMA")) {
            System.out.println("Erte turush kerek.");
        } else if (days.equals("ISHEMBI")) {
            System.out.println("Ishembi kunu futbol bar.");
        } else if (days.equals("JEKSHEMBI")) {
            System.out.println("Jekshembi kunu generalnyi uborka.");
        }

    }
}
