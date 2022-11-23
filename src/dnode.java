import java.util.*;

class dnode
{
    public String number = new String(new char[50]);
    public String gmail = new String(new char[40]);
    public String name = new String(new char[30]);
    public dnode prev;
    public dnode next;
    public dnode(String n, String r, String g)
    {
        name = n;
        number = r;
        gmail = g;
        next = null;
        prev = null;
    }
}
