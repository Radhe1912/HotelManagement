import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Hotel{

    String name="The Gourmet Garden Hotel";
    
    int available_rooms=15;          // total rooms

    // number of rooms for different types of rooms
    int luxurious_rooms=3;
    int standard_rooms=5;
    int regular_rooms=7;

    // cost of rooms
    int luxurious_room_price=500;    
    int standard_room_price=350;
    int regular_room_price=250;

    int cost=0;

    public void get_details(){
        System.out.println("The hotel name is: "+name);
        System.out.println("Available rooms are: "+available_rooms);
    }
}

abstract class LoginToHotel{
    public abstract void login_hotel();
}

class Login extends LoginToHotel{
    
    // password for different person
    private final String managerPassword = "Gourmet_321_Manager";
    private final String chefPassword = "Gourmet_321_Chef";
    private final String waiterPassword = "Gourmet_321_Waiter";
    private final String helpingStaffPassword = "Gourmet_321_HelpingStaff";
    
    public void login_hotel(){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        String name_of_loginPerson = sc.nextLine();

        System.out.println("Please enter your email");
        String email_of_loginPerson = sc.nextLine();

        System.out.println("Please enter the password");
        String login_password = sc.nextLine();

        System.out.println();
        System.out.println("---------------------------------The Gourmet Garden Hotel---------------------------------");

        if(login_password.equals(managerPassword)){

            String manager_phone = "1234567891";

            System.out.println("\t\tLogin Successfull!!! as a Manager");
            System.out.println();
            System.out.println("\t\tHere are your information and your duties:");
            System.out.println();

            System.out.println("\t\t\tName: "+name_of_loginPerson);
            System.out.println("\t\t\tPhone: "+manager_phone);
            System.out.println("\t\t\tEmail: "+email_of_loginPerson+"\n");

            System.out.println("\t\t\tYour duties are: ");

            System.out.println("\t\t\t\t1. Staff Management");
            System.out.println("\t\t\t\t2. Table and Room Management");
            System.out.println("\t\t\t\t3. Customer Relationship Management");
            System.out.println("\t\t\t\t4. Billing and Financial Management");
            System.out.println("\t\t\t\t5. Handling Complaints and Safety");
            System.out.println("\t\t\t\t6. Decide and change the shifts of the staff");
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }

        else if(login_password.equals(chefPassword)){
            String manager_phone = "1234567892";

            System.out.println("\t\tLogin Successfull!!! as a Manager");
            System.out.println();
            System.out.println("\t\tHere are your information and your duties:");
            System.out.println();

            System.out.println("\t\t\tName: "+name_of_loginPerson);
            System.out.println("\t\t\tPhone: "+manager_phone);
            System.out.println("\t\t\tEmail: "+email_of_loginPerson+"\n");

            System.out.println("\t\t\tYour duties are: ");

            System.out.println("\t\t\t\t1. Menu Planning");
            System.out.println("\t\t\t\t2. Food Preperation");
            System.out.println("\t\t\t\t3. Kitchen Management");
            System.out.println("\t\t\t\t4. Checking the Food Quality");
            System.out.println("\t\t\t\t5. Health Safety");
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }

        else if(login_password.equals(waiterPassword)){
            String manager_phone = "1234567893";

            System.out.println("\t\tLogin Successfull!!! as a Manager");
            System.out.println();
            System.out.println("\t\tHere are your information and your duties:");
            System.out.println();

            System.out.println("\t\t\tName: "+name_of_loginPerson);
            System.out.println("\t\t\tPhone: "+manager_phone);
            System.out.println("\t\t\tEmail: "+email_of_loginPerson+"\n");

            System.out.println("\t\t\tYour duties are: ");

            System.out.println("\t\t\t\t1. Customer service and interaction");
            System.out.println("\t\t\t\t2. Order Management");
            System.out.println("\t\t\t\t3. Table Maintenance");
            System.out.println("\t\t\t\t4. Payment Processing");
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }

        else if(login_password.equals(helpingStaffPassword)){
            String manager_phone = "1234567894";

            System.out.println("\t\tLogin Successfull!!! as a Manager");
            System.out.println();
            System.out.println("\t\tHere are your information and your duties:");
            System.out.println();

            System.out.println("\t\t\tName: "+name_of_loginPerson);
            System.out.println("\t\t\tPhone: "+manager_phone);
            System.out.println("\t\t\tEmail: "+email_of_loginPerson+"\n");

            System.out.println("\t\t\tYour duties are: ");

            System.out.println("\t\t\t\t1. Customer service and interaction");
            System.out.println("\t\t\t\t2. Guest Interaction and Service");
            System.out.println("\t\t\t\t3. Room Setup and Delivery");
            System.out.println("\t\t\t\t4. Room Maintenance and Presentation");
            System.out.println("\t\t\t\t5. Safety and Protocol Adherence and Maintaining Privacy");
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }

        else{
            System.out.println("Please select 1 for book the room and 2 for exit");
            System.out.println("Do You want to book rooms?");
            int book_room = sc.nextInt();
            if(book_room==1){
                BookRooms obj = new BookRooms();
                obj.book();
            }
            else{
                return;
            }
            System.out.println("");
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }
    }

    private void loginRole(String role){
        System.out.println("Logging as "+role+".");
        login_hotel();
    }

    public void check_login(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please tell who is logging in: ");
        System.out.println();
        System.out.println("Please select 1 for Manager, 2 for Chef, 3 for Waiter, 4 for Helping Staff");

        int person=sc.nextInt();
        sc.nextLine();

        switch (person) {
            case 1:
                loginRole("Manager");
                break;

            case 2:
                loginRole("Chef");
                break;

            case 3:
                loginRole("Waiter");
                break;
            
            case 4:
                loginRole("Helping Staff");
                break;

            default:
                System.out.println("Please select only from 1 to 4");
                System.out.println();
                check_login();
        }
    }
}

class BookRooms extends Hotel{

    public void book(){
        Scanner sc = new Scanner(System.in);
        String user;

        HashMap<String, Integer> booking_details = new HashMap<>();

        System.out.println("Hello and Welcome to the "+name);
        System.out.println("The total available rooms in out hotel are: "+available_rooms);
        System.out.println();

        System.out.println("Please enter the details for booking the room");
                
        System.out.println("Enter your name:");
        user=sc.nextLine();

        System.out.println("Enter your email:");
        String email=sc.nextLine();

        System.out.println("Enter your phone:");
        String phone=sc.nextLine();

        System.out.println("Please enter number of rooms to be booked");
        
        int no_of_rooms = sc.nextInt();
        sc.nextLine();
        
        booking_details.put("Luxurious Rooms",0);
        booking_details.put("Standard Rooms",0);
        booking_details.put("Regular Rooms",0);
        booking_details.put("Total Cost",0);

        int total_cost = booking_details.get("Total Cost");

        do{
            if(no_of_rooms>available_rooms){
                System.out.println("Sorry the available rooms are: "+available_rooms);
                break;
            }
            else if(no_of_rooms<available_rooms){
                
                int type_of_room;

                System.out.println("Please select the type of the Room:");
                
                System.out.println("Luxurious room details:");
                System.out.println("\t1. High-End Furnishings and Decor");
                System.out.println("\t2. King size bed");
                System.out.println("\t3. Ocean view");
                System.out.println("\t4. Complimentary Breakfast and Lunch");
                System.out.println("\t5. Free Wi-Fi");
                System.out.println("\t6. private balcony and terrace");

                System.out.println("Standard room details:");
                System.out.println("\t1. Fully Furnished");
                System.out.println("\t2. King size bed");
                System.out.println("\t3. City view");
                System.out.println("\t4. Complimentary Breakfast and Lunch");
                System.out.println("\t5. Free Wi-Fi");

                System.out.println("Regular room details:");
                System.out.println("\t1. Semi Furnishings");
                System.out.println("\t2. Double bed");
                System.out.println("\t3. Garden view");
                System.out.println("\t4. Complimentary Breakfast");
                System.out.println("\t5. Free Wi-Fi");

                System.out.println("The Price of Luxurious Rooms are: "+luxurious_room_price+"$");
                System.out.println("The Price of Standard Rooms are: "+standard_room_price+"$");
                System.out.println("The Price of Regular Rooms are: "+regular_room_price+"$");

                System.out.println("1. for Luxurious room, 2. for Standard room, 3. for Regular room");

                type_of_room=sc.nextInt();
                
                if(type_of_room==1){
                    
                    System.out.println("The available Luxurious Rooms are: "+luxurious_rooms);
                    System.out.println("Please enter number of Luxurious rooms to be booked");
                    int no_of_luxurious_rooms=sc.nextInt();
                    if(no_of_luxurious_rooms>luxurious_rooms){
                        System.out.println("Sorry the available rooms are: "+luxurious_rooms);
                        continue;
                    }
                    else{
                        System.out.println("Booked "+no_of_luxurious_rooms+" Luxurious rooms");
                        luxurious_rooms=luxurious_rooms-no_of_luxurious_rooms;
                        total_cost+=luxurious_room_price*no_of_luxurious_rooms;
                        cost+=luxurious_room_price*no_of_luxurious_rooms;
                    }
                }

                if(type_of_room==2){

                    System.out.println("The available Standard rooms are: "+standard_rooms);
                    System.out.println("Please enter number of Standard rooms to be booked");
                    int no_of_standard_rooms=sc.nextInt();
                    if(no_of_standard_rooms>standard_rooms){
                        System.out.println("Sorry the available rooms are: "+standard_rooms);
                        break;
                    }
                    else{
                        System.out.println("Booked "+no_of_standard_rooms+" Standard rooms");
                        standard_rooms=standard_rooms-no_of_standard_rooms;
                        cost+=standard_room_price*no_of_standard_rooms;
                    }
                }

                if(type_of_room==3){

                    System.out.println("The available Regular rooms are: "+regular_rooms);
                    System.out.println("Please enter number of Regular rooms to be booked");
                    int no_of_regular_rooms=sc.nextInt();
                    if(no_of_regular_rooms>regular_rooms){
                        System.out.println("Sorry the available rooms are: "+regular_rooms);
                        break;
                    }
                    else{
                        System.out.println("Booked "+no_of_regular_rooms+" Regular rooms");
                        regular_rooms=regular_rooms-no_of_regular_rooms;
                        cost+=regular_room_price*no_of_regular_rooms;
                    }
                }

                System.out.println("Do you want to book more rooms? type Y for yes, N for no");
                String book_next_room;
                book_next_room=sc.next();
                
                if(book_next_room.equals("N")){

                    System.out.println("------------------------~~~~~~~~~~~~~~~~~~~~~~~~~~~~~------------------------\n");
                    
                    booking_details.put("Total Cost", cost);
                    booking_details.put("Luxurious Rooms", 3-luxurious_rooms);
                    booking_details.put("Standard Rooms", 5-standard_rooms);
                    booking_details.put("Regular Rooms", 7-regular_rooms);
                    
                    Set set = booking_details.entrySet();
                    Iterator itr = set.iterator();
                    Iterator itr2 = set.iterator();

                    System.out.println("Thanks for booking the rooms " + user+ " your booking details are as follow:");
                    System.out.println();

                    while(itr.hasNext()){
                        Map.Entry entry=(Map.Entry) itr.next();
                        
                        if(entry.getValue().equals(0)){
                            continue;
                        }
                        if(entry.getKey()=="Total Cost"){
                            continue;
                        }
                        else{
                            System.out.println("\tYou have booked "+entry.getValue()+" "+entry.getKey());
                        }
                    }
                    while(itr2.hasNext()){
                        Map.Entry entry=(Map.Entry) itr2.next();
                        if(entry.getKey()=="Total Cost"){
                            System.out.println("\t"+entry.getKey()+"="+entry.getValue()+"$");
                        }
                    }
                    System.out.println();

                    // System.out.println(booking_details);

                    System.out.println("Thank you for exploring our website.");
                    System.out.println(" We look forward to welcoming you in person at our hotel!");
                    System.out.println();
                    System.out.println("------------------------~~~~~~~~~~~~~~~~~~~~~~~~~~~~~------------------------\n");
                    break;
                }
            }
        }
        while(available_rooms>0);
    }
}

class FoodItem{
    
    String name;
    double price;

    public FoodItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return name + " ($" + price + ")";
    }
}

class FoodMenu{

    ArrayList<FoodItem> menu;
    ArrayList<FoodItem> orderedItems;

    public FoodMenu(){
        menu = new ArrayList<>();
        orderedItems = new ArrayList<>();

        menu.add(new FoodItem("Burger", 5.99));
        menu.add(new FoodItem("Pizza", 8.99));
        menu.add(new FoodItem("Pasta", 7.49));
        menu.add(new FoodItem("Salad", 4.99));
        menu.add(new FoodItem("Sandwich", 7.99));
        menu.add(new FoodItem("Waffles", 7.99));
        menu.add(new FoodItem("Noodles", 8.99));
        menu.add(new FoodItem("Donut", 8.49));
        menu.add(new FoodItem("Popcorn", 6.49));
        menu.add(new FoodItem("Cake", 10.49));
        menu.add(new FoodItem("Chocolate Fudge Ice Cream", 5.99));
        menu.add(new FoodItem("Carmel Candy", 4.99));
        menu.add(new FoodItem("Strawberry Ice Cream", 4.99));
        menu.add(new FoodItem("Chocolate Almond Ice cream", 6.99));
        menu.add(new FoodItem("Coca cola", 2.99));
        menu.add(new FoodItem("Pepsi", 2.99));
        menu.add(new FoodItem("7 up", 2.99));
        menu.add(new FoodItem("Slice", 2.99));
        menu.add(new FoodItem("Special lassi", 4.99));
    }

    public void displayMenu(){
        System.out.println("\t------------- Food Menu -------------");
        for (int i = 0; i < menu.size(); i++){
            System.out.println("\t\t"+(i + 1) + ". " + menu.get(i));
        }
        System.out.println("-------------------~~~~~~~~~~~~~~~~~~~~~~~~~~~-------------------\n");
    }

    public void addToOrder(int itemNumber) {
        if (itemNumber>0 && itemNumber<=menu.size()) {
            orderedItems.add(menu.get(itemNumber-1));
            System.out.println("Added to order: "+menu.get(itemNumber-1));
        } else {
            System.out.println("Invalid item number. Please try again.");
        }
    }

    public void displayOrder(){
        System.out.println("\n-------------------~~~~~~~~~~~~~~~~~~~~~~~~~~~-------------------\n");
        System.out.println("\t----------------- Your Order -----------------");
        if (orderedItems.isEmpty()){
            System.out.println("\t\tNo items ordered.");
        } else {
            for (FoodItem item : orderedItems){
                System.out.println("\t\t\t"+item);
            }
        }
    }

    public double calculateBill(){
        double total = 0;
        for (FoodItem item : orderedItems){
            total += item.getPrice();
        }
        return total;
    }

}

class InvalidInputException extends RuntimeException{
    InvalidInputException(String str){
        super(str);
    }
}

class Main{

    public static void main(String[] args) {

        Scanner sc2 = new Scanner(System.in);
        Hotel hotel = new Hotel();
        int choice;

        System.out.println("\n\n-------------------~~~~~~~~~~~~~~~~~~~~~~~~~~~-------------------\n");
        System.out.println("Hello Thanks for visiting "+ hotel.name);
        System.out.println("Please tell us how can we help you\n");
        System.out.println("-------------------~~~~~~~~~~~~~~~~~~~~~~~~~~~-------------------\n");
        
        do{
            
            System.out.println("Choose 1 for Login");
            System.out.println("Choose 2 for Book the Room");
            System.out.println("Choose 3 for Select Food");
            System.out.println("Choose 4 to go back");
            
            choice=sc2.nextInt();

            if(choice<1 || choice>4){
                throw new InvalidInputException("Please enter only from 1 to 4");
            }

            else{
                switch (choice) {
                    case 1:
    
                        Login login_obj = new Login();
                        login_obj.check_login();
                        break;
    
                    case 2:
                    
                        BookRooms booking_obj=new BookRooms();
                        booking_obj.book();
                        break;
    
                    case 3:
                        
                        FoodMenu foodMenu = new FoodMenu();
    
                        boolean ordering = true;
    
                        while (ordering){
                            foodMenu.displayMenu();
                            System.out.println("Please select an item number to add to your order (or 0 to finish):");
                            int itemNumber = sc2.nextInt();
                            sc2.nextLine();
                
                            if(itemNumber == 0){
                                ordering = false;
                            }
                            else{
                                foodMenu.addToOrder(itemNumber);
                            }
                        }
                
                        foodMenu.displayOrder();
                        double totalBill = foodMenu.calculateBill();
                        System.out.println("\t\tYour total food bill is: $" + totalBill);
                        System.out.println("-------------------~~~~~~~~~~~~~~~~~~~~~~~~~~~-------------------\n");
                        break;
    
                    case 4:
                        System.out.println("\n--------------------------------------~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~--------------------------------------\n");
                        System.out.println("Thank You for visiting The Gourmet Garden Hotel");
                        System.out.println("We have functionalities like: ");
    
                        System.out.println("\t\tLogin for different staff and user");
                        System.out.println("\t\tBook rooms in which there are 3 types of rooms available like Luxurious, Standard and Regular");
                        System.out.println("\t\tOrder the Food and many more!");
                        System.out.println("\n--------------------------------------~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~--------------------------------------\n");
                        break;
    
                    default:
                        break;
                }
            }
        }
        while(choice!=4);
    }
}
