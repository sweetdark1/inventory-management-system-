# inventory-management-system-
mohammad dadoa 1181622

this  is my inventory management system designed to provide a platform for managing products, suppliers, orders, and waste.

## Description

This project consists of a backend system for an inventory management system. It includes the following resources:

- **Product**: Represents the products available in the inventory our system. Each product has a unique identifier, name, price, and is associated with a supplier.
- **Supplier**: Represents the suppliers who provide products to the inventory. Each supplier has a unique identifier, name, and contact information.
- **Wasted**: Tracks the instances where products are wasted due to various reasons. Each waste record includes a unique identifier, the product wasted, the quantity wasted, and the reason for wastage.
- **Orders**: Manages the orders placed by customers. Each order has a unique identifier, the product ordered, the quantity ordered, the order date, and the delivery date.
  
note that more resources can be added in the future to make the system smoother and more accurte. 
## How to Run the Application
this part will be added after the implementation

# Entity-Relationship Diagram (ERD)

![diagram-export-4-8-2024-12_26_14-AM](https://github.com/sweetdark1/inventory-management-system-/assets/97196200/63f551b0-7963-4337-8826-2adf0792a418)

## Entities

### Product
  - product_id (Primary Key)
  - product_name
  - price
  - supplier_id (Foreign Key referencing Supplier)

### Supplier
  - supplier_id (Primary Key)
  - supplier_name
  - contact_info

### Wasted
  - wasted_id (Primary Key)
  - product_id (Foreign Key referencing Product)
  - quantity
  - reason

### Orders
  - order_id (Primary Key)
  - product_id (Foreign Key referencing Product)
  - quantity
  - order_date
  - delivery_date

| Collection Resource (/users) | HTTP request (method URI) | Operation Description | HTTP status codes | Request sample | Response sample |
|-------------------------------|----------------------------|-----------------------|-------------------|----------------|-----------------|
| POST /users                   | Create                     | Create a new user     | 201 (Created): New user created successfully <br> 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to create user <br> 404 (Not Found): Resource not found | Sample request body for creating a new user | Sample response body for successful user creation |
| GET /users                   | Read                     | Retrieve list of users     | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to access resource <br> 404 (Not Found): Resource not found | N/A | Sample response body for retrieving list of users |
| GET /users/{id}             | Read user info           | Retrieve user info by ID    | 200 (OK): Request successful <br> 404 (Not Found): User not found | N/A | Sample response body for retrieving user info |
| PUT /users/{id}             | Update/Replace           | Replace user info by ID      | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to update user <br> 404 (Not Found): User not found | Sample request body for updating user info | Sample response body for successful user info update |
| PATCH /users/{id}           | Partial Update/Modify    | Modify specific user attributes by ID | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to update user <br> 404 (Not Found): User not found | Sample request body for partial user info update | Sample response body for successful partial user info update |
| DELETE /users/{id}          | Delete                    | Delete user by ID             | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to delete user <br> 404 (Not Found): User not found | N/A | Sample response body for successful user deletion |
