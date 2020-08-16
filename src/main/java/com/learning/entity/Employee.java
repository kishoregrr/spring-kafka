package com.learning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * CREATE TABLE employee ( id INT NOT null,
 *   first_name VARCHAR (45) DEFAULT NULL,
 *   last_name VARCHAR (45) DEFAULT NULL,
 *   email VARCHAR (45) DEFAULT null,
 *   PRIMARY KEY (id)
 * )
 *
 * commit
 *
 * INSERT INTO ecomdashboard.employee VALUES
 * 	(1,'Leslie','Andrews','leslie@luv2code.com'),
 * 	(2,'Emma','Baumgarten','emma@luv2code.com'),
 * 	(3,'Avani','Gupta','avani@luv2code.com'),
 * 	(4,'Yuri','Petrov','yuri@luv2code.com'),
 * 	(5,'Juan','Vega','juan@luv2code.com');
 *
 *
 */

@Entity
@Table(name = "employee")
public class Employee {
    // define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


    // define constructors

    public Employee() {

    }

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // define tostring

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
    }

}
