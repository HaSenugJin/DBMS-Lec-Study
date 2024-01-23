public class BankApp {
    public static void main(String[] args){
        String url = "/deposit";
        Dispatcher dic = new Dispatcher();

        dic.route(url);
    }
}