#include "arr.h"

Arr::Arr(QObject *parent)
    : QObject{parent}
{

    form = new Form;
    connect(this, &Arr::rez, form, &Form::rez);

}

void Arr::inSlot(QString str)
{
    this->str = str;
}

void Arr::intTask()
{
    int k = str.length();
    int count = 0;
    int buff = 0;
    QString buff2;
    for(int i = 0; i < k; i++)
    {
        if(str[i] == '-') count++;
    }
    int* arr = new int[count];
    for(int i = 0; i < k; i++)
    {
        if(str[i] == '-')
        {
            arr[buff] = buff2.toInt();
            buff2 = NULL;
            buff++;
            continue;
        }
        buff2 += str[i];
    }
    int max_I = 0;  
    for (int i = 0; i < count; i++)
    {
        if (arr[i] > arr[max_I]) max_I = i;
    }

    QString st;
    for (int i = 0; i < max_I; i++)
    {
        st += ' ';
        st += QString::number(arr[i]);
    }
    QMessageBox msgBox;
    msgBox.setText(st);
    msgBox.exec();
}

void Arr::dbTask()
{
    int k = str.length();
    int count = 0;
    int buff = 0;
    QString buff2;
    for(int i = 0; i < k; i++)
    {
        if(str[i] == '-') count++;
    }
    double* arr = new double[count];
    for(int i = 0; i < k; i++)
    {
        if(str[i] == '-')
        {
            arr[buff] = buff2.toDouble();
            buff2 = NULL;
            buff++;
            continue;
        }
        buff2 += str[i];
    }
    int max_I = 0;
    int min_I = 0;
    for (int i = 0; i < count; i++)
    {
        if (arr[i] > arr[max_I]) max_I = i;
        if (arr[i] < arr[min_I]) min_I = i;
    }

    if(min_I > max_I)
    {
        min_I *= max_I;
        max_I = min_I / max_I;
        min_I /= max_I;
    }
    double sum = 0;
    for (int i = min_I + 1; i < max_I; i++)
    {
        sum += arr[i];
    }

    QMessageBox msgBox;
    msgBox.setText(QString::number(sum));
    msgBox.exec();
}

void Arr::charTask()
{
    int k = str.length();
    int max_I = 0;
    int min_I = 0;
    for (int i = 0; i < k; i++)
    {
        if (str[i] > str[max_I]) max_I = i;
        if (str[i] < str[min_I]) min_I = i;
    }

    QString buff;
    buff += str[max_I];
    str[max_I] = str[min_I];
    str[min_I] = buff[0];

    QString st = str;
    QMessageBox msgBox;
    msgBox.setText(st);
    msgBox.exec();
}
