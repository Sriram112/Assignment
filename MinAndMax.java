import java.util.Scanner;

public class MinAndMax {
public static void main(String args[]){
    Scanner inp=new Scanner(System.in);
    System.out.print("\n Enter Size of Array: ");
    int n=inp.nextInt();
    int i,sum=0;
    int arr[]=new int[n];

    System.out.println("enter elements");

    for(i=0;i<n;i++)
    {

        arr[i]=inp.nextInt();
    }

    int max=arr[0],min=arr[0];

    for(i=0;i<n;i++)
    {
        if(arr[i]>max)
            max=arr[i];

        if(arr[i]<min)
            min=arr[i];

    }

    System.out.println("\n Maximum Number: "+max);
    System.out.println("\n Minimum Number: "+min);

}
}