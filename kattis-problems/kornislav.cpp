#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    vector <int> korn;

    for (int i = 0; i < 4; i++) {
        int n; cin >> n;
        korn.push_back(n);
    }

    sort(korn.begin(), korn.end());
    cout << (korn[0] * korn[2]) << endl;

    return 0;
}