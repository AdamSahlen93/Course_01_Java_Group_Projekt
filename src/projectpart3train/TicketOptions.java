package projectpart3train;

import java.util.ArrayList;
import java.util.HashMap;

public class TicketOptions
{
    //Monthly- or Single ticket

    ArrayList<Integer> prices = new ArrayList<>();
    private int singleTicketRegular = 35;
    private int singleTicketDiscount = 20;
    private int monthlyTicketRegular = 600;
    private int monthlyTicketDiscount = 450;

    ArrayList<String> types = new ArrayList<>();
    private String singleTicketTypeRegular = "Singel ticket: Regular";
    private String singleTicketTypeSenior = "Singel ticket: Senior ";
    private String singleTicketTypeYouth = "Singel ticket: Youth";
    private String monthlyTicketTypeRegular = "Monthly ticket: Regular";
    private String monthlyTicketTypeSenior =   "Monthly ticket: Senior";
    private String monthlyTicketTypeYouth =   "Monthly ticket: Youth";

    public void addToPrices()
    {
        prices.add(getSingleTicketRegular());
        prices.add(getSingleTicketDiscount());
        prices.add(getSingleTicketDiscount());
        prices.add(getMonthlyTicketRegular());
        prices.add(getMonthlyTicketDiscount());
        prices.add(getMonthlyTicketDiscount());
    }

    public void addToTypes()
    {
        types.add(getSingleTicketTypeRegular());
        types.add(getSingleTicketTypeSenior());
        types.add(getSingleTicketTypeYouth());
        types.add(getMonthlyTicketTypeRegular());
        types.add(getMonthlyTicketTypeSenior());
        types.add(getMonthlyTicketTypeYouth());

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

    public String getSingleTicketTypeRegular()
    {

        return singleTicketTypeRegular;
    }

    public void setSingleTicketTypeRegular(String singleTicketTypeRegular)
    {

        this.singleTicketTypeRegular = singleTicketTypeRegular;
    }

    public String getSingleTicketTypeSenior()
    {

        return singleTicketTypeSenior;
    }

    public void setSingleTicketTypeSenior(String singleTicketTypeSenior)
    {

        this.singleTicketTypeSenior = singleTicketTypeSenior;
    }

    public String getSingleTicketTypeYouth()
    {

        return singleTicketTypeYouth;
    }

    public void setSingleTicketTypeYouth(String singleTicketTypeYouth)
    {

        this.singleTicketTypeYouth = singleTicketTypeYouth;
    }

    public String getMonthlyTicketTypeRegular()
    {

        return monthlyTicketTypeRegular;
    }

    public void setMonthlyTicketTypeRegular(String monthlyTicketTypeRegular)
    {

        this.monthlyTicketTypeRegular = monthlyTicketTypeRegular;
    }

    public String getMonthlyTicketTypeSenior()
    {

        return monthlyTicketTypeSenior;
    }

    public void setMonthlyTicketTypeSenior(String monthlyTicketTypeSenior)
    {

        this.monthlyTicketTypeSenior = monthlyTicketTypeSenior;
    }

    public String getMonthlyTicketTypeYouth()
    {

        return monthlyTicketTypeYouth;
    }

    public void setMonthlyTicketTypeYouth(String monthlyTicketTypeYouth)
    {

        this.monthlyTicketTypeYouth = monthlyTicketTypeYouth;
    }
}
