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
	ifstream f1;
	f1.open("mydata.dat");
    student obj1;
    student arr[5];
    int i = 0;
    while(!(f1.eof()))
    {
        f1.read((char *)&arr[i],sizeof(obj1));
        //obj1.display();
        i = i + 1;
    }

    for(i=0;i<5;i++)
       arr[i].display();

    f1.close();


    return 0;
}


