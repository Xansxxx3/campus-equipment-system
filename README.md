# Campus Equipment System

Welcome to the **Campus Equipment System** (CES), a backend system designed to help students loan and track campus equipment, monitor loan due dates, and calculate penalties for overdue items.

This system allows students to manage their equipment loans through simple commands and track important information like loan duration, due dates, and penalties if items are returned late.

## Features
- **Equipment Loaning**: Students can loan various equipment for a specified period.
- **Due Date Tracking**: The system automatically keeps track of when the equipment is due to be returned.
- **Penalty Calculation**: If the equipment is returned after the due date, a penalty is applied.
- **Loan History**: Students can view their past and current equipment loans, including due dates and penalties.

## Core Functionality

### 1. Loaning Equipment
Students can request to borrow various types of campus equipment. The system allows the user to specify:
- **Equipment**: The type of equipment being loaned (e.g., laptop, projector, camera).
- **Loan Period**: The duration for which the student wishes to borrow the equipment (e.g., 3 days, 1 week).
- **Due Date**: The system automatically calculates and assigns the due date based on the loan period.

### 2. Tracking Due Dates
Once equipment is loaned, the system keeps track of the following:
- **Loan Start Date**: The date when the equipment was loaned.
- **Loan Due Date**: The expected date of return for the equipment.
- **Loan Status**: Indicates whether the loan is active, overdue, or returned.

### 3. Penalty Calculation
If a loan is overdue, the system calculates the penalty based on predefined rules. Penalties are calculated as follows:
- **Late Fee**: A fixed fee is charged for each day the equipment is overdue.
- **Maximum Penalty**: The system caps the penalty after a certain threshold to avoid excessive charges.

### 4. Loan History
Students can access their loan history to see:
- **Current Loans**: A list of currently borrowed items, along with due dates and penalties.
- **Past Loans**: A record of previously borrowed items, including return dates and penalties (if applicable).

## How It Works

1. **Loan Request**: When a student requests to borrow equipment, the system records the equipment, the loan period, and calculates the due date.
2. **Return Equipment**: Upon returning the equipment, the system checks if the item is returned late. If it's overdue, it applies the penalty.
3. **View Loan History**: Students can query their loan history to view details about past and current loans, including penalties for late returns.

## Penalty System

The penalty system works as follows:
- A fixed penalty is charged for each day an item is overdue.
- Example: If the fixed penalty is P50 per day and a laptop is returned 5 days late, the penalty will be **P250**.
- There may be a cap on penalties to prevent excessive charges, such as a maximum fine of $50, after which no further penalties are applied.

### Penalty Calculation Example:
- **Item**: Laptop
- **Loan Period**: 7 days
- **Return Date**: 9 days after the loan start date
- **Late Fee**: P50/day
- **Total Penalty**: 2 days * P50/day = **P50**



#### v1.0.0
- Initial release of the system with basic loaning, tracking, and penalty functionality.

---

Thank you for using the Campus Equipment System. We hope this helps streamline the management of campus equipment and ensures timely returns.
