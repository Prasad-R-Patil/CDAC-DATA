#include<iostream>
using namespace std;

int main()
{
   /* string str;
    cout<<"\n Enter a String :";
    cin>>str;

    cout<<"\n Entered string is :"<<str;

    str = "Technologies";

    str = str + "Pvt";

    cout<<"\n New Value of string is :"<<str;*/
    string s1, s2;
    cout<<"\n Enter two strings :";
    cin>>s1;
    cin>>s2;

   /* if(s1 == s2)
        cout<<"\n Strings are equal.";
    else
        cout<<"\n Strings are different..";
  */

    cout<<"\n\n"<<s1.size();
    s1 = s1 + " Technologies";
    cout<<"\n s1 = "<<s1;
    //s1 = s2;
    cout<<"\n\n"<<s1.size();
    s1.replace(3,4,"PQRST");
    cout<<" "<<s1;
   // cout<<"\n s1 = "<<s1 <<"   s2 = "<<s2;
    return 0;
}
/*Assignment:Find put some more functions in string class
and try to use it.

2.

A word is said to be magic word if it satisfies
following properties :
  1. The word has atleast 6 characters.
  2. The word has even number of character.
  3. The word has first letter 'Z' or 'z'
      hint use s1[0]

  4. The word has last and first character same.
  5. The word has two halves which are same.

  Sample Input: peek
     ZAGAZ
  s1   Z A G Z Z A G Z
       0 1 2 3 4 5 6 7   =   8


       for(i=0, j=len/2 ; i<len/2; i++,j++)
       {
           if(s1[i] == s1[j])
              continue;
            else
              break;
       }
