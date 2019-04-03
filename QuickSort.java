class QuickSort
{

    int partition(int arr[], int p, int r)
    {
        int x = arr[r];
        int i = (p-1);
        for (int j=p; j<r; j++)
        {

            if (arr[j] <= x)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i+1;
    }



    void sort(int arr[], int p, int r)
    {
        if (p< r)
        {
            int pi = partition(arr, p, r);

            sort(arr, p, pi-1);
            sort(arr, pi+1, r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public static void main(String args[])
    {
        int arr[] = {2,8,7,1,3,4,5,6,4};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }
}
