public class Main {
    public static void main(String[] args) {
        OrderFacade order = new OrderFacade("abc","1324","idk",1555);
        order.processOrder();
        OrderFacade order2 = new OrderFacade("abc","1345","idk",1555);
        order2.processOrder();
    }
}