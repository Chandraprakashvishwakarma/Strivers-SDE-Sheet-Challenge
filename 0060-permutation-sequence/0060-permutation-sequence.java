/*
Q. no. 54: kth Permutation Sequence
*/

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList();
        int fact =1;
        for(int i=1;i<n;i++){
            fact*=i;
            nums.add(i);
        }
        nums.add(n);
        String res ="";
        k--;
        while(true){
            res=res+nums.get(k/fact);
            nums.remove(k/fact);
            if(nums.size()==0) break;
            k=k%fact;
            fact=fact/nums.size();
        }
        return res;
    }
}

/*
Codding Ninjas:
import java.util.*;

public class Solution {
    public static String kthPermutation(int n, int k) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int fact =1;
        for(int i=1;i<n;i++){
            fact*=i;
            numbers.add(i);
        }
        numbers.add(n);
        k--;
        String ans = "";
        while(true){
            ans = ans+numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.size()==0) break;
            k=k%fact;
            fact = fact/numbers.size();
        }
        return ans;
    }
}
*/