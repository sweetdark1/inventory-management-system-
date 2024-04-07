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

| Collection Resource              | HTTP request (method URI)   | Operation Description                  | HTTP status codes                                                 | Request sample                            | Response sample                              |
|---------------------------------|------------------------------|----------------------------------------|--------------------------------------------------------------------|-------------------------------------------|----------------------------------------------|
| POST /products                  | Create                       | Create a new product                  | 201 (Created): New product created successfully <br> 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to create product <br> 404 (Not Found): Resource not found | Sample request body for creating a new product | Sample response body for successful product creation |
| GET /products                   | Read                         | Retrieve list of products             | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to access resource <br> 404 (Not Found): Resource not found | N/A                                       | Sample response body for retrieving list of products |
| GET /products/{id}              | Read product info            | Retrieve product info by ID           | 200 (OK): Request successful <br> 404 (Not Found): Product not found | N/A                                       | Sample response body for retrieving product info |
| PUT /products/{id}              | Update/Replace               | Replace product info by ID            | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to update product <br> 404 (Not Found): Product not found | Sample request body for updating product info | Sample response body for successful product info update |
| PATCH /products/{id}            | Partial Update/Modify        | Modify specific product attributes by ID | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to update product <br> 404 (Not Found): Product not found | Sample request body for partial product info update | Sample response body for successful partial product info update |
| DELETE /products/{id}           | Delete                       | Delete product by ID                  | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to delete product <br> 404 (Not Found): Product not found | N/A                                       | Sample response body for successful product deletion |
| POST /suppliers                 | Create                       | Create a new supplier                 | 201 (Created): New supplier created successfully <br> 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to create supplier <br> 404 (Not Found): Resource not found | Sample request body for creating a new supplier | Sample response body for successful supplier creation |
| GET /suppliers                  | Read                         | Retrieve list of suppliers            | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to access resource <br> 404 (Not Found): Resource not found | N/A                                       | Sample response body for retrieving list of suppliers |
| GET /suppliers/{id}             | Read supplier info           | Retrieve supplier info by ID          | 200 (OK): Request successful <br> 404 (Not Found): Supplier not found | N/A                                       | Sample response body for retrieving supplier info |
| PUT /suppliers/{id}             | Update/Replace               | Replace supplier info by ID           | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to update supplier <br> 404 (Not Found): Supplier not found | Sample request body for updating supplier info | Sample response body for successful supplier info update |
| PATCH /suppliers/{id}           | Partial Update/Modify        | Modify specific supplier attributes by ID | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to update supplier <br> 404 (Not Found): Supplier not found | Sample request body for partial supplier info update | Sample response body for successful partial supplier info update |
| DELETE /suppliers/{id}          | Delete                       | Delete supplier by ID                 | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to delete supplier <br> 404 (Not Found): Supplier not found | N/A                                       | Sample response body for successful supplier deletion |
| POST /wastage                   | Create                       | Record wasted product                 | 201 (Created): Wastage recorded successfully <br> 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to create wastage record <br> 404 (Not Found): Resource not found | Sample request body for recording wasted product | Sample response body for successful wastage record |
| GET /wastage                    | Read                         | Retrieve list of wasted products      | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to access resource <br> 404 (Not Found): Resource not found | N/A                                       | Sample response body for retrieving list of wasted products |
| GET /wastage/{id}               | Read wastage info            | Retrieve wastage info by ID           | 200 (OK): Request successful <br> 404 (Not Found): Wastage record not found | N/A                                       | Sample response body for retrieving wastage info |
| PUT /wastage/{id}               | Update/Replace               | Replace wastage info by ID            | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to update wastage record <br> 404 (Not Found): Wastage record not found | Sample request body for updating wastage info | Sample response body for successful wastage info update |
| PATCH /wastage/{id}             | Partial Update/Modify        | Modify specific wastage attributes by ID | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to update wastage record <br> 404 (Not Found): Wastage record not found | Sample request body for partial wastage info update | Sample response body for successful partial wastage info update |
| DELETE /wastage/{id}            | Delete                       | Delete wastage record by ID           | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to delete wastage record <br> 404 (Not Found): Wastage record not found | N/A                                       | Sample response body for successful wastage record deletion |
| POST /orders                    | Create                       | Place a new order                     | 201 (Created): New order placed successfully <br> 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to place order <br> 404 (Not Found): Resource not found | Sample request body for placing a new order | Sample response body for successful order placement |
| GET /orders                     | Read                         | Retrieve list of orders               | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to access resource <br> 404 (Not Found): Resource not found | N/A                                       | Sample response body for retrieving list of orders |
| GET /orders/{id}                | Read order info              | Retrieve order info by ID             | 200 (OK): Request successful <br> 404 (Not Found): Order not found | N/A                                       | Sample response body for retrieving order info |
| PUT /orders/{id}                | Update/Replace               | Replace order info by ID              | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to update order <br> 404 (Not Found): Order not found | Sample request body for updating order info | Sample response body for successful order info update |
| PATCH /orders/{id}              | Partial Update/Modify        | Modify specific order attributes by ID | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to update order <br> 404 (Not Found): Order not found | Sample request body for partial order info update | Sample response body for successful partial order info update |
| DELETE /orders/{id}             | Delete                       | Delete order by ID                    | 200 (OK): Request successful <br> 400 (Bad Request): Client error, request syntax malformed or parameters invalid <br> 401 (Unauthorized): User authentication required <br> 403 (Forbidden): User does not have permission to delete order <br> 404 (Not Found): Order not found | N/A                                       | Sample response body for successful order deletion |
