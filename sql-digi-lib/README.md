# Digital Library Audit (SQL)



This project is a simple SQL-based system to manage a digital library.
It tracks books, students, and issued books, and generates useful reports.


## Technologies Used

* MySQL
* SQL

---

## Tables Used

* **Books** – stores book details
* **Students** – stores student details
* **IssuedBooks** – tracks borrowed books

---

## Features

### Overdue Books

Finds books that are not returned within 14 days.


### Popular Categories

Shows which book categories are borrowed the most.

### Inactive Students

Identifies students who have not borrowed books for a long time.

---

## How to Run

1. Create database:

```sql
CREATE DATABASE library_db;
USE library_db;
```

2. Run files in order:

* `structure.sql`
* `random_data.sql`
* `queries.sql`

---

## Sample Output

### Overdue Books

![Overdue](../docs/../screenshots/overdue.png)

---

### Category Analysis

![Category](../docs/../screenshots/category.png)

---

## Author

Jishnu
