public class Recursion1{
    public int reverseExponentiation(int n) {
        // find power of a number
        int ans = 0 , n1 = n;
        while(n1>0){
        int r= n1%10;
        ans = ans*10 + r;
        n1 = n1/10;
        }
        int res =1;
        while(ans>0){
            if(ans%2 != 0){
                res *= n;
            }
            n *= n;
            ans/=2;
        }
        return res;
        
    }

    //(printing increasing, decreasing and Decreasing Increasing)
    static void printTillN(int N) {
        if(N==0) return;
        printTillN(N-1);
        System.out.print(N+" ");
    }

    //Given a positive integer n, count the number of digits in n that divide n evenly 
    //(i.e., without leaving a remainder). Return the total number of such digits.
    static int evenlyDivides(int n) {
        int n1 = n;
        int c=0;
        while(n1>0){
            int r = n1%10;
            if(r != 0 && n%r == 0){
                c++;
            }
            n1 = n1/10;
        }
        return c;
    }

    //fibonacci number
    public int nthFibonacci(int n) {
        // code here
        if(n==0 || n==1) return n;
        
        return nthFibonacci(n-1)+ nthFibonacci(n-2);
    }
    public static void main(String[] args) {
        
    }
}