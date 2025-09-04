
import java.util.ArrayList;
import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 2);
        list.add(1, 7);
        list.add(2, 11);
        list.add(3, 15);
        // System.out.println("List" + list);
        int target = 7;
        int[] result = Sum(list,target);
        System.out.println(Arrays.toString(result));
        
    }

    public static int[] Sum (ArrayList<Integer> list, int target) {
        int[] ans = {-1, -1};
        if (list.isEmpty()) return ans;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
            if (list.get(i) + list.get(j) == target) {
                   ans[0] = i;  
                   ans[1] = j;  
                //    break;
                }
            }
        }
        return ans;
    }
}