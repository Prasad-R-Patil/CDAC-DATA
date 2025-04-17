#include<iostream>
using namespace std;

int main()
{
	for(int i=0;i<5;i++)
	{
		for(int k=5-1; k>i; k--)
		{
			cout<<" ";
		}
		int value =1;
		for(int j=0;j<=i;j++)
		{
				cout<<value<<" ";
				value = value * (i-j)/(j+1);
		
		}
		cout<<endl;
	}
	
	
	
	return 0;
}