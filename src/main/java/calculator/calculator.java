package calculator;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class calculator
{
	public static double square_root(Integer a)
	{
		double sqr = Math.sqrt(a);
		return sqr;
	}
	public static int factorial(Integer n)
    {
        int res = 1, i;
        for (i=2; i<=n; i++)
        {
            res *= i;
        }
        return res;
    }
}