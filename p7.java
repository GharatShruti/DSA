public class p7 {
    public static void main(String[] args) {
        int[] arr = {89,43,-8,56,-87,102};
        int highest = -99999;
        int lowest = 99999;
        for(int element : arr) {
            if(element > highest) {
                highest = element;
            }
            if(element < lowest) {
                lowest = element;
            }
        }
        int difference = highest - lowest;
        System.out.println("The difference is " + difference);
    }
}
