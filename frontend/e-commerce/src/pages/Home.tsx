import { useEffect, useState } from 'react';
import axios from 'axios';

type Product = {
  id: number;
  title: string;
  price: number;
  description: string;
  thumbnail: string;
};

export default function Home() {
  const [products, setProducts] = useState<Product[]>([]);

  useEffect(() => {
    axios.get<{ products: Product[] }>('https://dummyjson.com/products')
      .then(res => setProducts(res.data.products))
      .catch(err => console.error('Failed to fetch products', err));
  }, []);

  return (
    <div>
      <h1 className="text-xl font-bold mb-4">Product List</h1>
      <ul className="grid gap-4 grid-cols-1 sm:grid-cols-2 lg:grid-cols-4">
        {products.map(p => (
          <li key={p.id} className="border p-4 rounded shadow">
            <img src={p.thumbnail} alt={p.title} className="w-full h-48 object-cover mb-2 rounded" />
            <h2 className="font-semibold text-lg">{p.title}</h2>
            <p className="text-sm text-gray-600 mb-2">{p.description}</p>
            <p className="text-green-700 font-bold text-lg">₹{p.price}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}
