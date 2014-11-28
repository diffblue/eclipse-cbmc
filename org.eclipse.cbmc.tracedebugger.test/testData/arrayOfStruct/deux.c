
#include <assert.h>

struct str
{
  int x;
  int y;
  int z;
  struct foo {
	  int a;
  } zoo;
};

int main (void)
{
  struct str arr[10];
  arr[0].x = 0;
  arr[1].y = 1;
  arr[1].y = 2;
  arr[1].zoo.a = 3;

  assert(arr[0].x == arr[1].y);
}

