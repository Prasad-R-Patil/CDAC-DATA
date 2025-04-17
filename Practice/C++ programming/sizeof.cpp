#include<iostream>
#include<limits.h>
#include<cfloat>
using namespace std;


int main()
{
	cout<<"size of int "<<sizeof(int)<<endl;
	cout<<"size of INT_MAX "<<INT_MAX<<endl;
	cout<<"size of INT_MIN "<<INT_MIN<<endl;
	cout<<"size of UINT_MAX "<<UINT_MAX<<endl;
	
	
	cout<<"size of CHAR "<<sizeof(char)<<endl;
	cout<<"size of CHAR_MAX "<<CHAR_MAX<<endl;
	cout<<"size of CHAR_MIN "<<CHAR_MIN<<endl;
	
	
	
	cout<<"size of FLOAT "<<FLT_DIG<<endl;
	cout<<"size of DBL "<<DBL_DIG<<endl;
	cout<<"size of LDBL "<<LDBL_DIG<<endl;
}