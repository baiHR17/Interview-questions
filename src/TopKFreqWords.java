import java.util.*;

public class TopKFreqWords {
    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        System.out.println(func(words, 4));
        // ["the", "is", "sunny", "day"]
    }
    public static List<String> func(String[] words, int k) {
        Map<String, Integer> count = new HashMap();

        for (String word: words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> heap = new PriorityQueue<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int count1 = count.get(o1);
                int count2 = count.get(o2);
                return count1 - count2;
            }
        });

        for (String word: count.keySet()) {
            heap.offer(word); // offer = insert word into heap
            if (heap.size() > k) heap.poll();
        }

        List<String> ans = new ArrayList();
        while (!heap.isEmpty()) ans.add(heap.poll());
        Collections.reverse(ans);
        return ans;
    }
}
