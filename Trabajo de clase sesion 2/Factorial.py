# Juan David Arboleda Molina.Estructura De Datos.2025

#Factorial

from itertools import permutations

def generar_permutaciones(lista):
    return list(permutations(lista))

numeros = [1, 2, 3]
print(generar_permutaciones(numeros))
