package calculator;

import java.util.*;
import java.io.*;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class calculator
{
	private static final Logger logger = LogManager.getLogger(calculator.class);
	public static double square_root(Integer a)
	{
		double sqr = Math.sqrt(a);
		logger.info("SQUARE ROOT INPUT:" + a + " RESULT:" + sqr);
		return sqr;
	}
	public static int factorial(Integer n)
    {
        int res = 1, i;
        for (i=2; i<=n; i++)
        {
            res *= i;
        }
        logger.info("FACTORIAL INPUT:" + n + " RESULT:" + res);
        return res;
    }
	public static double log(double n)
	{
        double res = Math.log(n);
        logger.info("LOG INPUT:" + n + " RESULT:" + res);
        return res;
	}
	public static int power(Integer base, Integer pow)
	{
        int res = (int) Math.pow(base, pow);
        logger.info("POWER INPUT:" + Integer.toString(base) + "^" + Integer.toString(pow) + " RESULT:" + res);
        return res;
	}
}