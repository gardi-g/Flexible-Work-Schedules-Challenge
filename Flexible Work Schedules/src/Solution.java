//Hackerrank ID: emegaraaa
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[] gaps = new int[n-1];
        int lastTime = timeToInt(sc.nextLine()) + 1; // each task takes 1 minute
        for(int i = 0; i < n-1; i++) {
            int time = timeToInt(sc.nextLine());
            gaps[i] = (time - lastTime);
            lastTime = time + 1; // each task takes 1 minute
        }
        Arrays.sort(gaps);
        // Calculate the sum of the largest k-1 gaps
        int total = 0;
        for(int i = 1; i < k; i++) {
            total += gaps[gaps.length - i];
        }
        System.out.println(total);
    }
    //Convert time string to an integer representing the number of minutes
    // (12:00 am) on day 0
    static int timeToInt(String line) {
        String[] t = line.split(" ");
        int day = Integer.valueOf(t[0]);
        int hour = Integer.valueOf(t[1].substring(0,2)) % 12; // convert hour 12 to hour 0
        int minute = Integer.valueOf(t[1].substring(3,5));
        if(t[2].equals("pm")) {
            hour += 12;
        }
        return day * 60 * 24 + hour * 60 + minute;
    }
}
