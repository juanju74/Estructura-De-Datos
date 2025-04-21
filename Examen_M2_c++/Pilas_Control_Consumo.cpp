#include <iostream>
#include <fstream>
#include <stack>
#include <string>
#include <sstream>
#include "Encabezado.c++"

using namespace std;

struct Consumo {
    string hora;
    int kilovatios;
};

int main() {
    imprimirencabezado();
    stack<Consumo> consumos;
    ifstream entrada("consumo.txt");
    string linea;

    if (!entrada) {
        cerr << "No se pudo acceder al archivo de consumo." << endl;
        return -1;
    }

    // Procesar cada línea del archivo
    while (getline(entrada, linea)) {
        stringstream parser(linea);
        Consumo dato;
        parser >> dato.hora >> dato.kilovatios;
        consumos.push(dato);
    }

    entrada.close();

    cout << "\n🔄 Histórico de consumo en orden inverso:\n" << endl;

    int alertas = 0;
    while (!consumos.empty()) {
        Consumo item = consumos.top();
        consumos.pop();

        cout << "Hora: " << item.hora << " Consumo: " << item.kilovatios << "kW";

        if (item.kilovatios > 550) {
            cout << " Pico de consumo ha sido detectado";
            alertas++;
        }

        cout << endl;
    }

    cout << "\nTotal de alertas generadas: " << alertas << endl;

    return 0;
}
