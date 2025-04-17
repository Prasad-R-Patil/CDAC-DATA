#include<iostream>
using namespace std;

int isprime(int num)
{
	int count=0;
	for(int i=2;i<num/2;i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}
	return count;
}


int main()
{

	int num;
	cout<<"enter A number:-";
	cin>>num;     
	
	int count=isprime(num);
	
	if(count==0)
	{
		cout<<"Number is Prime..!";
	}
	else
	{
		cout<<"Number is not Prime Number...!";
	}
	
	return 0;
	
}