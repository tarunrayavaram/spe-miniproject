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
		logger.info("[INPUT] - " + a);
		double sqr = Math.sqrt(a);
		logger.info("[RESULT - SQUARE ROOT] - " + sqr);
		return sqr;
	}
	public static int factorial(Integer n)
    {
		logger.info("[INPUT] - " + n);
        int res = 1, i;
        for (i=2; i<=n; i++)
        {
            res *= i;
        }
        logger.info("[RESULT - SQUARE ROOT] - " + res);
        return res;
    }
}