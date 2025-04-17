#include<fstream>
#include<iostream>
#include<sstream>
using namespace std;
int main()
{
	string ch;
	ifstream f1;
	ofstream f2;
	int sum = 0; // For summing up numbers
    string characters = ""; // To store non-numeric characters
    string num = ""; // Temporary string to store digits
	int uppercnt = 0, digitcnt = 0,lowercnt=0;
	
	f1.open("king.txt");
	
	
	
	
	
	
	
	while(getline(f1,ch))
	{
		
	 //for(int i=0;ch[i]; i++)
	   //{
			   /*if((ch[i]>='A') && (ch[i]<='Z'))
			   {
				   uppercnt++;
				   cout<<"\n condition for upper "<<ch[i];
			   }
			   else if((ch[i]>='a') && (ch[i]<='z'))
			   {
				   lowercnt++;
				   cout<<"\n condition for upper "<<ch[i];
			   }
			   else 
				   if((ch[i]>='0') && (ch[i]<='9'))
			   {
				   digitcnt++;
				   cout<<"\n condition for digit "<<ch[i];
			   }
			   if ((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')||(ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U'))
			   {
				   lowercnt++;
				   cout<<ch[i]<<endl;
			   }
			   
			   int sum=0;
			   
			    if (isdigit(sum)) 
				{
					ch += sum; // Append digit to temporary string
				}    
				else 
				{
				if (!ch.empty()) 
				{
					sum += stoi(ch); // Convert string to integer and add to sum
					ch = ""; // Reset temporary string
				}
			   
				}
				
				
				int number;
			   if((ch[i]>='0') && (ch[i]<='9'))
			   {
				   digitcnt++;
				   cout<<"\n condition for digit "<<ch[i];
				   
				   				   
			   }
			   stringstream ss(ch);
				   ss>>number;
				   cout<<number;
			  */ 
			  
			  
			  

    for (char cha : ch) {
        if (isdigit(cha)) {
            num += cha; // Collect digits
        } else {
            if (!num.empty()) {
                sum += stoi(num); // Convert collected digits to integer and add to sum
                num = ""; // Reset for next number
            }
            characters += cha; // Store non-numeric characters
        }
    }
    // Add any remaining number
    if (!num.empty()) {
       sum += stoi(num);
	   num="";
    }

    // Output results
    
    //cout << "Characters in the string: " << characters << endl;
			  

			   
			  
			 
       // }
		
		
	}
	cout << "Sum of numbers: " << sum << endl;
	
	cout<<"count is "<<uppercnt<<"   digitcnt is "<<digitcnt<<" lowercnt is="<<lowercnt<<endl;
	
	
	
	
	f1.close();
	
	
	f2.open("king.txt" , ios::app);
	
	f2<<"सागर दबाये रहा कई योजन रहस्य; सागर ने किनारों पर थोपी अपनी उत्कंठा; सागर ने लहरों की भुजाएँ फैला लीं; ";
	
	f2.close();
	
	ofstream f3;
	f3.open("king.txt", ios::out| ios::app);
	f3.close();
	

	return 0;
	
}