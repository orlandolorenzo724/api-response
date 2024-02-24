# API Response Library

This Java library simplifies handling API responses in your applications. It offers classes for generating API responses with different HTTP status codes and custom messages.

## Features

- Easily create API responses for various HTTP status codes like OK, Bad Request, Not Found, and Internal Server Error.
- Customize response messages based on different scenarios.
- Seamless integration into your Java projects.

## Installation

To use this library in your Java project, follow these steps:

1. Clone this repository to your local machine:

```bash
git clone https://github.com/orlandolorenzo724/api-response.git
```

2. Navigate to the cloned directory:
```agsl
cd api-response
```

3. Build the project using Maven:

```bash
mvn clean install
```

Once the build is successful, you can include the library as a dependency in your project.

```
<dependency>
    <groupId>it.orlandolorenzo</groupId>
    <artifactId>apiresponse</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

Here's a quick guide on how to use the APIResponse class:

1. Create an instance of APIResponse by providing the necessary parameters such as status, HTTP status code, message, internal code, and data.
2. Utilize the provided static methods like `ok`, `badRequest`, `notFound`, and `internalServerError` to generate API responses for common scenarios.
3. Customize the response messages by providing a map containing response messages and specifying the desired message key.

Example:

```java
APIResponse<String> response = APIResponse.ok(userDTO, responseHashMap, "successKey");
```

## Contributors
- Lorenzo Orlando

## License
This project is licensed under the MIT License - see the [LICENSE](https://opensource.org/license/mit) file for details.

## References
- Medium: [The Best Way to Handle API Responses in Spring Boot](https://medium.com/spring-boot/the-best-way-to-handle-api-responses-in-spring-boot-77996e20bf86)

