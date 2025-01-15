# Image Flickr App

## Overview

This Android application allows users to search for images on Flickr using tags. Users can input search terms into a search bar, and the app will display a grid of images matching the tags. Tapping on an image opens a detail view where the image and its metadata (title, description, author, and publish date) are displayed. The app includes features such as unit tests, UI tests, image sharing, animation, and additional image details.

## Features

- **Search Functionality**: The app allows users to search Flickr's public feed by entering a search term in the search bar.
- **Grid View**: Displays a grid of image thumbnails based on the search term.
- **Image Detail View**: Shows the full-size image along with its metadata (title, description, author, publish date, and dimensions).
- **Share Image**: Users can share the image and its metadata with a share button in the detail view.
- **Animations**: Smooth image transition animation from the grid view to the detail view.
- **Unit and UI Tests**: The app includes unit and UI tests to ensure stability and functionality.

## Tools and Technologies

- Android Studio (lady bug)
- Kotlin
- Jetpack Compose
- Clean Code Architecture
- Navigation compose
- Dagger Hilt
- Kotlin Flows
- Unit Testing
- UI Testing


## Tools and Technologies

This project uses a variety of modern Android development tools and libraries to ensure high performance, maintainability, and scalability. Below are the tools and technologies used in this project, along with a brief explanation of why each one was chosen:

- [Android Studio](https://developer.android.com/studio) (Ladybug)
Android Studio is the official Integrated Development Environment (IDE) for Android development. It provides all the tools necessary to build, debug, and test Android applications.

- [Kotlin](https://kotlinlang.org/)
Kotlin is the preferred language for Android development due to its conciseness, null safety, and powerful features like extension functions, coroutines, and data classes.

- [Jetpack Compose](https://developer.android.com/jetpack/compose)
Jetpack Compose is a fully declarative UI toolkit for building Android apps. It simplifies UI development by using Kotlin to define UI components and interactions.

- [Clean Code Architecture](https://martinfowler.com/bliki/CleanArchitecture.html)
The project follows the Clean Code Architecture pattern to ensure that the codebase is modular, maintainable, and testable.

- [Navigation Compose](https://developer.android.com/jetpack/compose/navigation)
Navigation Compose provides an easy-to-use and declarative approach to navigating between composables in Jetpack Compose.

- [Dagger Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
Dagger Hilt is a dependency injection library that reduces boilerplate code for setting up and managing dependencies. 

- [Kotlin Flows](https://kotlinlang.org/docs/flow.html)
Kotlin Flows are used for handling asynchronous streams of data in a reactive way. They provide a simple and efficient way to handle long-running or data-streaming operations such as API calls. 

- [Unit Testing](https://developer.android.com/training/testing/unit-tests)
Unit testing is essential for ensuring the correctness and stability of business logic. In this project, unit tests are written for the ViewModel, Repository, and UseCase layers to verify that the individual components work correctly in isolation. 
- [UI Testing](https://developer.android.com/training/testing/ui-testing)
UI testing is performed to ensure that the user interface behaves as expected under various conditions. UI tests are written to simulate user interactions such as entering text, tapping buttons, and navigating between screens. 

## Demo Screenshots

| **Screen 1**        | **Screen 2**         | **Screen 3**          | **Screen 4**         |
|---------------------|----------------------|-----------------------|----------------------|
| **Search Screen**    | **Image Grid**       | **Image Detail View** | **Share Button**     |
| ![Search Screen](https://github.com/user-attachments/assets/acbaf7fa-aef7-4633-83bf-7e960e36d34e) | ![Image Grid](https://github.com/user-attachments/assets/d604d964-232d-409b-be4e-38fd822e6c04) | ![Image Detail View](https://github.com/user-attachments/assets/eb0a4576-c0b8-4fd7-a1ab-4bdc36408347) | ![Share Button](https://github.com/user-attachments/assets/73cac27e-3a84-4725-9cc7-0d1c532af428) |

## Demo Video
https://github.com/user-attachments/assets/b4227549-f1b0-4c94-aa52-5a2eab43b332

## API Used

The app fetches image data from the [Flickr Public Feed API](https://api.flickr.com/services/feeds/photos_public.gne?format=json&nojsoncallback=1).

