#include<iostream>
using namespace std;


class date{
	
	int hh=0,mm=0,ss=0;
		
		
 public:
	void set_time(int h,int m,int s)
		{
			
				//Check hour...
				if ((h>0) &&(h<=24))
				{
					hh=h;
				}
				else
				{
					cout<<"Invalid Hour..."<<endl;
				}
				
				
				
				
				// check Minit...
				
				if((m>0) && (m<=60))
				{
					mm=m;
				}
				else
				{
					cout<<"Invalid Minit...."<<endl;
				}
				
				//check second...
				
				if((s>0) && (s<=60))
				{
					ss=s;
				}
				else
				{
					cout<<"Invalid Second...."<<endl;
				}
					
				
			
			
			
		
		
		}
		void display()
		{
			cout<<"\n"<<hh<<":"<<mm<<":"<<ss<<endl;
			
		}
	};//end class

int main()
{
	int h,m,s;
	date obj;
	
	cout<<"Enter The Time HH:MM:SS(eg:- 24:60:60) :- ";
	cout<<"Hour :- ";
	cin>>h;
	cout<<"Minit :- ";
	cin>>m;
	cout<<"Second :- ";
	cin>>s;
	
	
	
	obj.set_time(h,m,s);
	obj.display();
	return 0;
}	
