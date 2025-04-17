#include<iostream>
using namespace std;

void accept_array_element(int(*ptr)[3]);

void display_array_element(int(*ptr)[3]);

int main()
{
	
	int arr[3][3]={{1,2,3},{4,5,6},{7,8,9}};
	
	accept_array_element(arr);
	display_array_element(arr);
	
	return 0;
	
}


void accept_array_element(int (*ptr)[3])
{
	int i,j;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			cout<<"Enter Number ["<<i<<"] ["<<j<<"] => ";
			cin>>ptr[i][j];
			
		}
	}
	
}


void display_array_element(int (*ptr)[3])
{
	int i,j;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			cout<<" "<<ptr[i][j];
			
		}
		cout<<"\n";
	}
}