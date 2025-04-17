#include<iostream>
using namespace std;
     int sum(int a,int b)
	 {
		 return a+b;
	 }
	 int sum(int a,int b,int c)
	 {
		 return a+b+c;
	 }
	 float sum(float a,float b)
	 {
		 return a+b;
	 }
	 float sum(int a,float b)
	 {
		 return a+b;
	 }
	/* void sum(int a,int b)
	 {
		 return a+b;
	 }*/
	 float sum(float a,int b)
	 {
		 return a+b;
	 }
	 float sum(float a,float b,float c)
	 {
		 return a+b+c;
	 }


int main()
{
	int n1=23,n2=35;
	float f1=3.6f,f2=4.5f;
	
	cout<<" sum int "<<sum(n1,n2,n1+n2)<<endl;
	cout<<" sum int "<<sum(n1,n2)<<endl;
	cout<<" sum int "<<sum(f1,f2)<<endl;
	cout<<" sum int "<<sum(n1,f2)<<endl;
	cout<<" sum int "<<sum(f1,n2)<<endl;
	cout<<" sum int "<<sum(f1,f2,f1+f2)<<endl;
	
	
	
	
	
	
	
	
    
return 0;
     
}