class MathProblemTraine:
    def __init__(self, task, result):
        self.task = task
        self.result = result
        self.solved = False

    def check(self):
        print(f"{self.task} = ?")
        a = int(input())
        if self.result == a:
            self.solved = True

    def status(self):
        print(f"Task solved correctly - {self.solved}")

class AdditionTrainer(MathProblemTraine):
    def __init__(self, a, b):
        super().__init__(f"{a}+{b}", a + b)
        self.a = a
        self.b = b
    
    def get_task(self):
        print(self.task)

class MultiplicationTrainer(MathProblemTraine):
    def __init__(self, a, b):
        super().__init__(f"{a}*{b}", a * b)
        self.a = a
        self.b = b
    
    def get_task(self):
        print(self.task)


task1 = AdditionTrainer(3, 5)
task2 = MultiplicationTrainer(4, 2)

task1.status()
task2.status()

task1.check()
task2.check()

task1.status()
task2.status()