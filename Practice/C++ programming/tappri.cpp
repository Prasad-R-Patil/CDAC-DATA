#include<iostream>
using namespace std;

int main()
{   

	int ch =0;
	int total =0;
	int qut = 0;

	
	do {
			cout<<"1.vad-pav = 20"<<endl;
			cout<<"2.samosa = 15"<<endl;
			cout<<"3.tea = 10"<<endl;
			cout<<"4.coffe = 12"<<endl;
			cout<<"5.exit"<<endl;
		
		cout<<"Enter Your Choice.... :- ";
		cin>>ch;
		
		switch(ch)
		{
			case 1:
			{
				cout<<"Add quantity...:- ";
				cin>>qut;
				
				total = total+qut*20;
				break;
			}
			case 2:
			{
				cout<<"Add quantity...:- ";
				cin>>qut;
				
				total = total+qut*15;
				break;
			}
			case 3:
			{
				cout<<"Add quantity...:- ";
				cin>>qut;
				
				total = total+qut*10;
				break;
			}
			case 4:
			{
				cout<<"Add quantity...:- ";
				cin>>qut;
				
				total = total+qut*12;
				break;
			}
			default :
			{
				cout<<"Enter Currect Choice..."<<endl;
			}
		}
		
		
		
	}while(ch!=5);
	
	cout<<"total bill ="<<total;
}