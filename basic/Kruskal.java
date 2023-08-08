import java.util.Arrays;
import java.util.Scanner;

public class Kruskal {
    static int V, E;
    static int[][] graph;
    static int[] parent;
    static int final_cost;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        graph = new int[E][3];
        for (int i = 0; i < E; i++) {
            graph[i][0] = sc.nextInt();
            graph[i][1] = sc.nextInt();
            graph[i][2] = sc.nextInt();
        }
        parent = new int[V];
        final_cost = 0;

        Arrays.sort(graph, (o1, o2) -> Integer.compare(o1[2], o2[2]));

        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < E; i++) {
            if (find(graph[i][0] - 1) != find(graph[i][1] - 1)) {
                System.out.println("<선택된 간선>");
                System.out.println(Arrays.toString(graph[i]));
                union(graph[i][0] - 1, graph[i][1] - 1);
                final_cost += graph[i][2];
                System.out.println("<각 노드가 가리키고 있는 부모>");
                System.out.println(Arrays.toString(parent) + "\n");
                continue;
            }
        }

        System.out.println("최종 비용 : " + final_cost);
        sc.close();
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a > b) {
            parent[a] = b;
        } else {
            parent[b] = a;
        }
    }

    private static int find(int x) {
        if (parent[x] == x)
            return x;
        else
            return find(parent[x]);
    }
}
