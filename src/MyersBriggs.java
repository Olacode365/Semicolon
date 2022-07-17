import java.util.Scanner;
public class MyersBriggs {

    public static void main(String[] args) {
        question();
        display();
    }


    private static int totalNumberOfAForEI = 0;
    private static int totalNumberOfBForEI = 0;
    private static int totalNumberOfAForSN = 0;
    private static int totalNumberOfBForSN = 0;
    private static int totalNumberOfAForTF = 0;
    private static int totalNumberOfBForTF = 0;
    private static int totalNumberOfAForJP = 0;
    private static int totalNumberOfBForJP = 0;

    static void question(){

        Scanner scanner = new Scanner(System.in);
        String userResponse;

        for(int i=1; i<=20; i++){
            System.out.println("select an option");
            switch (i){
                case 1:
                    System.out.println("""
                            1.
                            A expend energy, enjoy groups
                            B conserve energy, enjoy one on one
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForEI++;
                    }else totalNumberOfBForEI++;
                    break;
                case 2:
                    System.out.println("""
                            2.
                            A interpret literally
                            B look for meaning and possibilities
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForSN++;
                    }else totalNumberOfBForSN++;
                    break;
                case 3:
                    System.out.println("""
                            3.
                            A logical,thinking,questioning
                            B empathetic,feeling,accommodating 
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForTF++;
                    }else totalNumberOfBForTF++;
                    break;
                case 4:
                    System.out.println("""
                            4.
                            A organized, orderly
                            B flexible, adaptable                            
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForJP++;
                    }else totalNumberOfBForJP++;
                    break;
                case 5:
                    System.out.println("""
                            5.
                            A more outgoing, think out loud
                            B more reserve, think to yourself
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForEI++;
                    }else totalNumberOfBForEI++;
                    break;
                case 6:
                    System.out.println("""
                            6.
                            A practical, realistic, experiential
                            B imaginative, innovative, theoretical
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForSN++;
                    }else totalNumberOfBForSN++;
                    break;
                case 7:
                    System.out.println("""
                            7.
                            A candid, straight forward, frank
                            B tactful, kind, encouraging
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForTF++;
                    }else totalNumberOfBForTF++;
                    break;
                case 8:
                    System.out.println("""
                            8.
                            A plan, schedule
                            B unplanned, spontaneous                    
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForJP++;
                    }else totalNumberOfBForJP++;
                    break;
                case 9:
                    System.out.println("""
                            9.
                            A seek many tasks, public activities, interaction with others
                            B seek private, solitary activities with quiet to concentrate
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForEI++;
                    }else totalNumberOfBForEI++;
                    break;
                case 10:
                    System.out.println("""
                            10.
                            A standard, usual, conventional
                            B different, novel, unique
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForSN++;
                    }else totalNumberOfBForSN++;
                    break;
                case 11:
                    System.out.println("""
                            11.
                            A firm, tend to criticize, hold line
                            B gentle, tend to appreciate, conciliate
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForTF++;
                    }else totalNumberOfBForTF++;
                    break;
                case 12:
                    System.out.println("""
                            12.
                            A regulated, structured
                            B easygoing, "/live/" and "/let live/"                 
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForJP++;
                    }else totalNumberOfBForJP++;
                    break;
                case 13:
                    System.out.println("""
                            13.
                            A external, communicative, express yourself
                             B internal, reticent, keep to yourself
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForEI++;
                    }else totalNumberOfBForEI++;
                    break;
                case 14:
                    System.out.println("""
                            14.
                            A focus on here and now
                            B look to the future, global perspective, "/big picture/"
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForSN++;
                    }else totalNumberOfBForSN++;
                    break;
                case 15:
                    System.out.println("""
                            15.
                            A tough-minded, just
                            B tender-hearted, merciful
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForTF++;
                    }else totalNumberOfBForTF++;
                    break;
                case 16:
                    System.out.println("""
                            16.
                            A preparation, plan ahead
                            B go with the flow, adapt as you go
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForJP++;
                    }else totalNumberOfBForJP++;
                    break;
                case 17:
                    System.out.println("""
                            17.
                            A active, initiate
                            B reflective, deliberate
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForEI++;
                    }else totalNumberOfBForEI++;
                    break;
                case 18:
                    System.out.println("""
                            18.
                            A facts, things, "/what is/"
                            B ideas, dreams,"/what could be/", philosophical
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForSN++;
                    }else totalNumberOfBForSN++;
                    break;
                case 19:
                    System.out.println("""
                            19.
                            A matter of fact, issue oriented
                            B sensitive, people oriented, compassionate
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForTF++;
                    }else totalNumberOfBForTF++;
                    break;
                case 20:
                    System.out.println("""
                            20.
                            A control, govern
                            B latitude, freedom              
                            """);
                    System.out.println("answer: ");
                    userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("A")){
                        totalNumberOfAForJP++;
                    }else totalNumberOfBForJP++;
                    break;
            }
        }
    }
    static void display() {
        String personalities1 = "";
        String personalities2 = "";
        String personalities3 = "";
        String personalities4 = "";

        if (totalNumberOfAForEI > totalNumberOfBForEI) {
            personalities1 = "E";
        } else personalities1 = "I";

        if (totalNumberOfAForSN > totalNumberOfBForSN) {
            personalities2 = "S";
        } else personalities2 = "N";

        if (totalNumberOfAForTF > totalNumberOfBForTF) {
            personalities3 = "T";
        } else personalities3 = "F";

        if (totalNumberOfAForJP > totalNumberOfBForJP) {
            personalities4 = "J";
        } else personalities4 = "P";

        System.out.println("Your personality is: " + personalities1 + personalities2 + personalities3 + personalities4);
    }
}
