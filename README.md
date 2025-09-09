# Online Menu Service

This project is a Spring Boot application for managing an online menu system.

## Prerequisites

Before you begin, ensure you have the following installed:
*   Java 17
*   Maven
*   PostgreSQL

## Getting Started

### 1. Clone the Project

```bash
git clone <your-repository-url>
cd onlineMenu
```

### 2. Build the Project

Build the application using Maven. This will download dependencies and compile the source code.

```bash
mvn clean install
```

## Database Setup

The application requires a PostgreSQL database to run.

1.  **Verify PostgreSQL Installation:**
    Open your terminal and check if `psql` is available in your PATH.
    ```bash
    which psql
    ```
    This command should return a path to the `psql` executable, not an error.

2.  **Connect to PostgreSQL:**
    Open the PostgreSQL interactive terminal.
    ```bash
    psql
    ```

3.  **List Existing Databases:**
    Inside the `psql` shell, you can list all databases to see what currently exists.
    ```sql
    \l
    ```

4.  **Create the Application Database:**
    Execute the following SQL command to create the database for this project.
    ```sql
    CREATE DATABASE online_menu;
    ```

5.  **Verify Database Creation:**
    Run the list command again to ensure the `online_menu` database now appears in the list.
    ```sql
    \l
    ```

6.  **Exit psql:**
    ```sql
    \q
    ```

## Running the Application

Once the database is set up, you can run the application directly from your favorite IDE (like IntelliJ IDEA or VS Code) by running the `OnlineMenuApplication` class.
