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
