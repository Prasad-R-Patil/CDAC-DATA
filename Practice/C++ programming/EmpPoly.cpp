#include<iostream>
using namespace std;

class emp
{
    protected:
    int empno;
    string name;
    float bsal;

    public:

    emp()
    {
        empno = 1;
        name  = "Prasad";
        bsal  = 55000.00f;
        
    }

    emp(int en , string nm , float bs)
    {
        empno = en;
        name  = nm;
        bsal = bs;

    }

    ~emp()
    {
        cout<<"emp ~dest called..."<<endl;
    }


    virtual float cal_sal() = 0;  // pure virtual function 

};
    

class manager : public emp
{

    float bonus;

    public:
    manager()
    {
        empno = 1;
        name  = "Prasad";
        bsal  = 55000.00f;
        bonus = 5000.00f;
    }

    manager(int en , string nm , float bs ):emp (en,nm,bs)
    {
        
        bonus = 5000.00f;
    }

    manager(int en , string nm , float bs , float b):emp (en,nm,bs)
    {
        bonus = b;

    }

    ~manager()
    {
        cout<<"manager ~dest called..."<<endl;
    }

     void Display()
    {
        cout<<"[ Manager ] => "<<empno<<" "<<name<<" "<<bsal<<" "<<bonus<<endl;

    }
     float cal_sal()
    {
        Display();
        cout<<"\n---------------------------------------------------------------------------\n"<<endl;
        return bsal + bonus;
    }

};  


class clark : public emp
{

    int overTime;

    public:
    clark()
    {
        empno = 1;
        name  = "Prasad";
        bsal  = 55000.00f;
        overTime = 1;
    }

    clark(int en , string nm , float bs ):emp (en,nm,bs)
    {
        
        overTime = 1;
    }

    clark(int en , string nm , float bs , int o):emp (en,nm,bs)
    {
        overTime = o;

    }

    ~clark()
    {
        cout<<"clark ~dest called..."<<endl;
    }

     void Display()
    {
        cout<<"[ Clark ] => "<<empno<<" "<<name<<" "<<bsal<<" "<<overTime<<endl;

    }
     float cal_sal()
    {
        Display();
        cout<<"\n---------------------------------------------------------------------------\n"<<endl;
        return bsal + ( overTime * 500 );
    }

};  

class programmer : public emp
{

    float incentive;

    public:
    programmer()
    {
        empno = 1;
        name  = "Prasad";
        bsal  = 55000.00f;
        incentive = 5.00f;
    }

    programmer(int en , string nm , float bs ):emp (en,nm,bs)
    {
        
        incentive = 25.00f;
    }

    programmer(int en , string nm , float bs , float i):emp (en,nm,bs)
    {
        incentive = i ;

    }

    ~programmer()
    {
        cout<<"programmer ~dest called..."<<endl;
    }

     void Display()
    {
        cout<<"[ programmer ] => "<<empno<<" "<<name<<" "<<bsal<<" "<<incentive<<endl;

    }
     float cal_sal()
    {
        Display();
        cout<<"\n---------------------------------------------------------------------------\n"<<endl;
         
        if((incentive >= 10.00f) && (incentive <= 25.00f))
        {
            int add = ((bsal * 15)/100);
            return bsal + add;
        }
        else if((incentive >= 26.00f) && (incentive <= 50.00f))
        {
            int add = ((bsal * 25)/100);
            return bsal + add;
        }
        else if((incentive >= 51.00f) && (incentive <= 75.00f))
        {
            int add = ((bsal * 35)/100);
            return bsal + add;
        }
        else if((incentive >= 76.00f) && (incentive <= 100.00f))
        {
            int add = ((bsal * 50)/100);
            return bsal + add;
        }
    }

};  




int main()
{
    cout<<"\n===================================[obj-1]=================================\n"<<endl;
                //Manager
    emp *ptr1 = new manager(11,"sagar", 50000.00f,5000.00f);
    
    cout<<"Total Salary include bonus is ==>> "<<ptr1->cal_sal()<<endl;
    cout<<"\n---------------------------------------------------------------------------\n"<<endl;
    delete ptr1;

    cout<<"\n############################################################################\n"<<endl;



    cout<<"\n===================================[obj-2]=================================\n"<<endl;
               //Manager
    emp *ptr2 = new manager(12,"Patil", 100000.00f,5000.00f);

    cout<<"Total Salary include bonus is ==>> "<<ptr2->cal_sal()<<endl;
    cout<<"\n---------------------------------------------------------------------------\n"<<endl;
    delete ptr2;

    cout<<"\n############################################################################\n"<<endl;

    
    cout<<"\n===================================[obj-3]=================================\n"<<endl;
               //Clark
    emp *ptr3 = new clark(13,"Harshal", 10000.00f,5);

    cout<<"Total Salary include bonus is ==>> "<<ptr3->cal_sal()<<endl;
    cout<<"\n---------------------------------------------------------------------------\n"<<endl;
    delete ptr3;

    cout<<"\n############################################################################\n"<<endl;


    cout<<"\n===================================[obj-4]=================================\n"<<endl;
               //Programmer
    emp *ptr4 = new programmer(14,"Kunal", 100000.00f,16.00f);

    cout<<"Total Salary include bonus is ==>> "<<ptr4->cal_sal()<<endl;
    cout<<"\n---------------------------------------------------------------------------\n"<<endl;
    delete ptr4;

    cout<<"\n############################################################################\n"<<endl;


    cout<<"\n===================================[obj-5]=================================\n"<<endl;
               //Programmer
    emp *ptr5 = new programmer(15,"Bhart", 100000.00f,55.00f);

    cout<<"Total Salary include bonus is ==>> "<<ptr5->cal_sal()<<endl;
    cout<<"\n---------------------------------------------------------------------------\n"<<endl;
    delete ptr5;

    cout<<"\n############################################################################\n"<<endl;




    return 0;
}