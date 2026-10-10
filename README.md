🔗 URL Shortener :

A simple backend application built using Java, Spring Boot, and MySQL to convert long URLs into short links and redirect users to the original websites.

✨ Features :

- Converts long URLs into short URLs.
- Generates short codes dynamically.
- Checks whether a short code already exists before saving it.
- Stores original URLs and short codes in MySQL.
- Redirects users to the original website.
- Supports API testing using Postman.

🛠️ Technologies Used :

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman
  
📂 Project Structure :

src/main/java/com/example/urlshortener/
├── controller/
│   └── UrlController.java
├── service/
│   └── UrlService.java
├── dao/
│   └── UrlRepo.java
├── entity/
│   └── Url.java
└── UrlshortenerApplication.java


 ⚙️ Setup Instructions :
 
1. Clone the repository.
2. Create a MySQL database named `urlshortener_db`.
3. Configure the database username and password in `application.properties`.
4. Run `UrlshortenerApplication.java`.
5. Test the API using Postman.
   
🧪 API Endpoints :

1. Shorten a URL
- Method: POST
- Endpoint: `http://localhost:8080/shorten`
- Parameter: `originalUrl`
In Postman, select Body → x-www-form-urlencoded and enter:
- Key: `originalUrl`
- Value: `https://www.google.com`
The application returns the generated short URL.

2. Redirect to the Original URL
- Method: GET
- Endpoint: `http://localhost:8080/{shortCode}`
Open the generated short URL in your browser to redirect to the original website.

🔄 How It Works :

1. Enter the original long URL.
2. Generate a short code.
3. Check whether the short code already exists. If it does, generate another code.
4. Save the original URL and unique short code in MySQL.
5. Return the generated short URL.
6. Open the short URL to visit the original website.
   
🚀 Future Enhancements :

- Handle invalid short URLs.
- Track the number of URL visits.
- Add URL expiration functionality.
- Develop a frontend using HTML, CSS, and JavaScript.
  
👩‍💻 Author
Lakshmi Priya S
