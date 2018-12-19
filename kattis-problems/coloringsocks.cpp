#include <iostream>
using namespace std;

int main() {
    int h,w,n,m;
    scanf("%d %d %d %d", &h, &w, &n, &m);
    int image[h][w];
    int kernel[n][m];

    for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
            scanf("%d", &image[i][j]);
        }
    }

    for (int i = n; i >= 0; i--) {
        for (int j = m; j >= 0; j--) {
            scanf("%d", &kernel[i][j]);
        }
    }

    for (int i = 0; i + n <= h; i++) {
        for (int j = 0; j + m <= w; j++) {
            int num = 0;
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < m; l++) {
                    num += image[l + i][j] * kernel[k][l];
                    cout << num;
                }
            }
            printf("%d", num);
        }
        printf("\n");
    }

    return 0;
}