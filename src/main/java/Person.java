public class Person {
    private String name;
    private String familyName;
    private String patronymicName;
    private Integer age;
    private String hobby;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", age=" + age +
                ", hobby=" + hobby +
                '}';
    }

    public static class Builder {
        private Person person;

        public Builder(String name) {
            this.person = new Person();
            person.name = name;
        }

        public Builder withFamilyName(String familyName) {
            person.familyName = familyName;
            return this;
        }

        public Builder withPatronymicName(String patronymicName) {
            person.patronymicName = patronymicName;
            return this;
        }

        public Builder withAge(int age) {
            person.age = age;
            return this;
        }

        public Builder withHobby(String hobby) {
            person.hobby = hobby;
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
