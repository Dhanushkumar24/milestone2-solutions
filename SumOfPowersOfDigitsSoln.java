        String number = String.valueOf(input1);
        int len = number.length();
        int sum = 0;
        for (int i = 0; i < len - 1; i++) {
            int first = Integer.parseInt(String.valueOf(number.charAt(i)));
            int second = Integer.parseInt(String.valueOf(number.charAt(i + 1)));
            sum += Math.pow(first, second);
        }
        return sum + 1;
