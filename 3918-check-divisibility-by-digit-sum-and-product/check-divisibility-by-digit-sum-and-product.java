class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0; 
        int pro=1;
        int original=n;
        while(n>0){
            int digit = n % 10;
            sum += digit;
            pro *= digit;
            n /= 10;

        }
        int divisor = sum + pro;
        return original % divisor == 0;

    }
}