class Solution {
    public int totalNumbers(int[] digits) {
      Set<Integer> set = new HashSet<>(); 
      for(int i = 0;i < digits.length;i++){
        for(int j = 0;j < digits.length;j++){
            for(int k = 0;k < digits.length;k++){
                //same index cannot be reused
                if(i == j || j == k || i == k)
                continue;

                // hundreds digit cannot be zero
                if(digits[i] == 0)
                continue;

                //last digit must be even
                if(digits[k] % 2 != 0)
                continue;

                int num = digits[i] * 100+digits[j] * 10+digits[k];
                set.add(num);
            }
        }
      }
      return set.size();
    }
}