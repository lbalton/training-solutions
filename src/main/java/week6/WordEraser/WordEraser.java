package week6.WordEraser;

public class WordEraser {



    private String[] arrWords;
    public String eraseWord(String words, String word){
        StringBuilder builder = new StringBuilder();
        String[] arrWords = words.split(" ");
        for (int i = 0;i < arrWords.length ;i++){
            if ((!arrWords[i].equals(word))){
                builder.append(arrWords[i]+ " ");
            }
        }
        return builder.toString().trim();
    }

}
