#include<iostream>
using namespace std;




void swap_by_address(int *p1,int *p2)
{
	int t;
	  t=*p1;
	*p1=*p2;
	*p2=t;
	
}

int main()
{
	int num1=40;
	int num2=50;
	
	cout<<" num1= "<<num1<<"num2= "<<num2<<endl;
	
	
	swap_by_address(&num1,&num2);
	
	cout<<" after swapping "<<" num1 = "<<num1<< "   num2 = "<<num2<<"";
}