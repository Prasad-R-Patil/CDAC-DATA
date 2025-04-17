#include<stdio.h>
int main()
{
	char names[5][10];
	int i;
	
	for(i=0;i<5;i++)
	{
	 printf("enter names _:");
	 scanf("%s",names[i]);
	}
	for(i=0;i<5;i++)
	{
		printf("\n name - %s",names[i]);
	}
	return 0;
}
