#include <assert.h>

int bar(int p) {
	return p++;
}

int foo(int p) {
	int v = bar(p);
	v = v + 1;
	return v;
}


int main(void) {
	int fooValue = foo(2);
	fooValue++;
	assert(fooValue == 1);
}

