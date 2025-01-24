class Poweroftwo {
    public static boolean solve(int n,int x){
        // if(x < 0)return false;
        // if(Math.pow(2,x) == n)return true;
        // return solve(n,x-1);
        if(Math.pow(2,x) > n)return false; //base case;
        if(Math.pow(2,x) == n)return true;
        return solve(n,x+1);


    }
    public static boolean isPowerOfTwo(int n) {
        int x = 0;
        return solve(n,x);
        
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
}