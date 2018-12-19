#include <iostream>
#include <string>
using namespace std;

int main() {
    string secret;
    getline(cin, secret);

    int count = 0;

    for (int i = 1; i < secret.length() - 1; i += 3) {
        if (secret[i-1] != 'P') count++;
        if (secret[i] != 'E') count++;
        if (secret[i+1] != 'R') count++;
    }
    cout << count << endl;
    return 0;
}