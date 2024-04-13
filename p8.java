import java.util.Arrays;

public class p8 {
    public static void main(String[] args) {
        int[] arr = {9,5,25,84,-4,1};
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = 1;
            while(right < arr.length) {
                if(arr[left] < arr[right]){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                left++;
                right++;
            }

    }
    System.out.println(Arrays.toString(arr));
    }
}
