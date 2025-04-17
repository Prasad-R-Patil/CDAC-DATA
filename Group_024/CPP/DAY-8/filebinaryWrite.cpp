#include<fstream>
#include<iostream>
using namespace std;
class student{
	int rno;
	char name[15];
	public:
		void set_data()
		{
			cout<<"Enter Rno";
			cin>>rno;
			cout<<"\nEnter Name";
			cin>>name;
		}
		void display()
		{
			cout<<"Rno: "<<rno<<"Name: "<<name<<endl;
		}
};

int main()
{
	ofstream f1;
	f1.open("mydata.dat");
    student obj1;
    for(int i = 1;i<=5;i++)
    {
        obj1.set_data();
        f1.write((char *)&obj1,sizeof(obj1));
    }
	f1.close();
	return 0;
}
