#include<iostream>
using namespace std;
class myArray
{
    int len;
    int* ptr;
    public:
    myArray()
    {
        cout<<"\n default constructor is called";
         len=5;
         ptr=new int[len];
         for(int i=0;i<len;i++)
        {
            ptr[i]=0;
        }   
    }
    myArray(int a)
    {
        cout<<"\n Single Paramterize Constructor is Called";
        len=a;
        ptr=new int[len];
        for(int i=0;i<len;i++)
        {
            ptr[i]=0;
        }
    }
    ~myArray()
    {
        cout<<"\ndestructor is  called";
        delete [] ptr;
    }
    void accept_element()
    {
        for(int i=0;i<len;i++)
        {
            cout<<"\nEnter the number: ";
            cin>>ptr[i];
        }
    }
    void display_element()
    {
        for(int i=0;i<len;i++)
        {
            
            cout<<" "<<ptr[i];
        }
    }
    myArray(myArray &a)
    {
        cout<<"\ncopy constructor is called";
        len=a.len;
        ptr=new int[len];
        for(int i=0;i<len;i++)
        {
            ptr[i]=a.ptr[i];
        }
    }
    const myArray & operator= (const myArray &a)
    {
        delete [] ptr;
        len=a.len;
        ptr=new int[len];
        for(int i=0;i<len;i++)
        {
            ptr[i]=a.ptr[i];
        }
        return* this;
    }

};

int main()
{
    myArray obj1,obj2(7);
    obj1.accept_element();
    cout<<"\nobj1.accept_element()";
    obj1.display_element();
    obj2.accept_element();
    cout<<"\nobj2.accept_element()\n";
    obj2.display_element();
    myArray obj3(obj1);
    obj3.accept_element();
    obj3.display_element();
    obj2=obj3;
    cout<<"\n";
    obj2.display_element();
    obj1=obj2=obj3;
    cout<<"\n";
    obj1.display_element();
    return 0; 
}