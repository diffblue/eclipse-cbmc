#include <assert.h>

int global;
void some_func(int arg) {
	arg++;
}

int main(void) {
	assert(global == 0);
	global++;
	some_func(global);
	assert(global == 2);
	return 0;
}
