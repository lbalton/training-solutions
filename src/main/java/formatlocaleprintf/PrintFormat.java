package formatlocaleprintf;

public class PrintFormat {

    public String printFormattedText(Double dnumber){
        String formatedText = String.format("The value is %2.1f",dnumber);
        return formatedText;
    }

    public String printFormattedText(int count, String fruit){
        String formatedText = String.format("There is %d piece of %s",count,fruit);
        return formatedText;
    }

    public String printFormattedText(int number){
        String formatedText = String.format("Your fav. num. is. %d", number);
        return formatedText;
    }




        public static void main(String[] args) {
        PrintFormat printFormat = new PrintFormat();
            System.out.println(printFormat.printFormattedText(2, "Apple"));
            System.out.println(printFormat.printFormattedText(2.2));
            System.out.println(printFormat.printFormattedText(23));
    }

}
