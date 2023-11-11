import numpy as np
import matplotlib.pyplot as plt

x_train = [[1, 1], [2, 4], [4, 6], [5, 2]]
y_train = np.array([-1,-1,1,1])
w = np.array([-4, 1/3, 1])                                 # [-b, -k, 1]
n_train = len(y_train)                                  # размер обучающей выборки

x_train = np.array([x + [1] for x in x_train])

M = [y * np.dot(w, x) for x, y in zip(x_train, y_train)]
print(f"M is {M}")

x_0 = x_train[y_train == 1]                 # формирование точек для 1-го
x_1 = x_train[y_train == -1]                # и 2-го классов

line_x = list(range(0,11))    # формирование графика разделяющей линии
line_y = [-x*w[1]/w[2] - w[0]/w[2] for x in line_x]

plt.scatter(x_0[:, 0], x_0[:, 1], color='red')
plt.scatter(x_1[:, 0], x_1[:, 1], color='blue')
plt.plot(line_x, line_y, color='green')

plt.xlim([0, 10])
plt.ylim([0, 10])
plt.ylabel('x2')
plt.xlabel('x1')
plt.grid(True)
plt.show()
