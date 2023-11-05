import java.util.*;

public class BFSprob {
    private LinkedList<Integer> adj[];

    public BFSprob(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void insertEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public void BFS(int source) {
        boolean[] vis = new boolean[adj.length];
        int[] parent = new int[adj.length];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(source);
        parent[source] = -1;
        vis[source] = true;
        while (!q.isEmpty()) {
            int p = q.poll();
            System.out.println(p);
            for (int i : adj[p]) {
                if (!vis[i]) {
                    vis[i] = true;
                    q.add(i);
                    parent[i] = p;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        BFSprob t = new BFSprob(v);
        System.out.println("Enter edges");
        for (int i = 0; i < e; i++) {
            t.insertEdge(sc.nextInt(), sc.nextInt());
        }
        System.out.print("BFS traversal");
        t.BFS(sc.nextInt());
    }
}
