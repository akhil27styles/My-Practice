public class targetsum
{
    public static int isSubsetSum(int arr[],int n,int diff){
        int s1=0;
        for(int i=0;i<arr.length;i++){
            s1+=arr[i];
        }
        int sum=0;
        sum=(diff+s1)/2;
        int t[][] = new int[n+1][sum+1]; 
          
            for(int i=0;i<=n;i++){
                for(int j=0;j<=sum;j++){
                    if(i==0){
                        t[i][j]=0;
                    }
                    if(j==0){
                        t[i][j]=1;
                    }
                    if(i>0&&j>0){
                    if(arr[i-1]<=j){
                        t[i][j]=(t[i-1][j-arr[i-1]]+t[i-1][j]);
                    }
                    else{
                        t[i][j]=t[i-1][j];
                    }
                    }
                }
            }
             return t[n][sum];
            
            
            
    }
public static void main(String args[]) 
    { 
        int set[] = {1,6,2,4};//{1,1,3,2} 
        
        int n = set.length; 
        int diff=2;
        int ans=isSubsetSum(set, n,diff); 
          System.out.println(ans);
    } 
}
