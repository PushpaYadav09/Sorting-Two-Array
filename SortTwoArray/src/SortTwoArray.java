import java.util.Scanner;

public class SortTwoArray {
    public SortTwoArray() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements for array A:");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter elements:");

        int m;
        for (m = 0; m < n; ++m) {
            A[m] = sc.nextInt();
        }

        System.out.println("Enter no. of elements in Array B:");
        int x = sc.nextInt();
        int[] B = new int[m];
        System.out.println("Enter elements:");

        int y;
        for (y = 0; y < x; ++y) {
            B[y] = sc.nextInt();
        }

        selectionsort(A);
        selectionsortdesc(B);

        System.out.println("sorted array array A:");

        for (m = 0; m < n; ++m) {
            System.out.println(A[m]);
        }

        System.out.println("sorted array array B:");

        for (y = 0; y < m; ++y) {
            System.out.println(B[y]);
        }

        System.out.println("3rd minimum element of array A: ");
        if (n >= 3) {
            int a = A[2];
            System.out.println("index: 2 element: " + a);
        }

        System.out.println("2nd maximum element of array B: ");
        if (m >= 2) {
            int b = B[1];
            System.out.println("index: 1 element: " + b);

        }
    }

        private static void selectionsortdesc ( int[] B){
            int m = B.length;

            for (int i = 0; i < m - 1; ++i) {
                int max_index = i;

                int j;
                for (j = i + 1; j < m; ++j) {
                    if (B[max_index] < B[j]) {
                        max_index = j;
                    }
                }

                j = B[max_index];
                B[max_index] = B[i];
                B[i] = j;
            }

        }

        protected static void selectionsort ( int[] A){
            int n = A.length;

            for (int i = 0; i < n - 1; ++i) {
                int min_index = i;

                int j;
                for (j = i + 1; j < n; ++j) {
                    if (A[j] < A[min_index]) {
                        min_index = j;
                    }
                }

                j = A[min_index];
                A[min_index] = A[i];
                A[i] = j;
            }

        }
    }