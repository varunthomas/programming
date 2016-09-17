import java.io.*;
import java.util.*;
public class QuickSort{

public static void sort(int [] a,int start,int end){

int pivotIndex;

if(start>=end)
return;

pivotIndex=partition(a,end,start)-1;
sort(a,start,pivotIndex-1);
sort(a,pivotIndex+1,end);


}

public static int partition(int[] a,int end,int start){

int pindex=0;
int pivot;
int i;
pivot=a[end];

for(i=start;i<end-1;i++)
{
if(a[i]<pivot){
swap(a,i,pindex);
pindex++;
}
}
swap(a,pindex,end);
return pindex;
}

public static void swap(int [] a, int i, int pindex){

int temp;
temp=a[i];
a[i]=a[pindex];
a[pindex]=temp;
} 

public static void display(int [] a, int n){

for(int i=0;i<n;i++){
System.out.println(a[i]);
}
}

public static void main(String args[]){

int n,i;

Scanner s=new Scanner(System.in);
System.out.println("Enter no of elements");
n=s.nextInt();

int [] a=new int[n];
System.out.println("Enter array elements");
for(i=0;i<n;i++)
a[i]=s.nextInt();

sort(a,0 ,n-1);
display(a,n);
}

}