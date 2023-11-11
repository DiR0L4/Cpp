import tkinter as tk
from tkinter.ttk import Frame
from tkinter import messagebox


def mergeSort(chars):
    if len(chars) == 1:
        return chars
    mid = (len(chars)-1) // 2
    lst1 = mergeSort(chars[:mid+1])
    lst2 = mergeSort(chars[mid+1:])
    result = merge(lst1, lst2)
    return result

def merge(lst1, lst2):
    lst = []
    i = 0
    j = 0
    while (i <= len(lst1) - 1 and j <= len(lst2) - 1):
        if lst1[i] < lst2[j]:
            lst.append(lst1[i])
            i += 1
        else:
            lst.append(lst2[j])
            j += 1
    if i  > len(lst1) - 1:
        while(j <= len(lst2) - 1):
            lst.append(lst2[j])
            j += 1
    else:
        while(i <= len(lst1) - 1):
            lst.append(lst1[i])
            i += 1
    return lst

def clickedSort():
    chars = entry_num1.get()
    if len(chars) == 0:
        label_m2.config(text = 'нет входных данных')
    else:
        chars = chars.replace(' ', '')
        chars = mergeSort(chars)
        label_m2.config(text = chars)

def binarySearch(chars, val):
    fst = 0
    lst = len(chars) - 1
    while(fst <= lst):
        mid = (fst + lst) // 2
        if chars[mid] == val:
            return True
        else:
            if val < chars[mid]:
                lst = mid - 1
            else:
                fst = mid + 1
    return False

def clickedSearch():
    chars = label_m2.cget("text")
    if chars != 'нет входных данных':
        chars = chars.replace(' ', '')
        if  binarySearch(chars, entry_num2.get()):
            messagebox.showinfo('Результат поиска', f'Буква {entry_num2.get()} найдена в строке')
        else:
            messagebox.showinfo('Результат поиска', f'Буква {entry_num2.get()} не найдена в строке')
        
    
app = tk.Tk()
app.title("Сортировка и поиcк букв")
app.geometry('350x150')
app.resizable(False,False)


f_top = Frame(app)
f_top.pack(side = 'top')
entry_num1 = tk.Entry(f_top, width=30)
entry_num1.pack(side = 'left', padx = 5, pady = 15)
button1 = tk.Button(f_top, text="Сортировать", command=clickedSort)
button1.pack(side = 'right', pady = 15)

f_middle = Frame(app)
f_middle.pack(pady = 10)
label_m1 = tk.Label(f_middle, text="Отсортированный список: ")
label_m1.pack(side = 'left')
label_m2 = tk.Label(f_middle)
label_m2.pack(side = 'right')

f_bot = Frame(app)
f_bot.pack(side = 'bottom')
entry_num2 = tk.Entry(f_bot, width=30)
entry_num2.pack(side = 'left', pady = 15)
button2 = tk.Button(f_bot, text="Поиск", command=clickedSearch)
button2.pack(side = 'right', padx = 17, pady = 15)


app.mainloop()