import java.util.*;
public class stockPrices {
    // brute force 
    public static int maxProfit(int arr[],int n ){
        int ans=0;
        for(int i =0;i<n-1;i++){
            int buy = arr[i];
            for(int j =i+1;j<n;j++){
                int sell = arr[j];
                int profit =0;
                profit = sell-buy;
                if(profit<0) profit = 0;
                ans=Math.max(profit,ans);
            }
        }
        return ans ;
    }
    // optimised
    public static int maxProfit2(int arr[],int n ){
        int maxProfit =0;
        int minprice = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
             minprice=Math.min(minprice,arr[i]);
             maxProfit=Math.max(maxProfit,arr[i]-minprice);
        }
        return maxProfit;
    } 

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,8};
        int n = arr.length;
        System.out.println(maxProfit(arr,n));
        System.out.println(maxProfit2(arr,n));
    }

   
}
