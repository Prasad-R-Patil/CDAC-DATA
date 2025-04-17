#include<iostream>
using namespace std;


int main()
{
	char str1[15],str2[15];
	int i;
	cout<<"\n Enter String: ";
	cin>>str1;
	
	for(i=0;str1[i]!='\0';i++)
		str2[i]=str1[i];
	
	str1[i]='\0';
	
	for(int j=0;str2[j]!='\0';j++)
		cout<<str2[j];
}