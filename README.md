# Indus Electricity Board - Invoice File Upload API Testing

This project automates API testing for an enterprise-level electricity board system undergoing digital transformation. The goal is to verify that when an invoice PDF is uploaded via a backend API, the system successfully extracts and returns accurate billing data such as `Account Number`, `Invoice Number`, etc.

---

## 📌 Project Overview

**Project Name:** `Indus`  
**Domain:** Electricity Distribution Board  
**Objective:** Automate validation of extracted data from uploaded invoice PDFs to replace manual entry processes  
**Testing Role:** API test automation focused on backend file processing  
**Environment:** Real-time enterprise backend, active in production/testing phases  

---

## ⚙️ Tech Stack

- **Language:** Java
- **Testing Library:** RestAssured
- **Test Framework:** TestNG
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA
- **Data Handling:** JSON response parsing via `JsonPath`
- **File I/O:** Invoice PDFs for upload testing

---

## 🔒 API Endpoint & Authentication

> 🚫 For confidentiality reasons, actual API endpoints and authentication keys are **anonymized**.  
> These are proprietary to the enterprise project and not publicly shareable.

---

## 🧪 What This Test Does

- Uploads real electricity invoice PDFs (Discom-wise or Circle-wise) to the backend API
- Parses the JSON response and extracts specific fields like `AccountNo_1`
- Verifies extracted values using assertions or manual printouts for comparison
- Ensures the system extracts data consistently and accurately after switching from manual to digital processing

---

## 📂 Project Structure

```
Indus_API_Testing/
├── pom.xml
├── README.md
└── src/
    └── test/
        └── java/
            ├── FiltestingPacakge/
            │   └── NoidaPowerDelhi.java         # Example test class for Noida Power Discom
            └── CircleTesting/
                └── NorthDelhiCircleTest.java    # Circle-based retesting class
```

> 📁 You’ll need to have access to internal folders containing the invoice PDFs:
> `D:\Indus Tower\Invoices 500\Delhi\Delhi\Noida Power Company Limited\...`

---

## 🚀 How to Run This Project

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/Indus_API_Testing.git
   cd Indus_API_Testing
   ```

2. **Open in IntelliJ IDEA**

3. **Add as a Maven project** using the provided `pom.xml`

4. **Download/Place the required invoice PDFs** at the appropriate file paths provided by the enterprise team (Indus system folders)

5. **Update the test file path** in the Java test class (e.g., `NoidaPowerDelhi.java`) as per your local machine setup.

6. **Run tests**:
   - Directly from IntelliJ via right-click → Run
   - Or use the Maven command line:
     ```bash
     mvn clean test
     ```

---

## 📋 Sample Assertion Logic

```java
String accounts = response.jsonPath().getString("data.AccountNo_1");

if ("2000057674".equals(accounts != null ? accounts.trim() : "")) {
    System.out.println("✅ Value is fine as expected");
} else {
    System.out.println("❌ Error in this field exists");
}
```

---

## 📌 Status of the Project

- ✅ Test scripts created for multiple Discoms and Circles
- 🧪 Currently testing file uploads with real PDF samples
- 📤 Manual and automated validations ongoing
- 💡 Jenkins integration not required as per current enterprise scope

---

## 📈 Future Enhancements (Planned/Optional)

- Parameterize test data via Excel or JSON files
- Batch file upload testing
- Extract and validate multiple fields from the API response
- Optional Jenkins CI setup for scheduled testing

---

## 🛡️ Disclaimer

> This is an **internal project** developed as part of a live enterprise system.  
> All data, URLs, and credentials are protected and **not publicly shared** to comply with company policy.

---

## 🤝 Contributions

This repository is intended for internal demonstration and validation purposes. External contributions are currently restricted.

