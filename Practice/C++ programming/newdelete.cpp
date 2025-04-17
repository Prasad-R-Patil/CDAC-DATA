
#include<iostream>
using namespace std;

int main()
{
	int *ptr;
	ptr=new int;
	cout<<"\n ptr = "<<ptr;
	cout<<"\n value at ptr = "<<*ptr;
	
	delete ptr;
	
	return 0;
}


