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

