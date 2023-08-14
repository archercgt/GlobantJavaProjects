/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Archer
 */
import java.util.Random;

public class test {
    public static void main(String[] args) {
        String randomName = generateRandomName();
        System.out.println("Random Name: " + randomName);
    }

    public static String generateRandomName() {
        Random random = new Random();

        int nameLength = random.nextInt(5) + 5; // Generate a name length between 5 and 10 characters

        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < nameLength; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a'); // Generate a random lowercase letter
            nameBuilder.append(randomChar);
        }

        return nameBuilder.toString();
    }
}

