    public final void update(String n)
    {
        char ans;
        int c;
        ptr = head;
        while (ptr != null)
        {
            if (strcmp(n,ptr.name) == 0)
            {

                do
                {
                    System.out.print("\nWHAT DO YOU WANT TO UPDATE?\n1.NAME\n2.PHONE NUMBER\n3.G-MAIL\n");
                    c = Integer.parseInt(sc.next());
                    switch (c)
                    {
                        case 1:
                            System.out.print("ENTER NEW-NAME=");
                            ptr.name = sc.next();
                            break;
                        case 2:
                            System.out.print("ENTER NEW PHONE-NUMBER?");
                            ptr.number = sc.next();
                            while (ptr.number.length() != 10)
                            {
                                System.out.print("ENTER VALID NUMBER  :");
                                ptr.number = sc.next();
                            }
                            break;
                        case 3:
                            System.out.print("ENTER NEW G-MAIL");
                            ptr.gmail = sc.next();
                            break;
                    }
                    System.out.print("DO YOU WANT TO CONTINUE UPDATING?");
                    ans = sc.next().charAt(0);
                }while (ans == 'y');
            }
            ptr = ptr.next;
        }
    }

    public dlist()
    {
        head = null;
        temp = null;
        ptr = null;
        ptr1 = null;
        ptr2 = null;
        dup = null;
    }
}