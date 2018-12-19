#include <iostream>
using namespace std;

int sum(int i) {
    int j = 0;
    while (i > 0) {
        j += i % 10;
        i /= 10;
    }
    return j;
}

int main() {
    int l, d, x;
    cin >> l >> d >> x;

    for (int i = l; i <= d; i++) {
        int n = sum(i);
        if (n == x) { cout << i << endl; break; }
    }

    for (int i = d; i >= 1; i--) {
        int m = sum(i);
        if (m == x) { cout << i << endl; break; }
    }

    return 0;
}