package stringmethods;

public class FileNameManipulator {



    public char findLastCharacter(String str){
        return str.charAt(str.length() - 1);
    }

/*
    public String findFileExtension(String fileName){

    }

    public boolean identifyFilesByExtension(String ext, String fileName){

    }

    public boolean compareFilesByName(String searchedFileName,String actualFileName){

    }
*/
    public String changeExtensionToLowerCase(String fileName){
        return fileName.toLowerCase();
    }

   // public String replaseStringPart(String fileName,String present, String target){
   // return fileName.replace
   // }

    public static void main(String[] args) {

        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        System.out.println(fileNameManipulator.findLastCharacter("asfpijgfsroigjniewgB"));

        System.out.println(fileNameManipulator.changeExtensionToLowerCase("NMENFEWIFEUFIE"));



    }

}
