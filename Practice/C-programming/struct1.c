#include<stdio.h>



struct stud{
	int rno;
	char name[15];
	float m1,m2,m3;
	float total;
};

int main()
{
	struct stud s1;
    
	printf("\n enter rno: ");
	scanf("%d",&s1.rno);
	printf("\n enter name: ");
	scanf("%s",&s1.name);
	printf("\n enter marks: ");
	scanf("%f",&s1.m1);
	scanf("%f",&s1.m2);
	scanf("%f",&s1.m3);
	
	s1.total=s1.m1+s1.m2+s1.m3;
	printf("\n rno \t name \t total ");
    printf("\n -----------------------------------------");
	printf(" \n rno=%d \t name=%s \t total=%f",s1.rno,s1.name,s1.total);
	
	return 0;
}


