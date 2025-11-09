import java.util.Random;

class RandomNumberThread extends Thread {
    private int limit; 

    RandomNumberThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        Random rand = new Random();
        try {
            for (int i = 1; i <= limit; i++) {
                int num = rand.nextInt(100);  
                System.out.println("Generated Number " + i + ": " + num);

               
                if (num % 2 == 0) {
                    SquareThread sq = new SquareThread(num);
                    sq.start();
                } 
                // If number is odd -> CubeThread
                else {
                    CubeThread cb = new CubeThread(num);
                    cb.start();
                }

                Thread.sleep(1000);  // Step 8: sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("RandomNumberThread interrupted");
        }
    }
}

class SquareThread extends Thread {
    int number;

    SquareThread(int num) {
        this.number = num;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " = " + square);
    }
}

class CubeThread extends Thread {
    int number;

    CubeThread(int num) {
        this.number = num;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " = " + cube);
    }
}

public class MultiThread {
    public static void main(String[] args) {
        
        RandomNumberThread rnt = new RandomNumberThread(10); 
        rnt.start();
    }
}
