#include<iostream>
using namespace std;




void swap_by_value(int a,int b)
{
	int t;
	t=a;
	a=b;
	b=t;
	cout<<" num1= "<<a<<"num2= "<<b<<endl;	
}

int main()
{
	int num1=40;
	int num2=50;
	
	cout<<" num1= "<<num1<<"num2= "<<num2<<endl;
	swap_by_value(num1,num2);
	//cout<<" after swapping "<<" num1 and num2 = "<<<<"";
}