#include<iostream>
using namespace std;
 int main()
 {
	 string str;





	 cout<<" enter string:-";
	 cin>>str;
	 int len=str.length();
	 int p =(str.length())-1;
	 int i,j;
	 // cout<<len;

	 if ( (len>=6) && (len%2==0) && ((str[0]=='Z')||(str[0]=='z')) && ((str[p]=='Z') ||(str[p]=='z')) )
     {
		 //cout<<"len/2  "<<len/2;
		 
		for(i=0,j=len/2; i<=(len/2); i++,j++)
		{
			 cout<<"\ni =" <<i;
		 if(str[i]==str[j])
			 continue;
		 else
			 break;
		}

	 }
    

		if (i==(len/2))
		{
		 cout<<"\n\a "<<str<<" this string is magical...";
		}
		else
		{
			cout<<"\n\a "<<str<<" this not string is magical...";
		}



	 


/*

	 if(len>=6)
     {
		 cout<<"\n ok";
	 }
     if(len%2==0)
	 {
		 cout<<"\n ok Ok";
	 }
	 if((str[0]=='Z')||(str[0]=='z'))
	 {
		 cout<<"\n ok ok ok";
	 }
	 if ((str[p]=='Z')||(str[p]=='z'))
	 {
		 cout<<"\n ok ok ok ok";
	 }

	 else
	 {
		 cout<<"fail";
	 }


	 for(i=0,j=len/2; i<=len/2; i++,j++)
	 {
		 if(str[i]==str[j])
			 continue;
		 else
			 break;
	 }
	 if (i==(len/2))
	 {
		 cout<<"\n this string is magical...";
	 }





*/












	 return 0;
 }
