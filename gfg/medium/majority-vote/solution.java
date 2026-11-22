class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        int c1 = 0, c2 = 0;
        int cnt1 = 0, cnt2 = 0;
        for (int num : arr) {
            if (num == c1) cnt1++;
            else if (num == c2) 
                cnt2++;
            else if (cnt1 == 0) 
            {
                c1 = num;
                cnt1 = 1;
            }
            else if (cnt2 == 0) {
                c2 = num;
                cnt2 = 1;
            } 
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        for (int num : arr) {
            if (num == c1)
                cnt1++;
            else if (num == c2) cnt2++;
        }
        int t = n / 3;
        if (cnt1 > t) al.add(c1);
        if (cnt2 > t) al.add(c2);
        Collections.sort(al);
        return al;
    }
}