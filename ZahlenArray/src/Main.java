public class Main {
    public static void main(String[] args) {
        ZahlenArray z = new ZahlenArray();
        int[] arr = {4, 8, 3, 10, 17};
        System.out.println("Max: " + z.getMax(arr));
        System.out.println("Min: " + z.getMin(arr));
        System.out.println("MaxSum: " + z.getMaxSum(arr));
        System.out.println("MinSum: " + z.getMinSum(arr));
    }
}