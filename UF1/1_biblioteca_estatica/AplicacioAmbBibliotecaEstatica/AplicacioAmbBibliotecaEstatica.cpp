#include "stdafx.h"
#include "include/FuncionsCriptografiques.h"
#include "conio.h"
int main()
{
	int h = hash(123);

	printf("Hash:%d", h);
	_getch();
    return 0;
}

