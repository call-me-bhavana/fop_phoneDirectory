
public final void searchbygmail(String gm)
    {
        ptr = head;
        while (ptr != null)
        {
            if (strcmp(gm,ptr.gmail) == 0)
            {
                System.out.print("G-MAIL FOUND\n");
                System.out.print("\n");
                System.out.print("CONTACT DETAILS ARE BELOW:\n");
                System.out.print("\n");
                System.out.print("\n\nNAME  ::\t");
                System.out.print(ptr.name);
                System.out.print("\nNUMBER::\t+91-");
                System.out.print(ptr.number);
                System.out.print("\nG-MAIL::\t");
                System.out.print(ptr.gmail);

            }
            ptr = ptr.next;
        }
    }

    // dnode *head,*temp,*ptr;
    // friend class apply;
    // class apply()
    // {

    // }