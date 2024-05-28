#include <stdio.h>
#include <conio.h>

void main()
{
	int num,lastdigit=0,rnum=0;
	clrscr();

	printf("Enter the number : ");
	scanf("%d",&num);//12345

	while (num >= 1)
	{
		if (num < 10)
			lastdigit = num;
		else
			lastdigit = num%10;

		rnum=(rnum*10)+lastdigit;
		num=num/10;
	}
	printf("\nRevese Number is : %d",rnum);
	getch();
}



lastdigit=5
rnum=(0*10)+5=5;

lastdigit=4;
rnum=(5*10)+4;
54









