#include <iostream>
#include <string>
using namespace std;

int main() {
    int n; cin >> n;

    for (int i = 0; i < n; i++) {
        string cc;
        cin >> cc;
        if (cc != "mumble") {
            int x = stoi(cc);
            if (x != (i + 1)) {
                cout << "something is fishy" << endl;
                return 0;
            }
        }
    }
    cout << "makes sense" << endl;

    return 0;
}