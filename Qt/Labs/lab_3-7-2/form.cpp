#include "form.h"
#include "ui_form.h"

Form::Form(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Form)
{
    ui->setupUi(this);
}

Form::~Form()
{
    delete ui;
}

void Form::slot(QString i)
{
    ui->label_2->setText(i);           // Записываем в строку переданный сигналом текст
}
