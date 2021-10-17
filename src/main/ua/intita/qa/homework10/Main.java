package ua.intita.qa.homework10;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile("src/main/resources/text.txt");
        String text = readFile.fileReader();
        System.out.println("PART1~~~~~~~~~~~~~~~~~~~~~~~~");
        String[] array = readFile.orderWords(text);
        for (String word : array) {
            System.out.println(word);
        }
        System.out.println("PART2~~~~~~~~~~~~~~~~~~~~~~~~");
         String res = readFile.deleteWords(text,4);
        System.out.println(res);
    }
}
