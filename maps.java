import java.util.*;

//7b
class A extends Thread {
    public void run() {
        System.out.println("fizz, ");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("buzz, ");
    }
}

class C extends Thread {
    public void run() {
        System.out.println("fizzbuzz, ");
    }
}

// 8a
class Employee {
    String emp_name;
    int exp;

    Employee(String name, int exper) {
        this.emp_name = name;
        this.exp = exper;
    }

    public String toString() {
        return this.emp_name + " " + this.exp;
    }
}

class Sortbyexp implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.exp - e2.exp;
    }
}

public class maps {
    public static void Add(int[] a) {
        List<Integer> l = new ArrayList<>();
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
            l.add(s);
        }
        System.out.println(l);
    }

    public static int pairs(HashMap<String, String> m1, HashMap<String, String> m2) {
        int c = 0;
        for (Map.Entry i : m1.entrySet()) {
            for (Map.Entry j : m2.entrySet()) {
                if (i.getKey().equals(j.getKey()) && i.getValue().equals(j.getValue())) {
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Resistor r1 = new Resistor("red", "black", "orange");
        // 2nd code

        HashMap<String, Integer> color = new HashMap<>();
        color.put("black", 0);
        color.put("brown", 1);
        color.put("red", 2);
        color.put("orange", 3);
        color.put("yellow", 4);
        color.put("green", 5);
        color.put("blue", 6);
        color.put("violet", 7);
        color.put("grey", 8);
        color.put("white", 9);
        String[] a = sc.nextLine().split(" ");
        int x = color.get(a[0]) * 10 + color.get(a[1]);
        System.out.println(x * Math.pow(10, color.get(a[2])) / 1000);

        // 7th a
        /*
         * int n = sc.nextInt();
         * try {
         * if (n > 0) {
         * int[] arr = new int[n];
         * for (int i = 0; i < n; i++) {
         * arr[i] = sc.nextInt();
         * }
         * Add(arr);
         * } else {
         * throw new IllegalArgumentException();
         * }
         * } catch (IllegalArgumentException e) {
         * System.out.println("Invalid Argument");
         * }
         */
        // 7b
        /*
         * System.out.println("Enter n value: ");
         * int n = sc.nextInt();
         * for (int i = 1; i <= n; i++) {
         * if (i % 15 == 0) {
         * C t1 = new C();
         * t1.start();
         * t1.join();
         * } else if (i % 5 == 0) {
         * B t2 = new B();
         * t2.start();
         * t2.join();
         * } else if (i % 3 == 0) {
         * A t3 = new A();
         * t3.start();
         * t3.join();
         * } else {
         * System.out.println(i + ",");
         * }
         * }
         */
        // 8a
        /*
         * ArrayList<Employee> arr = new ArrayList<Employee>();
         * arr.add(new Employee("a", 5));
         * arr.add(new Employee("b", 3));
         * arr.add(new Employee("c", 9));
         * System.out.println("Unsorted employee's list");
         * for (int i = 0; i < arr.size(); i++) {
         * System.out.println(arr.get(i).toString());
         * }
         * Collections.sort(arr, new Sortbyexp());
         * System.out.println("Sorted list");
         * for (int i = 0; i < arr.size(); i++) {
         * System.out.println(arr.get(i).toString());
         * }
         */
        // 8B
        /*
         * String s = sc.nextLine();
         * String[] arr = s.split(" ");
         * Map<String, Integer> ch = new LinkedHashMap<String, Integer>();
         * for (int i = 0; i < arr.length; i++) {
         * String x = arr[i];
         * if (ch.containsKey(x)) {
         * int c = ch.get(x);
         * c++;
         * ch.put(x, c);
         * } else {
         * ch.put(x, 1);
         * }
         * }
         * ArrayList<Integer> al = new ArrayList<Integer>();
         * Set<String> ss = ch.keySet();
         * for (String i : ss) {
         * if (al.contains(ch.get(i))) {
         * } else {
         * al.add(ch.get(i));
         * }
         * }
         * Collections.sort(al);
         * for (int i = al.size() - 1; i >= 0; i--) {
         * int temp = al.get(i);
         * ArrayList<String> tal = new ArrayList<>();
         * for (Map.Entry<String, Integer> l1 : ch.entrySet()) {
         * if (l1.getValue() == temp) {
         * tal.add(l1.getKey());
         * }
         * }
         * Collections.sort(tal);
         * for (String s1 : tal) {
         * System.out.print(s1 + " ");
         * }
         * }
         */
        // 9a
        /*
         * String s = sc.nextLine();
         * Map<Character, Integer> c = new LinkedHashMap<>();
         * for (int i = 0; i < s.length(); i++) {
         * if (!c.containsKey(s.charAt(i))) {
         * c.put(s.charAt(i), 1);
         * } else {
         * int x = c.get(s.charAt(i));
         * c.put(s.charAt(i), x + 1);
         * }
         * }
         * for (Map.Entry<Character, Integer> e : c.entrySet()) {
         * Character k = e.getKey();
         * Integer v = e.getValue();
         * System.out.print(" "k + " " + v);
         * }
         */
        // 9b
        /*
         * HashMap<String, String> m1 = new HashMap<String, String>();
         * HashMap<String, String> m2 = new HashMap<String, String>();
         * int n1 = sc.nextInt();
         * sc.nextLine();
         * for (int i = 0; i < n1; i++) {
         * String[] s = sc.nextLine().split(" ");
         * m1.put(s[0], s[1]);
         * }
         * int n2 = sc.nextInt();
         * sc.nextLine();
         * for (int i = 0; i < n2; i++) {
         * String[] s = sc.nextLine().split(" ");
         * m2.put(s[0], s[1]);
         * }
         * System.out.println(pairs(m1, m2));
         */
    }
}
