#include <iostream>
#include <vector>
using namespace std;

int miss(vector<int> v) {
    int n1 = v.back(); v.pop_back();
    int n2 = v.back(); v.pop_back();
    int n3 = v.back(); v.pop_back();

    if (n1 == n2) return n3;
    if (n2 == n3) return n1;
    return n2;
}

int main() {
    vector<int> x;
    vector<int> y;
    for (int i = 0; i < 3; i++) {
        int a, b; cin >> a >> b;
        x.push_back(a);
        y.push_back(b);
    }

    cout << miss(x) << " " << miss(y) << endl;
}