class findduplicates {
public static void printDuplicates(int a[], int n) {
boolean c=false;
    
    for(int i=0;i<n;i++){
    int ind=a[i]%n;
        a[ind]=a[ind]+n;
    }
    for(int i=0;i<n;i++){
        if(a[i]/n>1){
            System.out.print(i+" ");
            c=true;
        }
    }
    if(!c){
        System.out.print(-1);
    }
             
    }
}

-----------------------------------------------------------------
Explaination
a=[1,3,2,1,2]   n=5
i=0
ind=1%3
ind=1
a[1]=a[1]+5
a[1]=8

i=1
ind=3%5
ind=3
a[3]=a[3]+5
a[3]=2+5
a[3]=7
i=2
ind=2%5
ind=2
a[2]=a[2]+2
a[2]=2+2
a[2]=4
i=3
ind=1%5
ind=1
a[1]=a[1]+5
a[1]=3+5
a[1]=8
i=4
ind=a[4]%5
ind=2%5
a[2]=a[2]+5
a[2]=2+5
a[2]=7

a[1]=8+4=12
a[2]=7+4=11

and there a[1]/n is>1 return 1 and 2
