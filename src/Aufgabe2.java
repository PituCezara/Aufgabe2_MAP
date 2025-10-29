//Es gibt ein Array mit n positiven Zahlen.
//        1. Finden Sie die maximale Zahl.
//2. Finden Sie die minimale Zahl.
//3. Finden Sie die maximale Summe von n- 1 Zahlen.
//        z.B. [4, 8, 3, 10, 17] => 4 + 8 + 10 + 17 = 39
//        4. Finden Sie die minimale Summe von n -1 Zahlen.
//        z.B. [4, 8, 3, 10, 17] => 4 + 8 + 3 + 10 = 25

// maximul
public static int max(int[] arr) {
    int max = arr[0];
    for (int num : arr) {
        if (num > max)
            max = num;
    }
    return max;
}

// Minimul
public static int min(int[] arr) {
    int min = arr[0];
    for (int num : arr) {
        if (num < min)
            min = num;
    }
    return min;
}


// suma maximă a n-1 elemente ( suma totală - minimul)
public static int maxSum(int[] arr) {
    int sum = 0;
    int min = arr[0];
    for (int num : arr) {
        sum += num;
        if (num < min)
            min = num;
    }
    return sum - min;
}

//  Suma minimă a n-1 elemente (suma totală - maximul)
public static int minSum(int[] arr) {
    int sum = 0;
    int max = arr[0];
    for (int num : arr) {
        sum += num;
        if (num > max)
            max = num;
    }
    return sum - max;
}

// Test
public static void main(String[] args) {
    int[] arr = {4, 8, 3, 10, 17};

    System.out.println("Array: " + Arrays.toString(arr));
    System.out.println(" Max: " + max(arr));
    System.out.println(" Min: " + min(arr));
    System.out.println(" Maximale Summe (n-1 Zahlen): " + maxSum(arr)); // 39
    System.out.println(" Minimale Summe (n-1 Zahlen): " + minSum(arr)); // 25
}


