package edu.problems.leetcode.n204.countprimes;

public class CountPrimesSolutionEratosthenes {
    int countPrimes(int n){
        return 0;
    }

    public static void main(String[] args) {
        CountPrimesSolutionEratosthenes test = new CountPrimesSolutionEratosthenes();
        test.timing(0, 0, test);
        test.timing(0, 1, test);
        test.timing(0, 2, test);
        test.timing(1, 3, test);
        test.timing(2, 4, test);
        test.timing(2, 5, test);
        test.timing(3, 6, test);
        test.timing(3, 7, test);
        test.timing(4, 8, test);
        test.timing(4, 9, test);
        test.timing(4, 10, test);
        test.timing(8, 20, test);
        test.timing(25, 100, test);
        test.timing(168, 1000, test);
        test.timing(1229, 10_000, test);
        test.timing(9592, 100_000, test);//1:11769; 2:7857; 3:5222; 4:3683; 5:3046; 6v2:1373; sqrt-15;
        test.timing(78498, 1_000_000, test);//1:***; 2:***; 3:***; 4:***; 5:298466; 6v2:101805; sqrt-242;
        test.timing(664579, 10_000_000, test);//6v2:8089740; sqrt-5261;
        test.timing(5761455, 100_000_000, test);//sqrt-135046;
        test.timing(50847534, 1_000_000_000, test);
    }

    private void timing(int expectedResult, int value, CountPrimesSolutionEratosthenes test) {
        final long start = System.currentTimeMillis();
        System.out.println(expectedResult + ":" + test.countPrimes(value) + "|" + (System.currentTimeMillis() - start));
    }
}
