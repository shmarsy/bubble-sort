import java.util.Arrays;
class bubble_sort
{
    public static void main()
    {
        int[] a={2,1,5,3,12};
      bubble(a);
      System.out.println(Arrays.toString(a));
    }
    static void bubble(int[] a)
    {
     for(int i=0;i<a.length;i++)
     {
         for(int j=1;j<a.length-i;j++)
         {
             if(a[j]<a[j-1])
             {
             int temp=a[j];
             a[j]=a[j-1];
             a[j-1]=temp;

         }    
    }
}
}
}     
