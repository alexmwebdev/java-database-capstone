## **Title: Doctor**

### User Story 1 – Doctor Login

_As a doctor, I want to log into the portal, so that I can manage my appointments.

**Acceptance Criteria:**
Given I am registered as a doctor, when I enter my valid credentials on the login page, I should be redirected to the doctor dashboard and see my upcoming schedule.

**Priority:** [Medium]

---

### User Story 2 – Doctor Logout

_As a doctor, I want to log out of the portal, so that I can protect my session and personal data.

**Acceptance Criteria:**
Given I am logged in as a doctor, when I click the logout button I should be logged out and redirected to the homepage and my session should be destroyed.

**Priority:** [Low]

---

### User Story 3 – View Appointment Calendar

_As a doctor, I want to view my appointment calendar, so that I can organize my work schedule.

**Acceptance Criteria:**
Given I am logged in, when I navigate to the calendar, I should see all of my appointments for any day/week/month in a visual way.

**Priority:** [High]

---

### User Story 4 – Mark Unavailability

_As a doctor, I want to mark specific times as unavailable, so that patients cannot book during those periods.

**Acceptance Criteria:**
Given I am logged in, when I mark certain time slots as unavailable, the system should block those slots from being booked by the patients.

**Priority:** [High]

---

### User Story 5 – View Patient Details

_As a doctor, I want to view patient details for each appointment, so that I can be better prepared for consultations.

**Acceptance Criteria:**
Given I have scheduled appointments, when I click on a specific appointment, I should see the patient's name, reason for visit, and their basic history.

**Priority:** [High]


## **Role: Admin**

---

### User Story 1 – Admin Login

_As an admin, I want to log into the portal with my credentials, so that I can securely manage the system.

**Acceptance Criteria:**
Given I am on the login page, when I enter valid admin credentials I should be redirected to the admin dashboard and my session should be authenticated in a secure way.

**Priority:** [Medium]

---

### User Story 2 – Admin Logout

_As an admin, I want to log out of the portal, so that I can end my session securely.

**Acceptance Criteria:**
Given I am logged in as an admin, when I click the logout button, I should be logged out and redirected to the login screen and my session should be destroyed.

**Priority:** [Low]

---

### User Story 3 – Add Doctor

_As an admin, I want to add doctors to the system, so that they can manage appointments.

**Acceptance Criteria:**
Given I am on the "Add Doctor" form, When I submit valid doctor information, the doctor profile should be saved to the MySQL database and can be seen in the doctor list.

**Priority:** [High]

---

### User Story 4 – Delete Doctor Profile

_As an admin, I want to delete a doctor's profile, so that I can manage active practitioners.

**Acceptance Criteria:**
Given a doctor has no future appointments, when I click on the "Delete" button in their profile, the record should be removed from the system, and their appointments should not be seen.

**Priority:** [High]

---

### User Story 5 – View Monthly Appointments

_As an admin, I want to run a MySQL stored procedure to get monthly appointment counts, so that I can track platform usage.

**Acceptance Criteria:**
Given I have access to the MySQL database, when I run the appointment_stats procedure, the list of appointments grouped by month should be shown.

**Priority:** [High]



## **Title: Patient**

### User Story 1 – View Doctors Without Logging In

_As a patient, I want to view a list of doctors without logging in, so that I can explore my options before registering.

**Acceptance Criteria:**
Given I can access the doctor listing page and I am not logged in, I should see names, specialties, and contact info of available doctors.
**Priority:** [Medium]

---

### User Story 2 – Patient Sign-Up

_As a patient, I want to sign up using my email and password, so that I can book appointments.

**Acceptance Criteria:**
Given that I am on the signup page, when I submit valid registration details, my account should be created and I should be redirected to the login page.

**Priority:** [Medium]

---

### User Story 3 – Patient Login

_As a patient, I want to log into the portal, so that I can manage my bookings.

**Acceptance Criteria:**
Given that I have a registered account, when I enter valid credentials I should be redirected to my dashboard and be able to appointment management features

**Priority:** [High]

---

### User Story 4 – Book Appointment

_As a patient, I want to book an hour-long appointment, so that I can consult with a doctor.

**Acceptance Criteria:**
Given I am logged in, when I select a doctor, date, and time, the system should verify its availability and confirm the booking.

**Priority:** [High]

---

### User Story 5 – View Upcoming Appointments

_As a patient, I want to view my upcoming appointments, so that I can prepare in advance.

**Acceptance Criteria:**
Given I am logged in, when I visit the "My Appointments" section, I should see a list of all upcoming appointments with relevant details.

**Priority:** [High]