package alexkutschera01;

import java.util.Random;

public class Main {

    private static final int min = 0, max = 100, searched = 50;
    private static int resultsCount = 0;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        int result;
        while ((result = (min + random.nextInt(max - min))) != searched){
            System.out.print("\r" + result);
            resultsCount++;
        }
        long runTime = System.currentTimeMillis() - startTime;
        System.out.print("\rfound " + searched + " with chance " + ((double) 1 / (max - min)) + "% after " + runTime / 1000 + "," + runTime % 1000 + " seconds with " + resultsCount + " randoms");
    }
}
