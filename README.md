# WAD Lab 7 - CI/CD Pipeline & Backend Testing

This repository contains the Lab 7 assignment for the Web Application Development course at Politehnica University of Bucharest (UPB). The primary goal of this project is to set up a robust Continuous Integration (CI) pipeline using GitHub Actions to automate backend testing and code coverage reporting.

## 🚀 Features & Implementation

- **Automated CI Pipeline:** Configured via `.github/workflows/ci.yml`. The workflow is triggered automatically on every `push` and `pull_request` to the `test` branch.
- **Environment Variables & Secrets:** The backend tests require a specific environment variable (`MY_SECRET_KEY`). For security reasons, this is not hardcoded but securely injected into the pipeline using **GitHub Secrets**.
- **Automated Testing:** Executes Gradle backend tests automatically within an isolated Ubuntu environment running Java 17.
- **Code Coverage Reporting:** Integrates **JaCoCo** (`jacocoTestReport` task) to generate detailed code coverage reports after successful test executions.

## 🛠️ Tech Stack

- **Language:** Java 17
- **Build Tool:** Gradle
- **CI/CD:** GitHub Actions
- **Testing & Coverage:** JUnit 5, JaCoCo

## ⚙️ How It Works

1. A developer pushes code to the `test` branch.
2. GitHub Actions provisions an `ubuntu-latest` runner.
3. The runner checks out the repository and sets up JDK 17.
4. The GitHub Secret (`MY_SECRET_KEY`) is loaded into the environment.
5. `./gradlew test` is executed. If tests fail, the pipeline stops and alerts the team.
6. If tests pass, `./gradlew jacocoTestReport` runs to evaluate code coverage.

---
*Author: Furkan Dereli*
