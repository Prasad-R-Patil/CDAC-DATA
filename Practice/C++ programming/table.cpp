#include<iostream>
using namespace std;

int main()
{
	int num;
	int t=0;
	cout<<" Enter a number:- ";
	cin>>num;
	
	for (int i=1;i<=10;i++)
	{
		t=num*i;
		cout<<num<<" X "<<i<<" = "<<t<<endl;
	}
	
	
	
	
	
	
	return 0;
}