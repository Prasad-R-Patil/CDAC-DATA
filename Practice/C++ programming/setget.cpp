#include<iostream>
using namespace std;


class date{
	
	int dd,mm,yy;
		
		
 public:
	void set_date(int d,int m,int y)
		{
			dd=d;
			mm=m;
			yy=y;
		}
		void set_day(int d)
		{
			dd=d;
		}
		void set_month(int m)
		{
			mm=m;
		}
		
		
		int get_day()
	{
		return dd;
	}
		
		
		
	void display()
		{
			cout<<"\n"<<dd<<" / "<<mm<<" / "<<yy<<endl;
			
		}
	};//end class

int main()
{
	date obj;
	obj.set_date(20,10,2023);
	obj.display();
	obj.get_day();
	int d=0;
	d=obj.get_day();
	cout<<d;
	
	return 0;
}	
