import java.util.*;
import java.lang.*;
import java.io.*;
class Common
 {
	public static void main (String[] args)
	 {
	 Scanner sc= new Scanner(System.in);
	 int tc= sc.nextInt();
	 while(tc -- >0)
	 {
	     int n1=sc.nextInt();
	     int n2=sc.nextInt();
	     int n3=sc.nextInt();
	    
	        LinkedHashSet<Integer> h1=new LinkedHashSet<Integer>();
            LinkedHashSet<Integer> h2=new LinkedHashSet<Integer>();
            LinkedHashSet<Integer> h3=new LinkedHashSet<Integer>();
          
	     for(int i=0;i<n1;i++)
	     h1.add(sc.nextInt());
	     for(int i=0;i<n2;i++)
	     h2.add(sc.nextInt());
	     h1.retainAll(h2);
	     for(int i=0;i<n3;i++)
	     h3.add(sc.nextInt());
	    h1.retainAll(h3);
	     int length=h1.size();
         if(length>=1){
             Iterator<Integer> i = h1.iterator(); 
        while (i.hasNext()) 
            System.out.print(i.next()+" ");   
         }
         else{
             System.out.print("-1");
         }
         System.out.println();
	 }
}}



// 2nd method 

/*package whatever //do not write package name here */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class GFG {
// 	public static void main (String[] args) {
// 		//code
// 		Scanner sc=new Scanner(System.in);
// 		int t=sc.nextInt();
// 		while(t>0){
// 		    int n1=sc.nextInt();
// 		    int n2=sc.nextInt();
// 		    int n3=sc.nextInt();
// 		    int a1[]=new int[n1];
// 		     int a2[]=new int[n2];
// 		      int a3[]=new int[n3];
// 		    LinkedHashSet<Integer> hs=new LinkedHashSet<>();
// 		    for(int i=0;i<n1;i++){
// 		        a1[i]=sc.nextInt();
// 		        hs.add(a1[i]);
// 		    }
// 		    for(int i=0;i<n2;i++){
// 		        a2[i]=sc.nextInt();
// 		    }
// 		    for(int i=0;i<n3;i++){
// 		        a3[i]=sc.nextInt();
// 		    }
// 		    LinkedHashSet<Integer> hs1=new LinkedHashSet<>();
// 		    for(int i=0;i<n2;i++){
// 		        if(hs.contains(a2[i])){
// 		            hs1.add(a2[i]);
// 		        }
// 		    }
// 		    boolean c=true;
// 		    LinkedHashSet<Integer> hs2=new LinkedHashSet<>();
// 		    for(int i=0;i<n3;i++){
// 		        if(hs1.contains(a3[i])){
// 		            c=false;
// 		            hs2.add(a3[i]);
// 		        }
// 		    }
// 		    Iterator i=hs2.iterator();
// 		    while(i.hasNext()){
// 		        System.out.print(i.next()+" ");
// 		    }
// 		    if(c==true){
// 		        System.out.print(-1);
// 		    }
// 		    System.out.println();
// 		    t--;
// 		}
// 	}
// }



