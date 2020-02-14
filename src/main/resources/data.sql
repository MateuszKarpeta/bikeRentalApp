INSERT INTO bike_type (type)
VALUES ('E_BIKE'),
       ('MOUNTAIN_BIKE'),
       ('ROAD_BIKE');

INSERT INTO brand (brand_name)
VALUES ('Giant'),
       ('BMC');

INSERT INTO bike (id, bike_type, frame_size, name, price, model_year, brand)
VALUES (1, 1, 'L', 'Specialized SuperGalactix', 30, 2018, 1),
       (2, 2, 'M', 'BMC Teamelite 03 TWO MTB', 35, 2019, 2);

INSERT INTO brand_bikes (brand_id, bikes_id)
VALUES (1, 1),
       (2, 2);

INSERT INTO discount (name, value)
VALUES ('PROMO5',0.05),
       ('PROMO10',0.1);


