// $nombredeproyecto$.cpp: define las funciones exportadas de la aplicación DLL.
//

#include "stdafx.h"
#define DLL_EXPORT
#include "BibliotecaCriptograficaDinamica.h"

DECLDIR int suma(int a, int b) {
	return a + b;
}

