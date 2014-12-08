#include <assert.h>

void my_function(int my_param) {
	my_param = 2;
}

int main(int argc, char** argv) {
	int i = 0;
	my_function(1);
	assert(0);
}
