import java.util.Scanner;
import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Loops l = new Loops();
        // task 1
        System.out.println("Please, enter the number");
        int n = in.nextInt();
        System.out.println(l.getSqr(n));
        int n1, n2, n3;
        System.out.println("Please, enter the dimension of arrays. Firstly for array #1, then array #2, then array #3");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] c = new int[n3];
        l.initOfArr(a, b, c);
        l.printArr(a, b, c);
        System.out.println(l.getMaxSumArray(a, b, c));
        // task 2
        l.rotateNumbers(b);
        // I have questions about test classes. I can't do them now
    }

    protected void initOfArr(int[] a, int[] b, int[] c) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(80) - 3;
        for (int i = 0; i < b.length; i++)
            b[i] = rand.nextInt(910) - 4;
        for (int i = 0; i < c.length; i++)
            c[i] = rand.nextInt(45) - 3;
    }

    protected void printArr(int[] a, int[] b, int[] c) {
        System.out.println("The first array is: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");
        System.out.println();
        System.out.println("The second array is: ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + "  ");
        System.out.println();
        System.out.println("The third array is: ");
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + "  ");
        System.out.println();
    }

    protected int getSqr(int n) {
        int sqrt = 0;
        if (n < 0)
            n = Math.abs(n);
        for (int i = 1; i <= n; i++)
            sqrt += n;
        return sqrt;
    }

    protected int getMaxSumArray(int[] a, int[] b, int[] c) {
        int sumA = 0, sumB = 0, sumC = 0;
        for (int i = 0; i < a.length; i++)
            sumA += a[i];
        for (int i = 0; i < b.length; i++)
            sumB += b[i];
        for (int i = 0; i < c.length; i++)
            sumC += c[i];
        System.out.println("Sum of array #1: " + sumA + "\n" + "Sum of array #2: " + sumB + "\n" + "Sum of array #3: " + sumC + "\n");
        if (sumA > sumB && sumA > sumC)
            return 1;
        else if (sumB > sumA && sumB > sumC)
            return 2;
        else return 3;
    }

    protected void rotateNumbers(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int m = 0, z = 0;
            while (a[i] > 0) {
                z = a[i] % 10;
                a[i] /= 10;
                m = m * 10 + z;
            }
            a[i] = m;
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
