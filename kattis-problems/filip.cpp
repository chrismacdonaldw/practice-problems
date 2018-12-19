#include <iostream>
using namespace std;

int flip(int n) {
    int r = 0;
    while (n != 0) {
        r = r * 10 + n % 10;
        n /= 10;
    }
    return r;
}

int main() {
    int a, b;
    cin >> a >> b;

    a = flip(a);
    b = flip(b);

    cout << (a > b ? a : b) << endl;

    return 0;
}