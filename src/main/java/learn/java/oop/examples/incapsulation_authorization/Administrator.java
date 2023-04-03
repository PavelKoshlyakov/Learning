package learn.java.oop.examples.incapsulation_authorization;

public class Administrator extends User{


    public Administrator(String surname, String name, String patronymic, String phoneNumber, String email, String login, String password) {
        super(surname, name, patronymic, phoneNumber, email, login, password);
    }

    public Administrator makeAdmin(User user){
        return new Administrator(user.getSurname(), user.getName(), user.getPatronymic(), user.getPhoneNumber(), user.getEmail(), user.getLogin(), user.getPassword());
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "login='" + getLogin() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", patronymic='" + getPatronymic() + '\'' +
                "}";
    }
}
