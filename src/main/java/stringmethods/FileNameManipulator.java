package stringmethods;

public class FileNameManipulator {



    public char findLastCharacter(String str) {
        return str.charAt(str.length() - 1);
    }

    public boolean compareFilesByName(String searchedFileName,String actualFileName){
        boolean compareFilesByName = actualFileName.contains(searchedFileName);
        return compareFilesByName;
    }


    public String changeExtensionToLowerCase(String fileName){

        if ("".equals(fileName)){
            throw new IllegalArgumentException("szöveg megadása kötelező!");
        }

        return fileName.toLowerCase();
    }


    public String replaseStringPart(String fileName,String present, String target){
        if ("".equals(fileName)){
            throw new IllegalArgumentException("szöveg megadása kötelező!");
        }
            else if (present.equals(target) || "".equals(present)){
                throw new IllegalArgumentException("A megadott és elvárt elem nem egyezhet, és kötelező őket megadni.");
            }
        else if (target.equals(present) || "".equals(target)){
            throw new IllegalArgumentException("A megadott és elvárt elem nem egyezhet, és kötelező őket megadni.");
        }
    return fileName.replace(present, target);
    }


    /*
    public String findFileExtension(String fileName){
     }
     public boolean identifyFilesByExtension(String ext, String fileName){
     }
     */

    public static void main(String[] args) {

        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        System.out.println(fileNameManipulator.findLastCharacter("asfpijgfsroigjniewgB"));

        System.out.println(fileNameManipulator.changeExtensionToLowerCase("NMENFEWIFEUFIE"));

        System.out.println(fileNameManipulator.compareFilesByName("alma", "Az alma leesett a fáról a tél közeledtével."));

        System.out.println(fileNameManipulator.replaseStringPart("alma", "a", "E"));


    }




}
