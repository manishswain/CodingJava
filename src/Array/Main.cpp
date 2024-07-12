#include <bits/stdc++.h>
using namespace std;
  
/* Returns the square root of n. Note that the function */
float squareRoot(float n)
{
    /* We are using n itself as initial approximation
      This can definitely be improved */
    float x = n;
    float y = 1;
  
    float e = 0.000001; /* e decides the accuracy level*/
    while (x - y > e)
    {
        x = (x + y) / 2;
        y = n/x;
    }
    return x;
}
  
//  Method to find maximum height of arrangement of coins
int findMaximumHeight(int N)
{
    //  calculating portion inside the square root
    int n = 1 + 8*N;
    int maxH = (-1 + squareRoot(n)) / 2;
    return maxH;
}
  
//  Driver code to test above method
int main()
{
    int N = 12;
    cout << findMaximumHeight(N) << endl;
    return 0;
}