public static void sort(int arr[])
    {
        int length=arr.length;
        for(int i=0;i<length-1;i++)
        {
            int minimum_index=i;
            for(int j=i+1;j<length;j++)
            {
                if(arr[j] < arr[minimum_index])
                minimum_index =j;
            }
            int temp = arr[i];
        arr[i]=arr[minimum_index];
        arr[minimum_index]=temp;
        }
    }
