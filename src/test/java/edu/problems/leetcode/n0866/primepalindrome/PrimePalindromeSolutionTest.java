package edu.problems.leetcode.n0866.primepalindrome;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrimePalindromeSolutionTest {

    private static List<Integer> simplePrimeNumbers = new ArrayList<>();
    private static List<Integer> simpleNotPrimeNumbers = new ArrayList<>();
    private static List<Integer> simplePalindromeNumbers = new ArrayList<>();
    private static List<Integer> simpleNotPalindromeNumbers = new ArrayList<>();
    private static List<Integer> simplePrimePalindromeNumbers = new ArrayList<>();
    private PrimePalindromeSolution test = new PrimePalindromeSolution();


    @BeforeClass
    public static void populateLists(){
        populateSimplePrimeList();
        populateSimpleNotPrimeList();
        populateSimplePalindromeList();
        populateSimpleNotPalindromeList();
        populateSimplePrimePalindromeList();
    }

    @Test
    public void isPrimeShouldReturnTrueOnSimplePrimeNumbers() {
        for (Integer simplePrimeNumber : simplePrimeNumbers) {
            assertTrue(test.isPrime(simplePrimeNumber));
        }
    }

    @Test
    public void isPrimeShouldReturnFalseOnSimpleNotPrimeNumbers() {
        for (Integer simpleNotPrimeNumber : simpleNotPrimeNumbers) {
            assertFalse(test.isPrime(simpleNotPrimeNumber));
        }
    }

    @Test
    public void isPalindromeShouldReturnTrueOnSimplePalindromeNumbers(){
        for (Integer simplePalindromeNumber : simplePalindromeNumbers) {
            assertTrue(test.isPalindrome(simplePalindromeNumber));
        }
    }

    @Test
    public void isPalindromeShouldReturnFalseOnSimpleNotPalindromeNumbers(){
        PrimePalindromeSolution test = new PrimePalindromeSolution();
        for (Integer simpleNotPalindromeNumber : simpleNotPalindromeNumbers) {
            assertFalse(test.isPalindrome(simpleNotPalindromeNumber));
        }
    }

    private static void populateSimplePrimeList() {
        simplePrimeNumbers.add(2);
        simplePrimeNumbers.add(3);
        simplePrimeNumbers.add(5);
        simplePrimeNumbers.add(7);
        simplePrimeNumbers.add(11);
        simplePrimeNumbers.add(13);
        simplePrimeNumbers.add(17);
        simplePrimeNumbers.add(19);
        simplePrimeNumbers.add(23);
        simplePrimeNumbers.add(29);
        simplePrimeNumbers.add(31);
    }

    private static void populateSimpleNotPrimeList() {
        simpleNotPrimeNumbers.add(1);
        simpleNotPrimeNumbers.add(4);
        simpleNotPrimeNumbers.add(6);
        simpleNotPrimeNumbers.add(8);
        simpleNotPrimeNumbers.add(9);
        simpleNotPrimeNumbers.add(500);
        simpleNotPrimeNumbers.add(1_000_000);
    }

    private static void populateSimplePalindromeList() {
        simplePalindromeNumbers.add(1);
        simplePalindromeNumbers.add(131);
        simplePalindromeNumbers.add(1331);
        simplePalindromeNumbers.add(123321);
        simplePalindromeNumbers.add(79877897);
    }

    private static void populateSimpleNotPalindromeList() {
        simpleNotPalindromeNumbers.add(12);
        simpleNotPalindromeNumbers.add(29);
        simpleNotPalindromeNumbers.add(30);
        simpleNotPalindromeNumbers.add(123);
        simpleNotPalindromeNumbers.add(321);
        simpleNotPalindromeNumbers.add(10_000);
    }

    private static void populateSimplePrimePalindromeList() {
        simplePrimePalindromeNumbers.add(11);
        simplePrimePalindromeNumbers.add(131);

    }



}
