package ProduceConsume;

import java.util.List;

public class Factory {
    //构造方法
    public Factory(List list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    //存放产品的实例
    private List list;

    public void in() {
        synchronized (this) {
            if (this.getList().size() == 0) {
                //创建产品实例
                Object object=new Object();
                this.getList().add(object);
                System.out.println(Thread.currentThread().getName()+"生产了一件产品,实例为："+object);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                this.notifyAll();

            }else {
                try {
                    //不能写this.list.wait，因为这里的共享对象是this
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
    public void out(){
        synchronized (this) {
            if (this.getList().size() > 0) {
                Object object=this.getList().get(0);
                this.getList().remove(object);
                System.out.println(Thread.currentThread().getName()+"消费了一件产品,实例为："+object);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                this.notify();

            }else {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

