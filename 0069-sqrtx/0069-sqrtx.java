class Solution {
    public int mySqrt(int x) {
        long sqrt=1;
        long i=0;
        while(i<=x){
            i=sqrt*sqrt;
            if(i>=x)break;
            sqrt++;
        }
        if(i>x) return (int)sqrt-1;
        else return (int)sqrt;
    }
}