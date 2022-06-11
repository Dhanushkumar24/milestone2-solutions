
        int arr[] = new int[10];
        for (int i = 0; i < input2; i++) {
            int number = input1[i];
            while (number != 0) {
                int temp = number % 10;
                arr[temp] += 1;
                number = number / 10;
            }
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            } else if (arr[i] == max) {
                index = i;
            }
        }
        return index;
