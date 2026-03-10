import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair(3,"A"));
        pairs.add(new Pair(1,"B"));
        pairs.add(new Pair(2,"C"));
        Sorting sorting = new Sorting();
        sorting.insertionSort(pairs);
    }

}
