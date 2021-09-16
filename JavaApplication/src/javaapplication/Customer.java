package javaapplication;

import java.text.DecimalFormat;

public class Customer {
	   //variable declaration
	   private int customerID;
           private String name,address,yardType;
           private double length, width, totalCost;
    public Customer() {
        customerID =0;
        name = "N/A";
        address = "N/A";
        yardType="N/A"; 
        length = 0.0;
        width=0.0;
        totalCost=0.0;
    }
    public Customer(int customerID, String name, String address, String yardType,
            double length, double width, double totalCost){
            this.customerID=customerID;
            this.name=name;
            this.address= address;
            this.yardType=yardType;
            this.length=length;
            this.width=width;
            this.totalCost=totalCost;
    }
           public void setCustomerID(int custID)
	   {
	       this.customerID=custID;
	   }
	   //return name
	   public int getCustomerID()
	   {
	       return customerID;
	   }
           public void setAddress(String Address)
	   {
	       this.address=Address;
	   }
	   public String getAddress()
	   {
	       return address;
	   }
           public void setLength(double Length)
	   {
	       this.length=Length;
	   }
	   public double getLength()
	   {
	       return length;
	   }
           public void setWidth(double Width)
	   {
	       this.width=Width;
	   }
	   public double getWidth()
	   {
	       return width;
	   }
           public void setTotalCost(double TotalCost)
	   {
	       this.totalCost=TotalCost;
	   }
	   public double getTotalCost()
	   {
	       return totalCost;
	   }
    	   public void setName(String Name)
	   {
	       this.name=Name;
	   }
	   //return name
	   public String getName()
	   {
	       return name;
	   }
	   //get age
	   public void setYardType(String YardType)
	   {
	       this.yardType=YardType;
	   }
	   //return age
	   public String getYardType()
	   {
	       return yardType;
	   }
           @Override
           public String toString( )
           {
               return name;      // only show the Customer’s name
           }
           public String getDetails( )
           {
               DecimalFormat fmt = new DecimalFormat( "$#,##0.00" );
               String output = name + "\n";
               output += address + "\n";
               output += "Type: " + yardType + "\n";
               output += "Width: " + width + "\n";
               output += "Length: " + length + "\n";
               output += "Total Cost: " + fmt.format(totalCost); //currency
               return output;
}
}