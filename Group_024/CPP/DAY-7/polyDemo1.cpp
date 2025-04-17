#include<iostream>
using namespace std;

class emp
{
    protected:
    int empno;
    string name;
    float bsal;
public :
    //write all getter and setters
    emp()
    {
        cout<<"\n Default constructor of emp";
        empno = 0;
        name = "Janhavi";
        bsal = 0.0f;
    }
    emp(int n, string nm, float bs)
    {
        cout<<"\n Param constructor of emp";
        empno = n;
        name = nm;
        bsal = bs;
    }
    virtual ~emp()
    {
        cout<<"\n Destructor of emp";
    }
    virtual float cal_sal() = 0;  //pure virtual function
  /*  {
        cout<<"\n cal_sal() of emp is called..";
        return bsal;
    }*/
};

class manager : public emp
{
   float bonus;
   public:
    // getter and setter for bonus

    manager()
    {
        bonus = 0.0f;
        cout<<"\n Default constructor of manager";
    }
    manager(int n, string nm, float bs, float b) : emp(n,nm,bs)
    {
        bonus = b;
        cout<<"\n Param constructor of manager";
    }
    ~manager()
    {
        cout<<"\n Destructor of manager";
    }
    float cal_sal()
    {
        return bsal + bonus;
    }
};

class clerk : public emp
{
   int overtime;
   public:
    // getter and setter for bonus

    clerk()
    {
        overtime = 1;
        cout<<"\n Default constructor of clerk";
    }
    clerk(int n, string nm, float bs, int o) : emp(n,nm,bs)
    {
        overtime = o;
        cout<<"\n Param constructor of clerk";
    }
    ~clerk()
    {
        cout<<"\n Destructor of clerk";
    }
    float cal_sal()
    {
        return bsal + overtime * 500;
    }
};

int main()
{
   // emp e(10,"Pooja",35000.00f);
   // emp *em = new emp(5,"Nayan",45000.00f);
  //  em->cal_sal();
    emp *ptr = new manager(20,"Priti",45000.00f,7000.00f);
    //manager m(20,"Priti",45000.00f,7000.00f);
   // clerk c(30,"Sonal",66000.00f,5);

   // cout<<"\nSalary of emp Pooja = "<<e.cal_sal();
    cout<<"\nSalary of emp Priti = "<<ptr->cal_sal();
    delete ptr;
    ptr = new clerk(30,"Sonal",66000.00f,5);
    cout<<"\nSalary of emp Sonal = "<<ptr->cal_sal();
    delete ptr;
    return 0;

}
