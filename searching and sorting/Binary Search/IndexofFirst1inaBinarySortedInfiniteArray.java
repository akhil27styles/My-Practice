
class  IndexofFirst1inaBinarySortedInfiniteArray
{

    public static int first(int a[],int s,int l,int ele){
      int res=-1;
	    while(s<=l){
	        int mid=s+(l-s)/2;
	        if(a[mid]==ele){
	            res=mid;
	            l=mid-1;
	        }
	        else if(a[mid]>ele){
              l=mid-1; 
	        }
	        else{
              s=mid+1;
	        }
	    }
	    return res;
	}
	public static void main(String[] args) {
	int a[]={0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	int s=0,l=1,ele=1;
	while(ele>a[l]){
	    s=l;
	    l=l*2;
	}
	int ans=first(a,s,l,ele);
	System.out.println(ans);
	}
	
}
