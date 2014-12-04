#include <assert.h>

int bar() {
	return 3;
}
void foo() {
	int a;
	bar();
	a++;
}


int main() {
	int a = 3;
	foo();
	int b = 2;
	assert(b == 1);
}
