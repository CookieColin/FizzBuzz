package lab1;

public class Multiples {
    public static void main(String[] args) {


        int n = 1000; // below this number
        n--;
        int result = multiples(n, 3, 5);
        System.out.println(result);
        //466

        // O(n) solution
        // int cnt = 0;
//        for (int i = 1; i <= 1000; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                cnt++;
//            }
//            else if (i % 5 == 0) {
//                cnt++;
//            }
//            else if (i % 3 == 0) {
//                cnt++;
//            }
//        }
        //System.out.println(cnt);
    }

    static int multiples(int n, int a, int b) {
        n--;
        int doubleCounted;
        int fiveCount = Math.floorDiv(n, a);
        int threeCount = Math.floorDiv(n, b);
        if (a == b) {
            doubleCounted = Math.floorDiv(n, a);
        }
        else {
            doubleCounted = Math.floorDiv(n, a * b);
        }

        return fiveCount + threeCount - doubleCounted;
    }

}
