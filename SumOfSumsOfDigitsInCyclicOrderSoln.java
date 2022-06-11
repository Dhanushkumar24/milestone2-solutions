 String number = String.valueOf(input1);
        int len = number.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                sum += Integer.parseInt(String.valueOf(number.charAt(j)));
            }
        }
        return sum;
