// Database Models and Backend Logic
import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

// ==================== MODELS ====================

class User {
    private int userId;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String userType; // customer, manager, employee, admin

    public User(int userId, String username, String password, String email, String userType) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    // Getters and Setters
    public int getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getUserType() { return userType; }
    public String getEmail() { return email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
}

class Product {
    private int productId;
    private String productName;
    private double originalPrice;
    private double sellingPrice;
    private int stock;
    private String category;
    private String description;

    public Product(int productId, String productName, double originalPrice, 
                   double sellingPrice, int stock, String category) {
        this.productId = productId;
        this.productName = productName;
        this.originalPrice = originalPrice;
        this.sellingPrice = sellingPrice;
        this.stock = stock;
        this.category = category;
    }

    // Getters and Setters
    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public double getSellingPrice() { return sellingPrice; }
    public double getOriginalPrice() { return originalPrice; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    public String getCategory() { return category; }
}

class CartItem {
    private int cartItemId;
    private int productId;
    private int quantity;
    private double price;

    public CartItem(int cartItemId, int productId, int quantity, double price) {
        this.cartItemId = cartItemId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public double getTotal() { return quantity * price; }
}

class Bill {
    private int billId;
    private int userId;
    private List<CartItem> items;
    private double totalAmount;
    private double taxAmount;
    private double grandTotal;
    private LocalDateTime billDate;
    private String paymentStatus;

    public Bill(int billId, int userId, List<CartItem> items, double taxRate) {
        this.billId = billId;
        this.userId = userId;
        this.items = items;
        this.billDate = LocalDateTime.now();
        this.paymentStatus = "Pending";
        calculateTotal(taxRate);
    }

    private void calculateTotal(double taxRate) {
        this.totalAmount = items.stream().mapToDouble(CartItem::getTotal).sum();
        this.taxAmount = totalAmount * taxRate;
        this.grandTotal = totalAmount + taxAmount;
    }

    public int getBillId() { return billId; }
    public double getGrandTotal() { return grandTotal; }
    public LocalDateTime getBillDate() { return billDate; }
    public List<CartItem> getItems() { return items; }
}

class Employee {
    private int employeeId;
    private String employeeName;
    private String position;
    private double salary;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private int workingHours;
    private double bonus;
    private LocalDate hireDate;

    public Employee(int employeeId, String employeeName, String position, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.position = position;
        this.salary = salary;
        this.hireDate = LocalDate.now();
        this.bonus = 0;
    }

    public void checkIn() {
        this.checkInTime = LocalDateTime.now();
    }

    public void checkOut() {
        this.checkOutTime = LocalDateTime.now();
        calculateWorkingHours();
    }

    private void calculateWorkingHours() {
        if (checkInTime != null && checkOutTime != null) {
            this.workingHours = (int) Duration.between(checkInTime, checkOutTime).toHours();
        }
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public int getWorkingHours() { return workingHours; }
    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }
    public void setSalary(double salary) { this.salary = salary; }
}

// ==================== SERVICES ====================

class AuthenticationService {
    private Map<Integer, User> users = new HashMap<>();
    private int nextUserId = 1;

    public User register(String username, String password, String email, String userType) {
        User user = new User(nextUserId++, username, password, email, userType);
        users.put(user.getUserId(), user);
        return user;
    }

    public User login(String username, String password) {
        return users.values().stream()
            .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
            .findFirst()
            .orElse(null);
    }

    public User getUserById(int userId) {
        return users.get(userId);
    }
}

class ProductService {
    private Map<Integer, Product> products = new HashMap<>();
    private int nextProductId = 1;

    public Product addProduct(String name, double originalPrice, double sellingPrice, int stock, String category) {
        Product product = new Product(nextProductId++, name, originalPrice, sellingPrice, stock, category);
        products.put(product.getProductId(), product);
        return product;
    }

    public List<Product> searchProducts(String keyword) {
        return products.values().stream()
            .filter(p -> p.getProductName().toLowerCase().contains(keyword.toLowerCase()) ||
                        p.getCategory().toLowerCase().contains(keyword.toLowerCase()))
            .collect(Collectors.toList());
    }

    public Product getProductById(int productId) {
        return products.get(productId);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    public void updateStock(int productId, int quantity) {
        Product product = products.get(productId);
        if (product != null) {
            product.setStock(product.getStock() - quantity);
        }
    }

    public void updateProduct(int productId, double price, int stock) {
        Product product = products.get(productId);
        if (product != null) {
            product.setStock(stock);
        }
    }
}

class CartService {
    private Map<Integer, List<CartItem>> carts = new HashMap<>();
    private int nextCartItemId = 1;

    public void addToCart(int userId, int productId, int quantity, double price) {
        CartItem item = new CartItem(nextCartItemId++, productId, quantity, price);
        carts.computeIfAbsent(userId, k -> new ArrayList<>()).add(item);
    }

    public List<CartItem> getCart(int userId) {
        return carts.getOrDefault(userId, new ArrayList<>());
    }

    public void removeFromCart(int userId, int productId) {
        List<CartItem> cart = carts.get(userId);
        if (cart != null) {
            cart.removeIf(item -> item.getProductId() == productId);
        }
    }

    public void clearCart(int userId) {
        carts.remove(userId);
    }
}

class BillService {
    private Map<Integer, Bill> bills = new HashMap<>();
    private int nextBillId = 1;

    public Bill generateBill(int userId, List<CartItem> cartItems) {
        Bill bill = new Bill(nextBillId++, userId, new ArrayList<>(cartItems), 0.05);
        bills.put(bill.getBillId(), bill);
        return bill;
    }

    public Bill getBillById(int billId) {
        return bills.get(billId);
    }

    public List<Bill> getBillsByUserId(int userId) {
        return bills.values().stream()
            .filter(b -> b.getUserId() == userId)
            .collect(Collectors.toList());
    }

    public List<Bill> getAllBills() {
        return new ArrayList<>(bills.values());
    }
}

class EmployeeService {
    private Map<Integer, Employee> employees = new HashMap<>();
    private int nextEmployeeId = 1;

    public Employee addEmployee(String name, String position, double salary) {
        Employee emp = new Employee(nextEmployeeId++, name, position, salary);
        employees.put(emp.getEmployeeId(), emp);
        return emp;
    }

    public void employeeCheckIn(int employeeId) {
        Employee emp = employees.get(employeeId);
        if (emp != null) emp.checkIn();
    }

    public void employeeCheckOut(int employeeId) {
        Employee emp = employees.get(employeeId);
        if (emp != null) emp.checkOut();
    }

    public Employee getEmployeeById(int employeeId) {
        return employees.get(employeeId);
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    public void updateSalary(int employeeId, double newSalary) {
        Employee emp = employees.get(employeeId);
        if (emp != null) emp.setSalary(newSalary);
    }

    public void setBonus(int employeeId, double bonus) {
        Employee emp = employees.get(employeeId);
        if (emp != null) emp.setBonus(bonus);
    }
}

// ==================== MAIN SYSTEM ====================

public class ECommerceSystem {
    private AuthenticationService authService;
    private ProductService productService;
    private CartService cartService;
    private BillService billService;
    private EmployeeService employeeService;

    public ECommerceSystem() {
        authService = new AuthenticationService();
        productService = new ProductService();
        cartService = new CartService();
        billService = new BillService();
        employeeService = new EmployeeService();
        initializeSampleData();
    }

    private void initializeSampleData() {
        // Sample products
        productService.addProduct("Laptop", 50000, 45000, 20, "Electronics");
        productService.addProduct("Mouse", 500, 400, 100, "Electronics");
        productService.addProduct("Keyboard", 2000, 1500, 50, "Electronics");
        
        // Sample users
        authService.register("user1", "pass123", "user1@email.com", "customer");
        authService.register("manager1", "pass123", "manager@email.com", "manager");
        authService.register("admin1", "pass123", "admin@email.com", "admin");
        
        // Sample employees
        employeeService.addEmployee("John Doe", "Sales Executive", 30000);
        employeeService.addEmployee("Jane Smith", "Manager", 50000);
    }

    public static void main(String[] args) {
        ECommerceSystem system = new ECommerceSystem();
        System.out.println("E-Commerce System initialized successfully!");
    }
}