#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
}

MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_pushButton_clicked()      // При нажатии на кнопку Exit
{
    QMainWindow::close();                     // Закрываем главное окно
    form.close();                             // Закрываем виджет
}


void MainWindow::on_pushButton_2_clicked()    // При нажатии кнопки View more...
{
    form.show();                              // Появляется виджет
}

