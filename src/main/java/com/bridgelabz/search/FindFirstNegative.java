package com.bridgelabz.search;

import java.util.Scanner;

public class FindFirstNegative
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
        int index=findNegative(a);
        System.out.println(index);
    }

    private static int findNegative(int[] a)
    {
        for (int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                return i;
            }
        }
        return -1;
    }
}
