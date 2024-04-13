import java.util.Arrays;

public class p6 {
    public static void main(String[] args) {
        int[] arr = {345,3842,6,42422,453};
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("The reversed array is" + (Arrays.toString(arr)));

    }
}
