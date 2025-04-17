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
	void display()
		{
			cout<<"\n"<<dd<<" / "<<mm<<" / "<<yy;
			
		}
	};//end class

int main()
{
	date obj;
	obj.set_date(20,10,2023);
	obj.display();
	return 0;
}	
