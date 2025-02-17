# Juan David Arboleda Molina.Estructura De Datos.2025

#Tiempo Cuadratico

def ordenar_burbuja(lista):
    n = len(lista)
    for i in range(n):
        for j in range(n - i - 1):
            if lista[j] > lista[j + 1]:
                lista[j], lista[j + 1] = lista[j + 1], lista[j]  # Intercambiar
    return lista

numeros = [5, 2, 9, 1, 7]
print(ordenar_burbuja(numeros))  # Output: [1, 2, 5, 7, 9]
