#include <stdio.h>
#include <conio.h>

void main()
{
	int num,sum=0,lastdigit=0;
	clrscr();

	printf("Enter the Number : ");
	scanf("%d",&num);

	lastdigit = num%10;
	sum = (sum*10)+lastdigit;//4

	while (num > 0)
	{
		if (num > 9)
			num = num/10;
		else
		{
			lastdigit=num;
			sum=sum+lastdigit;
			num=num/10;
		}
	}
	printf("\nTotal of First & Last Digit is : %d",sum);//5
	getch();
}