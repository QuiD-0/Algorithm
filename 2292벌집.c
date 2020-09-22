#include<stdio.h>

int main()
{
	int num, i, sum;
	scanf("%d", &num);
	for (i = 1; i <1000000000; i++) {
		sum = 3 * i*i - (3 * i) + 1;
		if (num <= sum) {
			printf("%d", i);
			break;
		}
	}
	return 0;
}
