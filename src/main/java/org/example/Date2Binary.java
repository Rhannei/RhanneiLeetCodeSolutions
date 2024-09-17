package org.example;

import java.util.Arrays;

public class Date2Binary {
    public static void main(String[] args) {
        String date = "2080-02-29";
       String sum=  convertDateToBinary(date);

        System.out.println(sum);

    }
    public static String convertDateToBinary(String date) {

        String binaryValue="";


        String[] val= date.split("-");
        String binarycount="";
        for(int i=0;i<val.length;i++)
        {
            char[] charArr=val[i].toCharArray();
            for(int j=0;j<charArr.length;j++)
            {
                binarycount=binarycount+Integer.toBinaryString(charArr[j]);
            }
            if (i<val.length-1)
            {
                binaryValue=binaryValue+binarycount+"-";
            }
            else
            {
                binaryValue=binaryValue+binarycount;
            }

        }

        System.out.println(binaryValue);
        return binaryValue;


    }
}
