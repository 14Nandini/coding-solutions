class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> l = new ArrayList<>();
        l.add(n);
        while(n>1){
            if(n%2==0){
                n =(long) Math.floor(Math.sqrt(n));
                l.add(n);
            }
            else{
                n =(long)Math.floor(Math.pow(n,1.5));
                l.add(n);
            }
        }
        return l;
    }
}