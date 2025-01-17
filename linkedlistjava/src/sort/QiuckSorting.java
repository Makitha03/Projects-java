package sort;



public class QiuckSorting {


    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int arr[],int low,int high)
    {
        //choosing the pivot
        int pivot=arr[high];

        //Index of smaller element and indicates the right position of pivot found so far
        int i=low-1;

        for(int j=low;j<=high-1;j++)
        {
            //if the current element is smaller than pivot
            if(arr[j]<pivot)
            {
                //Incrementing the index of the smaller
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;

    }


    static void sort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pi=partition(arr, low, high);
            //separately sorting the elements before and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    static void display(int ar[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int ar[]= {64,33,25,12,22,11,90};
        System.out.println("before sorting..");
        display(ar, ar.length);

        sort(ar,0,ar.length-1);


        System.out.println("after sorting..");
        display(ar, ar.length);

    }

}

