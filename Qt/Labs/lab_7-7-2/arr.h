#ifndef ARR_H
#define ARR_H

#include <QObject>
#include "form.h"
#include <QMessageBox>

class Arr : public QObject
{
    Q_OBJECT
private:
    QString str;
    Form* form;
public:
    explicit Arr(QObject *parent = nullptr);
    void intTask();
    void dbTask();
    void charTask();
signals:
    void rez(QString str);
public slots:
    void inSlot(QString str);

};

#endif // ARR_H
