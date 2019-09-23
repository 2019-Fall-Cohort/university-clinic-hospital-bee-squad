# University Clinic Hospital

## Module 1 Mastery Project

### Team Members

- Barbara Taylor
- Brian Bross

### Defaults and Classes
Upon running the application, the following will be true.
- An empty EmployeeRoster will be initiated.  The user will be prompted to enter employee information.  If no employees are entered, some of the functions with produce an error and return the user to the main menu.
    -All employees will have the following characteristics:
        +Name
        +Employee Number
        +Salary
        +Whether or not they have been paid
    - there are 4 classes of employees
        +Doctors are paid $90k and will require further user input for Specialty
        +Nurses are paid $50k and will require further user input for Number Of Patients in their care
        +Receptionists are paid $45k and will require further user input for whether or not they are on the phone
        +Janitors are paid $40k and will require further user input for whether or not they are sweeping
- A PatientGroup will be initiated with 3 default patients.
    - The user will have the option to add more patients
    - Each patient, both default and user added, will start with a Blood Level of 20 and a Health Level of 10

### Functions
With the guidance of on-screen prompts, the user will have the ability to
    -Add an employee to the roster
    -Admit another patient to the hospital
    -Check the employee roster
    -Send all Doctors on their rounds
        +When doctors do blood work, they draw 1 unit of blood and increase the patients health level by 2x
    -Send all Nurses on their rounds
        +When nursees do blood work, they draw 2 units of blood and increase the patients health level by 1x
    -Pay all employees
        
### Concepts Used in This Module

BASE CLASS = Superclass = Parent class: This is a class that another class inherits member variables and/or methods from.

DERIVED CLASS = Subclass = Child class: This is a class that inherits member variables and/or methods from a Base class.

A derived class can OVERRIDE a method and/or a member variable from a superclass from which it inherits. An instance of the derived class will perform the method as the OVERRIDE in the derived class, not as in the superclass. This allows "polymorphism", i.e., more specific methods in the derived class that apply only to it.

A VIRTUAL METHOD is one that overrides the corresponding method in the superclass.

The concept of ABSTRACTION is one of the 4 major concepts (APIE) of object-oriented programming. Concepts in the real world are "abstracted out" and made into a more abstract object. For example, the Employee class is a more abstract class because it can encompass the more specific classes of Nurse, Doctor, etc.
                
