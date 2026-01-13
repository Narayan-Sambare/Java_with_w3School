import React, { useState } from 'react';
import { ShoppingCart, LogOut, Menu, X } from 'lucide-react';

const ECommerceApp = () => {
  const [currentUser, setCurrentUser] = useState(null);
  const [currentPage, setCurrentPage] = useState('login');
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  // Mock data
  const [products] = useState([
    { id: 1, name: 'Laptop', original: 50000, selling: 45000, stock: 20, category: 'Electronics' },
    { id: 2, name: 'Mouse', original: 500, selling: 400, stock: 100, category: 'Electronics' },
    { id: 3, name: 'Keyboard', original: 2000, selling: 1500, stock: 50, category: 'Electronics' },
    { id: 4, name: 'Monitor', original: 15000, selling: 12000, stock: 15, category: 'Electronics' },
    { id: 5, name: 'Headphones', original: 3000, selling: 2500, stock: 30, category: 'Electronics' },
  ]);

  const [employees] = useState([
    { id: 1, name: 'John Doe', position: 'Sales Executive', salary: 30000, hours: 8, bonus: 2000 },
    { id: 2, name: 'Jane Smith', position: 'Manager', salary: 50000, hours: 8, bonus: 5000 },
    { id: 3, name: 'Mike Johnson', position: 'Sales Staff', salary: 25000, hours: 8, bonus: 1500 },
  ]);

  const [cart, setCart] = useState([]);
  const [bills, setBills] = useState([]);
  const [searchTerm, setSearchTerm] = useState('');

  // Authentication
  const handleLogin = (e) => {
    e.preventDefault();
    if (username && password) {
      const userType = username.includes('admin') ? 'admin' : 
                       username.includes('manager') ? 'manager' : 
                       username.includes('emp') ? 'employee' : 'customer';
      setCurrentUser({ username, userType, id: Math.random() });
      setCurrentPage(userType === 'customer' ? 'shop' : 'dashboard');
      setUsername('');
      setPassword('');
    }
  };

  const handleLogout = () => {
    setCurrentUser(null);
    setCurrentPage('login');
    setCart([]);
    setUsername('');
    setPassword('');
  };

  // Cart functions
  const addToCart = (product) => {
    const existingItem = cart.find(item => item.id === product.id);
    if (existingItem) {
      setCart(cart.map(item =>
        item.id === product.id ? { ...item, quantity: item.quantity + 1 } : item
      ));
    } else {
      setCart([...cart, { ...product, quantity: 1 }]);
    }
  };

  const removeFromCart = (productId) => {
    setCart(cart.filter(item => item.id !== productId));
  };

  const generateBill = () => {
    const totalAmount = cart.reduce((sum, item) => sum + (item.selling * item.quantity), 0);
    const tax = totalAmount * 0.05;
    const grandTotal = totalAmount + tax;
    const bill = {
      id: bills.length + 1,
      date: new Date().toLocaleString(),
      items: cart,
      total: totalAmount,
      tax,
      grandTotal,
    };
    setBills([...bills, bill]);
    setCart([]);
    alert(`Bill Generated! Total: ₹${grandTotal.toFixed(2)}`);
    setCurrentPage('shop');
  };

  const filteredProducts = products.filter(p =>
    p.name.toLowerCase().includes(searchTerm.toLowerCase()) ||
    p.category.toLowerCase().includes(searchTerm.toLowerCase())
  );

  // ==================== CUSTOMER PAGES ====================

  const LoginPage = () => (
    <div className="min-h-screen bg-gradient-to-br from-blue-500 to-purple-600 flex items-center justify-center p-4">
      <div className="bg-white rounded-lg shadow-2xl p-8 max-w-md w-full">
        <h1 className="text-3xl font-bold text-center mb-8 text-gray-800">E-Commerce Store</h1>
        <div className="space-y-4">
          <div>
            <label className="block text-gray-700 font-semibold mb-2">Username</label>
            <input
              type="text"
              value={username}
              onChange={(e) => setUsername(e.target.value)}
              placeholder="Enter username"
              className="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500"
            />
          </div>
          <div>
            <label className="block text-gray-700 font-semibold mb-2">Password</label>
            <input
              type="password"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              placeholder="Enter password"
              className="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500"
            />
          </div>
          <button
            onClick={handleLogin}
            className="w-full bg-blue-500 hover:bg-blue-600 text-white font-bold py-2 px-4 rounded-lg transition duration-200"
          >
            Login
          </button>
        </div>
        <p className="text-center text-gray-600 mt-4 text-sm">
          Try: user1, admin1, manager1, emp1 (all with password: pass123)
        </p>
      </div>
    </div>
  );

  const ShopPage = () => (
    <div className="min-h-screen bg-gray-100">
      <nav className="bg-white shadow-md sticky top-0 z-40">
        <div className="max-w-7xl mx-auto px-4 py-4 flex justify-between items-center">
          <h1 className="text-2xl font-bold text-blue-600">Shop</h1>
          <div className="flex gap-4 items-center">
            <button
              onClick={() => setCurrentPage('cart')}
              className="relative bg-blue-500 text-white px-4 py-2 rounded-lg hover:bg-blue-600 flex items-center gap-2"
            >
              <ShoppingCart size={20} />
              Cart ({cart.length})
            </button>
            <button
              onClick={handleLogout}
              className="bg-red-500 text-white px-4 py-2 rounded-lg hover:bg-red-600 flex items-center gap-2"
            >
              <LogOut size={20} />
              Logout
            </button>
          </div>
        </div>
      </nav>

      <div className="max-w-7xl mx-auto px-4 py-8">
        <div className="mb-8">
          <input
            type="text"
            placeholder="Search products..."
            value={searchTerm}
            onChange={(e) => setSearchTerm(e.target.value)}
            className="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500"
          />
        </div>

        <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
          {filteredProducts.map(product => (
            <div key={product.id} className="bg-white rounded-lg shadow-md overflow-hidden hover:shadow-lg transition">
              <div className="p-6">
                <h2 className="text-xl font-bold mb-2">{product.name}</h2>
                <p className="text-gray-600 mb-4">{product.category}</p>
                <div className="flex justify-between items-center mb-4">
                  <div>
                    <p className="text-gray-500 line-through text-sm">₹{product.original}</p>
                    <p className="text-2xl font-bold text-green-600">₹{product.selling}</p>
                  </div>
                  <p className="text-sm bg-blue-100 text-blue-800 px-3 py-1 rounded-full">{product.stock} in stock</p>
                </div>
                <button
                  onClick={() => addToCart(product)}
                  disabled={product.stock === 0}
                  className="w-full bg-blue-500 hover:bg-blue-600 disabled:bg-gray-400 text-white font-bold py-2 px-4 rounded-lg transition"
                >
                  Add to Cart
                </button>
              </div>
            </div>
          ))}
        </div>
      </div>
    </div>
  );

  const CartPage = () => (
    <div className="min-h-screen bg-gray-100">
      <nav className="bg-white shadow-md sticky top-0 z-40">
        <div className="max-w-7xl mx-auto px-4 py-4 flex justify-between items-center">
          <button
            onClick={() => setCurrentPage('shop')}
            className="text-blue-500 hover:text-blue-700 font-semibold"
          >
            ← Back to Shop
          </button>
          <button
            onClick={handleLogout}
            className="bg-red-500 text-white px-4 py-2 rounded-lg hover:bg-red-600"
          >
            Logout
          </button>
        </div>
      </nav>

      <div className="max-w-4xl mx-auto px-4 py-8">
        <h1 className="text-3xl font-bold mb-8">Shopping Cart</h1>
        {cart.length === 0 ? (
          <p className="text-center text-gray-600">Your cart is empty</p>
        ) : (
          <>
            <div className="bg-white rounded-lg shadow-md overflow-hidden mb-8">
              {cart.map(item => (
                <div key={item.id} className="flex justify-between items-center p-6 border-b last:border-b-0">
                  <div>
                    <p className="text-lg font-semibold">{item.name}</p>
                    <p className="text-gray-600">₹{item.selling} x {item.quantity}</p>
                  </div>
                  <div className="flex items-center gap-4">
                    <p className="text-xl font-bold">₹{(item.selling * item.quantity).toFixed(2)}</p>
                    <button
                      onClick={() => removeFromCart(item.id)}
                      className="bg-red-500 text-white px-3 py-1 rounded hover:bg-red-600"
                    >
                      Remove
                    </button>
                  </div>
                </div>
              ))}
            </div>

            <div className="bg-white rounded-lg shadow-md p-6 mb-8">
              <div className="space-y-4">
                <div className="flex justify-between text-lg">
                  <span>Subtotal:</span>
                  <span>₹{cart.reduce((sum, item) => sum + (item.selling * item.quantity), 0).toFixed(2)}</span>
                </div>
                <div className="flex justify-between text-lg">
                  <span>Tax (5%):</span>
                  <span>₹{(cart.reduce((sum, item) => sum + (item.selling * item.quantity), 0) * 0.05).toFixed(2)}</span>
                </div>
                <div className="flex justify-between text-2xl font-bold border-t pt-4">
                  <span>Total:</span>
                  <span>₹{(cart.reduce((sum, item) => sum + (item.selling * item.quantity), 0) * 1.05).toFixed(2)}</span>
                </div>
              </div>
              <button
                onClick={generateBill}
                className="w-full mt-6 bg-green-500 hover:bg-green-600 text-white font-bold py-3 px-4 rounded-lg transition"
              >
                Generate Bill
              </button>
            </div>
          </>
        )}
      </div>
    </div>
  );

  // ==================== ADMIN/MANAGER/EMPLOYEE PAGES ====================

  const DashboardPage = () => (
    <div className="min-h-screen bg-gray-100">
      <nav className="bg-white shadow-md">
        <div className="max-w-7xl mx-auto px-4 py-4 flex justify-between items-center">
          <h1 className="text-2xl font-bold text-blue-600">
            {currentUser.userType.toUpperCase()} Dashboard
          </h1>
          <button
            onClick={handleLogout}
            className="bg-red-500 text-white px-4 py-2 rounded-lg hover:bg-red-600"
          >
            Logout
          </button>
        </div>
      </nav>

      <div className="max-w-7xl mx-auto px-4 py-8">
        {currentUser.userType === 'admin' && <AdminDashboard />}
        {currentUser.userType === 'manager' && <ManagerDashboard />}
        {currentUser.userType === 'employee' && <EmployeeDashboard />}
      </div>
    </div>
  );

  const AdminDashboard = () => (
    <div className="space-y-8">
      <div className="grid grid-cols-1 md:grid-cols-3 gap-6">
        <div className="bg-white p-6 rounded-lg shadow-md">
          <h3 className="text-gray-600 text-sm font-semibold mb-2">Total Products</h3>
          <p className="text-3xl font-bold">{products.length}</p>
        </div>
        <div className="bg-white p-6 rounded-lg shadow-md">
          <h3 className="text-gray-600 text-sm font-semibold mb-2">Total Bills</h3>
          <p className="text-3xl font-bold">{bills.length}</p>
        </div>
        <div className="bg-white p-6 rounded-lg shadow-md">
          <h3 className="text-gray-600 text-sm font-semibold mb-2">Total Employees</h3>
          <p className="text-3xl font-bold">{employees.length}</p>
        </div>
      </div>

      <div className="bg-white rounded-lg shadow-md p-6">
        <h2 className="text-xl font-bold mb-4">All Products</h2>
        <div className="overflow-x-auto">
          <table className="w-full text-sm">
            <thead className="bg-gray-100">
              <tr>
                <th className="px-4 py-3 text-left">Product Name</th>
                <th className="px-4 py-3 text-left">Original Price</th>
                <th className="px-4 py-3 text-left">Selling Price</th>
                <th className="px-4 py-3 text-left">Stock</th>
                <th className="px-4 py-3 text-left">Category</th>
              </tr>
            </thead>
            <tbody>
              {products.map(product => (
                <tr key={product.id} className="border-b hover:bg-gray-50">
                  <td className="px-4 py-3">{product.name}</td>
                  <td className="px-4 py-3">₹{product.original}</td>
                  <td className="px-4 py-3">₹{product.selling}</td>
                  <td className="px-4 py-3">{product.stock}</td>
                  <td className="px-4 py-3">{product.category}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>

      <div className="bg-white rounded-lg shadow-md p-6">
        <h2 className="text-xl font-bold mb-4">All Bills</h2>
        {bills.length === 0 ? (
          <p className="text-gray-600">No bills generated yet</p>
        ) : (
          <div className="overflow-x-auto">
            <table className="w-full text-sm">
              <thead className="bg-gray-100">
                <tr>
                  <th className="px-4 py-3 text-left">Bill ID</th>
                  <th className="px-4 py-3 text-left">Date</th>
                  <th className="px-4 py-3 text-left">Items</th>
                  <th className="px-4 py-3 text-left">Total</th>
                  <th className="px-4 py-3 text-left">Grand Total</th>
                </tr>
              </thead>
              <tbody>
                {bills.map(bill => (
                  <tr key={bill.id} className="border-b hover:bg-gray-50">
                    <td className="px-4 py-3">#{bill.id}</td>
                    <td className="px-4 py-3 text-xs">{bill.date}</td>
                    <td className="px-4 py-3">{bill.items.length}</td>
                    <td className="px-4 py-3">₹{bill.total.toFixed(2)}</td>
                    <td className="px-4 py-3 font-bold">₹{bill.grandTotal.toFixed(2)}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        )}
      </div>
    </div>
  );

  const ManagerDashboard = () => (
    <div className="space-y-8">
      <div className="bg-white rounded-lg shadow-md p-6">
        <h2 className="text-xl font-bold mb-4">Employee Management</h2>
        <div className="overflow-x-auto">
          <table className="w-full text-sm">
            <thead className="bg-gray-100">
              <tr>
                <th className="px-4 py-3 text-left">Name</th>
                <th className="px-4 py-3 text-left">Position</th>
                <th className="px-4 py-3 text-left">Salary</th>
                <th className="px-4 py-3 text-left">Working Hours</th>
                <th className="px-4 py-3 text-left">Bonus</th>
                <th className="px-4 py-3 text-left">Total</th>
              </tr>
            </thead>
            <tbody>
              {employees.map(emp => (
                <tr key={emp.id} className="border-b hover:bg-gray-50">
                  <td className="px-4 py-3">{emp.name}</td>
                  <td className="px-4 py-3">{emp.position}</td>
                  <td className="px-4 py-3">₹{emp.salary}</td>
                  <td className="px-4 py-3">{emp.hours}h/day</td>
                  <td className="px-4 py-3">₹{emp.bonus}</td>
                  <td className="px-4 py-3 font-bold">₹{emp.salary + emp.bonus}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>

      <div className="bg-white rounded-lg shadow-md p-6">
        <h2 className="text-xl font-bold mb-4">Stock Management</h2>
        <div className="overflow-x-auto">
          <table className="w-full text-sm">
            <thead className="bg-gray-100">
              <tr>
                <th className="px-4 py-3 text-left">Product</th>
                <th className="px-4 py-3 text-left">Current Stock</th>
                <th className="px-4 py-3 text-left">Status</th>
              </tr>
            </thead>
            <tbody>
              {products.map(product => (
                <tr key={product.id} className="border-b hover:bg-gray-50">
                  <td className="px-4 py-3">{product.name}</td>
                  <td className="px-4 py-3">{product.stock}</td>
                  <td className="px-4 py-3">
                    <span className={`px-3 py-1 rounded-full text-xs ${product.stock < 20 ? 'bg-red-100 text-red-800' : 'bg-green-100 text-green-800'}`}>
                      {product.stock < 20 ? 'Low Stock' : 'Available'}
                    </span>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );

  const EmployeeDashboard = () => (
    <div className="space-y-8">
      <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
        <div className="bg-green-500 text-white p-8 rounded-lg shadow-md text-center">
          <p className="text-sm font-semibold mb-2">CLOCK IN</p>
          <button className="bg-white text-green-500 font-bold py-3 px-6 rounded-lg hover:bg-gray-100 w-full">
            Check In
          </button>
        </div>
        <div className="bg-red-500 text-white p-8 rounded-lg shadow-md text-center">
          <p className="text-sm font-semibold mb-2">CLOCK OUT</p>
          <button className="bg-white text-red-500 font-bold py-3 px-6 rounded-lg hover:bg-gray-100 w-full">
            Check Out
          </button>
        </div>
      </div>

      <div className="bg-white rounded-lg shadow-md p-6">
        <h2 className="text-xl font-bold mb-4">My Details</h2>
        <div className="space-y-4">
          <div className="grid grid-cols-2 gap-4">
            <div>
              <p className="text-gray-600 text-sm">Name</p>
              <p className="text-lg font-semibold">John Doe</p>
            </div>
            <div>
              <p className="text-gray-600 text-sm">Position</p>
              <p className="text-lg font-semibold">Sales Executive</p>
            </div>
            <div>
              <p className="text-gray-600 text-sm">Base Salary</p>
              <p className="text-lg font-semibold">₹30,000</p>
            </div>
            <div>
              <p className="text-gray-600 text-sm">Working Hours (Today)</p>
              <p className="text-lg font-semibold">8 hours</p>
            </div>
            <div>
              <p className="text-gray-600 text-sm">Bonus</p>
              <p className="text-lg font-semibold text-green-600">₹2,000</p>
            </div>
            <div>
              <p className="text-gray-600 text-sm">Total Salary</p>
              <p className="text-lg font-bold text-green-600">₹32,000</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );

  return (
    <>
      {!currentUser ? <LoginPage /> : 
       currentUser.userType === 'customer' ? (
         currentPage === 'login' ? <LoginPage /> :
         currentPage === 'cart' ? <CartPage /> :
         <ShopPage />
       ) : <DashboardPage />}
    </>
  );
};

export default ECommerceApp;