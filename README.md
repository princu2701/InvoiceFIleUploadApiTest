# ⚡ Indus Invoice Upload API Testing

Welcome to the API test automation project for **Indus Electricity Board**, a real-time enterprise initiative aiming to **digitize invoice processing**. This project ensures accurate extraction of billing data from uploaded PDFs using backend REST APIs.

---

## 🎯 Project Purpose

> ✅ **Transforming manual electricity invoice workflows into automated, digital pipelines**

This test suite verifies that when a Discom or Circle uploads a PDF invoice, the system correctly extracts fields like:

- 🔢 `Account Number`
- 📄 `Invoice Number`
- 📆 `Billing Date`
- 💰 `Invoice Amount`

It’s part of Indus' broader effort to modernize utility operations.

---

## 🧰 Tech Stack

| Tool         | Purpose                     |
|--------------|-----------------------------|
| **Java**     | Core language               |
| **RestAssured** | API test automation     |
| **TestNG**   | Test framework              |
| **Maven**    | Build and dependency manager|
| **IntelliJ** | Primary IDE                 |

---

## 🔒 Security & Data Privacy

🚫 **All API endpoints and credentials are anonymized** to protect enterprise confidentiality.  
⚠️ Invoice file samples are proprietary and accessed through internal Indus systems.

---

## 📂 Folder Structure

```
Indus_API_Testing/
├── pom.xml
├── README.md
└── src/
    └── test/
        └── java/
            ├── FiltestingPacakge/
            │   └── NoidaPowerDelhi.java
            └── CircleTesting/
                └── NorthDelhiCircleTest.java
```

> 🗂️ PDFs are sourced internally, e.g.:
> `D:\Indus Tower\Invoices 500\Delhi\Delhi\Noida Power Company Limited\...`

---

## 🚀 How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/princu2701/Indus_API_Testing.git
   ```

2. **Open in IntelliJ**  
   File → Open → Select `pom.xml` to load Maven structure

3. **Update file paths** inside test classes for PDF locations

4. **Run tests** via:
   - IntelliJ test runner (Right-click → Run)
   - or command line:
     ```bash
     mvn clean test
     ```

---

## 🧪 Sample Validation Logic

```java
String accounts = response.jsonPath().getString("data.AccountNo_1");

if ("2000057674".equals(accounts != null ? accounts.trim() : "")) {
    System.out.println("✅ Value is fine as expected");
} else {
    System.out.println("❌ Error in this field exists");
}
```

---

## 🛠 Current Status

- ✅ Working test classes for multiple Discoms
- ✅ Retesting structure by Circle names
- ✅ Field-level validations
- 🔧 Actively under development

---

## 🔮 Planned Enhancements

- 📊 Excel-based test parameterization
- 🔁 Loop-based batch file upload testing
- 🔍 Add validations for multiple fields (`GST`, `Invoice Date`, etc.)
- ⚙️ Optional Jenkins CI integration (currently out of scope)

---

## 🙋 About the Author

This API test suite was developed as part of an **enterprise backend validation effort**, led during the **mid-phase of development** to support quality assurance and onboarding of new automation methods.

---

## ⚠️ Disclaimer

This repository contains code and logic related to internal systems.  
All data, endpoints, and business logic are masked or anonymized in public-facing documentation.

---

## 🙏 Thank You

Thanks for visiting this project!  
If you found this useful or insightful, feel free to:

- ⭐ Star this repo for reference  
- 👀 [Explore more of my work](https://github.com/princu2701) on GitHub  
- 🛠️ Check out other automation or API testing repositories on my profile  

Happy testing! 🚀
