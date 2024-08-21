import java.util.*;

public class rearrange {
    public static ArrayList<Integer> rearrange(ArrayList<Integer> arr, int n){
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int plus =0,minus=1;
        for(int i =0;i<n;i++){
            if(arr.get(i)<0){
                ans.set(minus,arr.get(i));
                minus+=2;
            } else{
                ans.set(plus,arr.get(i));
                plus+=2;
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
        ArrayList<Integer> ans = rearrange(A, 4);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
