#include <assert.h>

struct sss {
	int i;
	struct ssss {
		int g;
		int innerArray[10];
	} b;
};

int main() {
	int i = 1;
	i++;

	int arri[2];
	arri[0] = 1;
	arri[1] = 2;

	struct sss myStruct;
	myStruct.i = 2;
	myStruct.b.g = 3;
	myStruct.b.innerArray[0]=7;
	myStruct.b.innerArray[1]=7;

	assert(arri[1] == 1);
}
