#include<stdio.h>
int main()
{   
	char name[10];
	int cnt=0;
 	
	printf("Enter Name : ");
	scanf("%s",name);
	
	for(int i=0;name[i]!='\0';i++)
	{
		if((name[i]=='a')||(name[i]=='e')||(name[i]=='i')||(name[i]=='o')||(name[i]=='u')||(name[i]=='A')||(name[i]=='E')||(name[i]=='I')||(name[i]=='O')||(name[i]=='U'))
		cnt++;
	}
	printf("%d",cnt);
}