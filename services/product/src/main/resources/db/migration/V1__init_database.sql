CREATE TABLE IF NOT EXISTS category (
  id INT PRIMARY KEY,
  name VARCHAR(100),
  description TEXT
);

CREATE TABLE IF NOT EXISTS product (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  description TEXT,
  available_quantity DOUBLE PRECISION,
  price NUMERIC(10, 2),
  rating NUMERIC(2, 1),  -- ✅ THIS MUST EXIST
  stock INT,
  thumbnail TEXT,
  images JSONB,
  brand VARCHAR(100),
  category_id INT REFERENCES category(id)
);
-- Create sequence for category
CREATE SEQUENCE IF NOT EXISTS category_seq START 1;

-- Create sequence for product (if needed)
CREATE SEQUENCE IF NOT EXISTS product_seq START 1;


CREATE SEQUENCE IF NOT EXISTS category_seq START 1;

