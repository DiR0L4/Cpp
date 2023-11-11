#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    form = new Form;
    connect(this, &MainWindow::signal, form, &Form::slot);
}

MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_pushButton_clicked()
{
    auto a = ui->lineEdit->text().toInt();              // Считываем строки с полей и преобразуем их в int
    auto b = ui->lineEdit_2->text().toInt();
    auto c = ui->lineEdit_3->text().toInt();
    auto d = ui->lineEdit_5->text().toInt();
    QString sm = QString::number(a + b + c + d);        // Складывааем полученные значения и преобразуем в QString
    emit signal(sm);                                    // Отправляем сигнал с обьектом типа QString
    form->show();                                       // Открываем виджет
}

