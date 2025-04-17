#include<iostream>
using namespace std;

int main()
{
	int n;
	cout<<"enter a number:-";
	cin>>n;
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if (i<=j)
			{
				cout<<char('A'+j-1)<<" ";
			}
			else
			{
				cout<<"  ";
			}
		}
		char ch = 'A'+(n-2);
		
		for(int j=1;j<=n;j++)
		{
			if((i+j)<(n+1))
			{
				cout<<ch<<" ";
				ch--;
			}
			else
			{
				cout<<"  ";
			}
		}
		cout<<endl;
	}
	
	
	return 0;
}