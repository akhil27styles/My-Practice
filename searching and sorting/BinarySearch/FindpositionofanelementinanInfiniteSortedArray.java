
 class FindpositionofanelementinanInfiniteSortedArray
{
    public static int binary(int a[],int s,int l,int e){
        int res=0;
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
        return -1;
    }
	public static void main(String[] args) {
	int a[]={1,2,3,4,5,6,7,8,8,8,8,8,8,8,8,8,9,10,11,12,12,13,14,15,16,17,18,19,20,21,22,23,34};
	int s=0,l=1,ele=12;
	while(ele>a[l]){
	    s=l;
	    l=l*2;
	}
	int ans=binary(a,s,l,ele);
	System.out.println(ans);
	}
	
}
