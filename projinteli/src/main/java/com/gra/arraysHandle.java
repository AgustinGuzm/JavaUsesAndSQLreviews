package com.gra;
/*
Scenary: 1- To create a list five of friends and print out this.
         2- Use the list friend that includes gender (M/F) and prints out this.
 */
public class arraysHandle {
    public static void main(String[] args)
    {
        String[] myFriends ={"Ana", "Celina","Kelly","Paola","Edith"};
        String[][] myfriendsGender ={{"Ana", "Celina","Kelly","Paola","William"},{"F","F","F","F","M"}};
        String[][] GenderSecondVer ={{"Ana","F"},{ "Celina","F"},{"Kelly","F"},{"Paola","F"},{"William","M"}};
        printoutBasicArray(myFriends);
        pritnoutMatrix(myfriendsGender) ;
        pritnoutSecondMatrix(GenderSecondVer) ;
    }
    private static void printoutBasicArray(String[] myFriends)
    {
        //using the basic way
        System.out.println("------ USING BASIC WAY)-------");
        for(int i=0 ; i< myFriends.length; i++)
        {
            System.out.println(i+1+"- "+myFriends[i]);
        }
        //using advanced way
        System.out.println("------ USING ADVANCED WAY)-------");
        for (String y: myFriends)
        {
            System.out.println(y);
        }
    }

    private static void pritnoutMatrix(String[][] myfrinedsGender)
    {
        //using advanced way
        System.out.println("------ PRINTING A MATRIX)-------");
        for (int i = 0; i < myfrinedsGender.length ; i++) {
            for (int j = 0; j <myfrinedsGender[i].length ; j++) {
                System.out.println(myfrinedsGender[i][j]);
            }

        }
        //using advanced way
        System.out.println("------ PRINTING A MATRIX)-------");
        for (int i = 0; i < myfrinedsGender.length-1 ; i++) {
            for (int j = 0; j <myfrinedsGender[i].length ; j++) {
                System.out.println(myfrinedsGender[i][j]+" "+myfrinedsGender[i+1][j]);
            }

        }
        //String.format("%1$-" + 8 + "s", str).replace(' ', '0');
        System.out.println("------ PRINTING A MATRIX)-------");
        for (int i = 0; i < myfrinedsGender.length-1 ; i++) {
            for (int j = 0; j <myfrinedsGender[i].length ; j++) {
                String str = myfrinedsGender[i][j];
                System.out.println(String.format("%1$-" + 10 + "s", str).replace(' ', '.')+myfrinedsGender[i+1][j]);
            }

        }
    }
    private static void pritnoutSecondMatrix(String [][] GenderSecondVer)
    {
        System.out.println("------ PRINTING A  SECOND MATRIX)-------");
        for (int i = 0; i < GenderSecondVer.length ; i++) {
            for (int j = 0; j <GenderSecondVer[i].length ; j++) {
                String str = GenderSecondVer[i][j];
                System.out.print(String.format("%1$-" + 10 + "s", str).replace(' ', ' '));
            }
            System.out.println();
        }
    }
}
