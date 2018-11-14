# Introduction
This is an implementation created for Thoughtworks' Sales Taxes coding challenge.

### Problem
Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt. Import duty is an additional sales tax applicable on all imported goods at a rate of 5%, with no exemptions.

When I purchase items I receive a receipt which lists the name of all the items and their price (including tax), finishing with the total cost of the items, and the total amounts of sales taxes paid.  The rounding rules for sales tax are that for a tax rate of n%, a shelf price of p contains (np/100 rounded up to the nearest 0.05) amount of sales tax.

# Prepare
In order to run this program, you will need to install the java program and the input textfile.

### Installation
1. Download/Clone this directory.
2. The source code is located in the src directory
3. Compile SalesTax.java and run SalexTax.

### Text File
#### Assumptions
1. There will be one item per line
2. Each line will be in the format of <Quanty> <Name> at <Price>
3. Imported products will contain "imported" in <name>
4. Exempt products will contain only words "book", "chocolate", "pill"

# Functions
You can choose to pipe the program using system i/o, or use program arguments to import the text.

### Pipe
If you choose to pipe your input, follow code below on your terminal
```
java SampleTax < input.txt
```
### Argument
If you choose to use program arguments, follow code below on your terminal
```
java SampleTax input.txt
```
