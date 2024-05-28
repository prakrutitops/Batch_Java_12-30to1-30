#include <stdio.h>
#include <conio.h>

void main()
{
	int num,maxnum=0,temp;
	clrscr();
	printf("Enter the numberr : ");
	scanf("%d",&num);

	while (num > 0)
	{
		temp = num%10;
		if (temp > maxnum)
		{
			maxnum=temp;
		}
		num=num/10;
	}
	printf("\nGreates Number You have entered is : %d",maxnum);
	getch();
}
