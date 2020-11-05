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


