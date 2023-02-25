package com.gra.stringHandle;

public class StringsHandle {
    public static void main(String[] args) {
        String str="90.9";
        if (str.contains("."))
        {
            str = String.format("%1$-" + 8 + "s", str).replace(' ', '0');
            str = str.substring(0,str.indexOf(".")) + str.substring(str.indexOf(".")).substring(0,3) ;
        }
        else
        {
            str= str+".00";
        }
        //str = String.format("%1$" + 6 + "s", str).replace(' ', '0');
        System.out.println("format str "+str);
    }
}
