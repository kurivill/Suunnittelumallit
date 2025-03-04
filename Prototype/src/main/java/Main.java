import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Recommendation> recommendations = new ArrayList<>();

        Recommendation original = new Recommendation("Sci-Fi");
        recommendations.add(original);
        original.addBook(new Book("Isaac Asimov", "The Foundation", Genre.SCIFI, 1951, 255));
        original.addBook(new Book("Frank Herbert", "Dune", Genre.SCIFI, 1965, 412));
        original.addBook(new Book("Liu Cixin", "The Three-Body Problem", Genre.SCIFI, 2008, 400));

        while (true) {
            System.out.println("1. Show Recommendations");
            System.out.println("2. Clone Recommendation");
            System.out.println("3. Remove Recommendation");
            System.out.println("4. Edit Recommendation");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    for (Recommendation recommendation : recommendations) {
                        System.out.println(recommendation);
                    }
                    break;
                case 2:
                    Recommendation clone = original.clone();
                    recommendations.add(clone);
                    break;
                case 3:
                    System.out.print("Enter target audience: ");
                    String target = sc.nextLine();
                    recommendations.removeIf(recommendation -> recommendation.getTargetAudience().equals(target));
                    break;
                case 4:
                    System.out.println("Choose a recommendation to edit:");
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println(i + 1 + ". " + recommendations.get(i).getTargetAudience());
                    }
                    int editIndex = sc.nextInt() - 1;
                    sc.nextLine();
                    Recommendation targetRecommendation = recommendations.get(editIndex);
                    System.out.println("1. Add Book");
                    System.out.println("2. Remove Book");
                    System.out.println("3. Edit Target Audience");
                    System.out.print("Choose an option: ");
                    int editOption = sc.nextInt();
                    sc.nextLine();
                    switch (editOption) {
                        case 1:
                            System.out.print("Enter author: ");
                            String author = sc.nextLine();
                            System.out.print("Enter title: ");
                            String title = sc.nextLine();
                            System.out.print("Enter genre: ");
                            Genre genre = Genre.valueOf(sc.nextLine().toUpperCase());
                            System.out.print("Enter year: ");
                            int year = sc.nextInt();
                            System.out.print("Enter pages: ");
                            int pages = sc.nextInt();
                            sc.nextLine();
                            targetRecommendation.addBook(new Book(author, title, genre, year, pages));
                            break;
                        case 2:
                            System.out.print("Enter title: ");
                            String bookTitle = sc.nextLine();
                            targetRecommendation.removeBook(bookTitle);
                            break;
                        case 3:
                            System.out.print("Enter new target audience: ");
                            String newTargetAudience = sc.nextLine();
                            targetRecommendation.setTargetAudience(newTargetAudience);
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }


}
