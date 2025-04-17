#include<iostream>
using namespace std;

void swap_by_ref(int &a,int &b)
{
	int t;
	t=a;
	a=b;
	b=t;
	
}


int main()
{
	int num1=40;
	int num2=50;
	cout<<" num1 = "<<num1<< "   num2 = "<<num2<<endl;
	
	swap_by_ref(num1,num2);
	cout<<" after swapping "<<" num1 = "<<num1<< "   num2 = "<<num2<<"";
}