#include <stdio.h>
#include <conio.h>
void main()
{
	int a = 0, b = 1, temp, i, n;
	clrscr();
	printf("Enter Value");
	scanf("%d", &n);
	printf("%d\n", a);
	printf("%d\n", b);
	for (i = 2; i <= n; i++)
	{
		temp = a + b;
		printf("%d\n", temp);
		a = b;
		b = temp;
	}
	getch();
}