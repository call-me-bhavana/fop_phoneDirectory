public final void accept()
    {
        String number = new String(new char[50]);
        String gmail = new String(new char[40]);
        String name = new String(new char[30]);
        char ans;
			  /*do
			  {*/
        System.out.print("ENTER NAME      :");
        name = sc.next();
        // cin.getline (name,30);
        System.out.print("ENTER NUMBER    :");
        number = sc.next();
        while (number.length() != 10)
        {
            System.out.print("ENTER VALID NUMBER  :");
            number = sc.next();
        }
        System.out.print("ENTER G-MAIL    :");
        gmail = sc.next();
        temp = new dnode(name, number, gmail);
        if (head == null)
        {
            head = temp;
        }
        else
        {
            ptr = head;
            while (ptr.next != null)
            {
                ptr = ptr.next;
            }
            ptr.next = temp;
            temp.prev = ptr;
        }
				/*System.out.print("DO YOU WANT TO CONTINUE?????????");
			ans = sc.next().charAt(0);
			  }while (ans == 'y');*/

    }