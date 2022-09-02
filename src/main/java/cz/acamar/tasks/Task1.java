package cz.acamar.tasks;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        return Arrays.stream(str.split("\\s+"))
                .mapToInt(String::length)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }
}
