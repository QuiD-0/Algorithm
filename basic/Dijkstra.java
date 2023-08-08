import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    static final int INF = 9999999;
    // 그래프를 표현 할 2차원 List
    static List<List<Node>> graph = new ArrayList<>();
    // 최단거리테이블을 표현 할 배열
    static int[] result;

    static void dijkstra(int index) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        result[index] = 0;
        pq.offer(new Node(index, 0));
        while(!pq.isEmpty()) {
            Node node = pq.poll();
            int nodeIndex = node.index;
            int distance = node.distacne;
            if(distance > result[nodeIndex]) {
                continue;
            }
            for (Node linkedNode : graph.get(nodeIndex)) {
                if(distance + linkedNode.distacne < result[linkedNode.index]) {
                    result[linkedNode.index] = distance + linkedNode.distacne;
                    pq.offer(new Node(linkedNode.index, result[linkedNode.index]));
                }
            }
        }
    }
    static class Node implements Comparable<Node>{
        int index; // 노드 번호
        int distacne; // 이동 할 노드까지의 거리
        Node(int index, int distacne) {
            this.index = index;
            this.distacne = distacne;
        }
        // 최단거리를 기준으로 오름차순 정렬합니다.
        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.distacne, o.distacne);
        }
    }

}
