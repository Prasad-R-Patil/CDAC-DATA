#include<iostream>
using namespace std;

int main()
{
	int num;
	int sum=0;
	
	while(true)
	{
		cout<<"Enter Numbers:-";
		cin>>num;
		if(num==-100)
		{
			break;
		}
		else
		{
			sum += num;
		}
			
	}
	
	cout<<"The Squer of Sum of Number is="<<sum*sum;
	
}