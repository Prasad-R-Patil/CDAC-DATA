#include<iostream>
using namespace std;

int main()
{
	string str1,str2;
	cout<<"\n Enter two String: ";
	//cin>>str;
	//cout<<str;
	//str=" technologies";
	//cout<<str<<endl;
	//str=str +" pvt";
	//cout<<str;
	cin>>str1;
	cin>>str2;
	
	if (str1==str2)
		cout<<" String Are Equal"<<endl;
	else
		cout<<" string are not equal"<<endl;
	
	
	str1=str2;
	cout<<"\n s1= "<<str1<<" s2= "<<str2;
	
	cout<<"\n\n"<<str1.size();
	
}