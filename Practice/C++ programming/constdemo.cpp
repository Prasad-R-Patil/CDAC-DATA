#include<iostream>
using namespace std;

int main()
{
	const int i=10;
	
	cout<<"constant value of i is"<<" "<<i<<endl;
	//i=20;
	//cout<<i;
	constexpr int num =i*10;
	cout<<num;
}