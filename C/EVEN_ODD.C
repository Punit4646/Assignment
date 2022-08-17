/*
	Dalvadi Punit
	Subject:-Even odd
*/
#include<stdio.h>
#include<conio.h>
void main()
{
	int a;
	clrscr();
	printf("Enter The Number of a\n");
	scanf("%d",&a);

	if(a%2==0)
	{
		printf("Number is Even");
	}
	else
	{
		printf("Number is odd");
	}
	getch();
}