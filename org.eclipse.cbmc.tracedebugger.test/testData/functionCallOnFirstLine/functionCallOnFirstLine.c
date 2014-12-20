#include <assert.h>
#include <stdio.h>

int foo(int my_param) {
	return my_param++;
}

int main() {
	int a = foo(1);
	int b = 32;
	assert(0);
}
