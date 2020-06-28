
class MinimumDifferenceElementinaSortedArray
{
    public static int binary(int a[],int s,int l,int e){
        while(s<=l){
            int mid=s+(l-s)/2;
            if(e==a[mid]){
                return mid;
            }
            if(a[mid]<e){
                s=mid+1;
            }
            if(a[mid]>e){
              l=mid-1;
            }
        }
        if(Math.abs(a[s]-e)>Math.abs(a[l]-e)){
         return a[l];   
        }
       
        return a[s];
    }
   
	public static void main(String[] args) {
	int a[]={1,3,8,10,15};
	int s=0,l=a.length,ele=12;
	int ans=binary(a,s,l,ele);
	System.out.println(ans);
	}
	
}
