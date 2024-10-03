package Heap;

import java.util.PriorityQueue;

public class NearestPoint {
    public static class Point implements Comparable<Point> {
        int x;
        int y;
        int distance;
        int index;

        Point(int x, int y, int distance, int index) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.index = index;

        }

        @Override
        public int compareTo(Point p2) {
            return this.distance - p2.distance;
        }
    }

    public static void main(String[] args) {
        int pnt[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pnt.length; i++) {
            int distance = pnt[i][0] * pnt[i][0] + pnt[i][1] * pnt[i][1];
            pq.add(new Point(pnt[i][0], pnt[i][1], distance, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().index);
        }
    }
}
