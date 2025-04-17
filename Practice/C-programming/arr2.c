#include<stdio.h>
int main()
{   
	char name[10];
	printf("\n enter name:");
	scanf("%s",name);
	for (int i=0; i<10;i++)
	{
		printf("\n %c",name[i]);
		
	}
		
	return 0;
	
}