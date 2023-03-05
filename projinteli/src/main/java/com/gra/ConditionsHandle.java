package com.gra;
/* use of conditional structures
 * if... then... else / Switch... case.
 * scenery: Replace the blank space by ^ in one String.
 * String to use: "To use string to learn the basic structures to develop is easy"
 *
 */
public class ConditionsHandle
{
    public static void main(String[] args){
        String myStr = "To use string to learn the basic structures to develop is easy";
        System.out.println(myStr);
        int lmyStr = myStr.length() -1;

        //to fill out blank spaces
        fillOutBlankSpaces(myStr, lmyStr);

        //to replace a=@, e=%, i=!, o= &, u=#
        replaceVowelsBySpeciaChar(myStr, lmyStr);
    }

    public static void fillOutBlankSpaces(String myStr, int lmyStr)
    {
        String myNewStr="";
        int countspaces = 0;
        int countchar = 0;

        for (int i = 0; i <= lmyStr; i++)
        {
            if (myStr.charAt(i) == ' ')
            {
                myNewStr += "^";
                countspaces++;
            }
            else
            {
                myNewStr += myStr.charAt(i);
                countchar++;
            }
        }
        System.out.println(myNewStr);
        System.out.println("Total spaces : "+countspaces);
        System.out.println("Total characters : "+countchar);
    }
    public static void replaceVowelsBySpeciaChar(String myStr, int lmyStr)
    {
        //to replace a=@, e=%, i=!, o= &, u=#
        String myNewStr="";
        int counta = 0;
        int counte = 0;
        int counti = 0;
        int counto = 0;
        int countu = 0;
        int countn = 0;
        char mychar;

        for (int i=0 ; i <= lmyStr ; i++)
        {
            mychar = myStr.charAt(i);
            switch (mychar)
            {
                case 'a' :
                {
                    myNewStr += "@";
                    counta++;
                    break;
                }
                case 'e':
                {
                    myNewStr += "%";
                    counte++;
                    break;
                }
                case 'i' :
                {
                    myNewStr += "!";
                    counti++;
                    break;
                }
                case 'o':
                {
                    myNewStr += "&";
                    counto++;
                    break;
                }
                case 'u':
                {
                    myNewStr += "#";
                    countu++;
                    break;
                }
                default:
                {
                    myNewStr += mychar;
                    countn++;
                    break;
                }

            }
        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println(myStr);
        System.out.println(myNewStr);
        System.out.println("Total a : "+counta);
        System.out.println("Total e : "+counte);
        System.out.println("Total i : "+counti);
        System.out.println("Total o : "+counto);
        System.out.println("Total u : "+countu);
        System.out.println("Total no changes : "+countn);
    }

}
