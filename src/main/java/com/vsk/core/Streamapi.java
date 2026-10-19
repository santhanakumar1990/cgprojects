package com.vsk.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamapi {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "James");

        // Using Stream API to filter names starting with 'J' and collect them into a list
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());

        // Print the even numbers
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Even Numbers Count: " + evenNumbers.size());
    }
}
