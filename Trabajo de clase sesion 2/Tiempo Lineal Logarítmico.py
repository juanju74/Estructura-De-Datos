#Juan David Arboleda Molina.Estructura De Datos.2025.17/02/2025.CAMPUS CALI.UNIVERSIDAD COOPERATIVA DE COLOMBIA

#Tiempo Lineal Logarítmico 

def merge_sort(lista):
    if len(lista) <= 1:
        return lista
    medio = len(lista) // 2
    izquierda = merge_sort(lista[:medio])
    derecha = merge_sort(lista[medio:])
    return fusionar(izquierda, derecha)


def fusionar(izquierda, derecha):
    resultado = []
    while izquierda and derecha:
        if izquierda[0] < derecha[0]:
            resultado.append(izquierda.pop(0))
        else:
            resultado.append(derecha.pop(0))
    return resultado + izquierda + derecha

numeros = [8, 3, 5, 1, 9, 6]
print(merge_sort(numeros))  # Output: [1, 3, 5, 6, 8, 9]
