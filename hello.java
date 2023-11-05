
// //import java.io.*;
// import java.util.*;

// public class hello {
//     public static void main(String[] args) {// Program for amstrong number
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 0; i <= n; i++) {
//             if (check(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//         fibonacii(n);

//     }

//     public static boolean check(int n) {
//         int temp = 0, last = 0, power = 0, sum = 0;
//         temp = n;
//         while (temp > 0) {
//             temp = temp / 10;
//             power++;
//         }
//         temp = n;
//         while (temp > 0) {
//             last = temp % 10;
//             sum += (Math.pow(last, power));
//             temp = temp / 10;
//         }
//         return (n == sum);
//     }

//     static void fibonacii(int n) {
//         int a = 0, b = 1, c = 0;
//         for (int i = 1; i < n; i++) {
//             c = a + b;
//             a = b;
//             b = c;
//             System.out.print(c + " ");
//         }
//     }
// }
// // in fuction overloading wee can change the data types of parameters but return
// // type of the function should be same
import java.io.*;

class Student implements Serializable {
    static int roll;
    String name;
    transient String contact;

    Student(int r, String n, String c) {
        roll = r;
        name = n;
        contact = c;
    }
}

class hello {
    public static void main(String[] args) throws Exception {
        Student s = new Student(501, "Ram", "12344321");
        FileOutputStream fos = new FileOutputStream("Studinfo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.flush();
        oos.close();
    }
}