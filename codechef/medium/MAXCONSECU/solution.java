    public static int findMaxConsecutiveOnes(int[] nums) {
       //write code here...
       int cnt = 0, maxCnt = 0;
       for(int num : nums){
           if(num == 1){
               cnt++;
               maxCnt = Math.max(cnt, maxCnt);
           }
           else cnt = 0;
       }
       return maxCnt;
    }
