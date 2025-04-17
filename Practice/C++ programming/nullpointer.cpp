#include<iostream>
using namespace std;


int main()
{
	int *ptr=NULL;
	
	int i=10;
	ptr=&i;
	if (ptr==NULL)
	{
		cout<<" invalid.."<<endl;
	}
	else
	{
		cout<<" value at ptr= "<<*ptr<<endl;
	}
}