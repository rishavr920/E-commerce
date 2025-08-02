-- Insert categories
INSERT INTO category (name, description) VALUES
('Electronics', 'Devices, gadgets and accessories'),
('Fashion', 'Clothing and apparel'),
('Home & Kitchen', 'Appliances and furniture');

-- Insert sample products
INSERT INTO product (name, description, available_quantity, price, rating, stock, thumbnail, images, brand, category_id) VALUES
('iPhone 15', 'Latest Apple iPhone', 50, 79999.99, 4.8, 50, 'iphone15.png', '["iphone15_front.png","iphone15_back.png"]', 'Apple', 1),
('Samsung Galaxy S23', 'Latest Samsung flagship', 30, 69999.99, 4.7, 30, 's23.png', '["s23_front.png","s23_back.png"]', 'Samsung', 1),
('Levi''s Jeans', 'Blue denim jeans', 100, 1999.99, 4.2, 100, 'levis_jeans.png', '["levis_front.png","levis_back.png"]', 'Levis', 2),
('Sofa Set', '3-seater sofa for living room', 10, 15999.99, 4.5, 10, 'sofa.png', '["sofa_front.png","sofa_side.png"]', 'Ikea', 3);
