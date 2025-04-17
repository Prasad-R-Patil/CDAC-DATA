#include<stdio.h>
void even(int num)
{
	for(int i=0;i<=num;i++)
	{
		if ((i%2)==0)
		{
			printf("%d ",i);
		}
			
	}
}
void odd(int num)
{
	for(int i=0;i<=num;i++)
	{
		if ((i%2)!=0)
		{
			printf("%d ",i);
		}
			
	}
}
int main()
{
	int num ;
	int ch;
	printf("\n enter number: ");
	scanf("%d",&num);
	
		printf("\n 1.Even");
		printf("\n 2.odd");
		printf("\n 3.Exit");
		
		printf("\n Enter your Choice :=> ");
        scanf("%d",&ch);		
	
	
	switch(ch)
	{
		case 1:
		{
			even(num);
			break ;
		}
		case 2:
		{
			odd(num);
			break ;
		}
		
		
		
		
		
		
	}
	printf("the end");
	return 0;
}