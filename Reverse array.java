class HelloWorld {
    static int[] arr;
    public static void main(String[] args) {
        arr = new int[]{1};
        //reverseArray(arr, 0);
        reverseArrayTwoPointers(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void reverseArray(int[] arr, int index) {
        if(index > (arr.length/2 - 1))
            return;
        int store = arr[arr.length - 1 - index];
        arr[arr.length - 1 -index] = arr[index];
        arr[index] = store;
        reverseArray(arr, index + 1);
    }
    
    public static void reverseArrayTwoPointers(int[] arr, int left, int right) {
        if(left >= right)
            return;
        
        int store = arr[left];
        arr[left] = arr[right];
        arr[right] = store;
        
        reverseArrayTwoPointers(arr, left + 1, right - 1);
    }
}
