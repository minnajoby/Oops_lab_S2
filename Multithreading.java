class MultiplicationTable extends Thread {
    public void run() {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

class PrimeNumbers implements Runnable {
    private int n;

    public PrimeNumbers(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("First " + n + " Prime Numbers:");
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        MultiplicationTable tableThread = new MultiplicationTable();
        PrimeNumbers primeRunnable = new PrimeNumbers(10);
        Thread primeThread = new Thread(primeRunnable);

        tableThread.start();
        primeThread.start();
    }
}
