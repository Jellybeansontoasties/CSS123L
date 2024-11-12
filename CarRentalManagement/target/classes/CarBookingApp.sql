DROP DATABASE IF EXISTS CarRentalSystem;
CREATE DATABASE CarRentalSystem;
USE CarRentalSystem;

CREATE TABLE Car (
    car_id INT PRIMARY KEY AUTO_INCREMENT,  -- Unique identifier for each car
    description TEXT,                       -- A brief description of the car
    model VARCHAR(100),                     -- Model of the car (e.g., Corolla, Civic)
    brand VARCHAR(100),                     -- Brand of the car (e.g., Toyota, Honda)
    price DECIMAL(10, 2),                   -- Price per rental period (e.g., per day)
    status VARCHAR(20)                      -- Status of the car (e.g., available, rented, maintenance)
);

CREATE TABLE Rental (
    rental_id INT PRIMARY KEY AUTO_INCREMENT, -- Unique identifier for each rental
    car_id INT,                               -- Foreign key referencing the Car table
    start_date DATE,                          -- Start date of the rental
    end_date DATE,                            -- End date of the rental
    FOREIGN KEY (car_id) REFERENCES Car(car_id)  -- Ensure referential integrity with Car table
);

-- Filter Tables
CREATE TABLE Brand (
    brand_id INT PRIMARY KEY AUTO_INCREMENT, -- Unique identifier for each brand
    brand_name VARCHAR(100)                  -- Brand name (e.g., Toyota, Honda)
);
CREATE TABLE Model (
    model_id INT PRIMARY KEY AUTO_INCREMENT, -- Unique identifier for each model
    model_name VARCHAR(100),                 -- Model name (e.g., Corolla, Civic)
    brand_id INT,                            -- Foreign key referencing the Brand table
    FOREIGN KEY (brand_id) REFERENCES Brand(brand_id)
);

-- Dump

-- Car Data

INSERT INTO Car (description, model, brand, price, status) VALUES
('A compact sedan with excellent fuel efficiency and a comfortable ride.', 'Civic', 'Honda', 50.00, 'available'),
('A luxury sedan with a spacious interior and advanced safety features.', 'Accord', 'Honda', 80.00, 'available'),
('A family SUV with three rows of seating and great towing capacity.', 'Highlander', 'Toyota', 120.00, 'rented'),
('A stylish coupe with a turbocharged engine and a sporty drive.', 'Mustang', 'Ford', 100.00, 'available'),
('A full-size pickup truck with off-road capabilities and high towing capacity.', 'F-150', 'Ford', 110.00, 'available'),
('A compact hatchback with nimble handling and a budget-friendly price.', 'Mazda3', 'Mazda', 45.00, 'maintenance'),
('An electric vehicle with impressive range and modern features.', 'Model 3', 'Tesla', 150.00, 'available'),
('A practical compact car with a reputation for reliability and fuel efficiency.', 'Corolla', 'Toyota', 45.00, 'rented'),
('A luxury crossover SUV with cutting-edge technology and a comfortable ride.', 'RX', 'Lexus', 95.00, 'available'),
('A classic sports car with exceptional performance and an iconic design.', '911', 'Porsche', 250.00, 'available'),
('An all-electric luxury SUV with premium features and advanced tech.', 'Model X', 'Tesla', 175.00, 'rented'),
('A rugged off-road vehicle with a powerful engine and premium interior.', 'Wrangler', 'Jeep', 110.00, 'available'),
('A full-size sedan with a smooth ride and a sleek design.', 'Malibu', 'Chevrolet', 70.00, 'available'),
('A midsize crossover with efficient fuel economy and a spacious cabin.', 'Santa Fe', 'Hyundai', 75.00, 'available'),
('A compact luxury sedan with a smooth drive and refined styling.', 'A4', 'Audi', 90.00, 'available'),
('A family minivan with ample seating and generous storage space.', 'Odyssey', 'Honda', 85.00, 'rented'),
('A budget-friendly sedan with a comfortable interior and decent features.', 'Sonata', 'Hyundai', 55.00, 'available'),
('A sleek hatchback with modern styling and a turbocharged engine.', 'Golf', 'Volkswagen', 65.00, 'available'),
('A midsize sedan with a comfortable ride and an efficient hybrid engine.', 'Camry Hybrid', 'Toyota', 80.00, 'available'),
('A luxury SUV with spacious interiors and cutting-edge tech features.', 'X5', 'BMW', 150.00, 'available'),
('A compact SUV with high safety ratings and a smooth drive.', 'RAV4', 'Toyota', 95.00, 'available'),
('A high-performance SUV with impressive speed and handling.', 'Porsche Cayenne', 'Porsche', 200.00, 'rented'),
('A family-friendly SUV with three rows of seats and ample cargo space.', 'Pilot', 'Honda', 110.00, 'available'),
('A high-performance luxury sedan with a sleek design and powerful engine.', 'M5', 'BMW', 160.00, 'available'),
('A sporty hatchback with great handling and a turbocharged engine.', 'Mini Cooper', 'BMW', 75.00, 'available'),
('An eco-friendly compact car with excellent fuel efficiency and a small footprint.', 'Prius', 'Toyota', 60.00, 'available');

-- Rental Data

INSERT INTO Rental (car_id, start_date, end_date) VALUES
(1, '2024-11-01', '2024-11-05'),  -- Civic, rented for 4 days
(2, '2024-11-03', '2024-11-07'),  -- Accord, rented for 4 days
(3, '2024-10-15', '2024-10-20'),  -- Highlander, rented for 5 days
(4, '2024-11-02', '2024-11-06'),  -- Mustang, rented for 4 days
(5, '2024-11-01', '2024-11-05'),  -- F-150, rented for 4 days
(6, '2024-09-28', '2024-10-02'),  -- Mazda3, rented for 4 days
(7, '2024-11-03', '2024-11-10'),  -- Model 3, rented for 7 days
(8, '2024-10-25', '2024-10-30'),  -- Corolla, rented for 5 days
(9, '2024-10-20', '2024-10-22'),  -- RX, rented for 2 days
(10, '2024-11-01', '2024-11-04'), -- 911, rented for 3 days
(11, '2024-09-10', '2024-09-14'), -- Model X, rented for 4 days
(12, '2024-11-05', '2024-11-12'), -- Wrangler, rented for 7 days
(13, '2024-11-01', '2024-11-06'), -- Malibu, rented for 5 days
(14, '2024-10-22', '2024-10-29'), -- Santa Fe, rented for 7 days
(15, '2024-11-03', '2024-11-06'), -- A4, rented for 3 days
(16, '2024-09-15', '2024-09-20'), -- Odyssey, rented for 5 days
(17, '2024-11-02', '2024-11-04'), -- Sonata, rented for 2 days
(18, '2024-10-05', '2024-10-08'), -- Golf, rented for 3 days
(19, '2024-11-01', '2024-11-07'), -- Camry Hybrid, rented for 6 days
(20, '2024-10-18', '2024-10-22'), -- X5, rented for 4 days
(21, '2024-11-04', '2024-11-08'), -- RAV4, rented for 4 days
(22, '2024-10-10', '2024-10-15'), -- Porsche Cayenne, rented for 5 days
(23, '2024-11-01', '2024-11-03'), -- Pilot, rented for 2 days
(24, '2024-09-30', '2024-10-05'), -- M5, rented for 5 days
(25, '2024-10-12', '2024-10-15'); -- Mini Cooper, rented for 3 days

-- Brand Table
INSERT INTO Brand (brand_name) VALUES
('Honda'),
('Toyota'),
('Ford'),
('Mazda'),
('Tesla'),
('Lexus'),
('Porsche'),
('Chevrolet'),
('Hyundai'),
('Audi'),
('BMW'),
('Volkswagen'),
('Jeep'),
('Mini');

-- Model Table 
INSERT INTO Model (model_name, brand_id) VALUES
('Civic', 1),           -- Honda
('Accord', 1),          -- Honda
('Highlander', 2),      -- Toyota
('Corolla', 2),         -- Toyota
('F-150', 3),           -- Ford
('Mustang', 3),         -- Ford
('Mazda3', 4),          -- Mazda
('Model 3', 5),         -- Tesla
('Model X', 5),         -- Tesla
('RX', 6),              -- Lexus
('911', 7),             -- Porsche
('Malibu', 8),          -- Chevrolet
('Santa Fe', 9),        -- Hyundai
('A4', 10),             -- Audi
('X5', 11),             -- BMW
('Golf', 12),           -- Volkswagen
('Wrangler', 13),       -- Jeep
('Odyssey', 1),         -- Honda
('Porsche Cayenne', 7), -- Porsche
('RAV4', 2),            -- Toyota
('Camry Hybrid', 2),    -- Toyota
('M5', 11),             -- BMW
('Pilot', 1),           -- Honda
('Mini Cooper', 13);    -- Mini

CREATE VIEW available_cars AS
SELECT c.car_id, c.model, c.brand, c.price, c.status
FROM Car c
WHERE c.status = 'available';

CREATE VIEW cars_in_price_range AS
SELECT c.car_id, c.model, c.brand, c.price, c.status
FROM Car c
WHERE c.price BETWEEN 50 AND 100;

