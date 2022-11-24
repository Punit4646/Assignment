// addition,subtraction..

#include<iostream>
using namespace std;
int main()
{
  // declare variables
  double num1, num2;

  // take input from end-user
  cout << "Enter two Numbers :: ";
  cin >> num1 >> num2;

  // addition of two number
  cout << num1 << "+" << num2 << " = "<< num1+num2 << endl;

  // subtraction of two number
  cout << num1 << "-" << num2 << " = "<< num1-num2 << endl;

  // multiplication of two number
  cout << num1 << "*" << num2 << " = "<< num1*num2 << endl;

  // division of two number
  cout << num1 << "/" << num2 << " = "<< num1/num2 << endl;

  return 0;
}