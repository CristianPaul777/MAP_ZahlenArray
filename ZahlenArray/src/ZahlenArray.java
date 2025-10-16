public class ZahlenArray {

    public int getMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public int getMin(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    public int getMaxSum(int[] arr) {
        int min = getMin(arr);
        int sum = 0;
        for (int n : arr) sum += n;
        return sum - min;
    }

    public int getMinSum(int[] arr) {
        int max = getMax(arr);
        int sum = 0;
        for (int n : arr) sum += n;
        return sum - max;
    }
}