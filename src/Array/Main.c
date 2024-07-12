#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    int a[n];
    int i;
    // Directions of ants
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    int left = 0, right = 0;
    // Number of contiguous ants at left edge and moving towards left
    for (i = 0; i < n; i++)
    {
        if (a[i] == -1)
        {
            left++;
        }
        else
        {
            break;
        }
    }
    for (i = n - 1; i >= 0; i--)
    {
        if (a[i] == 1)
        {
            right++;
        }
        else
        {
            break;
        }
    }
    // Number of ants between 'left' and 'right' position and moving towards left
    int leftgoingants = 0;
    for (i = left; i <= n - right - 1; i++)
    {
        if (a[i] == -1)
        {
            leftgoingants++;
        }
    }
    if (left >= right)
    {
        printf("%d", left + leftgoingants);
    }
    else
    {
        printf("%d", left + leftgoingants + 1);
    }
    return 0;
}