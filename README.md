# spring-vaadin-mysql-autorithation
Spring Vaadin MySQL Authorization Example

[UA]
Цей проект демонструє, як інтегрувати Spring, Vaadin та MySQL для створення простої системи авторизації. Додаток надає зручний інтерфейс для входу в систему та управління обліковими даними користувачів, демонструючи бездоганну взаємодію між цими фреймворками.
Особливості

    Spring Boot: Забезпечує основу програми, гарантуючи надійну та масштабовану архітектуру.
    Vaadin: забезпечує динамічний та адаптивний користувацький інтерфейс для процесу авторизації.
    MySQL: Слугує базою даних для безпечного зберігання інформації про користувачів.
    Spring Security: Забезпечує безпеку додатку та захист даних користувачів.

Структура проекту

    Бекенд: Працює на основі Spring Boot, відповідає за бізнес-логіку, автентифікацію користувачів та обробку даних.
    Фронтенд: Побудований за допомогою Vaadin, пропонуючи сучасний та інтерактивний інтерфейс для взаємодії з користувачем.
    База даних: MySQL використовується для зберігання облікових даних користувачів та іншої необхідної інформації.

Інструкція з налаштування

    Клонуйте сховище:

    bash

git clone https://github.com/DarkPoul/spring-vaadin-mysql-autorithation

Перейдіть до каталогу проекту:

bash

cd spring-vaadin-mysql-autorithation 

Налаштуйте базу даних:

    Переконайтеся, що MySQL встановлено і запущено.
    Створіть нову базу даних і оновіть файл application.properties з вашими обліковими даними до бази даних:

    properties

    spring.datasource.url=jdbc:mysql://localhost:3306/ваша_назва_бази_даних
    spring.datasource.username=ваше_ім'я користувача
    spring.datasource.password=ваш_пароль

    У проекті знаходиться додатковий сервіс для створення хешованого паролю. Необхідно за допомогою нього згенерувати пароль для першого користувача, та додати його до БД. Або ж відредагувати код під свої потреби та додати автоматичне створення першого     користувача.

Зберіть і запустіть додаток:

bash

    ./mvnw spring-boot:run

Використання

    Відкрийте веб-браузер і перейдіть за адресою http://localhost:8080.
    
    Перед вами відкриється форма для входу.

Не соромтеся розгалужувати цей репозиторій, вносити свої зміни і надсилати запит на вилучення. Будь-який внесок у покращення цього проекту вітається.


This project demonstrates how to integrate Spring, Vaadin, and MySQL to create a simple authorization system. The application provides a user-friendly interface for logging in and managing user credentials, showcasing the seamless interaction between these frameworks.
Features

    Spring Boot: Provides the backbone of the application, ensuring a robust and scalable architecture.
    Vaadin: Delivers a dynamic and responsive user interface for the authorization process.
    MySQL: Serves as the database for storing user information securely.
    Spring Security: Ensures that the application is secure and user data is protected.

Project Structure

    Backend: Powered by Spring Boot, handling business logic, user authentication, and data processing.
    Frontend: Built with Vaadin, offering a modern and interactive UI for user interactions.
    Database: MySQL is used to store user credentials and other necessary information.

Setup Instructions

    Clone the repository:

    bash

git clone https://github.com/yourusername/vaadin-spring-mysql-auth

Navigate to the project directory:

bash

cd vaadin-spring-mysql-auth

Configure the database:

    Ensure MySQL is installed and running.
    Create a new database and update the application.properties file with your database credentials:

    properties

    spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password

    The project contains an additional service for creating a hashed password. You need to use it to generate a password for the first user and add it to the database. Or you can edit the code to suit your needs and add automatic creation of the first user.

Build and run the application:

bash

    ./mvnw spring-boot:run

Usage

    Open a web browser and navigate to http://localhost:8080.
    You will be presented with a login form.

Contributing

Feel free to fork this repository, make your changes, and submit a pull request. Any contributions to improve this project are welcome.
