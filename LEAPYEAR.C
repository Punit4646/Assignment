/*
	Dalvadi Punit
	Subject:-leap year
*/
#include<stdio.h>
#include<conio.h>
void main()
{
	int year;
	clrscr();
	printf("Enter Year");
	scanf("%d",&year);

	if(year%400==0)
	{
		printf("%d Leap Year",year);
	}
	else if(year%100==0)
	{
		printf("%d Not Leap Year",year);
	}
	else if(year%4==0)
	{
		printf("%d Leap year",year);
	}
	else
	{
		printf("%d Not Leap Year",year);
	}
	getch();
}