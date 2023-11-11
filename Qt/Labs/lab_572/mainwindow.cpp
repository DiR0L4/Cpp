#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    db = QSqlDatabase::addDatabase("QSQLITE"); // Создаём БД используя драйвер QSQLITE
    db.setDatabaseName("./myDb.db");

    if(db.open())              // Уведомляем удалось ли открыть БД
    {
        qDebug("open");
    }
    else
    {
        qDebug("no open");
    }

    query = new QSqlQuery(db); // Инициализируем запрос в БД db
    query->exec("CREATE TABLE STR(Entered TEXT, Edited TEXT);"); // Запрос в БД

    model = new QSqlTableModel(this,db); // Создание таблицы
    model->setTable("STR");
    model->select();

    ui->tableView->setModel(model); // Выводим таблицу
}

MainWindow::~MainWindow()
{
    delete ui;
}



void MainWindow::on_pushButton_clicked() // Добавляем строку при нажатии на кнопку Add
{
    model->insertRow(model->rowCount());
}


void MainWindow::on_pushButton_2_clicked() // Удаляем строку номером row при нажатии на Delete
{
    model->removeRow(row);
}


void MainWindow::on_tableView_clicked(const QModelIndex &index) // При нажатии на ячейку записываем в row номер строки
{
    row = index.row();
}

