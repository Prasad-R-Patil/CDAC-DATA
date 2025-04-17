#include <iostream>
using namespace std;

class StringOperation 
{
protected:
    int strlength(const char* str) 
    {
        int length = 0;
        while (str[length] != '\0') 
        {
            length++;
        }
        return length;
    }

    // Copy string
    char* strcopy(char* dest, const char* src) 
    {
        int i = 0;
        while (src[i] != '\0') 
        {
            dest[i] = src[i];
            i++;
        }
        dest[i] = '\0';  
        return dest; 
    }

    // Compare two strings
    int strcompare(const char* str1, const char* str2) 
    {
        int i = 0;
        while (str1[i] != '\0' && str2[i] != '\0') 
        {
            if (str1[i] != str2[i]) 
            {
                return str1[i] - str2[i];
            }
            i++;
        }
        return str1[i] - str2[i]; 
    }
};

// Person class inherits from StringOperation
class person : public StringOperation 
{
protected:
    int Age;
    char* name;

public:
    // Default constructor
    person() 
    {
        Age = 24;
        name = new char[strlength("prasad") + 1];  // Allocate memory
        strcopy(name, "prasad");
    }

    // Parameterized constructor
    person(int a, const char* nm) 
    {
        Age = a;
        name = new char[strlength(nm) + 1];  // Allocate memory
        strcopy(name, nm);
    }

    // Copy constructor
    person(const person& p) 
    {
        Age = p.Age;
        name = new char[strlength(p.name) + 1];
        strcopy(name, p.name);
    }

    // Virtual destructor 
    virtual ~person() 
    {
        delete[] name;
    }

    // Pure virtual function
    virtual void Display() = 0;
};

// Student class inheriting from person
class Student : public person 
{
    char grade;

public:
    // Default constructor
    Student() : person() 
    {
        cout << "\nDefault Constructor Student called..." << endl;
        grade = 'A';  // Default grade
    }

    // Parameterized constructor
    Student(int a, const char* s, char g) : person(a, s) 
    {
        cout << "\nParameterized Constructor Student called..." << endl;
        grade = g;
    }

    // Copy constructor
    Student(const Student& s) : person(s) 
    {
        cout << "\nCopy Constructor Student called..." << endl;
        grade = s.grade;
    }

    // Overloaded equality operator
    bool operator==(const Student& s) 
    {
        return (Age == s.Age && strcompare(name, s.name) == 0 && grade == s.grade);
    }

    
    void Display()  
    {
        cout << "Student Details:" << endl;
        cout << "Name: " << name << endl;
        cout << "Age: " << Age << endl;
        cout << "Grade: " << grade << endl;
    }

    // Destructor
    ~Student() 
    {
        delete[] name;
    }
};

// Main function
int main() {
    Student s1;  
    s1.Display();

    Student s2(22, "John", 'B');  
    s2.Display();

    Student s3 = s2;  
    s3.Display();

   
    if (s2 == s3) {
        cout << "s2 and s3 are equal" << endl;
    } else {
        cout << "s2 and s3 are not equal" << endl;
    }

    return 0;
}
