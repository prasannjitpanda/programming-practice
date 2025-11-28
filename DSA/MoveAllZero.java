public class MoveAllZero {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while(index < arr.length) {
            arr[index++] = 0;
        }
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
}