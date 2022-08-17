/*
	Dalvadi Punit
	Subject:-Year to day
*/

#include<stdio.h>
#include<conio.h>

void main()
{
      int years,months,weeks,days;

      printf("enter years:");
      scanf("%d",&years);

      months=years*12;
      weeks=(months*4)+(years*4);
      days=years*365;
      printf("month=%d days=%d \n",months,days);
      printf("weeks=%d \n",weeks);
      getch();
}