-- Insert categories first
INSERT INTO category (id, name) VALUES
    (1, 'Beauty'),
    (2, 'Electronics'),
    (3, 'Clothing')
ON CONFLICT (id) DO NOTHING;

INSERT INTO product (
    name, description, available_quantity, price, rating, stock,
    thumbnail, images, brand, category_id
) VALUES
    (
        'Essence Mascara Lash Princess',
        'The Essence Mascara Lash Princess is a popular mascara known for its volumizing and lengthening effects. Achieve dramatic lashes with this long-lasting and cruelty-free formula.',
        99, 9.99, 2.56, 99,
        'https://cdn.dummyjson.com/product-images/beauty/essence-mascara-lash-princess/thumbnail.webp',
        '["https://cdn.dummyjson.com/product-images/beauty/essence-mascara-lash-princess/1.webp"]',
        'Essence', 1
    ),
    (
        'Eyeshadow Palette with Mirror',
        'The Eyeshadow Palette with Mirror offers a versatile range of eyeshadow shades for creating stunning eye looks. With a built-in mirror, it''s convenient for on-the-go makeup application.',
        34, 19.99, 2.86, 34,
        'https://cdn.dummyjson.com/product-images/beauty/eyeshadow-palette-with-mirror/thumbnail.webp',
        '["https://cdn.dummyjson.com/product-images/beauty/eyeshadow-palette-with-mirror/1.webp"]',
        'Glamour Beauty', 1
    ),
    (
        'Powder Canister',
        'The Powder Canister is a finely milled setting powder designed to set makeup and control shine. With a lightweight and translucent formula, it provides a smooth and matte finish.',
        89, 14.99, 4.64, 89,
        'https://cdn.dummyjson.com/product-images/beauty/powder-canister/thumbnail.webp',
        '["https://cdn.dummyjson.com/product-images/beauty/powder-canister/1.webp"]',
        'Velvet Touch', 1
    ),
    (
        'Red Lipstick',
        'The Red Lipstick is a classic and bold choice for adding a pop of color to your lips. With a creamy and pigmented formula, it provides a vibrant and long-lasting finish.',
        91, 12.99, 4.36, 91,
        'https://cdn.dummyjson.com/product-images/beauty/red-lipstick/thumbnail.webp',
        '["https://cdn.dummyjson.com/product-images/beauty/red-lipstick/1.webp"]',
        'Chic Cosmetics', 1
    ),
    (
        'Red Nail Polish',
        'The Red Nail Polish offers a rich and glossy red hue for vibrant and polished nails. With a quick-drying formula, it provides a salon-quality finish at home.',
        79, 8.99, 4.32, 79,
        'https://cdn.dummyjson.com/product-images/beauty/red-nail-polish/thumbnail.webp',
        '["https://cdn.dummyjson.com/product-images/beauty/red-nail-polish/1.webp"]',
        'Nail Couture', 1
    ),
    (
        'Calvin Klein CK One',
        'CK One by Calvin Klein is a classic unisex fragrance, known for its fresh and clean scent. It''s a versatile fragrance suitable for everyday wear.',
        29, 49.99, 4.37, 29,
        'https://cdn.dummyjson.com/product-images/fragrances/calvin-klein-ck-one/thumbnail.webp',
        '["https://cdn.dummyjson.com/product-images/fragrances/calvin-klein-ck-one/1.webp","https://cdn.dummyjson.com/product-images/fragrances/calvin-klein-ck-one/2.webp","https://cdn.dummyjson.com/product-images/fragrances/calvin-klein-ck-one/3.webp"]',
        'Calvin Klein', 2
    ),
    (
        'Chanel Coco Noir Eau De',
        'Coco Noir by Chanel is an elegant and mysterious fragrance, featuring notes of grapefruit, rose, and sandalwood. Perfect for evening occasions.',
        58, 129.99, 4.26, 58,
        'https://cdn.dummyjson.com/product-images/fragrances/chanel-coco-noir-eau-de/thumbnail.webp',
        '["https://cdn.dummyjson.com/product-images/fragrances/chanel-coco-noir-eau-de/1.webp","https://cdn.dummyjson.com/product-images/fragrances/chanel-coco-noir-eau-de/2.webp","https://cdn.dummyjson.com/product-images/fragrances/chanel-coco-noir-eau-de/3.webp"]',
        'Chanel', 2
    ),
    (
        'Dior J''adore',
        'J''adore by Dior is a luxurious and floral fragrance, known for its blend of ylang-ylang, rose, and jasmine. It embodies femininity and sophistication.',
        98, 89.99, 3.8, 98,
        'https://cdn.dummyjson.com/product-images/fragrances/dior-j''adore/thumbnail.webp',
        '["https://cdn.dummyjson.com/product-images/fragrances/dior-j''adore/1.webp","https://cdn.dummyjson.com/product-images/fragrances/dior-j''adore/2.webp","https://cdn.dummyjson.com/product-images/fragrances/dior-j''adore/3.webp"]',
        'Dior', 2
    ),
    (
        'Dolce Shine Eau de',
        'Dolce Shine by Dolce & Gabbana is a vibrant and fruity fragrance, featuring notes of mango, jasmine, and blonde woods. It''s a joyful and youthful scent.',
        4, 69.99, 3.96, 4,
        'https://cdn.dummyjson.com/product-images/fragrances/dolce-shine-eau-de/thumbnail.webp',
        '["https://cdn.dummyjson.com/product-images/fragrances/dolce-shine-eau-de/1.webp","https://cdn.dummyjson.com/product-images/fragrances/dolce-shine-eau-de/2.webp","https://cdn.dummyjson.com/product-images/fragrances/dolce-shine-eau-de/3.webp"]',
        'Dolce & Gabbana', 2
    ),
    (
        'Gucci Bloom Eau de',
        'Gucci Bloom by Gucci is a floral and captivating fragrance, with notes of tuberose, jasmine, and Rangoon creeper. It''s a modern and romantic scent.',
        91, 79.99, 2.74, 91,
        'https://cdn.dummyjson.com/product-images/fragrances/gucci-bloom-eau-de/thumbnail.webp',
        '["https://cdn.dummyjson.com/product-images/fragrances/gucci-bloom-eau-de/1.webp","https://cdn.dummyjson.com/product-images/fragrances/gucci-bloom-eau-de/2.webp","https://cdn.dummyjson.com/product-images/fragrances/gucci-bloom-eau-de/3.webp"]',
        'Gucci', 2
    );