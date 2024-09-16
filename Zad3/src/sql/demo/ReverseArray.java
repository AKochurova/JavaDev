package sql.demo;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 1;
        arr[3] = 3;
        arr[4] = 9;

        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println("");

        arr = mas(arr);

        for (int i : arr) {
            System.out.print(i);
        }
    }

    public static int[] mas(int[] m) {
        int[] arr2 = new int[m.length];
        for (int i = m.length - 1; i > 0; ) {
            for (int j = 0; j < m.length; j++) {
                arr2[j] = m[i];
                i--;
            }
        }
        return arr2;
    }
}
