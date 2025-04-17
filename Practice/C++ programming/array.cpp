#include<iostream>
using namespace std;

void accept_array_elements(int *p);
void display_array_elements(int *ptr);

void accept_array_elements(int *p)
{
	int i;
	for(i=0;i<3;i++)
	{
		cout<<"Enter Number";
		cin>>p[i];
	}
}

void display_array_elements(int *ptr)
{
	int i;
	for (i=0;i<3;i++)
	{
		cout<<"  "<<ptr[i];
		//ptr=ptr+1;
	}
}








int main()
{
	int arr[3];
	
	accept_array_elements(arr);
	display_array_elements(arr);
	
	return 0;
}