#include <iostream>
using namespace std;

int main() {
    int t; cin >> t;

    for (int i = 0; i < t; i++) {
        int god = 0, mech = 0, temp;

        int ng; cin >> ng;
        int nm; cin >> nm;

        for (int j = 0; j < ng; j++) {
            cin >> temp;
            if (temp > god) god = temp;
        }

        for (int j = 0; j < nm; j++) {
            cin >> temp;
            if (temp > mech) mech = temp;
        }

        cout << (mech > god ? "MechaGodzilla" : "Godzilla") << endl;
    }
    return 0;
}