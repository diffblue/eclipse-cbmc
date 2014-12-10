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

int my_function(int my_param) {
	my_param++;
	if (my_param != 3)
		my_function(my_param);
	return 45;
}

int main() {
	int a = my_function(1);
	printf("hi %d", a++);
	assert(0);
}
