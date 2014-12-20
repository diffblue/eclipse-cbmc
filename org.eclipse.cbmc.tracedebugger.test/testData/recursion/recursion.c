#include <assert.h>
#include <stdio.h>

int my_function(int my_param) {
	my_param++;
	if (my_param != 3)
		my_function(my_param);
	return 45;
}

int main() {
	int a = my_function(1);
	printf("hi %d", a++);
	assert(0);
}
