package DSA.DynamicProgramming;

public class PrimeNumber {
    private long totalPrime = 0;
    public void sieve_Prime(int n) {
        boolean[] arr = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = true;
        }

        for (int i = 2; i < n / 2; i++) {
            if (arr[i]) {
                for (int j = i + i; j < n; j = j + i) {
                    if (arr[j]) {
                        arr[j] = false;
                    }
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (arr[i]) {
                totalPrime++;
                System.out.println(i);
            }
        }
        System.out.println("\nTotal Prime Numbers till "+n+" is : "+totalPrime);
        totalPrime = 0;
    }

    public void loop_Prime(int n) {
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }
                if(count >= 3){
                    break;
                }
            }
            if (count == 2) {
                totalPrime++;
                System.out.println(i);
            }
        }
        System.out.println("\nTotal Prime Numbers till "+n+" is : "+totalPrime);
        totalPrime = 0;
    }

}
