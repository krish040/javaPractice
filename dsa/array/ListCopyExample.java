import java.util.List;
import java.util.ArrayList;

public class ListCopyExample {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();


        ds.add(1);
        ans.add(new ArrayList<>(ds));  // add copy

        ds.add(2);
        ans.add(new ArrayList<>(ds));  // add copy

        ds.add(3);
        ans.add(new ArrayList<>(ds));  // add copy

        //System.out.println(ans);

/********************************************************************* */

        List<List<Integer>> ans1 = new ArrayList<>();
        List<Integer> ds1 = new ArrayList<>();

        ds1.add(1);
        ans1.add(ds1);  // no copy

        ds1.add(2);
        ans1.add(ds1);  // same ds1

        ds1.add(3);
        ans1.add(ds1);  // same ds1

        //System.out.println(ans1);
    }
}
