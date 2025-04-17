#include<iostream>
using namespace std;

int main()
{

    int unit = 0;
    float Total = 0.0f;
    float Instrest = 0.0f;

    cout<<"\n=========================================================\n";
    cout<<"Enter Your Electric Bill Unit... :-  ";
    cin>>unit;
    cout<<"\n=========================================================\n";

    if(unit<=50)
    {
        Total = unit*8.5;
    }
    else if((unit>50) && (unit<=250))
    {
        Total = ((50*8.5) + ((unit-50)*13));
    }
    else if(unit>250)
    {
        Total = ((50*8.5) + (200*13) + ((unit-250)*18.25));
    }
     
    cout<<"\n=========================================================\n";
    cout<<"Total Electric Bill is =>>  RS. "<<Total<<endl;
    cout<<"\n=========================================================\n";

    if(Total<=800)
    {
		Total=850;
        
        cout<<"Your Electric Bill is =>>  RS. "<<Total<< " Bill is <800 then 850 is compalsary"<<endl;
        cout<<"\n========================================================================================\n";
    }
    else if((Total>1000) && (Total < 1500))
    {
        Instrest = (Total*8/100);
        cout<<"Your Electric Bill is =>>  RS. "<<Total<< " Then  Extra Charge Rs. "<<Instrest<< "  Final Ammount is Rs. "<<Total+Instrest<<endl;
        cout<<"\n=======================================================================================================================================\n";

    }
    else if(Total>=1500) 
    {
        Instrest = (Total*15/100);
        cout<<"Your Electric Bill is =>>  RS. "<<Total<< " Then  Extra Charge Rs. "<<Instrest<< "  Final Ammount is Rs. "<<Total+Instrest<<endl;
        cout<<"\n=======================================================================================================================================\n";
    }




    return 0;
}