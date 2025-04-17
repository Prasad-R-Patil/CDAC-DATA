#include <iostream>

using namespace std;


int Hot_Drink(int totalBill , int choice)
{
    int quantity = 0;
    do {
        cout << "\n==>> Menu: <<==\n";
        cout << "=> 1. Tea - Rs. 10\n";
        cout << "=> 2. Coffee - Rs. 20\n";
        cout << "=> 3. Green-Tea - Rs. 30\n";
        cout << "=> 4. Milk - Rs. 40\n";
        cout << "=> 5. Exit\n";

        cout << "\nEnter your choice: ";
        cin >> choice;

        switch(choice)
        {

                case 1:
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 10 * quantity;
                        cout << "Added " << quantity << " Tea(s) to your order.\n";
                        break;
                    }
                case 2 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 20 * quantity;
                        cout << "Added " << quantity << " Coffee(s) to your order.\n";
                        break;
                    }
                case 3 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 30 * quantity;
                        cout << "Added " << quantity << " Sandwich(es) to your order.\n";
                        break;
                    }
                case 4 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 40 * quantity;
                        cout << "Added " << quantity << " Burger(s) to your order.\n";
                        break;
                    }
                default:
                    {
                    cout << "Invalid choice! Please select a valid option.\n";
                    }

        }


    } while (choice != 5);

    return totalBill;
}

int Soft_Drink(int totalBill , int choice)
{
    int quantity = 0;
    do {
        cout << "\n==>> Menu: <<==\n";
        cout << "=> 1. Coca-Cola - Rs. 20\n";
        cout << "=> 2. Apple Sidra - Rs. 40\n";
        cout << "=> 3. Mountain Dew - Rs. 30\n";
        cout << "=> 4. Sprite - Rs. 20\n";
        cout << "=> 5. Maaza - Rs. 45\n";
        cout << "=> 6. Exit\n";

        cout << "\nEnter your choice: ";
        cin >> choice;

        switch(choice)
        {

                case 1:
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 20 * quantity;
                        cout << "Added " << quantity << " Coca-cola s to your order.\n";
                        break;
                    }
                case 2 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 40 * quantity;
                        cout << "Added " << quantity << " Apple(s) to your order.\n";
                        break;
                    }
                case 3 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 30 * quantity;
                        cout << "Added " << quantity << " Mountein(es) to your order.\n";
                        break;
                    }
                case 4 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 20 * quantity;
                        cout << "Added " << quantity << " Sprite(s) to your order.\n";
                        break;
                    }
                case 5 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 45 * quantity;
                        cout << "Added " << quantity << " Maaza(s) to your order.\n";
                        break;
                    }
                default:
                    {
                    cout << "Invalid choice! Please select a valid option.\n";
                    }

        }


    } while (choice != 6);

    return totalBill;
}

int Fast_Food(int totalBill , int choice)
{
    int quantity = 0;
    
    do {
        cout << "\n==>> Menu: <<==\n";
        cout << "=> 1. French Fries - Rs. 100\n";
        cout << "=> 2. Noodles - Rs. 70\n";
        cout << "=> 3. Sandwich - Rs. 50\n";
        cout << "=> 4. Burger - Rs. 80\n";
        cout << "=> 5. Pizza - Rs. 150\n";
        cout << "=> 6. Exit\n";

        cout << "\nEnter your choice: ";
        cin >> choice;

        switch(choice)
        {

                 case 1:
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 100 * quantity;
                        cout << "Added " << quantity << " FrenchFries(s) to your order.\n";
                        break;
                    }
                 case 2 :
                     {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 70 * quantity;
                        cout << "Added " << quantity << " Noodles(s) to your order.\n";
                        break;
                     }
                 case 3 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 50 * quantity;
                        cout << "Added " << quantity << " Sandwich(es) to your order.\n";
                        break;
                    }
                case 4 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 80 * quantity;
                        cout << "Added " << quantity << " Burger(s) to your order.\n";
                        break;
                    }
                case 5 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 150 * quantity;
                        cout << "Added " << quantity << " Pizza(s) to your order.\n";
                        break;
                    }
                case 6 :
                    {
                    cout << "\nTotal Bill Amount: Rs. ==>> " << totalBill << endl;
                    break;

                    }
                default:
                    {
                    cout << "Invalid choice! Please select a valid option.\n";
                    }

        }


    } while (choice != 6);
  
    return totalBill;
}

int Veg_Menu(int totalBill , int choice)
{
    int quantity = 0;
    do {
        cout << "\n==>> Menu: <<==\n";
        cout << "=> 1. Shahi Panner - Rs. 130\n";
        cout << "=> 2. Veg Biryani - Rs. 120\n";
        cout << "=> 3. Matar Mushroom - Rs. 150\n";
        cout << "=> 4. Poori Bhaji - Rs. 100\n";
        cout << "=> 5. Exit\n";

        cout << "\nEnter your choice: ";
        cin >> choice;

        switch(choice)
        {

                case 1:
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 130 * quantity;
                        cout << "Added " << quantity << " Panner(s) to your order.\n";
                        break;
                    }
                case 2 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 120 * quantity;
                        cout << "Added " << quantity << " Biryani(s) to your order.\n";
                        break;
                    }
                case 3 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 150 * quantity;
                        cout << "Added " << quantity << " Mushroom(es) to your order.\n";
                        break;
                    }
                case 4 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 100 * quantity;
                        cout << "Added " << quantity << " PooriBhaji(s) to your order.\n";
                        break;
                    }

        }


    } while (choice != 5);

    return totalBill;
}

int Non_Veg_Menu(int totalBill , int choice)
{
    int quantity = 0;
    do {
        cout << "\n==>> Menu: <<==\n";
        cout << "=> 1. Chicken Masala - Rs. 230\n";
        cout << "=> 2. Non-Veg Biryani - Rs. 150\n";
        cout << "=> 3. Mutton Masala - Rs. 450\n";
        cout << "=> 4. Anda Curry - Rs. 100\n";
        cout << "=> 5. Exit\n";

        cout << "\nEnter your choice: ";
        cin >> choice;

        switch(choice)
        {

                case 1:
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 230 * quantity;
                        cout << "Added " << quantity << " Chicken-Masala(s) to your order.\n";
                        break;
                    }
                case 2 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 150 * quantity;
                        cout << "Added " << quantity << " Non-Veg-Biryani(s) to your order.\n";
                        break;
                    }
                case 3 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 450 * quantity;
                        cout << "Added " << quantity << " Mutton-Masala(es) to your order.\n";
                        break;
                    }
                case 4 :
                    {
                        cout << "Enter quantity: ";
                        cin >> quantity;
                        totalBill += 100 * quantity;
                        cout << "Added " << quantity << " Anda-Curry(s) to your order.\n";
                        break;
                    }

        }


    } while (choice != 5);

    return totalBill;
}



int main() 
{
    int choice, quantity, totalBill=0;
    char nextOrder;


        int totalBill1 = 0;
        int totalBill2 = 0;
        int totalBill3 = 0;
        int totalBill4 = 0;
        int totalBill5 = 0;
        cout << "\nWelcome to the Hotel ShivRaj..." << endl;

        do {
            cout << "\n==>> Menu: <<==\n";
            cout << "=> 1. Hot-Drink\n";
            cout << "=> 2. Soft-Drink\n";
            cout << "=> 3. Fast-Food\n";
            cout << "=> 4. Veg-Menu\n";
            cout << "=> 5. Non-Veg Menu\n";
            cout << "=> 6. Exit\n";

            cout << "\nEnter your choice: ";
            cin >> choice;

            switch(choice)
            {

                     case 1:
                        {
                                                            
                            totalBill1=Hot_Drink(totalBill,choice);
                            break;
                        }
                     case 2 :
                         {
                            totalBill2=Soft_Drink(totalBill,choice);
                            break;
                         }
                     case 3 :
                        {
                            totalBill3=Fast_Food(totalBill,choice);
                           
                            break;
                        }
                    case 4 :
                        {
                            totalBill4=Veg_Menu(totalBill,choice);
                            break;
                        }
                    case 5 :
                        {
                            totalBill5=Non_Veg_Menu(totalBill,choice);
                            break;
                        }
                    case 6 :
                        {
                        cout << "\nTotal Bill Amount: Rs. ==>> " << totalBill1+totalBill2+totalBill3+totalBill4+totalBill5 << endl;
                        break;

                        }
                    default:
                        {
                        cout << "Invalid choice! Please select a valid option.\n";
                        }

            }


        } while (choice != 6);



    cout << "\nThank You For Visit...\n Have a great day!\n";
    
    return 0;
}
