package com.fis.test;

public class CodeSTD
{
   public static void main(String[] args)
   {
     // replaceNextElementGreatestOnRight();
     // highestPowerOf2LessOrEqualToNumber();
      lambdaFun();
      
   }


   private static void highestPowerOf2LessOrEqualToNumber()
   {
      int n= 19;
      int res = 0; 
      for (int i = n; i >= 1; i--) 
         { 
          // If i is a power of 2 
           if ((i & (i - 1)) == 0) 
              { 
                   res = i; 
                 break; 
              } 
         } 
      System.out.println(res); 
      
   }

   private static void replaceNextElementGreatestOnRight()
   {
      int arr[] =
      {16, 17, 4, 3, 5, 2};
      int len = arr.length;
      int max = arr[len - 1];
      arr[len - 1] = -1;
      for (int i = len - 2; i >= 0; i--)
      {
         int temp = arr[i];
         arr[i] = max;
         if (max < temp)
         {
            max = temp;
         }
      }
      for (int i = 0; i < arr.length; i++)
      {
         System.out.print(arr[i] + " ");
      }
   }
}
