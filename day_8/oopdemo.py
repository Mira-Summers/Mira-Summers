from abc import ABCMeta,abstractmethod
class Payment(metaclass=ABCMeta):
    @abstractmethod
    def pay(self):
        pass
class Alipay(Payment):
    def pay(self,money):
        print(f"使用支付宝支付{money}")
class WeChatpay(Payment):
    def recharge(self,money):
        print(f"使用微信支付{money}")

a=Alipay()
a.pay(100)

c=WeChatpay()
c.recharge(100)