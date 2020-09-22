#include <stdio.h>


int main() {
	int a, sum = 0, i;
	scanf("%d", &a);getchar();
	for (i = 0; i < a; i++)
		sum+=getchar()-'0';
	printf("%d\n", sum);
}
