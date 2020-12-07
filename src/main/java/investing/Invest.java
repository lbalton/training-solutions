package investing;

public class Invest {

    private String stockName;
    private double buyPrice;
    private double currentlyPrice;


    public Invest(String stockName,double buyPrice, double currentlyPrice) {
        this.stockName = stockName;
        this.buyPrice = buyPrice;
        this.currentlyPrice = currentlyPrice;
    }


    public String getStockName() {
        return stockName;
    }

    public double getPrice() {
        return currentlyPrice;
    }


    public String changeStockPrice(){

        String signPlus = "+";
        String signMinus = "-";

        if(buyPrice > currentlyPrice)
            System.out.println("Csökkent : " + signMinus + (buyPrice - currentlyPrice) + "$");

        else System.out.println("Nőtt : " + signPlus + ( currentlyPrice - buyPrice)+ "$" );

        return "";
    }


    public String changeInPercent(){

        if (buyPrice > currentlyPrice){
            System.out.println("Csökkent:  -" + (100 - (currentlyPrice / buyPrice) * 100) + "%");
        }
        else if (buyPrice == currentlyPrice){
            System.out.println("Nem történt változás.");
        }
        else{
            System.out.println("Nőtt:  +" + (100 - (buyPrice / currentlyPrice) * 100) + "%");
        }
        return " " ;
    }





    public static void main(String[] args) {


        Invest pltr = new Invest("PLTR",30,10);

        System.out.println(pltr.changeStockPrice());

        System.out.println(pltr.changeInPercent());


    }

}

