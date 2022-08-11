/*
@Author: Jegadeeswari S
Date : 11/08/2022
Title : if else
Question : Printing average and sum of even and odd numbers from 1 to 1000
*/
class test2
{

public static void main(String[]args)
{
int evensum=0;
int oddsum =0;
int evencount =0;
int oddcount1=0;
int avgeven;
int avgodd;



for(int i=1; i<1001;i++)
{
//System.out.println(i);

if(i%2 ==0)//if num/2 is 0 then the num is even else odd
{

evensum+=i; 
evencount++; // to get total number of observation to find the average
}
else
{
oddsum+=i;
oddcount1++;
}
}
System.out.println(evensum);
System.out.println(oddsum);
System.out.println("eventcount"+evencount);
System.out.println("oddcount"+oddcount1);
avgeven=evensum/evencount;
avgodd= oddsum/oddcount1;
System.out.println("evenavg"+avgeven);
System.out.println("oddavg"+avgodd);
}
}