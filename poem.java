/* 
# Name:                         poem.java
# Author:                       Michael Sineiro
# Date of latest revision:      4/8/2024
# Purpose:                      Calls static methods in a sequence to print a Haiku
*/

public class poem {

    // main method
    public static void main(String[] args) {
        line1(); // Call the 'line1' method to print the first line
    }

    // Static method 'line1'
    public static void line1() {
        System.out.println("\"Gentle morning breeze,"); // Print w/ double quotes
        line2(); // Call the next method
    }

    // Static method 'line2'
    public static void line2() {
        System.out.println("\tLeaves whisper softly;"); // Print indented
        line3(); // Call the next method
    }

    // Static method 'line3'
    public static void line3() {
        System.out.println("\\ A new day awakens \\"); // Print statment w/ backslashes
    }
}
