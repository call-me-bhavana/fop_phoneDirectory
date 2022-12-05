public final void display()
    {
        ptr = head; //start the node
        while (ptr != null) //traverse till last
        {
            System.out.print("\n\nNAME  ::\t");
            System.out.print(ptr.name);
            System.out.print("\nNUMBER::\t+91-");
            System.out.print(ptr.number);
            System.out.print("\nG-MAIL::\t");
            System.out.print(ptr.gmail);
            ptr = ptr.next;
        }
    }
