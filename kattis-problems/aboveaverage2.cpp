#include <iostream>
using namespace std;

double average(int arr[], int size) {
    int i, sum = 0;
    double avg;

    for (i = 0; i < size; i++) {
        sum += arr[i];
    }
    avg = double(sum) / size;
    return avg;
}

double above(int arr[], int avg, int size) {
    int i, x = 0;
    for(i = 0; i < size; i++) {
        if (arr[i] >= avg) {
            x++;
        }
    }
    return x;
}

int main() {
    int x;
    cin >> x;

    for(int i = 0; i < x; i++) {
        int y;
        cin >> y;
        int arr[y];
        for(int j = 0; j < y; j++) {
            cin >> arr[j];
        }
        double avg = above(arr, average(arr, y), y);
        cout.setf(ios::fixed, ios::floatfield);
        cout.precision(3);
        cout << 100 - ((avg / y) * 100) << "%";
    }
    return 0;
}