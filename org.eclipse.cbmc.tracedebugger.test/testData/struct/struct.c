/*******************************************************************************
 * Copyright (c) 2014 Rapicorp, Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rapicorp, Inc - initial API and implementation
 *******************************************************************************/
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
