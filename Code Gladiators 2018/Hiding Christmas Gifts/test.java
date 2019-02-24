import java.lang.reflect.Array;
import java.util.*;
import static java.lang.System.*;
public class test {
	private static class pair<First, Second>{
        First first;
        Second second;
        pair(First first,Second second){
            this.first = first;
            this.second = second;
        }
        @Override
        public String toString(){
            return (first + " " + second);
        }
        @Override
        public boolean equals(Object o){
            if(this == o)
                return true;
            if(o == null || getClass() != o.getClass())
                return false;
            pair<?,?> pair = (pair<?, ?>) o;
            if(!first.equals(pair.first)) return false;
            return second.equals(pair.second);
        }
        @Override
        public int hashCode(){
            return 31 * first.hashCode() + second.hashCode();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<Integer>[] store = new ArrayList[n];
        for (int i = 0; i < store.length; i++)
            store[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int u = s.nextInt() - 1;
            int v = s.nextInt() - 1;
            store[u].add(v);
            store[v].add(u);
        }
        int arr[][] = new int[m][2];
       // for (int i = 0; i < arr.length; i++) {
         //   arr[i][0] = s.nextInt() - 1;
           // arr[i][1] = s.nextInt() - 1;
        //}
        // for keeping the unique pairs for queries
       // HashSet<pair<Integer, Integer>> storing = new HashSet<>();
        test.count = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int one = s.nextInt() - 1;
            int two = s.nextInt() - 1;
            String save = one + "" + two;
            if(patharray.get(save) == null){
                foo(store, one, two, n);
            }
            else{
                ArrayList<Integer> ind = patharray.get(save);
                for(int j = 0; j < ind.size(); j++)
                	count[ind.get(j)]++;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < count.length; i++){
        	max = Math.max(max, count[i]);
        }
        out.println(max);
        
    }
    private static HashMap<String, ArrayList<Integer>> patharray = new HashMap<>();
    private static int[] count;

    private static boolean bfs(ArrayList<Integer>[] arr, int src, int des, int[] pred, int[] dist, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++){
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        while(!queue.isEmpty()){
            int u = queue.remove();
            for(int i = 0; i < arr[u].size(); i++){
                if(!visited[arr[u].get(i)]){
                    visited[arr[u].get(i)] = true;
                    dist[arr[u].get(i)] = dist[u] + 1;
                    pred[arr[u].get(i)] = u;
                    queue.add(arr[u].get(i));
                    if(arr[u].get(i) == des)
                        return true;
                }
            }
        }
        return false;
    }

    public static void foo(ArrayList<Integer>[] arr, int src, int des, int n) {
        int pred[] = new int[n];
        int dist[] = new int[n];
        if (!bfs(arr, src, des, pred, dist, n)) {
            return;
        }
        ArrayList<Integer> path = new ArrayList<>();
        int crawl = des;
        path.add(crawl);
        // storing which node is visited globally
        count[crawl]++;
        while(pred[crawl] != -1){
            path.add(pred[crawl]);
            count[pred[crawl]]++;
            crawl = pred[crawl];
        }

        // storing all the calculated path globally
        patharray.put(src + "" + des, path);

       /* for(int i = path.size() - 1; i >= 0; i--){
            count[path.get(i)]++;
        }*/
    }
}
