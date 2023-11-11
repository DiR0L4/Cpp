#include "computer.h"

Computer::Computer(QObject *parent)
    : QObject{parent}
{
    this->number = 0;
    form = new Form;
    connect(this, &Computer::signalW, form, &Form::slotF);
}

void Computer::check(int nb)
{
    if (nb <= 0) throw -1;
    else
    {
        this->number = nb;
        emit signalW("Entered " + QString::number(nb));
        form->show();
    }
}

void Computer::slotC(QString str)
{
    try{
        check(str.toInt());
    }
    catch(int)
    {
        emit signalW("Entered a negative number !!!");
        form->show();
    }
}
