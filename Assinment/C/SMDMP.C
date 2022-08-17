/*
	Dalvadi Punit
	Subject:-sum,mul,sub,div,mod
*/
#include<stdio.h>
#include<conio.h>

void main(){
int a,b,c,d,e,f,g;
clrscr();
printf("enter the value of a:");
scanf("%d",&a);
printf("enter the value of b:");
scanf("%d",&b);
c=a+b;
printf("get final value of sum : %d \n",c);
d=a-b;
printf("get value of sub : %d \n",d);
e=a*b;
printf("get value of multiplication : %d \n",e);
f=a/b;
printf("get value of division : %d \n",f);
g=a%b;
printf("get value of modulo : %d \n",g);
getch();
}
