import { Outlet, Link } from 'react-router-dom';

function App() {
  return (
    <div className="p-4">
      <nav className="flex gap-4 border-b pb-2 mb-4">
        <Link to="/">Home</Link>
        <Link to="/order">Place Order</Link>
      </nav>
      <Outlet />
    </div>
  );
}

export default App;
