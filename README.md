# Shopping Basket Calculator (Java)

A simple Java program that calculates the total cost of a basket of shopping items with offers.

### Pricing Rules:
- Apple – 35p
- Banana – 20p
- Melon – 50p, Buy One Get One Free
- Lime – 15p, Three for the price of two

### How to Run:
1. Compile: `mvn clean install`
2. Run: `java -cp target/classes com.arpan.shopping.ShoppingApp`

### How to Test:
Run `mvn test` to execute unit tests.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Shopping Project Layout (Maven-style)


shopping/
├── pom.xml                           # Maven build configuration
├── README.md                         # Project overview and instructions
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── arpan/
    │   │           └── shopping/
    │   │                  └── Item.java                        # Enum with item definitions and pricing rules
    │   │                  └── ShoppingBasketCalculator.java    # Logic for calculating basket total
    │   │                  └── ShoppingApp.java                 # Main class (entry point)
    │   └── resources/
    │       └── application.properties                   # (Optional) configs
    └── test/
        ├── java/
        │   └── com/
        │       └── arpan/
        │           └── shopping/
        │               └── service/
        │                   └── ShoppingApplicationTests.java # Unit tests for ShoppingBasketCalculator
