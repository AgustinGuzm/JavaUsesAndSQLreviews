package com.gra.strings;

public class StringHandle {
    public static void main(String[] args) {
        String mystr="Agustin Guzman";
        //gnirts yM
        //            123456789
        //            012345678
        //to print out string in reverse way
        int lmystr= mystr.length() ;
        System.out.println("Length is = "+lmystr);
        System.out.println(mystr);
        lmystr= mystr.length() - 1;

        System.out.println("---- using stringbuilder----");
        StringBuilder sbmystr = new StringBuilder(mystr);
        System.out.println(sbmystr.reverse());

        System.out.println("----Using For-----");
        for(int i=lmystr; i>=0 ; i--)
        {
         System.out.print(mystr.charAt(i));
        }
        System.out.println();
        System.out.println("---- using while----");
        int i= lmystr;
        while (i>= 0)
        {
            System.out.print(mystr.charAt(i));
            i= i -1;
        }

        System.out.println();
        System.out.println("---- using non consecutive string----");
        System.out.println(mystr);
        int ii= 0;
        while ( ii< lmystr)
        {
            System.out.print(mystr.charAt(ii)+" ");
            ii= ii +2;
        }

        System.out.println();
        System.out.println("---- using while reverse non consecutive----");
        int j= lmystr;
        while (j>= 0)
        {
            System.out.print(mystr.charAt(j));
            j= j -1;
        }
        System.out.println();
        j= lmystr;
        while (j>= 0)
        {
            System.out.print(mystr.charAt(j)+" ");
            j= j -2;
        }
        System.out.println();
        System.out.println("---- using for non consecutive----");
        for(int k=0; k<lmystr ; k=k+2)
        {
            System.out.print(mystr.charAt(k)+" ");
        }
        System.out.println();
        System.out.println("-------numeros pares------");
        for(int np=2 ; np<=100 ; np=np+2)
        {
            System.out.print(np+" ");
        }
        System.out.println();
        System.out.println("-------numeros inpares------");
        for(int np=1 ; np<=100 ; np=np+2)
        {
            System.out.print(np+" ");
        }

        System.out.println();
        System.out.println("-------suma de numeros pares y suma de numeros impares------");

        int sumEven=0;
        int sumOdd=0;
        for ( int Z =1; Z<=70; Z++ )
        {
            if (Z % 2 == 0 )
            {
                sumEven+=Z;
            }
            else
            {
                sumOdd+=Z;
            }
        }
        System.out.println("sum even numnber is " +sumEven    );
        System.out.println("sum odd numbers is " +sumOdd);
//-------------------------------------------------------------------------------------
        //to print out 10 times Hi using for structure
        System.out.println();
        System.out.println("---to using for");
        for(int x=1 ; x<=10 ; x=x+1){
            System.out.print("Hi ");
        }
        System.out.println();
        System.out.println("---to using while");
        int xx=1;
        while (xx<=10)
        {
            xx = xx +1;
            System.out.print("Hi ");

        }
    }


}
