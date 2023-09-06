package learn.java.t2_oop.examples.incapsulation_authorization;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>(
                List.of(
                        new Administrator("Иванов", "Иван", "Иванович", "89150000101", "admin@admin.com", "admin", "admin"),
                        new User("Кошелев", "Иван", "Степанович", "88005553535", "kosh@gmail.com", "koshh", "123")
                )
        );
//        ArrayList<Item> items = new ArrayList<>(
//                List.of(
//                        new Item("Молоко", 79),
//                        new Item("Хлеб", 31),
//                        new Item("Печенье", 126),
//                        new Item("Сахар", 63),
//                        new Item("TWIX", 47)
//                )
//        );

        Shop shop = new Shop();


        while (true) {
            System.out.println("1 - Авторизоваться, 2 - Зарегистрироваться, 0 - Выход");

            int choice = scanner.nextInt();
            if (choice == 1) {
                String inputString = inputString("Введите логин или email");
                String password = inputString("Введите пароль");

                User currentUser = checkUserData(users, inputString, password);
                if (currentUser == null) {
                    System.out.println("Вы ввели некорректные данные.");
                    continue;
                }
                boolean isAuthorized = true;
                while (isAuthorized) {
                    if (currentUser instanceof Administrator) {
                        Administrator currentAdministrator = (Administrator) currentUser;
                        System.out.println("1 - Добавить товар, 2 - список товаров, 3 - удалить товар, 4 - информация о пользователях, 5 - Сменить роль пользователя, 0 - выйти");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            Item newItem = createItem();    //Создание нового товара
                            shop.addItem(newItem);          //Добавление нового товара в список
                        }
                        if (choice == 2) {
                            shop.printItems();          //Вывод всех товаров
                            System.out.println();       //Пустая строка после вывода
                        }
                        if (choice == 3) {
                            System.out.println("Введите номер товара, который хотите удалить:");
                            int numberItem = scanner.nextInt();

                            if (!shop.isCurrentNumber(numberItem)) {
                                System.out.println("Введён некорректный номер товара");
                                continue;       //Пропуск всего остального и возвращение к началу
                            }
                            shop.deleteItem(numberItem - 1);    //Удаление товара. number-1, потому что нумерация идёт с нуля, а выводится с единицы
                            System.out.println("Товар успешно удалён!");
                        }
                        if (choice == 4) {
                            for (int i = 0; i < users.size(); i++) {
                                System.out.println((i + 1) + " " + users.get(i));
                            }
                        }
                        if (choice == 5) {
                            System.out.println("Введите номер пользователя:");
                            int numberUser = scanner.nextInt();
                            User user = users.get(numberUser - 1);
                            Administrator newAdministrator = currentAdministrator.makeAdmin(user);  //Пересоздание User как Administrator
                            users.remove(numberUser - 1);                   //Удаление старого представления пользователя
                            users.add(newAdministrator);                         //Добавление нового администратора
                        }
                        if (choice == 0) {
                            isAuthorized = false;                               //Сброс флага авторизации. После этого while остановится и придётся снова вводить логин и пароль
                        }
                    } else {
                        //Если авторизовался пользователь, то сразу выводится список товаров
                        shop.printItems();

                        System.out.println("Введите 0, чтобы выйти из аккаунта");
                        int number = scanner.nextInt();
                        if (number == 0) isAuthorized = false;

                    }
                }

            } else if (choice == 2) {
                User registrationUser = registration();
                if (registrationUser != null)
                    users.add(registrationUser);  //Если удалось зарегистрироваться, то новый пользователь добавляется в список
            } else if (choice == 0) {
                break;
            }
        }

    }

    public static String inputString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String input = scanner.nextLine();
        return input;
    }

    /**
     * Функция регистрации нового пользователя.
     * Заполнение всех необходимых данных и формирование нового объекта пользователя.
     *
     * @return User если регистрация успешна, null - если ошибка во время регистрации
     */
    public static User registration() {
        String surname = inputString("Введите фамилию:");
        String name = inputString("Введите имя:");
        String patronymic = inputString("Введите отчество:");

        String phoneNumber = inputString("Введите номер телефона:");
        boolean isCorrect = phoneNumber.matches("\\+7|8\\d{10}");
        if (!isCorrect) {
            System.out.println("Введён некорректный номер телефона");
            return null;
        }

        String email = inputString("Введите email:");
        isCorrect = email.matches("\\w{1,}@[A-z]{1,}\\.\\w{1,}");   //regex для проверки корректности email. До @ должен быть хотя бы один символ, потом хотя бы один латинский символ, потом точка, потом домен
        if (!isCorrect) {
            System.out.println("Введён некорректный email");
            return null;
        }

        String login = inputString("Введите логин:");
        isCorrect = login.matches("\\w{4,}");   //Проверка корректности логина. Должно быть минимум 4 латинских символа, дозволительно использование тире
        if (!isCorrect) {
            System.out.println("Введён некорректный логин. Можно использовать только символы латиницы, цифры и знак подчёркивания. Длина должна быть не менее 4 символов");
            return null;
        }

        String password = inputString("Введите пароль:");
        return new User(surname, name, patronymic, phoneNumber, email, login, password);
    }

    /**
     * Проверка корректности введённых данных для входа.
     *
     * @param users    список пользователей
     * @param login    логин или email
     * @param password пароль
     * @return User, данные которого ввели, null - если данные некорректны
     */
    public static User checkUserData(ArrayList<User> users, String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) || user.getEmail().equals(login)) {
                if (user.getPassword().equals(password)) {
                    return user;
                }
            }
        }
        return null;
    }

    /**
     * Создание нового товара
     * Имя и стоимость вводятся с консоли
     *
     * @return Item
     */
    public static Item createItem() {
        Scanner scanner = new Scanner(System.in);
        String name = inputString("Введите название товара:");
        System.out.println("Введите стоимость товара");
        int cost = scanner.nextInt();
        return new Item(name, cost);
    }

}
