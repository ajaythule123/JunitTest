package com.lcwd.test.Services;

public class CalculaterService {

    public static int addTwoNumber(int a ,int b)
    {
        int result=a+b;
        return result;
    }

    public static int productTwoNumber(int a , int b)
    {
        int result=a*b;
        return result;
    }

    public static int devideTwoNuber(int a , int b)
    {
        int result = a/b;
        return result;
    }

    public static int sumAnyNumber(int ...number)
    {
        int s=0;

        for(int n:number)
        {
            s=s+n;
        }
        return s;
    }
}
