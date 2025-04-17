#include<iostream>
using namespace std;


class date{
	
	int dd=1,mm=1,yy=1990;
		
		
 public:
	void set_date(int d,int m,int y)
		{
			
			
				
				if(m==1,m==3,m==5,m==7,m==8,m==10,m==12)	
				{
					if((d>0)&&(d<=31))
					{
						dd=d;
					}
				}
				else if(m==2 || m==02)
					{
						if((y%4)==0)
						{
							
							if((d>0)&&(d<=29))
							{
								dd=d;
							}
					
						}
					 
						else
						{
							if((d>0)&&(d<=28))
							{
								dd=d;
							}
						}
						
						
								
					}
				else
				{
				    if((d>0)&&(d<=30))
					{
						dd=d;
					}
				}
				// check Month...
				
				if((m>0) && (m<=12))
				{
					mm=m;
				}
				else
				{
					cout<<"Invalid Month...."<<endl;
				}
				
				//year check...
				
				if((y>=1990) && (y<=2025))
				{
					yy=y;
				}
					
				
			
			
			
		
		
		}
		void display()
		{
			cout<<"\n"<<dd<<" / "<<mm<<" / "<<yy;
			
		}
	};//end class

int main()
{
	int d,m,y;
	date obj;
	
	cout<<"Enter The Date DD/MM/YY(eg:- 12/4/2025) :- ";
	cout<<"Date :- ";
	cin>>d;
	cout<<"Month :- ";
	cin>>m;
	cout<<"Year :- ";
	cin>>y;
	
	
	
	obj.set_date(d,m,y);
	obj.display();
	return 0;
}	
