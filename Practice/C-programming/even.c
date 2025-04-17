/*
#include<stdio.h>
int main()
{	
	int i,num,;
	printf("\n Enter term: ");
	scanf("%d",&num);
	for(i=0;i<=num;i++)
	{
		if ((i%2)==0)
		{
			printf("%d ",i);
		}
	}
	return 0;
}
*/

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

int main()

{
	int num;
	printf("\n Enter number");
	scanf("%d",&num);
	
	even(num);
	return 0;
}

