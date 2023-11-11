#ifndef FORM_H
#define FORM_H

#include <QWidget>

namespace Ui {
class Form;                        // Объяввление класса виджета
}

class Form : public QWidget
{
    Q_OBJECT

public:
    explicit Form(QWidget *parent = nullptr);
    ~Form();

private:
    Ui::Form *ui;
public slots:
    void slot(QString i);           // Объявление слота с параметром типа QString
};

#endif // FORM_H
