# users-management-API
The project focuses on developing a User Management API that will provide a set of endpoints and functionalities to manage and handle user information in an application or system. The API will allow the creation, retrieval, update, and deletion of users, as well as authentication and authorization of users.

### **Objectives**

- Create a robust and secure User Management API using an API-First approach.
- Provide functionalities to register new users in the system.
- Enable querying of existing user information.
- Implement mechanisms to update user data.
- Include options to delete users from the system.
- Implement an authentication and authorization system to ensure proper access to API resources.

### **Key Features**

- There will be 3 different types of users of the applications.
    - Users. These ones are common users that are no yet registered in the system. They can do the following actions.
        - Register into the system.
            - A confirmation email will be sent when users succesfully registered.
    - Registered-User. These users have already created an account. They can perform the following actions:
        - Get their account information.
        - Update their account details.
        - Upload a profile picture.
            - This profile picture will be pending to approve for an user admin.
        - Disable their accounts.
    - Admin-User. These special kind of user can not be manually registered, only another admin-user can create them. They can perform the        following actions:
        - Get all users of the system.
        - Search u.
        - Get any user of the system information.
        - Get pending profile pictures to be approved.
        - Approve or deny profile pictures.
        - Update registered-users information.
        - Disable registered-users accounts.
        - Delete registered-user accounts.
    
- Authentication and Authorization.
    - The API will include an authentication system to verify user credentials and grant access to protected resources.
    - Authorization mechanisms will be implemented to define user permissions and privileges, controlling their access to different functionalities and data.
    - The app will allow users to register and login into the system using 3rd party integrations such as Google Account or Github Account.
- Documentation and Testing:
    - Clear and comprehensive documentation of the API will be automatically generated, describing the endpoints, parameters, and corresponding responses.
    - Thorough testing will be conducted to ensure the proper functioning of the API in various scenarios and edge cases.

### **Technologies**

- Java 17
- Springboot
- MongoDB
- Swagger-UI
- RabbitMQ
- Docker
- Hexagonal Architecture
- TDD
- BDD
