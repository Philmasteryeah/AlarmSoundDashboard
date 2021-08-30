# Spring Boot Alarm Sound Kiosk Dashboard 

- java
- spring boot
- gradle
- bootstrap 5
- sound


### What is this
- the server backend imports and saves delivery orders per REST
- multiple clients show the orders as list with HTTP / JS
- the list is synchronized between all clients
- special orders appear with a alarm sound and blinking color 

### use case
- in the restaurant
	- as food monitor as in fast food restaurants
- taxi or delivery of people
	- transportation orders

### TODOs
- make it reactive
- alert blinking

### future extensions
- work with this [Kuando Busylight ](https://github.com/tckb/busylight_driver)
- prepare a rasperry pi as external web client with hdmi and sound
- Tizen or Android TV App (only one httprequest to the client page)


# How to start
```
$ git clone https://github.com/Philmasteryeah/AlarmSoundDashboard.git
$ cd AlarmSoundDashboard
$
$ ./gradlew bootRun
```


### THX
* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

