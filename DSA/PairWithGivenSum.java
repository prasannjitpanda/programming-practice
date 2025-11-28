public class PairWithGivenSum {
    public static void main(String[] args) {
        int[]arr={1,4,5,6,8};
        int target=10;
        int left=0, right=arr.length-1;
        while(left<right) {
            int sum=arr[left]+arr[right];
            if(sum==target) {
                System.out.println(arr[left]+"+"+arr[right]+"="+target);
                return;
            }
            else if(sum<target) {
                left++;
            }
            else {
                right--;                            
            }
        }
    }
}