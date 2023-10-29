package FactoryMethod;

public class Program {
    public static void main(String[] args) {
//        DeveloperFactory developerFactory = new CppDeveloperFactory();
//        Developer developer =developerFactory.createDeveloper();
//        developer.writeCode();
        DeveloperFactory developerFactory = createteDevBySpecial("cpp");
        Developer developer =developerFactory.createDeveloper();
        developer.writeCode();
    }

   static DeveloperFactory createteDevBySpecial(String special) {
        if (special.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }
       if (special.equalsIgnoreCase("cpp")){
           return new CppDeveloperFactory();
       } else {
           throw new RuntimeException(special + " is unknown cpeciality ");
       }



}}
