package factory;

import java.util.LinkedList;


public class House {

    private Integer count1=0;
    private Integer count2=0;

    public Integer getCount1() {
        return count1;
    }

    public void setCount1(Integer count1) {
        this.count1 = count1;
    }

    public Integer getCount2() {
        return count2;
    }

    public void setCount2(Integer count2) {
        this.count2 = count2;
    }

    public House(LinkedList phoneList) {
        this.phoneList = phoneList;
    }
    //泛型
    private LinkedList<Phone> phoneList;

    public synchronized void in(){
        if(this.phoneList.size()<=100) {
            //创建产品对象
            Phone phone = new Phone("华为手机");
            //产品入队
            this.phoneList.offer(phone);
            System.out.println(Thread.currentThread().getName()+"生产了一件产品："+phone.getName() + phone+"编号为："+phone.getId());
        }else{
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public synchronized void out(){
        if(this.phoneList.size()>=5) {
            if(Thread.currentThread().getName().equals("甲销售员")){
                count1++;
            }else {
                count2++;
            }
            //产品出队
            Phone phone= this.phoneList.poll();
            System.out.println(Thread.currentThread().getName()+"消费了一件产品："+phone.getName() + phone+"编号为："+phone.getId());
        }else{
            this.notifyAll();
        }
    }
}
