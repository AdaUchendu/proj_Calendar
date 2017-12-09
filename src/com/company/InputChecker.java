package com.company;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
/* Team Planit:
   Adaku Uchendu
   Buban Ndeta
   Steven Sommers
   Yeabi Demissie
   Tony Smith
   Akhil Naraparaju
   THIS CLASS MEASURES USER INPUT VS EXPECTED ENTRIES (E.G. "BACK" "Y" "LIST")
   ALSO INCLUDES VERIFYING VALID IDS, MONTH, AND DATES
=======
/**
 * Created by adakuuchendu on 12/5/17.
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
/**
 * Created by adakuuchendu on 12/5/17.
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
/**
 * Created by adakuuchendu on 12/5/17.
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
/**
 * Created by adakuuchendu on 12/5/17.
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
 */


class InputChecker {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    //Bring in file search
    Search fileSearch = new Search();
    WriteToFile write = new WriteToFile();
    //Verify user entered "back"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    public boolean checkBack(String newUserInput) {
        String upper = newUserInput.toUpperCase();
        if (upper.equals("BACK")) {
            return true;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        } else {
            return false;
        }
    }
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
        }
        else {
            return false;
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    //Y = true, N = false
    public boolean checkYN(String newUserInput) {
        String upper = newUserInput.toUpperCase();
        if (upper.equals("Y")) {
            return true;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        } else if (upper.equals("N")) {
            return false;
        } else {
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
        }
        else if (upper.equals("N")) {
            return false;
        }
        else {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
            System.out.println("Invalid input.");
            return false;
        }
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    //Verify new ID is valid
    public boolean checkID(int newID, String password, String name) {
        //Ensure ID length is 5 characters
        String temp = Integer.toString(newID);
        int length = temp.length();
        //Add zeroes if needed
        while (temp.length() <= 2) {
            //If length is 5, create the file
            if (temp.length() == 2) {
                //Look for an existing file
                if (fileSearch.doesUserExist(temp)) {
                    //End loop
                    temp = "0" + temp;
                    return false;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                } else {
                    write.createUserFile(temp, password, name);
                    break;
                }
            } else {
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                }
                else {
                    write.createUserFile(temp, password, name);
                    break;
                }
            }
            else {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                temp = "0" + temp;
            }
        }
        return true;
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    //Find existing IDs
    public void checkExistingID(int newID) {
        //Ensure ID length is 5 characters
        String temp = Integer.toString(newID);
        int length = temp.length();
        //Add zeroes if needed
        while (temp.length() <= 5) {
            //If length is 5, continue
            if (temp.length() == 5) {
                //Look for an existing file
                if (fileSearch.doesUserExist(temp)) {
                    //Do not display the default accounts
                    if (!temp.equals("00")) {
                        System.out.println(temp + " " + fileSearch.getUserName(temp));
                    }
                    break;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                } else {
                    break;
                }
            } else {
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                }
                else {
                    break;
                }
            }
            else {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                temp = "0" + temp;
            }
        }
    }

    //Verify user entered "list"
    public boolean checkList(String newUserInput) {
        String lowered = newUserInput.toLowerCase();
        if (lowered.equals("list")) {
            return true;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        } else {
            return false;
        }
    }
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
        }
        else {
            return false;
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    //Verify date format
    public boolean checkDate(String newDate) {
        if ((newDate.length() == 8 || newDate.length() == 9 || newDate.length() == 10) &&
                (newDate.charAt(1) == '/' || newDate.charAt(2) == '/') &&
                (newDate.charAt(3) == '/' || newDate.charAt(4) == '/' || newDate.charAt(5) == '/')) {
            return true;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        } else {
            return false;
        }
    }
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
        }

        else {
            return false;
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    public boolean checkTime(String newTime) {
        if (newTime.length() == 6 && newTime.charAt(1) == ':' &&
                //Check AM/PM/am/pm starting at char 4
                (newTime.charAt(4) == 'P' || newTime.charAt(4) == 'A') &&
                newTime.charAt(5) == 'M') {
            return true;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        } else if (newTime.length() == 7 && newTime.charAt(2) == ':' &&
=======
        }
        else if (newTime.length() == 7 && newTime.charAt(2) == ':' &&
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        }
        else if (newTime.length() == 7 && newTime.charAt(2) == ':' &&
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        }
        else if (newTime.length() == 7 && newTime.charAt(2) == ':' &&
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        }
        else if (newTime.length() == 7 && newTime.charAt(2) == ':' &&
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                //Check AM/PM/am/pm starting at char 5
                (newTime.charAt(5) == 'P' || newTime.charAt(5) == 'A') &&
                newTime.charAt(6) == 'M') {
            return true;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        } else {
            return false;
        }
    }
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
        }
        else {
            return false;
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    public boolean validMonth(String monthYear) {
        //Separate month and year
        String[] splitMonth = monthYear.split("\\s+");
        String month = splitMonth[0];
        month = month.toUpperCase();
        //Ensure a month was entered
        if (month.equals("JANUARY") || month.equals("FEBRUARY") || month.equals("MARCH") ||
                month.equals("APRIL") || month.equals("MAY") || month.equals("JUNE") ||
                month.equals("JULY") || month.equals("AUGUST") || month.equals("SEPTEMBER") ||
                month.equals("OCTOBER") || month.equals("NOVEMBER") || month.equals("DECEMBER")) {
            return true;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        } else {
=======
        }
        else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        }
        else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        }
        else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        }
        else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
            return false;
        }
    }
    //Turn month text into integer
    public String getMonthNumber(String month) {
        if (month.equals("JANUARY")) {
            return "01";
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        } else if (month.equals("FEBRUARY")) {
            return "02";
        } else if (month.equals("MARCH")) {
            return "03";
        } else if (month.equals("APRIL")) {
            return "04";
        } else if (month.equals("MAY")) {
            return "05";
        } else if (month.equals("JUNE")) {
            return "06";
        } else if (month.equals("JULY")) {
            return "07";
        } else if (month.equals("AUGUST")) {
            return "08";
        } else if (month.equals("SEPTEMBER")) {
            return "09";
        } else if (month.equals("OCTOBER")) {
            return "10";
        } else if (month.equals("NOVEMBER")) {
            return "11";
        } else if (month.equals("DECEMBER")) {
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
        }
        else if (month.equals("FEBRUARY")) {
            return "02";
        }
        else if (month.equals("MARCH")) {
            return "03";
        }
        else if (month.equals("APRIL")) {
            return "04";
        }
        else if (month.equals("MAY")) {
            return "05";
        }
        else if (month.equals("JUNE")) {
            return "06";
        }
        else if (month.equals("JULY")) {
            return "07";
        }
        else if (month.equals("AUGUST")) {
            return "08";
        }
        else if (month.equals("SEPTEMBER")) {
            return "09";
        }
        else if (month.equals("OCTOBER")) {
            return "10";
        }
        else if (month.equals("NOVEMBER")) {
            return "11";
        }
        else if (month.equals("DECEMBER")) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
            return "12";
        }
        return "01";
    }
}
