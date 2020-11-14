package com.company;

public class Main {
// Zadanie:
// Zadeklaruj tablicę zawierającą nazwy dni tygodnia. Wypisz elementy tablicy za pomocą pętli for.

    public static void main(String[] args) {

        String[] arr = {"Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela"};

        for (int i = -1; i < arr.length; i++) {
            System.out.println(arr[i+1]);
            System.out.println("************");
        }

    }
}
