import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<IndividualCashless> individualCashless = new ArrayList<>();
        List<IndividualCashless> resultIndividualCashless = new ArrayList<>();

        List<AccountsEntity> entities = new ArrayList<>();
        List<AccountsEntity> resultEntities = new ArrayList<>();

        List<IndividualCash> individualCashes = new ArrayList<>();
        List<IndividualCash> resultIndividualCashes = new ArrayList<>();

        Writer writer = new Writer();
        Reader reader = new Reader();

        IndividualCashless individual = IndividualCashless.builder()
                .destination("Destination")
                .amount(800)
                .bankName("BelarusBank")
                .accountNumber(1586)
                .surname("Mandrik")
                .name("Yulia")
                .middleName("Vasilyevna")
                .passSeries("BM")
                .passNumber(55478).build();

        IndividualCashless individualCashless1 = new IndividualCashless("Destination",
                600, "Mandrik", "Vladislav", "Vasilyevich",
                "BM", 2342, "BelInvestBank", 56478);

        AccountsEntity accountsEntity = new AccountsEntity("Destination", 1800,
                "BelAgroPromBank", 7823, "Everybody",
                5464846, "Mandrik", "Vladislav", "Vasilyevich");

        AccountsEntity accountsEntity1 = new AccountsEntity("Destination", 2500,
                "BelAgroPromBank", 8423, "Velvet", 4563257,
                "Mandrik", "Nadezda", "Vladimirovna");

        IndividualCash individualCash = new IndividualCash("Destination", 750,
                "Mandrik", "Vladislav", "Vasilyevich", "BM",
                848615, 42867);
        IndividualCash individualCash1 = new IndividualCash("Destantion", 1000,
                "Mandrik", "Nadezda", "Vladimirovna", "BM",
                646461, 42246);

        individualCashless.add(individual);
        individualCashless.add(individualCashless1);

        entities.add(accountsEntity);
        entities.add(accountsEntity1);

        individualCashes.add(individualCash);
        individualCashes.add(individualCash1);

        individualCashless.sort(Comparator.comparing(IndividualCashless::getBankName).thenComparing
                (IndividualCashless::getAccountNumber));

        try {
            writer.writeFile(individualCashless, "text.txt");
            writer.writeFile(entities, "text1.txt");
            writer.writeFile(individualCashes, "text2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            resultIndividualCashless = reader.readFile("text.txt");
            for (IndividualCashless individualCashless12 : resultIndividualCashless) {
                System.out.println(individualCashless12);
            }
            System.out.println("\n");
            resultEntities = reader.readFile("text1.txt");
            for (AccountsEntity accountsEntity12 : resultEntities) {
                System.out.println(accountsEntity12);
            }
            System.out.println("\n");
            resultIndividualCashes = reader.readFile("text2.txt");
            for (IndividualCash individualCash12 : resultIndividualCashes) {
                System.out.println(individualCash12);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}