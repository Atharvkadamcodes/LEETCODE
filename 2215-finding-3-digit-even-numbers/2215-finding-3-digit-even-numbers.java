class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> arr = new TreeSet<>();
        for(int i = 0; i < digits.length; i++) {
            for(int j = 0; j < digits.length; j++) {
                for(int k = 0; k < digits.length; k++) {
                    if(j!=i && k!=j && k!=i) {
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        if(num % 2 == 0 && (num > 99 && num < 1000)) {
                            arr.add(num);
                        }
                    }
                }               
            }
        }

        int[] lastArr = new int[arr.size()];
        int i = 0;
        for(int array : arr) {
            lastArr[i] = array;
            i++;
        }
        
        Arrays.sort(lastArr);
        return lastArr;
    }
}