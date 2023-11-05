import java.util.*;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        // int s = 0;
        // int mx = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // if (i != j) {
        // int cal = (arr[i] - 1) * (arr[j] - 1);
        // if (cal > mx) {
        // mx = (arr[i] - 1) * (arr[j] - 1);
        // }
        // }
        // }
        // }
        // System.out.println(mx);
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }
        System.out.print(l);
    }
}
