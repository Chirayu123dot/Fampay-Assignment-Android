# Server-Driven UI Application

## What is server-driven UI? 🤔
Server-driven UI is a development technique in which the major UI components of a mobile application are fetched from the server via API calls and dynamically rendered in the application when the user opens the app. It helps in updating the native user interface in already deployed mobile applications, without any interference from the user (like updating the app from playstore/appstore).
This opens up new possibilities and addresses some fundamental challenges with native mobile app development.<br><br>
This application builds a simple front-end dynamically based on the API response from the server. The entire frontend is built dynamically, and can be changed by changing the API response

## About the Application 📱
This application was made as an internship assignment for [Fampay](https://fampay.in/)

The problem statement was as follows:
> Develop a standalone container, that displays a list of Contextual Cards. A Contextual Card is used to refer to a view that is rendered using json from an API. These views are dynamic and their properties like images, color, texts, buttons (CTAs) etc. can be changed from backend at anytime.

API endpoint: https://run.mocky.io/v3/fefcfbeb-5c12-4722-94ad-b8f92caad1ad#FFB486


## Libraries Used
- __Jetpack Compose__ : _For dynamic UI_
- __Retrofit__ : _For making the network requests_
- __GsonConverter__: _For parsing the JSON Response_
- __Coil__: _For loading images via url_

## Running the project
- Clone the project using `git clone https://github.com/Chirayu123dot/Fampay-Assignment-Android`
- Run it on a physical device or an emulator

## APK
https://github.com/Chirayu123dot/Fampay-Assignment-Android/blob/master/fampay-app.apk
> Click on the download button

## Video demonstration
https://user-images.githubusercontent.com/72456458/185765258-2634839b-d740-45bd-bc02-4c90f8227237.mp4

