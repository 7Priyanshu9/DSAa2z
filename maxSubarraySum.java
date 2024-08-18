public class maxSubarraySum {
    public static int cal_max(int n, int arr[]){
        int ans = 0;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=arr[i];
            if(sum>ans){
                ans =sum;
            }

            if(sum == 0){
                sum =0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]= {-3,4,5,1,-7,2,-9,7,4,3,-1};
        int n = arr.length;
        System.out.println("Max sum is :" + cal_max(n, arr));
    }
}
