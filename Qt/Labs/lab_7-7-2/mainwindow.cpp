#include "mainwindow.h"
#include "qevent.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    arr = new Arr;

    connect(this, &MainWindow::inSig, arr, &Arr::inSlot);
}

MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_pushButton_clicked()
{
    QString st = ui->lineEdit->text();
    emit inSig(st);
    arr->intTask();
}


void MainWindow::on_pushButton_2_clicked()
{
    QString st = ui->lineEdit->text();
    emit inSig(st);
    arr->dbTask();
}


void MainWindow::on_pushButton_3_clicked()
{
    QString st = ui->lineEdit->text();
    emit inSig(st);
    arr->charTask();
}

void MainWindow::keyPressEvent(QKeyEvent *e)
{
    if(e->key() == Qt::Key_Escape)
    {
        this->close();
    }
}

