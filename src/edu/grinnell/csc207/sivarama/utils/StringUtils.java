package edu.grinnell.csc207.sivarama.utils;

public class StringUtils
{
  public static String[]
  splitAt(String input, char splitter)
  {
    int j = 0;
    String[] cArray = new String[input.length()];
    for (int i = 0; i < input.length(); i++)
      {
        char ch = input.charAt(i);
        if(ch == splitter){
        }//if
        else
          {
            cArray[j] = String.valueOf(ch);
            j++;
            //System.out.println(j);
          }//else
      }
    String[] output = new String[j];
    for(int i = 0; i < j; i++)
      {
        output[i] = cArray[i];
      }// for()
    return output;
  }// splitAt(String,char)
  
  public static String[]
  splitCSV (String input)
  {
    int j = 0;
    String[] cArray = new String[input.length()];
    for (int i = 0; i < input.length (); i++)
      {
        char ch = input.charAt(i);
        if(ch == '"'){
        }//if
        else if(ch == '\\'){
        }//else if
        else
          {
            cArray[j] = String.valueOf(ch);
            j++;
          }//else
      }
    
    String[] output = new String[j];
    for(int i = 0; i < j; i++)
      {
        output[i] = cArray[i];
      }// for()       
    return output;
    
  }//splitCSV
 
  public static String
  deLeet(String input)
  {
    int j = 0;
    char cArray[] = input.toCharArray();
    for (int i = 0; i < input.length(); i++)
      {
        char ch = input.charAt(i);
        if(ch == '@'){
          cArray[j] = 'a';
          j++;} //if@
        else if(ch == '+'){
          cArray[j] = 't';
          j++;}//if+
        else if(ch == '0'){
          cArray[j] = 'o';
          j++;}//if0
        else if(ch == '1'){
          cArray[j] = 'l';
          j++;}//if1
        else if((ch == '3') && (i == 0)){
          cArray[j] = 'e';
          j++;}//if3
        else if((ch == '3') && (!(i == 0) && !(input.charAt(i-1) == '|')))
          {
          cArray[j] = 'e';
          j++;
          }//if3
        else if((ch == '|') && (input.charAt(i+1) == '3'))
          {
          cArray[j] = 'b'; 
          i = i + 1;
          j++;
          }//if|3
        else if((ch == '|') && (!(input.charAt(i+1) == '3')))
          {
          cArray[j] = 'n'; 
          i = i + 2;
          j++;
          }//if|\|
        else{
          cArray[j] = ch;
          j++;
        }// else
      }// for
    char[] chArray = new char[j];
    //System.out.println(j);
    for(int i = 0; i < j; i++)
      {
        chArray[i] = cArray[i];
      }//for(remove extra chars)
    String output = new String(chArray);
    return output;
  }// deleet(String)
 
  public static void
  nameGame(String name)
  {
    int i = 1;
    while ((name.charAt (i)!= 'a') && (name.charAt (i) != 'e') && 
        (name.charAt (i)!= 'i') && (name.charAt (i) != 'o')
        && (name.charAt (i) != 'u'))
    {
    i++;
    } //while()
    String bName = "B" + name.substring (i);
    bName = "B" + name.substring (i);
    String fName = new String();
    fName = "F" + name.substring (i);
    String mName = new String();
    mName = "M" + name.substring (i);
    System.out.println(name + "!");
    System.out.println(name + ", " + name + " bo " + bName + " Bonana"
                       + " fanna" + " fo " + fName);
    System.out.println("Fee " + "fy " + "mo "+ mName + ", " + name + "!");
    
  }// nameGame(String)

  public static void
  main (String[] args)
  throws Exception 
  {
    java.io.PrintWriter pen;
    pen = new java.io.PrintWriter (System.out, true);
    /** EXERCISE A Examples */

    //pen.println (Arrays.toString(StringUtils.splitAt ("a:b:c", ':')));
    
    /** EXERCISE B Examples */
    // Could not get B to work, mainly had trouble with replacing the
    // confusing backslashes and quotes.
    /** EXERCISE C Examples */

    //pen.println (StringUtils.deLeet ("3"));
    //pen.println (StringUtils.deLeet ("133+"));
    //pen.println (StringUtils.deLeet ("3@+ |3@|\\|@|\\|@"));
  
    /** EXERCISE D Examples */
    
    //StringUtils.nameGame("Lincoln");
    //StringUtils.nameGame("Shirley");
  }
  
}//endClass
