#include<iostream>
using namespace std;

void swap(int *a, int *b)
{
	*a=*a+*b;
	*b=*a-*b;
	*a=*a-*b;
}

int main()
{
	int num1=40;
	int num2=50;
    cout<<" num1= "<<num1<<"  num2= "<<num2<<endl;
	swap(&num1,&num2);
	cout<<"after swapping "<<" num1= "<<num1<<"  num2= "<<num2;
	
}