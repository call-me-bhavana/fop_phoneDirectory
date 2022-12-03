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

class dlist
{
    private dnode head;
    private dnode temp;
    private dnode ptr;

    private dnode ptr1;
    private dnode ptr2;
    private dnode dup;
    public dnode prevn;
    Scanner sc = new Scanner(System.in);

    public final int strcmp(String a, String b){
        return a.compareTo(b);
    }
    public final void insert()
    {
        accept();
    }

    public final void sort()
    {
        dnode i;
        dnode j;
        int temp;
        String n = new String(new char[10]);
        for (i = head;i.next != null;i = i.next)
        {
            for (j = i.next;j != null;j = j.next)
            {
                temp = strcmp(i.name,j.name);
                if (temp > 0)
                {
                    n = i.name;
                    i.name = j.name;
                    j.name = n;
                }
            }
        }

    }

