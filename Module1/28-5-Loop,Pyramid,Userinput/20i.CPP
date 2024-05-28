#include <stdio.h>
#include <conio.h>

void main()
{
	int num,lastdigit=0;
	clrscr();
	printf("Enter the Number for the SUM : ");
	scanf("%d",&num);

	while (num > 0)
	{
		lastdigit = lastdigit+num%10;
		num=num/10;
	}
	printf("Sum of all digit is : %d",lastdigit);
	getch();
}
