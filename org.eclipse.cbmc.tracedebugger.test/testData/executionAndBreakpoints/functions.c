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
