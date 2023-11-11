#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)    // Конструктор
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    ui->label->setVisible(false);          // Скрываем картинки и количество
    ui->label_2->setVisible(false);
    ui->label_3->setVisible(false);
    ui->label_4->setVisible(false);
    ui->label_5->setVisible(false);
    ui->label_6->setVisible(false);
    int a = rand() % 10;
    ui->label_2->setText(QString::number(a));
    a = rand() % 10;
    ui->label_4->setText(QString::number(a));
    a = rand() % 10;
    ui->label_6->setText(QString::number(a));
}
MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_checkBox_stateChanged(int arg1)
{
    if(arg1 == Qt::Checked)                // Если стоит флаг
    {
        ui->label->setVisible(true);       // Показываем картинки и количество
        //int a = rand() % 10;
        //ui->label_2->setText(QString::number(a));
        ui->label_2->setVisible(true);
    }
    else                                   // Любой другой случай(нет флага)
    {
        ui->label->setVisible(false);      // Скрываем
        ui->label_2->setVisible(false);
    }
}


void MainWindow::on_checkBox_2_stateChanged(int arg1)
{
    if(arg1 == Qt::Checked)               // Если стоит флаг
    {
        ui->label_3->setVisible(true);    // Показываем картинки и количество
        //int a = rand() % 10;
        //ui->label_4->setText(QString::number(a));
        ui->label_4->setVisible(true);
    }
    else                                  // Любой другой случай(нет флага)
    {
        ui->label_3->setVisible(false);   // Скрываем
        ui->label_4->setVisible(false);
    }
}


void MainWindow::on_checkBox_3_stateChanged(int arg1)
{
    if(arg1 == Qt::Checked)               // Если стоит флаг
    {
        ui->label_5->setVisible(true);    // Показываем картинки и количество
        //int a = rand() % 10;
        //ui->label_6->setText(QString::number(a));
        ui->label_6->setVisible(true);
    }
    else                                  // Любой другой случай(нет флага)
    {
        ui->label_5->setVisible(false);   // Скрываем
        ui->label_6->setVisible(false);
    }
}

