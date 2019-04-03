

    class insertion
    {

        void sort(int arr[])
        {
            int n=arr.length;
            for(int j=1;j<n;j++){
                int key=arr[j];//$5    //$$3
                int i=j-1;//$0   //$$1
                while ( i>=0 && arr[i]>key ){//$i=0 &&6>5   //$$i=1 && 6>3
                    arr[i+1]=arr[i];//$arr[1]=arr[0]means in place of 5 put 6 and move  //$$arr[2]=arr[1]
                    i=i-1;//$-1
                }
                arr[i+1]=key;//&arr[0]=5
                //$ 5 6
            }
        }



        static void print(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");

            System.out.println();
        }

        public static void main(String args[])
        {
            int arr[] = {6,5,3,69,35};

            insertion ob = new insertion();
            ob.sort(arr);

            print(arr);
        }
    }
