#include<iostream>
using namespace std;



int main()
{
	int arr1[2][2]={{10,20},{40,50}};
	int arr2[2][2]={{30,60},{70,80}};
	int arr3[2][2];
	
	
	cout<<"addition is "<<endl;
	
	int i;
	int j;
	
	for (i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			arr3[i][j]=arr1[i][j]+arr2[i][j];
			cout<<"  "<<arr3[i][j];
			
		}
		cout<<endl;01.
		
	}
	
	
	
	
}