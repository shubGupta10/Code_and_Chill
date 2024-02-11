import java.util.Scanner;

class WaveArray {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            convertToWave(n, a);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void convertToWave(int n, int[] a) {
        for (int i = 0; i < n-1; i += 2) {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
    }
}
