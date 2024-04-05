/* 
# Script Name:                  helloWorld.java
# Author:                       Michael Sineiro
# Date of latest revision:      4/4/2024
# Purpose:                      Prints Hello World using ASCII art
*/

// Defines a class named helloWorld
public class helloWorld {
    // main method 
    public static void main(String[] args) {
        // Initializes an array of strings
        String[] lines = {
            "H   H  EEEE  L      L       OOO        W   W   OOO  RRRR  L      DDDD  !!",
            "H   H  E     L      L      O   O       W W W  O   O R   R L      D   D !!",
            "HHHHH  EEEE  L      L      O   O       W W W  O   O RRRR  L      D   D !!",
            "H   H  E     L      L      O   O       W W W  O   O R  R  L      D   D   ",
            "H   H  EEEE  LLLLL  LLLLL   OOO         W W    OOO  R   R LLLLL  DDDD  !!",
        };

        // for loop for every line in the string
        for (String line : lines) {
            // Prints each line 
            System.out.println(line);
        }
    }
}
