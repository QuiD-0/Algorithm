import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] board = {
            {"A", "B", "T", "T", "T"},
            {"T", "C", "D", "E", "T"},
            {"T", "T", "T", "F", "T"},
            {"T", "T", "T", "G", "T"},
            {"C", "B", "A", "H", "I"}
        };
        System.out.println(solution.solution(board));


    }

    class Solution {
        public int solution(String[][] board) {
            int answer = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    int result = bfs(i, j, board);
                    answer = Math.max(answer, result);
                }
            }
            return answer;
        }

        private int bfs(int x, int y, String[][] board) {
            int answer = 0;
            int[] dx = {0, 0, 1, -1};
            int[] dy = {1, -1, 0, 0};
            boolean[][] visited = new boolean[5][5];
            visited[x][y] = true;
            Queue<Node> queue = new LinkedList<>();
            queue.add(new Node(x, y, 1, false, visited));
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                answer = Math.max(answer, node.count);
                for (int i = 0; i < 4; i++) {
                    int nx = node.x + dx[i];
                    int ny = node.y + dy[i];
                    if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5) {
                        continue;
                    }
                    if (node.visited[nx][ny]) {
                        continue;
                    }
                    if (board[nx][ny].charAt(0) > board[node.x][node.y].charAt(0)) {
                        node.visited[nx][ny] = true;
                        queue.add(new Node(nx, ny, node.count + 1, node.chance, node.visited));
                    } else {
                        if (!node.chance) {
                            node.visited[nx][ny] = true;
                            queue.add(new Node(nx, ny, node.count + 1, true, node.visited));
                        }
                    }
                }
            }
            return answer;
        }
    }

    private boolean[][] deepCopy(boolean[][] original) {
        if (original == null) {
            return null;
        }
        boolean[][] result = new boolean[original.length][original[0].length];
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                result[i][j] = original[i][j];
            }
        }
        return result;
    }

     class Node {
        int x;
        int y;
        int count;
        boolean chance;
        boolean[][] visited;

        public Node(int x, int y, int count, boolean chance, boolean[][] visited) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.chance = chance;
            this.visited = deepCopy(visited);
        }
    }
}
