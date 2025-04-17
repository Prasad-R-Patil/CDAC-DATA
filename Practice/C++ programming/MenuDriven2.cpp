
#include <iostream>
using namespace std;

int main() {
    int choice, quantity, totalBill = 0;
    char nextOrder;

   
    string items[] = {"Tea", "Coffee", "Sandwich", "Burger", "Pizza"};
    int prices[] = {10, 20, 50, 80, 150};
    int orderQty[5] = {0}; 

    cout << "\nWelcome to the Hotel ShivRaj..." << endl;

    do {
        cout << "\n==>> Menu: <<==\n";
        for (int i = 0; i < 5; i++) 
        {
            cout << "=> " << (i + 1) << ". " << items[i] << " - Rs. " << prices[i] << endl;
        }
        cout << "=> 6. Exit\n";

        cout << "\nEnter your choice: ";
        cin >> choice;

        if (choice >= 1 && choice <= 5) 
        {
            cout << "Enter quantity: ";
            cin >> quantity;
            orderQty[choice - 1] += quantity;
            totalBill += prices[choice - 1] * quantity;

            cout << "Added " << quantity << " " << items[choice - 1] << "(s) to your order.\n";
        } 
        else if (choice != 6) 
        {     
            cout << "Invalid choice! Please select a valid option.\n";
        }

    } while (choice != 6);

    // Printing order 
    cout << "\n==>> Order Summary <<==\n";
    for (int i = 0; i < 5; i++) 
    {
        if (orderQty[i] > 0) 
        {
            cout << items[i] << " x " << orderQty[i] << " = Rs. " << (orderQty[i] * prices[i]) << endl;
        }
    }
    cout << "Total Bill Amount: Rs. " << totalBill << endl;

    cout << "\nThank You For Visiting!\nHave a great day!\n";
    return 0;
}
