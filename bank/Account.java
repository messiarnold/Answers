package bank;

public class Account {
    private static int num_of_accounts;
    private static double USD_VALUE = 3.7;

    private double money_in_new_ILS;
    private double money_in_DOLLARS;
    private double all_the_money_in_new_ILS;
    private String account_owner;
    private int id;
    private String geographic_area; 


    // to string method
    public String toString() {
        return "Account [money_in_new_ILS=" + money_in_new_ILS + ", money_in_DOLLARS=" + money_in_DOLLARS
                + ", all_the_money_in_new_ILS=" + all_the_money_in_new_ILS + ", account_owner=" + account_owner
                + ", id=" + id + ", geographic_area=" + geographic_area + "]";
    }
    

    // set
    public void setAccount_owner(String account_owner) {
        this.account_owner = account_owner;
    }
    public void setAll_the_money_in_new_ILS(float all_the_money_in_new_ILS) {
        this.all_the_money_in_new_ILS = all_the_money_in_new_ILS;
        
    }
    public void setGeographic_area(String geographic_area) {
        this.geographic_area = geographic_area;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setMoney_in_DOLLARS(double money_in_DOLLARS) {
        this.money_in_DOLLARS = money_in_DOLLARS;
        update_all_money();
    }
    public void setMoney_in_new_ILS(double money_in_new_ILS) {
        this.money_in_new_ILS = money_in_new_ILS;
        update_all_money();
    }

    // get
    public String getAccount_owner() {
        return account_owner;
    }
    public double getAll_the_money_in_new_ILS() {
        return all_the_money_in_new_ILS;
    }
    public String getGeographic_area() {
        return geographic_area;
    }
    public int getId() {
        return id;
    }
    public double getMoney_in_DOLLARS() {
        return money_in_DOLLARS;
    }
    public double getMoney_in_new_ILS() {
        return money_in_new_ILS;
    }
    public static int getNum_of_accounts() {
        return num_of_accounts;
    }

    private void update_all_money(){
        this.all_the_money_in_new_ILS = (USD_VALUE * money_in_DOLLARS) + money_in_new_ILS;
    }


    // פעולות בונות
    public Account(double money_in_new_ILS, double money_in_DOLLARS, double all_the_money_in_new_ILS,String account_owner, int id, String geographic_area) {
        this.money_in_new_ILS = money_in_new_ILS;
        this.money_in_DOLLARS = money_in_DOLLARS;
        this.all_the_money_in_new_ILS = all_the_money_in_new_ILS;
        this.account_owner = account_owner;
        this.id = id;
        this.geographic_area = geographic_area;
        update_all_money();
    }

    public Account(double money_in_new_ILS, double money_in_DOLLARS, double all_the_money_in_new_ILS,
            String account_owner, int id) {
        this.money_in_new_ILS = money_in_new_ILS;
        this.money_in_DOLLARS = money_in_DOLLARS;
        this.all_the_money_in_new_ILS = all_the_money_in_new_ILS;
        this.account_owner = account_owner;
        this.id = id;
        update_all_money();
    }


    public Account() {
    }

    
}
