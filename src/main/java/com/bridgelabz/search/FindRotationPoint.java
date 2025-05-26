package com.bridgelabz.search;

import java.util.Scanner;

public class FindRotationPoint
{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=scanner.nextInt();
        int []a=new int[size];
        System.out.println("Enter "+size+" element");
        for (int i=0;i<size;i++)
        {
            a[i]=scanner.nextInt();
        }
        int index=findRotationIndex(a);
        System.out.println(index);
    }

    private static int findRotationIndex(int[] a)
    {

        int left=0;
        int right=a.length-1;
        while(left<right)
        {
            int mid=(right+left)/2;
            if(a[mid]>a[right])
            {
                left=mid+1;
            }
            if(a[mid]<a[right])
            {
                right=mid;
            }
        }
        return left;
    }
}
