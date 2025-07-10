import { useState } from 'react';
import axios from 'axios';

export default function Order() {
  const [productId, setProductId] = useState('');
  const [quantity, setQuantity] = useState(1);
  const [result, setResult] = useState<any>(null);

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    try {
      const res = await axios.post('http://localhost:8080/orders', {
        productId,
        quantity
      });
      setResult(res.data);
    } catch (err) {
      console.error('Order failed', err);
      setResult({ error: 'Order failed' });
    }
  };

  return (
    <div>
      <h1 className="text-xl font-bold mb-4">Place an Order</h1>
      <form onSubmit={handleSubmit} className="flex flex-col gap-2 max-w-md">
        <input
          className="border p-2"
          placeholder="Product ID"
          value={productId}
          onChange={e => setProductId(e.target.value)}
          required
        />
        <input
          className="border p-2"
          type="number"
          min="1"
          value={quantity}
          onChange={e => setQuantity(parseInt(e.target.value))}
          required
        />
        <button type="submit" className="bg-blue-600 text-white p-2 rounded">Submit</button>
      </form>

      {result && (
        <div className="mt-4 p-4 bg-gray-100">
          <pre>{JSON.stringify(result, null, 2)}</pre>
        </div>
      )}
    </div>
  );
}
