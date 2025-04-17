#include<iostream>
using namespace std;

int main()
{
	int ch=0;
	int ch2=0;
	int qut=0;
	int qut2=0;
	int total1=0;
	int total2=0;
	int total3=0;
	int total4=0;
	
	do
	{
		cout<<"1.Snaks....||"<<endl;
		cout<<"2.cold drinks"<<endl;
		cout<<"3.Hot drinks|"<<endl;
		cout<<"4.Ice-cream||"<<endl;
		cout<<"5.Exit.....||"<<endl;
		
		cout<<"Enter Your Choice||"<<endl;
		cin>>ch;
		
		switch(ch)
		{
			case 1:
			{
				do{
					cout<<"1.Vada Pav.=20||"<<endl;
					cout<<"2.samosa...=15||"<<endl;
					cout<<"3.Exit........||"<<endl;
					
					cout<<"Enter Your Choice"<<endl;
					cin>>ch2;
					
					switch(ch2)
					{
						case 1:
						{
							cout<<"Enter Quantity.:-"<<endl;
							cin>>qut2;
							total1=total1+qut2*20;
							break;
						}
						case 2:
						{
							cout<<"Enter Quantity.:-"<<endl;
							cin>>qut2;
							total1=total1+qut2*15;
							break;
						}
						default :
						{
							cout<<"Enter Valid Choice:-"<<endl;
						}
					}
					
					
				}while(ch2!=3);
				
				
				break;
						
			}
			
			case 2:
			{
				do{
					cout<<"1.coca cola..=20||"<<endl;
					cout<<"2.Papsi......=15||"<<endl;
					cout<<"3.Exit..........||"<<endl;
					
					cout<<"Enter Your Choice"<<endl;
					cin>>ch2;
					
					switch(ch2)
					{
						case 1:
						{
							cout<<"Enter Quantity.:-"<<endl;
							cin>>qut2;
							total2=total2+qut2*20;
							
							break;
						}
						case 2:
						{
							cout<<"Enter Quantity.:-"<<endl;
							cin>>qut2;
							total2=total2+qut2*15;
							
							break;
						}
						default :
						{
							cout<<"Enter Valid Choice:-"<<endl;
						}
					}
					
					
				}while(ch2!=3);
				
				break;
						
			}
			
			case 3:
			{
				do{
					cout<<"1.Tea......=20||"<<endl;
					cout<<"2.Coffie...=15||"<<endl;
					cout<<"3.Exit........||"<<endl;
					
					cout<<"Enter Your Choice"<<endl;
					cin>>ch2;
					
					switch(ch2)
					{
						case 1:
						{
							cout<<"Enter Quantity.:-"<<endl;
							cin>>qut2;
							total3=total3+qut2*20;
							
							break;
						}
						case 2:
						{
							cout<<"Enter Quantity.:-"<<endl;
							cin>>qut2;
							total3=total3+qut2*15;
							
							break;
						}
						default :
						{
							cout<<"Enter Valid Choice:-"<<endl;
						}
					}
					
					
				}while(ch2!=3);
				
				break;
						
			}
			
			case 4:
			{
				do{
					cout<<"1.Venela.......=20||"<<endl;
					cout<<"2.Butter scoh..=15||"<<endl;
					cout<<"3.Exit............||"<<endl;
					
					cout<<"Enter Your Choice"<<endl;
					cin>>ch2;
					
					switch(ch2)
					{
						case 1:
						{
							cout<<"Enter Quantity.:-"<<endl;
							cin>>qut2;
							total4=total4+qut2*20;
							
							break;
						}
						case 2:
						{
							cout<<"Enter Quantity.:-"<<endl;
							cin>>qut2;
							total4=total4+qut2*15;
							
							break;
						}
						default :
						{
							cout<<"Enter Valid Choice:-"<<endl;
						}
					}
					
					
				}while(ch2!=3);
				
				
				break;
						
			}
		}
		
		
		
	}while(ch!=5);
		
	cout<<"1.Snaks.........||="<<total1<<endl;
	cout<<"2.Cold Drinks...||="<<total2<<endl;
	cout<<"3.Hot Drinks....||="<<total3<<endl;
	cout<<"4.Ice-cream.....||="<<total4<<endl;
	
	
	cout<<"Total Bill......||="<<total1+total2+total3+total4;
	
	return 0;
	
}