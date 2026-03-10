import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> result = new ArrayList<>();
        int n = pairs.size();

        if (n == 0) return result;

        for (int i = 0; i < n; i++) {
            Pair current = pairs.get(i);
            int j = i - 1;

            // shifting elements to the right
            while (j >= 0 && pairs.get(j).key > current.key) {
                pairs.set(j + 1, pairs.get(j));
                j--;
            }
            // insert element
            pairs.set(j + 1, current);

            // shadow copy of the list
            result.add(new ArrayList<>(pairs));
            System.out.println("iteration = " + i + " : "+result);
        }
        return result;
    }
}
