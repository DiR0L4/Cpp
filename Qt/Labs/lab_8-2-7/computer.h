#ifndef COMPUTER_H
#define COMPUTER_H

#include <QObject>
#include <form.h>

class Computer : public QObject
{
    Q_OBJECT
public:
    explicit Computer(QObject *parent = nullptr);
    void check(int nb);

private:
    int number;
    Form* form;

signals:
    void signalW(QString str);

public slots:
    void slotC(QString str);
};

#endif // COMPUTER_H
