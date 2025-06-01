class Human(object):
    def work(self):
        return "咖啡开工"
class ps_job(Human):
    def work(self):
        return "美工"
class IT_job(Human):
    def work(self):
        return "敲代码"
def job(obj):
    print(obj.work())

ps=ps_job()
it=IT_job()
job(ps)