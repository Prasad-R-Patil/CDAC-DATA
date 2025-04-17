#include<iostream>
#include<iomanip>
using namespace std;


int  main()
{
/*
   char *c = "ABCDEF";

   cout<<(void *)c<<"   "<<c<<"\n";

   cout.write(c,4);
   cout<<endl;

   cout.put('I').put('N').put('\n');

   float a = 3.14159678;
   cout.precision(5);

   cout<<a;


   char str[150];
  cout<<"\n Enter String :";
   cin.getline(str,15,'\n');
   cin.getline()
   cout<<str;

int uppercnt = 0, digitcnt = 0;
   cin.read(str,150);  // read till ^Z

   //cout<<str;
   for(int i=0;str[i]; i++)
   {
       if(str[i]>='A' && str[i]<='Z')
       {
           uppercnt++;
           cout<<"\n condition for upper "<<str[i];
       }

       if(str[i]>='0' && str[i]<='9')
       {
            digitcnt++;
            cout<<"\n condition for digit "<<str[i];
       }

   }
   cout<<"\n uppercnt = "<<uppercnt;
   cout<<"\n digitcnt = "<<digitcnt;
*/

   int num;
   cout<<"\n";
   for(num = 1 ; num < 10 ; num ++)
   {
       cout<<setw(6)<<num*num*num<<"\n";
       //cout<<num*num*num<<"\n";
       cout<<setfill('*');
   }


   return 0;
}
