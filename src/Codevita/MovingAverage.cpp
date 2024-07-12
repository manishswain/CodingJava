#include <bits/stdc++.h>
#define mod 1000000007
#define mp make_pair
#define pb push_back
#define ff first
#define ss second
#define loops(i,a,b) for(auto i=a;i<=b;i++)
#define rrep(i,a,b) for(auto i=a;i>=b;i--)
#define mrep(i,m) for(auto i=m.begin();i!=m.end();i++)
#define all(x) (x).begin(),(x).end()
using namespace std;

void solve()
{
    int n,x,y;

    cin>>x>>y>>n;

     double a[n];

    loops(i,0,n-1)cin>>a[i];
    vector<double>twoarr;
    vector<double>fourarr;
    double total=0.000000;
    int m=max(x,y);
    loops(i,0,n-1)
    {
       total+=a[i];
       if(i>=x-1)
       {
           if(i>=m-1)
            twoarr.pb(total/x);
           total-=a[i-x+1];
        }
    }
    total=0.000000;
    loops(i,0,n-1)
    {
       total+=a[i];
       if(i>=y-1)
       {
           if(i>=m-1)
            fourarr.pb(total/y);
           total-=a[i-y+1];
        }
    }
   int f=0,ans=0;
   for(int i=0,i<15;i++)
   {
       
   }
   if(twoarr[0]>fourarr[0])f=1;
   loops(i,1,(int)twoarr.size()-1) 
   {
        if(f&&twoarr[i]<fourarr[i])ans++,f=0;
       else if(!f&&twoarr[i]>fourarr[i])ans++,f=1;
    }

   cout<<ans;
}

int32_t main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    solve();
    return 0;
}