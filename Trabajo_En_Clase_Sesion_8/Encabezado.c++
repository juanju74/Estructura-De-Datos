#include <iostream>
#include <string>
#include <chrono>
#include <iomanip>

using namespace std;

void imprimirencabezado()
{
    // datos del encabezado
    string nombre = "Juan David Arboleda Molina";
    string campus = "Campus Cali";
    string repositoriogit = "https://github.com/juanju74/Estructura-De-Datos";

    // fecha y hora
    auto ahora = chrono::system_clock::now();
    time_t fecha = chrono::system_clock::to_time_t(ahora);
    tm *ltm = localtime(&fecha);
    char buffer[80];
    strftime(buffer, 80, "%d/%m/%Y %H:%M:%S", ltm);
    string fecha_hora = buffer;

    // impresion del encabezado
    cout << "👤Nombre: " << nombre << endl;
    cout << "🎓Campus: " << campus << endl;
    cout << "📂Repositorio: " << repositoriogit << endl;
    cout << "📅Fecha y hora: " << fecha_hora << endl;
    cout << "----------------------------------------" << endl;
    cout << endl;

}