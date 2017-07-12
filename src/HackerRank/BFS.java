package HackerRank;

import java.util.*;

/**
 * Basic BFS, edge lengths of 6.
 *
 * Problem description:
 * https://www.hackerrank.com/challenges/ctci-bfs-shortest-reach
 */
public class BFS {

    class Node {
        int nodeName;
        Node parent;
        int distance;

        Node(int nodeName, Node parent, int distance) {
            this.nodeName = nodeName;
            this.parent = parent;
            this.distance = distance;
        }
    }

    ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adjacencies, int startNode) {

        HashSet<Integer> visited = new HashSet<>();     // set of visited nodes
        LinkedList<Node> frontier = new LinkedList<>(); // frontier

        frontier.add(new Node(startNode, null, 0));

        while (!frontier.isEmpty()) {
            Node current = frontier.getFirst();

            for (int neighbour : adjacencies.get(current.nodeName)) {
                if (!visited.contains(neighbour)) {

                }
            }

        }


        return new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numProblems = in.nextInt();                   // number of problems to be read

        for (int p = 0; p < numProblems; p++) {
            // set up arrayList of arrayLists to store adjacent nodes
            int numNodes = in.nextInt();
            ArrayList<ArrayList<Integer>> adjacencies = new ArrayList<>();
            for (int node = 0; node < numNodes; node++) {
                adjacencies.add(new ArrayList<>());               // create empty arraylist for each node
            }

            int numEdges = in.nextInt();
            for (int edge = 0; edge < numEdges; edge++) {                   // populate matrix
                int u = in.nextInt();
                int v = in.nextInt();
                adjacencies.get(u).add(v);              // add adjacents in both directions
                adjacencies.get(v).add(u);
            }

            int startNode = in.nextInt();

            BFS sol = new BFS();

            ArrayList<Integer> results = sol.bfs(adjacencies, startNode);

            for (int result : results) {
                System.out.print(result + " ");
            }
        }
    }
}
