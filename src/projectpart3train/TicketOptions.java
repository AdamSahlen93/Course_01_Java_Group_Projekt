package projectpart3train;

import java.util.ArrayList;

public class TicketOptions
{
    //Creates a list with the types of tickets avalible for customers
    ArrayList<String> ticketOptions = new ArrayList<>();
    private int singleTicketRegular = 35;
    private int singleTicketDiscount = 20;
    private int monthlyTicketRegular = 600;
    private int monthlyTicketDiscount = 450;

    //Adds to the list with ticketOptions (index 0: Single index 1: Monthly)
    public void addTicketOptions()
    {
        ticketOptions.add("Single-use ticket");
        ticketOptions.add("Monhly ticket");
    }

    public void showTicketOptions()
    {

        System.out.println("\n");
        System.out.println("Your ticket options are!");
        System.out.println("----------");
        System.out.println(ticketOptions.get(0) + ":");
        System.out.println(AgeGroup.REGULAR.toString() + " : " + singleTicketRegular + " kr");
        System.out.println(AgeGroup.JUNIOR.toString() + " : " + singleTicketDiscount + " kr");
        System.out.println(AgeGroup.SENIOR.toString() + " : " + singleTicketDiscount + " kr");
        System.out.println("----------");
        System.out.println(ticketOptions.get(1) + ":");
        System.out.println(AgeGroup.REGULAR.toString() + " : " + monthlyTicketRegular + " kr");
        System.out.println(AgeGroup.JUNIOR.toString() + " : " + monthlyTicketDiscount + " kr");
        System.out.println(AgeGroup.SENIOR.toString() + " : " + monthlyTicketDiscount + " kr");
        System.out.println("\n");

    }

    public int getSingleTicketRegular()
    {

        return singleTicketRegular;
    }

    public void setSingleTicketRegular(int singleTicketRegular)
    {

        this.singleTicketRegular = singleTicketRegular;
    }

    public int getSingleTicketDiscount()
    {

        return singleTicketDiscount;
    }

    public void setSingleTicketDiscount(int singleTicketDiscount)
    {

        this.singleTicketDiscount = singleTicketDiscount;
    }

    public int getMonthlyTicketRegular()
    {

        return monthlyTicketRegular;
    }

    public void setMonthlyTicketRegular(int monthlyTicketRegular)
    {

        this.monthlyTicketRegular = monthlyTicketRegular;
    }

    public int getMonthlyTicketDiscount()
    {

        return monthlyTicketDiscount;
    }

    public void setMonthlyTicketDiscount(int monthlyTicketDiscount)
    {

        this.monthlyTicketDiscount = monthlyTicketDiscount;
    }
}


