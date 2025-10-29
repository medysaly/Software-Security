# Software-Security

🔐 CS 305 – Software Security Projects

Southern New Hampshire University | Mehdi Salhi

This repository showcases two major projects completed for CS 305 – Software Security, demonstrating secure software development, vulnerability assessment, and encryption best practices.

⸻

🧠 Project 1 – Artemis Financial Vulnerability Assessment

Goal: Perform a full security evaluation of a financial web application to identify and mitigate potential threats.

Key Highlights
	•	Manual code review revealed SQL Injection, XSS, and hard-coded credentials.
	•	Static analysis (OWASP Dependency-Check) exposed outdated libraries with CVEs (e.g., Spring4Shell, Ghostcat).
	•	Created a detailed mitigation plan recommending library updates, input validation, and secure error handling.
	•	Advocated for DevSecOps integration to automate scanning and patch management.

Technologies: Java | Spring Boot | Maven | OWASP Dependency-Check | NVD CVE Database

Outcome: Strengthened Artemis Financial’s application security posture while aligning with NIST SP 800-53, PCI DSS, and GDPR compliance standards.

⸻

🔒 Project 2 – Practices for Secure Software

Goal: Implement secure communication and cryptography practices to protect data in transit and at rest.

Key Highlights
	•	Implemented RSA-2048 asymmetric encryption for secure key exchange.
	•	Used SHA-256 hashing to ensure data integrity and prevent tampering.
	•	Generated and deployed digital certificates using Java Keytool.
	•	Followed secure coding standards: input validation, no hard-coded keys, and least-privilege principles.
	•	Demonstrated functional and secondary testing with successful execution and checksum verification.

Technologies: Java | RSA-2048 | SHA-256 | Java Keytool | HTTPS | OWASP Secure Coding Practices

Outcome: Validated the importance of strong cryptography and secure coding in protecting sensitive client-server communications.
