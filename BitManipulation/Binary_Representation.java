package BitManipulation;

public class Binary_Representation {
    public static void Binary(int n) {
        int arr[] = new int[32];
        int i = 0;
        while (n != 1) {
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
        System.out.println();
    }

    public static void Built_In(int n) {
        System.out.println(Integer.toBinaryString(n));
    }

    public static void main(String args[]) {
        int x = 13;
        System.out.print("Binary of " + x + " is: ");
        Binary(x);
        int y = 32;
        System.out.print("Binary of " + y + " using built in function is: ");
        Built_In(y);

    }
}
