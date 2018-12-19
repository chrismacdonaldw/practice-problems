#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    for (int i = min(n,m) + 1; i < max(n,m) + 2; i++)
        cout << i << endl;
    return 0;
}