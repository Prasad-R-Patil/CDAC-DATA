#include<iostream>
using namespace std;

class emp
{
	protected:
	
		int empno;
		string name;
		float bsal;
	
	public:
		//setter getter
		
		emp()
		{
			cout<<"\n default constructor of emp..";
			empno=0;
			name="sagar";
			bsal=0.0f;
		}
		
		emp(int n,string nm,float bs)
		{
			empno=n;
			name=nm;
			bsal=bs;
		}
		
		~emp()
		{
			cout<<"\n dest of emp";
		}
		
		virtual float cal_sal()
		{
			cout<<"\n calculate sal"<<bsal;
			return bsal;
		}
		
		
		
	
	
};


class manager:public emp
{

	
	float bonus;

		public:
		
		manager()
		{
			bonus=0.0f;
		}
		
		manager(int a)
		{
			bonus=a;
		}
		manager(int n,string nm,float bs,float b):emp(n,nm,bs)
		{
			bonus=b;
		}
		
		float cal_sal()
		{
			bsal=bsal+bonus;
			return bsal;
		}
		
		~manager()
		{
			
		}
		
};

class clark:public emp
{
	
	
	int overtime;

		public:
		
		clark()
		{
			overtime= 1;
		}
		
		clark(int a)
		{
			overtime=a;
		}
		clark(int n,string nm,float bs,int o):emp(n,nm,bs)
		{
			overtime= o;
		}
		
		float cal_sal()
		{
			bsal=bsal+overtime*500;
			return bsal;
		}
		
		~clark()
		{
			
		}
		
};

class programmer:public emp
{
	
	
	int insentive;

		public:
		
		programmer()
		{
			insentive=5;
		}
		
		programmer(int a)
		{
			insentive=a;
		}
		programmer(int n,string nm,float bs,int i):emp(n,nm,bs)
		{
			insentive=i;
		}
		
		float cal_sal()
		{
			if(insentive<25)
			{
			  bsal=bsal+((bsal*5)/100);
			  return bsal;
			}
			else if((insentive>=25) && (insentive<50))
			{
				bsal=bsal+((bsal*10)/100);
			  return bsal;
			}
			else if((insentive>=50) && (insentive<75))
			{
				bsal=bsal+((bsal*15)/100);
			  return bsal;
			}
			else if((insentive>=75) && (insentive<=100))
			{
				bsal=bsal+((bsal*25)/100);
			  return bsal;
			}
			
			
		}
		
		~programmer()
		{
			
		}
		
};


int main()
{
	
	//manager m(10,"sagar",5000.0,500.0);
	
	emp *ptr= new programmer(10,"sagar",100000.0,60);
	
	cout<<"bonus of emp = "<<ptr->cal_sal(); 
	return 0;
	
	
}
