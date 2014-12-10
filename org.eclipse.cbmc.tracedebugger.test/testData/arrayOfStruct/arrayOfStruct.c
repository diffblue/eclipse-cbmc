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

