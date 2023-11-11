#Используем библиотеки `numpy` и `matplotlib.pyplot` и `sklearn.model_selection`
from math import *
import numpy as np
import matplotlib.pyplot as plt

#Задаем функцию модели, функцию потерь для модели и производную функции потерь по весам
def func(x):
 return x ** 4 - 10 * x ** 3 + 20 * x * x - 100 * x

#Задаем выборку
data_x = np.arange(0, 10, 0.1)
data_y = [func(x) for x in data_x]

#Делим выборку на тестовую и обучающую и находим веса по методу наименьших квадратов
x_train, y_train = data_x[::2], data_y[::2]
poly_n = 13
w = np.polyfit(x_train, y_train, poly_n)
print(f"weights1 is {w}")

#Вычисление значения коэффициентов вектора w для квадратической функции потерь
X_train = np.array([[a ** n for n in range(poly_n + 1)] for a in x_train]) # матрица входных векторов
w2 = y_train @ X_train @ np.linalg.inv(X_train.T @ X_train)
print(f"weights2 is {w2}")

#L2 регуляризатор
L = 20 # при увеличении N увеличивается L (кратно): 12; 0.2 13; 20 15; 5000
IL = np.array([[L if i == j else 0 for j in range(poly_n + 1)] for i in range(poly_n + 1)]) # матрица lambda*I
X_train = np.array([[a ** n for n in range(poly_n + 1)] for a in x_train]) # матрица входных векторов
w3 = y_train @ X_train @ np.linalg.inv(X_train.T @ X_train + IL)
print(f"weights3 is {w3}")

#Рисуем график с точками и разделяющей линией
x_max = max(data_x) + 0.25
x_min = min(data_x) - 0.25

y_max = max(data_y) + 0.25
y_min = min(data_y) - 0.25

line_x = list(range(floor(x_min),ceil(x_max))) # формирование графика разделяющей линии

line_x = x_train
line_y = [np.dot(w,[x**(poly_n - i) for i in range(poly_n + 1)]) for x in x_train]
line_y2 = [np.dot(w2,[x**(i) for i in range(poly_n + 1)]) for x in x_train]
line_y3 = [np.dot(w3,[x**(i) for i in range(poly_n + 1)]) for x in x_train]

plt.scatter(line_x, y_train, color='blue')
plt.plot(line_x, line_y, color='green')
plt.plot(line_x, line_y2, color='red')
plt.plot(line_x, line_y3, color='magenta')

plt.xlim([x_min, x_max])
plt.ylim([y_min, y_max])
plt.ylabel('y')
plt.xlabel('x')
plt.grid(True)
plt.show()