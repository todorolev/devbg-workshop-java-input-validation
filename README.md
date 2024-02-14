The file [validation_en.md](./validation_en.md) contains the transcript from the lecture.

[regauto](./regauto/) is the Spring Boot application used for the example during the lecture.

**Example:** An application for cars data registration. In order to register a new car, a request containing the owner's name and registration plate must be submitted.

### [regauto](./regauto/)
*Build:* ``./gradlew clean build`` or (Windows) ``.\gradlew clean build``<br/>
*Start:* Start the ``main()`` method in the IDE or via ``java -jar ./build/libs/regauto-0.0.1-SNAPSHOT.jar``

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
