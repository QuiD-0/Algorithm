#include<stdio.h>
#include<string.h>

int main() {
	char array[80];
	int i, count = 0, index = 1, num, j;
	scanf("%d", &num);

	for (j = 0; j < num; j++) {
		scanf("%s", &array);
		count = 0;
		index = 1;
		for (i = 0;array[i]!='\0'; i++) {
			if (array[i] == 'O') {
				count += index;
				index++;
			}
			else {
				index = 1;
			}
		}
		printf("%d\n", count);
	}
	
	return(0);
}
