package com.bridgelabz.search;

import java.util.Scanner;

public class PeakElementFinder
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=scanner.nextInt();
        int []a=new int[size];
        System.out.println("Enter "+size+" element");
        for (int i=0;i<size;i++)
        {
            a[i]=scanner.nextInt();
        }
        int index=findPeakElement(a);
        System.out.println("Peak element in an array is "+a[index]);
    }

    private static int findPeakElement(int[] arr)
    {
      int left=0;int right=arr.length-1;

      while (left<=right)
      {
          int mid=(right+left)/2;
          boolean isLeftSmaller = (mid == 0 || arr[mid] > arr[mid - 1]);
          boolean isRightSmaller = (mid == arr.length - 1 || arr[mid] > arr[mid + 1]);

          if(isLeftSmaller&&isRightSmaller)
          {
              return mid;
          }
          else if (mid > 0 && arr[mid] < arr[mid - 1]) {
              right = mid - 1;
          } else {
              left = mid + 1;
          }
      }
      return -1;
    }
}
