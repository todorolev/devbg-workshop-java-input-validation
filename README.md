Файлът [validation.md](./validation.md) съдържа цялата информация от семинара.

[regauto](./regauto/) е Spring Boot приложението, използванo за примера по време на лекцията.

**Пример:** Приложение за регистрация на автомобили. За да се регистрира нов автомобил трябва да се изпрати заявка, съдържаща имената на собственика и регистрационният номер.

### [regauto](./regauto/)
*Build:* ``./gradlew clean build`` или (Windows) ``.\gradlew clean build``<br/>
*Start:* Стартирайте ``main()`` метода в IDE или с ``java -jar ./build/libs/regauto-0.0.1-SNAPSHOT.jar``

**Endpoints**<br/>
*Save Car*<br/>
``curl --location 'http://localhost:8080/car' \
--header 'Content-Type: application/json' \
--data '{
    "ownerName": "Todor",
    "ownerSurname": "Olev",
    "plate": "E0050MA"
}'``

*Find Car*<br/>
``curl --location 'http://localhost:8080/car?plate=E0050MA'``

<br/>