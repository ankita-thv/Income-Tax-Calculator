package com.internshala.javaapp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of person: ");
        int p = scanner.nextInt();
        String[] name = new String[p];
        long[] income= new long[p];
        for (int i=0; i<p;i++)
        {
            System.out.println("Enter name "+i+": ");
            name[i] = scanner.next();
            System.out.println("Enter "+name[i]+"'s Annual Income: ");
            income[i] = scanner.nextLong();
        }
        for(int i=0;i<p;i++)
        {
            calculateTax(name[i],income[i]);
        }

    }
    public static void calculateTax(String name, long income)
    {double tax;
        if(income>=300000)
        {
            tax = income*0.2;
        }
        else if(100000<=income)
        {
            tax = income*0.1;
        }
        else
        {
            tax=0;
        }
        System.out.println(name+": ₹"+tax);
    }
}

