#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    int num;
    cin >> num;
    int x1,y1,r1,x2,y2,r2;
    double d;
    int res;
    for (int i=0; i<num; i++) {
        cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;
         
        if(x1==x2 && y1==y2) {
            if(r1==r2) res = -1;
            else res = 0;
        }   
        else {
            int min = abs(r1-r2);
            d = sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
            if (d<r1+r2 && d>min) res = 2;
            else if (d == r1+r2 || d == min) res = 1;
            else res = 0;
        }    
        cout << res << endl;
    }
    return 0;
}
