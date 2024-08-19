import java.util.Arrays;
public class longestConsSeq {
    public static int longest(int arr[],int n){
                Arrays.sort(arr);
                int ans = 1; 
                int count = 1; 
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] + 1 == arr[i + 1]) {
                        count++; 
                    } else {
                        ans = Math.max(count, ans); 
                        count = 1; 
                    }
                }
                ans = Math.max(count, ans); 
                return ans;
            }
        
            public static void main(String[] args) {
                int arr[] = {100, 200, 1, 3, 2, 4,54,58,23,55,98,56,3,57};
                int n = arr.length;
                System.out.println("Length of longest consecutive sequence is " + longest(arr, n));
            }
}
