#include <assert.h>

struct sss {
	int i;
	struct ssss {
		int g;
		int innerArray[2];
	} b;
};

int main() {
	int i = 1;
	i++;

	struct sss myStruct;
	myStruct.i = 2;
	myStruct.b.g = 3;
	myStruct.b.innerArray[0]=7;
	myStruct.b.innerArray[1]=7;

	assert(0);
}
