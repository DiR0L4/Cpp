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

task1 = MathProblemTraine("5 * 7", 35)
task2 = MathProblemTraine("12 + 8", 20)

task1.check()
task1.status()

task2.check()
task2.status()
