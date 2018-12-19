#include <iostream>
#include <iomanip>
using namespace std;

double average(int arr[], int size) {
    double num = 0;
    for (int i = 0; i < size; i++)
        num += arr[i];
    return num / size;
}

int main() {
    int n; cin >> n;

    for (int i = 0; i < n; i++) {
        int m; cin >> m;
        int arr[m]; int c = 0;
        for (int j = 0; j < m; j++) cin >> arr[j];
        double avg = average(arr, m);
        for (int j = 0; j < m; j++) {
            if (arr[j] > avg) c++;
        }
        double p = ((double)c / m) * 100;
        cout << fixed;
        cout << setprecision(3) << p << "%" << endl;
    }
    return 0;
}