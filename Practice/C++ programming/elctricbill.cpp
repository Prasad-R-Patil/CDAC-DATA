#include<iostream>
using namespace std;

int main()
{   

    float unit;
    float total=0.0f;	
	cout<<" Enter unit :- ";
	cin>>unit;
	
	if (unit<=50)
	{
		total=unit*8.5;
	}
	else if ((unit>=50) && (unit<=250))
	{
		
		total = (50*8.5)+( (unit-50)*13.00);
	}
	else if (unit>250)
	{
		total= (50*8.5)+( 200*13.00)+((unit-250)*18.25);
	}
	
	
	
	
	if (total<850)
	{
		total=850;
		cout<<" Final Amount bill is =>> "<<total<<endl;
	}
	
	else if(total>=1500)
	{
		int intrest = 0;
		intrest=(total*15/100);
		cout<<" Total bill %15 for extra =>> "<<intrest <<"  Total Bill is =>>"<<total+intrest<<endl;
		cout<<" Final Amount bill is =>> "<<total+intrest<<endl;
	}
	
	
	
	return 0;
}