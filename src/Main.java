public class Main {
    public static void main(String[] args) {
        //task1//

        int[] one  = new int [3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        System.out.println(one[0]);
        System.out.println(one[1]);
        System.out.println(one[2]);

        double[] two = {1.57, 7.654, 9.986};
        System.out.println(two[0]);
        System.out.println(two[1]);
        System.out.println(two[2]);

        //task2//

        System.out.println(java.util.Arrays.toString(one));
        System.out.println(java.util.Arrays.toString(two));

        //task3-//

        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        //task4-//

        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] += 1;
            }
        }
        System.out.println(java.util.Arrays.toString(one));









    }
}