import java.util.List;
import java.util.ArrayList;

public class PermuationOptimal {
    
    public static void recurPermute(int index, int[] nums, List<List<Integer>> ans) { 
        if(index== nums.length) { 
            // copy the ds to ans 
            List<Integer> ds =new ArrayList<>(); 
            for(int i=0;i<nums.length;i++) { 
                ds.add(nums[i]); 
            }
            ans.add(new ArrayList<>(ds)); 
            return; 
        }
        for (int i=index; i<nums.length;i++) { 
            swap(i, index, nums); 
            recurPermute(index+1, nums, ans); 
            swap(i, index, nums); 
        }
    }
        
    static void swap(int i, int j, int[] nums) {
        int temp =nums[i]; 
        nums[i]= nums[j];
        nums[j]=temp; 
    } 

    static List<List<Integer>> permute(int[] nums) { 
        List <List<Integer>> ans= new ArrayList<>(); 
        recurPermute(0, nums, ans); 
        return ans; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans=permute(arr);

        for (List<Integer> i:ans){
            System.out.println(i);
        }
    }
}
