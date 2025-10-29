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

void main() {
}