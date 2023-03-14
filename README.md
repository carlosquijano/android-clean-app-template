# jetpack-compose-app-starter-template

🚀 Android + Jetpack Compose app starter template.

## About

This is a starter template for an Android app built with Jetpack Compose. 

### Features at a glance

- Material Design 3
- Clean Architecture principles
- MVVM Architecture principles
- Dagger Hilt for dependency injection
- UI starter templates
  - Welcome, Help and About Screens
  - Login, Signup, Forgot Password and OT Recovery Screens
  - User Profile and Settings Screens
  - Rate App Screens

### Build with

- Gradle
- Android SDK 33
- Jetpack Compose 1.3.3
- Material Design 3
- Dagger Hilt 2.45

### Project Structure

The project follows the Clean Architecture pattern, with separate layers for data, domain, and presentation. 

Here's a breakdown of the project's main packages:

- `data`: This package contains classes and interfaces for interacting with data sources, such as a remote API or a local database.
- `domain`: This package contains the core business logic for the app, such as use cases and domain models.
- `di`: This package contains the Dagger Hilt dependency injection setup for the app.
- `ux`: This package contains pre-built UI templates that you can use as starting points for your own screens.
- `ui`: This package contains the UI code for the app, including Composables, ViewModels, and other UI-related classes.

## Contributing

Contributions to this project are welcome! If you find a bug or would like to suggest an enhancement, please open an issue on GitHub. Pull requests are also welcome.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/carlosquijano/jetpack-compose-app-template/tags).

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
