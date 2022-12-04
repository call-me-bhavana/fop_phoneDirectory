public final void searchbyname(String na)
    {
        ptr = head;
        while (ptr != null)
        {
            if (strcmp(na,ptr.name) == 0)
            {
                System.out.print("NAME FOUND");
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