# Developer : surendra gupta
# Date : 10-DEC-2020
## URL Shortener
***
[URL shortening] is a technique on the World Wide Web in which a uniform resource locator (URL) may be made substantially shorter in length and still direct to the required page. This is achieved by using an redirect on a domain name that is short, which links to the web page that has a long URL.


URL shortner application has been developed as two main functionalities:
1. URL Shortner RESTful API
2. Dashboard


####**1. URL Shortner RESTful API**

**Representational State Transfer (REST)** is a software architecture style consisting of guidelines and best practices for creating scalable web services REST is a coordinated set of constraints applied to the design of components in a distributed hypermedia system that can lead to a more per formant and maintainable architecture.

RESTful systems typically, but not always, communicate over the Hypertext Transfer Protocol with the same HTTP verbs (GET, POST, PUT, DELETE, etc.) used by web browsers to retrieve web pages and send data to remote servers.

This application exposes below list of services.

 1. Shortner service
 2. Expansion service
 3. Top 5 popular viewed URLs
 4. Recently viewed 5 URLs
 5. List of shorten URLs
 6. Total count of shorten URLs 
 7. Recently shorten 5 URLs
 8. Day wise total shorten count for 5 days
 9.  List of shorten URLs with each view count

####**1. Shortner Service**
Post the long url and gives us the short url as a response.
```
POST http://localhost:8080/api/v1/shorten 
```
**Example Request:**
```
curl -X POST --data '{"longUrl":"http://stackoverflow.com/questions/6525538/convert-utc-date-time-to-local-date-time-using-javascript"}' --header "Content-Type:application/json" http://54.200.113.144:8080/api/v1/shorten
```
**Response:**
```
{
    "shortUrl": "ctE1zkz",
    "longUrl": "https://www.google.co.in/search?sclient=psy-ab&es_sm=93&biw=1366&bih=643&noj=1&q=jquery+append+json+data+inside+html+tag&oq=jquery+append+json+data+inside+html"
}
```
####**2. Expansion Service**
  Returns the long Url for the given short Url id.
```
GET http://localhost:8080/api/v1/expand/{urlId}
```
**Example Request:**
```
curl http://localhost:8080/api/v1/expand/zjwOlHd
```
**Response:**
```
http://www.journaldev.com/2593/spring-jdbc-and-jdbctemplate-crud-with-datasource-example-tutorial
```
####**3. Top 5 popular viewed URLs**
Returns the five most viewed Url that is shortned.
```
GET http://localhost:8080/api/v1/mostpopular
```
**Example Request:**
```
curl http://localhost:8080/api/v1/mostpopular
```
**Response:**
```
[
    {
        "shortUrl": "zjwOcAI",
        "count": 16
    },
    {
        "shortUrl": "zktB1uq",
        "count": 7
    },
    {
        "shortUrl": "zjwOlHd",
        "count": 6
    },
    {
        "shortUrl": "zkrJLyQ",
        "count": 5
    },
    {
        "shortUrl": "zkiV65Z",
        "count": 5
    }
]
```
####**4. Recently viewed URLs**
Returns the five recently viewed Url that is shortned.
```
GET http://localhost:8080/api/v1/recentlyviewed
```

**Example Request:**
```
curl http://localhost:8080/api/v1/recentlyviewed
```
**Response:**
```
[
    {
        "SHORTURL": "zkuSHrY",
        "MODIFIEDDATE": 1429533762509
    },
    {
        "SHORTURL": "zjwOcAI",
        "MODIFIEDDATE": 1429533758189
    },
    {
        "SHORTURL": "zkuThk5",
        "MODIFIEDDATE": 1429517326583
    },
    {
        "SHORTURL": "zkuQGhe",
        "MODIFIEDDATE": 1429475809843
    },
    {
        "SHORTURL": "zkuQHhx",
        "MODIFIEDDATE": 1429475806039
    }
]
```
####**5. List of shorten URLs**
Returns list of all  Url that is shortned.
```
GET http://localhost:8080/api/v1/shorturllist
```
**Example Request:**
```
curl http://localhost:8080/api/v1/shorturllist
```
**Response:**
```
[
    "zjwNTxS",
    "zjwNZBs",
    "zjwOcAI",
    "zjwOkkD",
 ]
```
####**6. Total count of URL shorten**
Returns the count of total number of url shortened.
```
GET http://localhost:8080/api/v1/urlstotalcount
```
**Example Request:**
```
curl http://localhost:8080/api/v1/urlstotalcount
```
**Response:**
```
6
```
####**7. Recently shortner URLs**
Returns the five recently shortned Url.
```
GET http://localhost:8080/api/v1/recentlyshorten
```
**Example Request:**
```
curl http://localhost:8080/api/v1/recentlyshorten
```
**Response:**
```
[
    {
        "COUNT": 24,
        "DATE": "2015-04-20"
    },
    {
        "COUNT": 2,
        "DATE": "2015-04-19"
    },
    {
        "COUNT": 2,
        "DATE": "2015-04-18"
    },
    {
        "COUNT": 1,
        "DATE": "2015-04-16"
    },
    {
        "COUNT": 5,
        "DATE": "2015-04-09"
    }
]
```
####**8. Day wise total shorten count for the past 5 days**
Returns the total number of url shortened for the past 5 days.
```
GET http://localhost:8080/api/v1/last5dayscount
```
**Example Request:**
```
curl http://localhost:8080/api/v1/last5dayscount
```

**Response:**
```
[
    {
        "COUNT": 24,
        "DATE": "2015-04-20"
    },
    {
        "COUNT": 2,
        "DATE": "2015-04-19"
    },
    {
        "COUNT": 2,
        "DATE": "2015-04-18"
    },
    {
        "COUNT": 1,
        "DATE": "2015-04-16"
    },
    {
        "COUNT": 5,
        "DATE": "2015-04-09"
    }
]
```
####**9. List of shorten URLs with each view count**
Returns the list of shorten url with each view count.
```
GET http://localhost:8080/api/v1/listurl
```
**Example Request:**
```
curl http://localhost:8080/api/v1/listurl
```

**Response:**
```
[
    {
        "COUNT": 5,
        "SHORTURL": "zjwNTxS"
    },
    {
        "COUNT": 3,
        "SHORTURL": "zjwNZBs"
    },
    {
        "COUNT": 19,
        "SHORTURL": "zjwOcAI"
    },
    {
        "COUNT": 1,
        "SHORTURL": "zjwOkkD"
    },
    {
        "COUNT": 7,
        "SHORTURL": "zjwOlHd"
    }
    ]
```

####**2. Dashboard**
Dashboard developed as web application based on Spring MVC and runs as a Spring Boot. Dashboard consumes above mentioned RESTful API services to present data on its page.


###Technologies Used
 - Java JDK7
 - Spring 4.0(JDBC, MVC, IOC/DI) + Spring Boot
 - JUnit
 - Derby Database
 - Maven
 - Eclipse IDE
 - jQuery
 - JSON
 - HTML
 - CSS
 - Bootstrap
 - Postman REST client

###Building and Running Application
Go to project's root folder. For example:
```
cd /home/ubuntu/url-shortner
```
Command to build: 
```
mvn clean package
```
Command to run:
```
java -jar target/url-shortner-0.1.0.jar
```

