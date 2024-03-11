import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class CountPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int res = countPairs(ar);
        System.out.println(res);
    }

    static int countPairs(int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                int c = map.get(ar[i]);
                map.put(ar[i], c + 1);
            } else {
                map.put(ar[i], 1);
            }
        }

        Collection<Integer> values = map.values();
        int pairCount = 0;
        for (int v : values) {
            pairCount += v / 2; // Count pairs for each frequency
        }
        return pairCount;
    }
}
