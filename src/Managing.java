public class Managing {
    double money;
    public void makeMoney(double made_money) {
        money += made_money;
    }
    public void spendMoney(double spend_money) {
        money -= spend_money;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
}
