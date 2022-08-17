/*
	Dalvadi Punit
	Subject:-Day to Year
*/

#include<stdio.h>
#include<conio.h>

void main(){
   int days,weeks,months,years;
   clrscr();

   printf("enter the days:");
   scanf("%d",&days);

   years=days/365;
   printf("get the value of years: %d \n",years);

   weeks=(days%365)/7;
   printf("get the value of weeks: %d \n",weeks);

   months=(days%365)/30;
   printf("get the value of months: %d \n",months);

   days=(days%365)%7;
   printf("get the value of last days: %d \n",days);

   getch();
}