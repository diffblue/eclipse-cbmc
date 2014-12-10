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
#include <stdio.h>

int foo(int my_param) {
	return my_param++;
}

int main() {
	int a = foo(1);
	int b = 32;
	assert(0);
}
