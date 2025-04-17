#include<iostream>
using namespace std;

int main()
{
	int n=0;
	cout<<"Enter The Number :-  ";
	cin>>n;
	
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=i;j--)
		{
		  cout<<"*";
		
		}
		
		for(int j=1;j<=n;j++)
		{
			if(i>j)
			{
				cout<<"  ";
			}
			else
			{
				cout<<"*";
			}
		
		}
		cout<<endl;
	
	}
	
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i>=j)
			{
				cout<<"*";
			}
			else
			{
				cout<<" ";
			}
		
		}
		for(int j=1;j<=n;j++)
		{
			if((i+j)>n)
			{
				cout<<"*";
			}
			else
			{
				cout<<" ";
			}
		
		}
		cout<<endl;
	
	}
}
