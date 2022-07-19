public class Main {
    public static void main(String[] args) {
        Person ivan = new Person.Builder()
                .withName("Иван")
                .withFamilyName("Иванов")
                .withPatronymicName("Иванович")
                .build();

        System.out.println(ivan);
    }

}
