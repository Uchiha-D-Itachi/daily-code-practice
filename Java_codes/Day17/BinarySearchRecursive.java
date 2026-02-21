public class BinarySearchRecursive {

    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == key)
            return mid;

        if (arr[mid] > key)
            return binarySearch(arr, low, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int result = binarySearch(arr, 0, arr.length - 1, 30);
        System.out.println("Index = " + result);
    }
}
