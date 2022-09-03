#include <stdio.h>
#include <conio.h>
void main()
{
	int a, i, fact = 1;
	clrscr();
	printf("Enter Fact no");
	scanf("%d", &a); //5
	for (i = a; i > 0; i--)
	{
		fact = fact * i;
		printf("%d\n", fact);
	}
	getch();
}
