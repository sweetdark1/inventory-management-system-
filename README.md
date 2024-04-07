# inventory-management-system-
mohammad dadoa 1181622
# Entity-Relationship Diagram (ERD)

## Entities

### Product
- Attributes:
  - product_id (Primary Key)
  - product_name
  - price
  - supplier_id (Foreign Key referencing Supplier)

### Supplier
- Attributes:
  - supplier_id (Primary Key)
  - supplier_name
  - contact_info

### Wasted
- Attributes:
  - wasted_id (Primary Key)
  - product_id (Foreign Key referencing Product)
  - quantity
  - reason

### Orders
- Attributes:
  - order_id (Primary Key)
  - product_id (Foreign Key referencing Product)
  - quantity
  - order_date
  - delivery_date
