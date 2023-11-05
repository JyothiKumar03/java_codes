import java.util.*;

public class lab_pract {
    /*
     * public static void main(String[] args) { matrix printing
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * int[][] arr = new int[n][n];
     * if (n <= 0) {
     * System.exit(0);
     * }
     * int rs = 0, rend = n - 1;
     * int cs = 0, cend = n - 1;
     * int c = 1;
     * while (rs <= rend && cs <= cend) {
     * for (int i = cs; i <= cend; i++) {
     * arr[rs][i] = c++;
     * }
     * rs++;
     * for (int i = rs; i <= rend; i++) {
     * arr[i][cend] = c++;
     * }
     * cend--;
     * for (int i = cend; i >= cs; i--) {
     * arr[rend][i] = c++;
     * }
     * rend--;
     * for (int i = rend; i >= rs; i--) {
     * arr[i][cs] = c++;
     * }
     * cs++;
     * }
     * for (int i = 0; i < n; i++) {
     * for (int j = 0; j < n; j++) {
     * System.out.print(arr[i][j] + "  ");
     * }
     * System.out.println();
     * }
     * }
     */
    // stirng merge
    /*
     * public static String merge(String s1, String s2) {
     * StringBuilder sb = new StringBuilder();
     * int i = 0, j = 0;
     * int n = s1.length(), m = s2.length();
     * while (i < n && j < m) {
     * sb.append(s1.charAt(i));
     * sb.append(s2.charAt(j));
     * i++;
     * j++;
     * }
     * while (i < n) {
     * sb.append(s1.charAt(i));
     * i++;
     * }
     * while (j < m) {
     * sb.append(s2.charAt(j));
     * j++;
     * }
     * return sb.toString();
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println(merge(sc.next(), sc.next()));
     * }
     */
    class Myrectangle {
        int vx1, vx2, vy1, vy2;

        public Myrectangle(int v_x1, int v_y1, int v_x2, int v_y2) {
            vx1 = v_x1;
            vy1 = v_y1;
            vx2 = v_x2;
            vy2 = v_y2;
        }

        public int area() {
            return Math.abs((vx1 - vx2) * (vy1 - vy2));
        }

        public void rect_over(Myrectangle rect) {
            int x1 = Math.max(vx1, rect.vx1);
            int x2 = Math.min(vx2, rect.vx2);
            int y1 = Math.max(vy1, rect.vy1);
            int y2 = Math.min(vy2, rect.vy2);
            if (x1 > x2 || y1 > y2) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    class Square extends Myrectangle {
        public int xy, yc, len;

        public Square(int x, int y, int l) {
            xy = x;
            yc = y;
            len = l;
        }

        public int area() {
            return len * len;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        String[] arr1 = sc.nextLine().split(" ");
        Myrectangle mr = new Myrectangle(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),
                Integer.parseInt(arr[3]));
        Square s = new Square(Integer.parseInt(arr1[0]), Integer.parseInt(arr1[1]), Integer.parseInt(arr1[2]));
        Myrectangle my_rec = new Myrectangle(Integer.parseInt(arr1[0]), Integer.parseInt(arr1[1]),
                Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]),
                Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]));
        System.out.println(mr.area());
        System.out.println(s.area());
        my_rec.rect_over(mr);
    }
}
