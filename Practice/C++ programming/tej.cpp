

#include <fstream>
#include <iostream>

using namespace std;

int main() {
    string ch;
    ifstream f1;
    int uppercent = 0; // Declare a variable to count uppercase letters

    // Open the file
    f1.open("tyy.txt");
    if (!f1) {
        cout << "Error opening file!" << endl;
        return 1; // Exit the program if the file cannot be opened
    }

    // Read the file line by line
    while (getline(f1, ch)) {
        for (int i = 0; ch[i]; i++) {
            if ((ch[i] >= 'A') && (ch[i] <= 'Z')) { // Fixed the missing parenthesis here
                uppercent++; // Increment uppercase counter
            }
        }
    }

    // Print the result
    cout << "Total uppercase letters: " << uppercent << endl;

    f1.close(); // Close the file
    return 0;
}
 	
 	
 	
 	
 
