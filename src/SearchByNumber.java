public final void searchbynumber(String num)
    {
        ptr = head;
        while (ptr != null)
        {
            if (strcmp(num,ptr.number) == 0)
            {
                System.out.print("NUMBER FOUND\n");
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