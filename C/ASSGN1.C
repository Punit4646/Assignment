/*
  PUNIT DALVADI
  Subject:-NAME,BIRTH DATE,AGE,ADDRESS
*/
#include<stdio.h>
#include<conio.h>
void main()
{
	char name[18],address[50];
	int dob,age;
	clrscr();

	printf("Enter Your Name\n");
	scanf("%s",&name);
	printf("Enter Your Birth Date\n");
	scanf("%d",&dob);
	printf("Enter Your Age\n");
	scanf("%d",&age);
	printf("Enter Your Address\n");
	scanf("%s",&address);
	printf("---------------------------\n");
	printf("Your name is %s\n",name);
	printf("Your Birth Date is %d\n",dob);
	printf("Your Age is %d\n",age);
	printf("Your address is %s\n",address);

	getch();
}
