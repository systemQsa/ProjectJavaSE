package ua.intita.qa.homework12.entiry;

public enum Subject {
    ENGLISH("English"),MATH("Math"),BIO("Bio"),
    PHYSICS("Physics"),CHEMISTRY("Chemistry"),LITERATURE("Literature"),
    HISTORY("History");

    private final  String name;

     Subject(String name){
         this.name = name;
     }

    public String getSubject(){
        return name;
    }
}
