import java.util.HashMap;

public class twoSum{
    static int[] find_2sum(int size , int arr[],int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int brr[] = new int[2];
        brr[0]=brr[1]=-1;

        for(int i=0;i<size;i++){
            int rem = target - arr[i];
            if(hm.containsKey(rem)){
                brr[0]=hm.get(rem);
                brr[1] = i;
                return brr;
            } 
            hm.put(arr[i],i);
        }
        return brr;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 12, 8, 11};
        int target = 14;
        int[] ans = find_2sum(n, arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                           + ans[1] + "]");

    }
}