class Solve{
    
    long maxArea(int A[], int len){
        // Code Here
        long res=0;
        int li=0,hi=len-1;
        while(li<hi){
            res=Math.max(res,(hi-li)*Math.min(A[li],A[hi]));
            if(A[li]<A[hi]){
                li++;
            }
            else{
                hi--;
            }
        }
        return res;
    }
    
}
https://practice.geeksforgeeks.org/problems/container-with-most-water0535/1/?category[]=Mathematical&difficulty[]=0&difficulty[]=1&page=1&query=category[]Mathematicaldifficulty[]0difficulty[]1page1#
