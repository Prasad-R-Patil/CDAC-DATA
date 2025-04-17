#include<iostream>
using namespace std;

int main()
{
	int num=10,num2;
	//int &var=num;
	//cout<<" var="<<var<<endl;
	cout<<" num="<<num<<endl;
	int &var=num2;
	var=500;
	cout<<"num="<<num;
	
	var=num2;
	cout<<" num2="<<num2<<endl;
	
	return 0;
}