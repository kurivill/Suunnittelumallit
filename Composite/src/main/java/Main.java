public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        Unit umbrellaCorp = new Department("Umbrella Corporation");
        Unit ceo = new Employee("Albert Wesker", 1000000);
        umbrellaCorp.add(ceo);

        Unit research = new Department("Research");
        umbrellaCorp.add(research);
        Unit researchDirector = new Employee("William Birkin", 500000);
        research.add(researchDirector);
        Unit researchScientist1 = new Employee("Alexia Ashford", 200000);
        research.add(researchScientist1);

        Unit marketing = new Department("Marketing");
        umbrellaCorp.add(marketing);
        Unit marketingDirector = new Employee("Oswell E. Spencer", 500000);
        marketing.add(marketingDirector);
        Unit tvmarketing = new Department("TV Marketing");
        marketing.add(tvmarketing);
        Unit tvMarketingManager = new Employee("Ada Wong", 200000);
        tvmarketing.add(tvMarketingManager);
        Unit tvMarketingAssistant = new Employee("Carla Radames", 100000);
        tvmarketing.add(tvMarketingAssistant);

        umbrellaCorp.printData(sb, 0);
        System.out.println(sb.toString());

        System.out.println("Total salary: " + umbrellaCorp.getTotalSalary());


    }
}
