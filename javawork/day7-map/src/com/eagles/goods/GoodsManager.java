package com.eagles.goods;

import java.text.SimpleDateFormat;
import java.util.*;

public class GoodsManager {

    //创建商品容器对象
    private static List<Goods> goodsList = null;

    private static Scanner scanner = null;

    private static ArrayList<Cate> cateArrayList = null;

    private static HashMap<String,Order> shoppingCartMap = null;

    //创建静态代码块，将商品初始化
    static {

        goodsList = new ArrayList<>();
        shoppingCartMap = new HashMap<>();
        scanner = new Scanner(System.in);

        //创建商品对象
        Goods goods1 = new Goods("小米10", "小米", "001", 500, 3000.0);
        Goods goods2 = new Goods("华为mate40", "华为", "001", 450, 5000.0);
        Goods goods3 = new Goods("安踏运动鞋", "安踏", "002", 1200, 350.0);
        Goods goods4 = new Goods("贵人鸟外套", "贵人鸟", "002", 1340, 1450.0);
        Goods goods5 = new Goods("小米电视", "小米", "003", 1500, 870.0);
        Goods goods6 = new Goods("乔丹篮球", "乔丹", "004", 1200, 200.0);
        Goods goods7 = new Goods("晨光水笔", "晨光", "006", 3660, 10.0);

        //将所有的商品添加到集合中
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsList.add(goods4);
        goodsList.add(goods5);
        goodsList.add(goods6);
        goodsList.add(goods7);

        //创建类别集合
        cateArrayList = new ArrayList<>();

        //创建类别对象
        Cate cate1 = new Cate("001","电子产品");
        Cate cate2 = new Cate("002","服装服饰");
        Cate cate3 = new Cate("003","家用电器");
        Cate cate4 = new Cate("004","运动器材");
        Cate cate5 = new Cate("005","儿童玩具");
        Cate cate6 = new Cate("006","文具用品");

        //将所有的类别对象添加到集合中
        cateArrayList.add(cate1);
        cateArrayList.add(cate2);
        cateArrayList.add(cate3);
        cateArrayList.add(cate4);
        cateArrayList.add(cate5);
        cateArrayList.add(cate6);

        //将对应的cate对象传给goods
        for (Goods goods : goodsList) {
            for (Cate cate : cateArrayList) {
                    if (goods.getCateId().equals(cate.getCateId())){
                        goods.setCate(cate);
                    }
            }}
    }

    public static List<Goods> getGoodsList() {
        return goodsList;
    }

    /**
     * 添加商品的方法
     * @return
     */
    public static void addGoods() {

        System.out.println("---------------------------------添加商品---------------------------------------");

        System.out.println("请输入需要添加的商品：");
        String goodsName = scanner.next();

        System.out.println("请输入商品的品牌：");
        String goodsBrand = scanner.next();

        System.out.println("请输入商品的类别：");
        String cateName = scanner.next();

        System.out.println("请输入商品的库存：");
        int num = scanner.nextInt();

        System.out.println("请输入商品的价格：");
        double price = scanner.nextDouble();

        //创建类别对象
        Cate cate = null;

        for (Cate c : cateArrayList) {
            if (c.getCateName().equals(cateName)){
                    cate = c;
                    break;
            }
        }

        //创建商品对象
        Goods goods = new Goods(goodsName,goodsBrand,cate.getCateId(),num,price,cate);

        //将商品添加到容器中
        getGoodsList().add(goods);

        System.out.println("商品添加成功：");

        for (Goods g : getGoodsList()) {
            System.out.println(g);
        }

    }

    /**
     * 购物车
     * @return
     */
    public static void shoppingGoods(User user) {

        System.out.println("---------------------------------购物---------------------------------------");

        System.out.println("欢迎"+user.getUsername()+"光临英格购物系统~~");

        while (true){

            System.out.println("请输入你需要购买的商品的编号：");
            for (int i = 0 ; i < goodsList.size() ; i++) {
                System.out.println((i + 1)+"、"+goodsList.get(i).getGoodsName()+"           价格："+goodsList.get(i).getPrice());
            }

            int select = scanner.nextInt();
            Goods goods = null;
            for (int i = 0 ; i < goodsList.size() ; i++) {
                if (select == (i + 1)){
                        goods = goodsList.get(i);
                        break;
                }
            }

            //创建订单对象
            Order order = new Order();
            order.setUser(user);
            order.setGoods(goods);
            //生产订单编号
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
            String orderId = simpleDateFormat.format(date);
            order.setOrderId(orderId);

            //将订单数据添加到购物车中
            shoppingCartMap.put(orderId,order);

            System.out.println("------------------------购物车列表---------------------------------------");
            //遍历购物车
            for (Map.Entry<String, Order> entry : shoppingCartMap.entrySet()) {

                System.out.println("订单编号为 ："+entry.getKey()+" 商品信息为 "+entry.getValue());
            }

            //取出账户对象
            Account account = null;
            System.out.println("请选择您付款的账户：");
            for (int i = 0; i < user.getAccountList().size(); i++) {
                System.out.println((i + 1)+"："+user.getAccountList().get(i).getBankName());
            }

            select = scanner.nextInt();

            for (int i = 0; i < user.getAccountList().size(); i++) {
                if (select == (i + 1)){
                    account = user.getAccountList().get(i);
                }
            }

            if (goods.getPrice() > account.getBalance()){
                System.out.println("余额不足");

            }else {
                for (Goods g : goodsList) {
                   if (g.getGoodsName().equals(goods.getGoodsName())){
                       g.setNum(g.getNum() - 1);//库存减一
                       account.setBalance(account.getBalance() - g.getPrice());//价格从余额中扣除
                       System.out.println("购买成功");
                       System.out.println("您当前的账户余额为："+account.getBalance());
                       break;
                   }
                }

                System.out.println("商品列表：");
                for (Goods g : goodsList) {
                    System.out.println(g);
                }

            }
            System.out.println("还需要购买其他商品？");
            System.out.println("yes/no");
            String next = scanner.next();
            if (next.equals("yes")){
              continue;
            }else{
                System.out.println("拜拜，欢迎下次光临~");
                break;
            }
        }
    }

    /**
     * 打印商品价格小于1000的商品信息
     */
    public static void printGoodsByPrice(){

        System.out.println("----------------------------------------打印商品价格小于1000的商品信息-----------------------------");
        for (Goods goods : getGoodsList()) {

            if (goods.getPrice() > 1000){
                System.out.println(goods);
            }
        }

    }

    /**
     * 根据商品名称删除商品
     */
    public static void deleteGoodsByName(){

        System.out.println("----------------------------------------根据商品名称删除商品-----------------------------");

        System.out.println("请输入要删除的商品名称：");
        String name = scanner.next();
        Iterator<Goods> iterator = getGoodsList().iterator();
        while (iterator.hasNext()){
            Goods goods = iterator.next();
            if (goods.getGoodsName().equals(name)){
               iterator.remove();//删除当前遍历的对象
               System.out.println("删除的商品对象为 ："+goods);
           }
        }

        iterator = getGoodsList().iterator();
        System.out.println("删除之后的商品信息：");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    /**
     * 打印类别为服装服饰，价格大于1000的商品信息
     */
    public static void findGoodsByCateAndPrice(){

        System.out.println("----------------------------------------打印类别为服装服饰，价格大于1000的商品信息-----------------------------");
        Iterator<Goods> iterator = getGoodsList().iterator();
        while (iterator.hasNext()){
            Goods goods = iterator.next();
            if (goods.getCate().getCateName().equals("服装服饰") && goods.getPrice() > 1000){
                System.out.println(goods);
            }
        }
    }

    /**
     * 根据用户信息，来查询当前用户购买的所有商品
     */
    public static void findShopGoods(){

        System.out.println("----------------------------------------查询用户购买的所有商品-----------------------------");

        System.out.println("请输入用户姓名：");
        String name = scanner.next();

        for (Map.Entry<String, Order> entry : shoppingCartMap.entrySet()) {

            if (entry.getValue().getUser().getUsername().equals(name)){
                System.out.println(entry.getValue().getGoods());
            }
        }

    }

}
