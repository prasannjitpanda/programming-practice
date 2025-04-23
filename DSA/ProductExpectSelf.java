public class ProductExpectself {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
            int product = 1;
            for(int j=0; j<nums.length; j++) {
                if(i != j) {
                    product *= nums[j]; //multiply other numbers
                }
            }
            result[i] = product;
        }
        //print the result
        for(int num : result) {
            System.out.print(num + " ");                                                
        }
    }
}