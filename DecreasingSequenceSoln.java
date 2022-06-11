        if (input2 == 1 || input2 == 0) return new Result(0, 0);
        // u can throw exception for input2<0 (optional)
        int arr[] = new int[input2];
        for (int i = 0; i < input2 - 1; i++) {
            for (int j = i; j < input2 - 1; j++) {
                if (input1[j] > input1[j + 1]) {
                    arr[i]++;
                    if (j == input2 - 2) {
                        i = j + 1;
                    }
                } else {
                    i = j;
                    break;
                }
            }

        }
        int count = 0;
        int max = -999999999;// can use INT_MAX
        for (int k = 0; k < input2; k++) {
            if (arr[k] > 0) {
                count++;
            }
            if (arr[k] > max) {
                max = arr[k];
            }
        }


        if (max > 0) {
            max += 1;
        }
        return new Result(count, max);
