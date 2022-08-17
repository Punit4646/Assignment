/*
	Punit Dalvadi
	Subject:-Day to month

*/

#include<stdio.h>
#include<conio.h>

 void main(){
   int days,months;
   clrscr();
   printf("enter the days:");
   scanf("%d",&days);

   months=days/30;
   printf("get the value of months: %d\n",months);

   days=days%30;
   printf("get last days: %d\n",days);

   getch();
}