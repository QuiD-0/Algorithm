#include<stdio.h>

int main() {
	int num, i, j, func, ak, minus, func2, minus2;

	scanf("%d", &num);
	for (i = 1;; i++) {
		func = 2 * i*i - 3*i + 2;
		if (func > num) {
			ak = i - 1;
			j = 2 * ak - 1;
			break;
		}
	}
	func2 = 2 * i*i - 3 * i + 2;
	func = 2 * ak*ak - 3 * ak + 2;
	minus = num - func;
	minus2 = func2 - num;
	if (num - func < j) {
		i = j;
		printf("%d/%d", j - minus, 1+ minus);
	}
	else {
		i = j;
		printf("%d/%d", j+2 - minus2, minus2);
	}
}
