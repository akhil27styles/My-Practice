public class SubsetSum
{
    public static boolean isSubsetSum(int arr[],int n,int sum){
        boolean t[][] = new boolean[n + 1][sum + 1]; 
          
            for(int i=0;i<=n;i++){
                for(int j=0;j<=sum;j++){
                    if(i==0){
                        t[i][j]=false;
                    }
                    if(j==0){
                        t[i][j]=true;
                    }
                    if(i>0&&j>0){
                    if(arr[i-1]<=j){
                        t[i][j]=(t[i][j-arr[i-1]]||t[i-1][j]);
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
        int set[] = { 3, 34, 4, 12, 5, 2 }; 
        int sum = 9; 
        int n = set.length; 
        if (isSubsetSum(set, n, sum) == true) 
            System.out.println("Found a subset"
                               + " with given sum"); 
        else
            System.out.println("No subset with"
                               + " given sum"); 
    } 
}
