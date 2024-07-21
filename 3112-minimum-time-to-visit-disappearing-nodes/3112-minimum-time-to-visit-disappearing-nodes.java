import java.util.*;

class Pair {
    int node;
    int weight;

    Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

class Solution {
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        List<Pair>[] graph = new ArrayList[n];
        for (int index = 0; index < n; index++) {
            graph[index] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(new Pair(edge[1], edge[2]));
            graph[edge[1]].add(new Pair(edge[0], edge[2]));
        }

        int[] result = new int[n];
        Arrays.fill(result, Integer.MAX_VALUE);
        result[0] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));
        pq.add(new Pair(0, 0));

        boolean[] visited = new boolean[n];

        while (!pq.isEmpty()) {
            Pair curNode = pq.poll();
            if (visited[curNode.node]) continue;
            visited[curNode.node] = true;

            for (Pair connectedNode : graph[curNode.node]) {
                int curTime = curNode.weight + connectedNode.weight;
                if (curTime < result[connectedNode.node] && curTime < disappear[connectedNode.node]) {
                    result[connectedNode.node] = curTime;
                    pq.add(new Pair(connectedNode.node, curTime));
                }
            }
        }

        for (int index = 0; index < n; index++) {
            if (result[index] > disappear[index]) {
                result[index] = -1;
            }
        }

        return result;
    }
}
