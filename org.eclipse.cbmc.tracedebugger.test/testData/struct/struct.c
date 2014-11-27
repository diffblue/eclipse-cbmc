#include <assert.h>

struct str
{
  int x;
  int y;
  int z;
};

int main (void)
{
  int q;
  struct str s;

  s.x = q;
  s.y = s.x+1;
  s.z = s.y + s.x;

  assert(q == s.z);

  return 1;
}
