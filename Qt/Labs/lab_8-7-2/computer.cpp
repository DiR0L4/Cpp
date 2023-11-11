#include "computer.h"

Computer::Computer(QObject *parent)
    : QObject{parent}
{
    this->number = 0;
}

void Computer::check(int nb)
{
    if (nb <= 0) throw "Entered a negative number !!!";
    else this->number = nb;
}

void Computer::slotC(QString str)
{
    try{
        check(str.toInt());
    }
    catch(const char* st)
    {
        emit signalW
    }
}
