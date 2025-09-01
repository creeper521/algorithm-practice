package hot100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class t53 {
    List<List<Integer>> edges;//记录从i指向别的课程的所有，是一个有向图
    int[] indeg;//记录度数
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for(int i = 0;i < numCourses;i++){
            edges.add(new ArrayList<Integer>());
        }
        indeg = new int[numCourses];
        for(int[] num : prerequisites){
            edges.get(num[1]).add(num[0]);
            indeg[num[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i < numCourses; i++){
            if(indeg[i] == 0){
                queue.offer(i);
            }
        }

        int sum = 0;
        while(!queue.isEmpty()){
            int now = queue.poll();
            sum++;
            for(int x : edges.get(now)){
                indeg[x]--;
                if (indeg[x] == 0){
                    queue.offer(x);
                }
            }
        }
        return sum == numCourses;
    }
}
