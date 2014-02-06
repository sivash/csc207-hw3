package edu.grinnell.csc207.sivarama.utils;

import java.math.BigInteger;

public class Calculator
{
  public static BigInteger
  eval0(String input)
  {
    int total = 0;
    int j = 0;
    char cArray[] = new char[input.length()];
    for(int i = 0; i < input.length(); i++)
      {
        char ch = input.charAt (i);
        if (ch == ' ');
        else
        {
        cArray[j] = ch;
        j++;
        }//else
      }//for[create string w/o spaces]
    int begin = 0;
    char operator = 0;
    int end = 0;
    j = 0;
    for (int i = 0; i < input.length (); i++)
      {
        if ((Character.isDigit(cArray[i])) && ((j % 2) == 0) && 
            !(j == 0))
          {
            begin = Character.getNumericValue(cArray[i]);
            //System.out.print(begin);
            j++;
            if (operator == '+'){
              total = total + begin + end;
             // System.out.println (total);
              }
            else if (operator == '-')
              total = total + begin - end;
            else if (operator == '*')
              total = total + begin * end;
            else if (operator == '/')
              total = total + begin / end;
            else if (operator == '^')
              total = total + (int) Math.pow (begin, end);
            begin = 0;
            end = 0;
          }
        else if((Character.isDigit(cArray[i])) && ((j % 2) == 0))
            {
              begin = Character.getNumericValue(cArray[i]);
            //  System.out.print(begin);
              j++;
            }
        else if (!(Character.isDigit(cArray[i])))
            {
              operator = cArray[i];
             // System.out.print(operator);
            }
        else if((Character.isDigit(cArray[i])) && ((j % 2) == 1))
            {
          end = Character.getNumericValue(cArray[i]);
         // System.out.print(end);
          j = 0;
          if (operator == '+')
            total = total + begin + end;
          else if (operator == '-')
            total = total + begin - end;
          else if (operator == '*')
            total = total + begin * end;
          else if (operator == '/')
            total = total + begin / end;
          else if (operator == '^')
            total = total + (int) Math.pow (begin, end);
          //System.out.println (total);
          begin = 0;
          end = 0;
            }
       // System.out.println ();
      }
    BigInteger bTotal = BigInteger.valueOf((long)total);
   
    return bTotal;
  } // eval0(String)
  public static void
  main (String[] args)
  throws Exception 
  {
    java.io.PrintWriter pen;
    pen = new java.io.PrintWriter (System.out, true);
   
    /** EXERCISE E Examples */
    pen.println(Calculator.eval0 ("9+9"));
    pen.println(Calculator.eval0 ("9/9"));
    pen.println(Calculator.eval0 ("9*9"));
    pen.println(Calculator.eval0 ("2-1"));
    pen.println(Calculator.eval0 ("2^3"));

  }

}
