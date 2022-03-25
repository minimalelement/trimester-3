class Stadium
{
    String stadium_name, location,  pitch_size;
    int phone;
    int capacity;

    void staduimdetails(String a,String b,String c)
    {
        stadium_name =a;
        location = b;
        pitch_size = c;

        System.out.println("STADIUM NAME : "+stadium_name+"\nLOCATION :"+location+"\nPITCH SIZE :"+pitch_size);
    }
    public static void main(String args[])
    {
            Stadium S = new Stadium();
            S.staduimdetails("MG ST","Cochin","1270x1680");

    }
