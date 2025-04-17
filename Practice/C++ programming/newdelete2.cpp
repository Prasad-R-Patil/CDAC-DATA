#include<iostream>
using namespace std;

int main()
{
	int *ptr;
	ptr = new int[10];
	cout<<"\n ptr = "<<ptr;
	
	
	for(int i=0;i<10;i++)
		ptr[i] = i*10;
	
	for(int j=0;j<10;j++)
		cout<<" \n 1 "<<ptr[j];
	
	delete []ptr;
	
	return 0;
}