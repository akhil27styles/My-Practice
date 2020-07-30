import java.util.Scanner;

public class MinmumScalarProductOfTwoVectors

{

    public static int MScalarProduct(int arr1[],int arr2[],int n)

    {

        int sum=0;

        for(int i=0;i<n;i++)

        {

            sum=sum+arr1[i]*arr2[i];

        }  

        return sum;  

    }

    public static void sort(int arr1[],int arr2[],int n)

    {

        int temp=0;

        for(int i=0;i<n;i++)

        {

            for(int j=0;j<n;j++)

            {

                if(arr1[i]<arr1[j])

                {

                    temp=arr1[i];

                    arr1[i]=arr1[j];

                    arr1[j]=temp;

                }

            }

             for(int j=0;j<n;j++)

            {

                if(arr2[i]>arr2[j])

                {

                    temp=arr2[i];

                    arr2[i]=arr2[j];

                    arr2[j]=temp;

                }

            }

        }

    }

public static void main(String[] args) 

{

    Scanner sc=new Scanner(System.in);

    int[] a1=new int[50];

    int[] a2=new int[50];

    System.out.println("enter size of an array");

    int size=sc.nextInt();

    System.out.println("enter elements of an array1");

    for(int i=0;i<size;i++)

    {

        a1[i]=sc.nextInt();

    }

    System.out.println("enter elements of an array2");

    for(int i=0;i<size;i++)

    {

        a2[i]=sc.nextInt();

    }

    sort(a1,a2,size);

   System.out.println("the minimum scalar product of two vector is "+MScalarProduct(a1,a2,size));

}

}
Output
enter size of an array
6
enter elements of an array1
1
3
3
5
2
3
enter elements of an array2
1
4
3
5
6
7
the minimum scalar product of two vector is 60