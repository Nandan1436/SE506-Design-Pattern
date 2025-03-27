public class OrderFacade implements Facade{
    private String cardInfo;
    private String PIN;
    private String orderType;
    private int balance;

    public OrderFacade(String cardInfo, String PIN, String orderType, int balance) {
        this.cardInfo = cardInfo;
        this.PIN = PIN;
        this.orderType = orderType;
        this.balance = balance;
    }

    public void processOrder(){
        Account account=getAccount();
        SecurityPIN securityPIN=getSecurityPIN();
        BalanceCheck balanceCheck=getBalanceCheck();
        Notification notification=getNotification();

        if(!account.checkCardInfo(cardInfo)){
            notification.sendNotification("Incorrect card Information");
            return;
        }

        if(!securityPIN.checkSecurityPIN(PIN)){
            notification.sendNotification("Incorrect PIN");
            return;
        }

        if(!balanceCheck.checkBalance(balance)){
            notification.sendNotification("Not enough balance");
            return;
        }

        notification.sendNotification("Pizza order processed successfully");

    }


    @Override
    public Account getAccount() {
        return new Account();
    }

    @Override
    public SecurityPIN getSecurityPIN() {
        return new SecurityPIN();
    }

    @Override
    public BalanceCheck getBalanceCheck() {
        return new BalanceCheck();
    }

    @Override
    public Notification getNotification() {
        return new Notification();
    }
}
