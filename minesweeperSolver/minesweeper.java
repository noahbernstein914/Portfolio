//READ BEFORE RUNNING
//This program controls movement of mouse 
//When mouse gets stuck use CTRL+ALT+DELETE to open task manager
//This program requires you to match up the window  


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Robot;
import java.lang.reflect.Array;
import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.*;
import java.time.Year;

public class minesweeper {
    public static void main(String[] args) throws InterruptedException {

        // int gamemode = type();
        // System.out.println(gamemode);
        setBoundaries(2);
        try {
            Robot robot = new Robot();
            HashMap<String, Integer> order = new HashMap<>();
            order.put("d0", 120);
            order.put("d1", 120);
            order.put("d2", 120);
            order.put("d3", 120);
            order.put("d4", 120);
            order.put("d5", 120);
            order.put("d6", 120);
            order.put("d7", 120);
            order.put("d8", 120);
            order.put("d9", 120);
            order.put("d10", 120);
            order.put("d11", 120);
            order.put("d12", 120);
            order.put("d13", 120);
            order.put("d14", 120);
            order.put("d15", 120);
            order.put("d16", 120);
            order.put("d17", 120);
            order.put("d18", 120);
            order.put("d19", 120);
            order.put("d20", 120);
            order.put("d21", 120);
            order.put("d22", 120);
            order.put("d23", 120);
            order.put("d24", 120);
            order.put("d25", 120);
            order.put("d26", 120);
            order.put("d27", 120);
            order.put("d28", 120);
            order.put("d29", 120);
            order.put("d30", 120);
            order.put("d31", 120);
            order.put("d32", 120);
            order.put("d33", 120);
            order.put("d34", 120);
            order.put("d35", 120);
            order.put("d36", 120);
            order.put("d37", 120);
            order.put("d38", 120);
            order.put("d39", 120);
            order.put("d40", 120);
            order.put("d41", 120);
            order.put("d42", 120);
            order.put("d43", 120);
            order.put("d44", 120);
            order.put("d45", 120);
            order.put("d46", 120);
            order.put("d47", 120);
            order.put("d48", 120);
            order.put("d49", 120);
            order.put("d50", 120);
            order.put("d51", 120);
            order.put("d52", 120);
            order.put("d53", 120);
            order.put("d54", 120);
            order.put("d55", 120);
            order.put("d56", 120);
            order.put("d57", 120);
            order.put("d58", 120);
            order.put("d59", 120);
            order.put("d60", 120);
            order.put("d61", 120);
            order.put("d62", 120);
            order.put("d63", 120);
            order.put("d64", 120);
            order.put("d65", 120);
            order.put("d66", 120);
            order.put("d67", 120);
            order.put("d68", 120);
            order.put("d69", 120);
            order.put("d70", 120);
            order.put("d71", 120);
            order.put("d72", 120);
            order.put("d73", 120);
            order.put("d74", 120);
            order.put("d75", 120);
            order.put("d76", 120);
            order.put("d77", 120);
            order.put("d78", 120);
            order.put("d79", 120);
            order.put("d80", 120);
            order.put("d81", 120);
            order.put("d82", 120);
            order.put("d83", 120);
            order.put("d84", 120);
            order.put("d85", 120);
            order.put("d86", 120);
            order.put("d87", 120);
            order.put("d88", 120);
            order.put("d89", 120);
            order.put("d90", 120);
            order.put("d91", 120);
            order.put("d92", 120);
            order.put("d93", 120);
            order.put("d94", 120);
            order.put("d95", 120);
            order.put("d96", 120);
            order.put("d97", 120);
            order.put("d98", 120);
            order.put("d99", 120);
            order.put("d100", 120);
            order.put("d101", 120);
            order.put("d102", 120);
            order.put("d103", 120);
            order.put("d104", 120);
            order.put("d105", 120);
            order.put("d106", 120);
            order.put("d107", 120);
            order.put("d108", 120);
            order.put("d109", 120);
            order.put("d110", 120);
            order.put("d111", 120);
            order.put("d112", 120);
            order.put("d113", 120);
            order.put("d114", 120);
            order.put("d115", 120);
            order.put("d116", 120);
            order.put("d117", 120);
            order.put("d118", 120);
            order.put("d119", 120);
            order.put("d120", 120);
            order.put("d121", 120);
            order.put("d122", 120);
            order.put("d123", 120);
            order.put("d124", 120);
            order.put("d125", 120);
            order.put("d126", 120);
            order.put("d127", 120);
            order.put("d128", 120);
            order.put("d129", 120);
            order.put("d130", 120);
            order.put("d131", 120);
            order.put("d132", 120);
            order.put("d133", 120);
            order.put("d134", 120);
            order.put("d135", 120);
            order.put("d136", 120);
            order.put("d137", 120);
            order.put("d138", 120);
            order.put("d139", 120);
            order.put("d140", 120);
            order.put("d141", 120);
            order.put("d142", 120);
            order.put("d143", 120);
            order.put("d144", 120);
            order.put("d145", 120);
            order.put("d146", 120);
            order.put("d147", 120);
            order.put("d148", 120);
            order.put("d149", 120);
            order.put("d150", 120);
            order.put("d151", 120);
            order.put("d152", 120);
            order.put("d153", 120);
            order.put("d154", 120);
            order.put("d155", 120);
            order.put("d156", 120);
            order.put("d157", 120);
            order.put("d158", 120);
            order.put("d159", 120);
            order.put("d160", 120);
            order.put("d161", 120);
            order.put("d162", 120);
            order.put("d163", 120);
            order.put("d164", 120);
            order.put("d165", 120);
            order.put("d166", 120);
            order.put("d167", 120);
            order.put("d168", 120);
            order.put("d169", 120);
            order.put("d170", 120);
            order.put("d171", 120);
            order.put("d172", 120);
            order.put("d173", 120);
            order.put("d174", 120);
            order.put("d175", 120);
            order.put("d176", 120);
            order.put("d177", 120);
            order.put("d178", 120);
            order.put("d179", 120);
            order.put("d180", 120);
            order.put("d181", 120);
            order.put("d182", 120);
            order.put("d183", 120);
            order.put("d184", 120);
            order.put("d185", 120);
            order.put("d186", 120);
            order.put("d187", 120);
            order.put("d188", 120);
            order.put("d189", 120);
            order.put("d190", 120);
            order.put("d191", 120);
            order.put("d192", 120);
            order.put("d193", 120);
            order.put("d194", 120);
            order.put("d195", 120);
            order.put("d196", 120);
            order.put("d197", 120);
            order.put("d198", 120);
            order.put("d199", 120);
            order.put("d200", 120);
            order.put("d201", 120);
            order.put("d202", 120);
            order.put("d203", 120);
            order.put("d204", 120);
            order.put("d205", 120);
            order.put("d206", 120);
            order.put("d207", 120);
            order.put("d208", 120);
            order.put("d209", 120);
            order.put("d210", 120);
            order.put("d211", 120);
            order.put("d212", 120);
            order.put("d213", 120);
            order.put("d214", 120);
            order.put("d215", 120);
            order.put("d216", 120);
            order.put("d217", 120);
            order.put("d218", 120);
            order.put("d219", 120);
            order.put("d220", 120);
            order.put("d221", 120);
            order.put("d222", 120);
            order.put("d223", 120);
            order.put("d224", 120);
            order.put("d225", 120);
            order.put("d226", 120);
            order.put("d227", 120);
            order.put("d228", 120);
            order.put("d229", 120);
            order.put("d230", 120);
            order.put("d231", 120);
            order.put("d232", 120);
            order.put("d233", 120);
            order.put("d234", 120);
            order.put("d235", 120);
            order.put("d236", 120);
            order.put("d237", 120);
            order.put("d238", 120);
            order.put("d239", 120);
            order.put("d240", 120);
            order.put("d241", 120);
            order.put("d242", 120);
            order.put("d243", 120);
            order.put("d244", 120);
            order.put("d245", 120);
            order.put("d246", 120);
            order.put("d247", 120);
            order.put("d248", 120);
            order.put("d249", 120);
            order.put("d250", 120);
            order.put("d251", 120);
            click(678 , 326);// starting
            click(138 , 330);
            click(621 , 330);// starting
            click(675 , 747);
            click(172, 357);
            click(172, 357);
            
            int xposdif = 0;
            int yposdif = 0;
            Boolean run = true;
            Boolean x = true;
            Boolean oporator = true;
            final int originalx = 175;
            final int originaly = 364;
            int numogreens = 0;
            Boolean clicked = false;
            while (oporator) {
                while (run) {
                    //Thread.sleep(3000);
                    int newx = originalx + 30 * xposdif;
                    int newy = originaly + 30 * yposdif;
                    System.out.println("_______________");
                    System.out.println("cords: " + newx + "," + newy);
                    robot.mouseMove(newx, newy);
                    int pos = spotLoc(xposdif, yposdif);
                    String temporary = ("d" + Integer.toString(pos));
                    System.out.println("old: " + order.get(temporary));
                    if (order.get(temporary) % 2 == 0) {
                        String toplefttemporary = ("d" + Integer.toString(pos - 19));
                        String toptemporary = ("d" + Integer.toString(pos - 18));
                        String toprighttemporary = ("d" + Integer.toString(pos - 17));
                        String lefttemporary = ("d" + Integer.toString(pos - 1));
                        String righttemporary = ("d" + Integer.toString(pos + 1));
                        String bottomlefttemporary = ("d" + Integer.toString(pos + 17));
                        String bottomtemporary = ("d" + Integer.toString(pos + 18));
                        String bottomrighttemporary = ("d" + Integer.toString(pos + 19));
                        if (order.get(temporary) == 120) {
                            order.put(temporary, getColor(newx, newy));
                        }
                        if (order.get(temporary) == 99) {
                            oporator = false;
                        }
                        System.out.println("new: " + order.get(temporary));
                        if (order.get(temporary) / 100 <= 0) {
                            int topleftvalue = 0;
                            if ((pos > 17) && pos % 18 != 0) {
                                if (order.get(toplefttemporary) == 120) {
                                    int f = getColor(newx - 30, newy - 30);
                                    order.put(toplefttemporary, f);
                                    topleftvalue = order.get(toplefttemporary);
                                } else {
                                    topleftvalue = order.get(toplefttemporary);
                                }
                            } else {
                                topleftvalue = 200;
                            }
                            System.out.println("top left is " + topleftvalue);
                            int topvalue = 0;
                            if (pos > 17) {
                                if (order.get(toptemporary) == 120) {
                                    int f = getColor(newx, newy - 30);
                                    order.put(toptemporary, f);
                                    topvalue = order.get(toptemporary);
                                } else {
                                    topvalue = order.get(toptemporary);
                                }
                            } else {
                                topvalue = 200;
                            }
                            System.out.println("top is " + topvalue);
                            int toprightvalue = 0;
                            if (((pos - 17) > 0) && (pos - 17) % 18 != 0) {
                                if (order.get(toprighttemporary) == 120) {
                                    int f = getColor(newx + 30, newy - 30);
                                    order.put(toprighttemporary, f);
                                    toprightvalue = order.get(toprighttemporary);
                                } else {
                                    toprightvalue = order.get(toprighttemporary);
                                }
                            } else {
                                toprightvalue = 200;
                            }
                            System.out.println("top right is " + toprightvalue);
                            int leftvalue = 0;
                            if (pos % 18 != 0) {
                                if (order.get(lefttemporary) == 120) {
                                    int f = getColor(newx - 30, newy);
                                    order.put(lefttemporary, f);
                                    leftvalue = order.get(lefttemporary);
                                } else {
                                    leftvalue = order.get(lefttemporary);
                                }
                            } else {
                                leftvalue = 200;
                            }
                            System.out.println("left is " + leftvalue);
                            int rightvalue = 0;
                            if ((pos - 17) % 18 != 0) {
                                if (order.get(righttemporary) == 120) {
                                    int f = getColor(newx + 30, newy);
                                    order.put(righttemporary, f);
                                    rightvalue = order.get(righttemporary);
                                } else {
                                    rightvalue = order.get(righttemporary);
                                }
                            } else {
                                rightvalue = 200;
                            }
                            System.out.println("right is " + rightvalue);
                            int bottomleftvalue = 0;
                            if (pos < 234 && pos % 18 != 0) {
                                if (order.get(bottomlefttemporary) == 120) {
                                    int f = getColor(newx - 30, newy + 30);
                                    order.put(bottomlefttemporary, f);
                                    bottomleftvalue = order.get(bottomlefttemporary);
                                } else {
                                    bottomleftvalue = order.get(bottomlefttemporary);
                                }
                            } else {
                                bottomleftvalue = 200;
                            }
                            System.out.println("bottomleft is " + bottomleftvalue);
                            int bottomvalue = 0;
                            if (pos < 234) {
                                if (order.get(bottomtemporary) == 120) {
                                    int f = getColor(newx, newy + 30);
                                    order.put(bottomtemporary, f);
                                    bottomvalue = order.get(bottomtemporary);
                                } else {
                                    bottomvalue = order.get(bottomtemporary);
                                }
                            } else {
                                bottomvalue = 200;
                            }
                            System.out.println("bottom is " + bottomvalue);
                            int bottomrightvalue = 0;
                            if (pos < 234 && (pos - 17) % 18 != 0) {
                                if (order.get(bottomrighttemporary) == 120) {
                                    int f = getColor(newx + 30, newy + 30);
                                    order.put(bottomrighttemporary, f);
                                    bottomrightvalue = order.get(bottomrighttemporary);
                                } else {
                                    bottomrightvalue = order.get(bottomrighttemporary);
                                }
                            } else {
                                bottomrightvalue = 200;
                            }
                            System.out.println("bottomright is " + bottomrightvalue);
                            int greencount = 0;
                            ArrayList<Integer> greencountlist = new ArrayList<Integer>();
                            ArrayList<String> greencountloc = new ArrayList<String>();
                            if (topleftvalue == 120) {
                                greencountlist.add(newx - 30);
                                greencountlist.add(newy - 30);
                                greencountloc.add(toplefttemporary);
                                greencount++;
                            }
                            if (topvalue == 120) {
                                greencountlist.add(newx);
                                greencountlist.add(newy - 30);
                                greencountloc.add(toptemporary);
                                greencount++;
                            }
                            if (toprightvalue == 120) {
                                greencountlist.add(newx + 30);
                                greencountlist.add(newy - 30);
                                greencountloc.add(toprighttemporary);
                                greencount++;
                            }
                            if (leftvalue == 120) {
                                greencountlist.add(newx - 30);
                                greencountlist.add(newy);
                                greencountloc.add(lefttemporary);
                                greencount++;
                            }
                            if (rightvalue == 120) {
                                greencountlist.add(newx + 30);
                                greencountlist.add(newy);
                                greencountloc.add(righttemporary);
                                greencount++;
                            }
                            if (bottomleftvalue == 120) {
                                greencountlist.add(newx - 30);
                                greencountlist.add(newy + 30);
                                greencountloc.add(bottomlefttemporary);
                                greencount++;
                            }
                            if (bottomvalue == 120) {
                                greencountlist.add(newx);
                                greencountlist.add(newy + 30);
                                greencountloc.add(bottomtemporary);
                                greencount++;
                            }
                            if (bottomrightvalue == 120) {
                                greencountlist.add(newx + 30);
                                greencountlist.add(newy + 30);
                                greencountloc.add(bottomrighttemporary);
                                greencount++;
                            }
                            int flagcount = 0;
                            ArrayList<Integer> flagcountlist = new ArrayList<Integer>();
                            if (topleftvalue == 130) {
                                flagcountlist.add(newx - 30);
                                flagcountlist.add(newy - 30);
                                flagcount++;
                            }
                            if (topvalue == 130) {
                                flagcountlist.add(newx);
                                flagcountlist.add(newy - 30);
                                flagcount++;
                            }
                            if (toprightvalue == 130) {
                                flagcountlist.add(newx + 30);
                                flagcountlist.add(newy - 30);
                                flagcount++;
                            }
                            if (leftvalue == 130) {
                                flagcountlist.add(newx - 30);
                                flagcountlist.add(newy);
                                flagcount++;
                            }
                            if (rightvalue == 130) {
                                flagcountlist.add(newx + 30);
                                flagcountlist.add(newy);
                                flagcount++;
                            }
                            if (bottomleftvalue == 130) {
                                flagcountlist.add(newx - 30);
                                flagcountlist.add(newy + 30);
                                flagcount++;
                            }
                            if (bottomvalue == 130) {
                                flagcountlist.add(newx);
                                flagcountlist.add(newy + 30);
                                flagcount++;
                            }
                            if (bottomrightvalue == 130) {
                                flagcountlist.add(newx + 30);
                                flagcountlist.add(newy + 30);
                                flagcount++;
                            }
                            int twohuncount = 0;
                            if (topleftvalue == 200) {
                                twohuncount++;
                            }
                            if (topvalue == 200) {

                                twohuncount++;
                            }
                            if (toprightvalue == 200) {

                                twohuncount++;
                            }
                            if (leftvalue == 200) {

                                twohuncount++;
                            }
                            if (rightvalue == 200) {

                                twohuncount++;
                            }
                            if (bottomleftvalue == 200) {
                                twohuncount++;
                            }
                            if (bottomvalue == 200) {
                                twohuncount++;
                            }
                            if (bottomrightvalue == 200) {
                                twohuncount++;
                            }
                            int elevhuncount = 0;
                            if (topleftvalue == 110) {
                                elevhuncount++;
                            }
                            if (topvalue == 110) {

                                elevhuncount++;
                            }
                            if (toprightvalue == 110) {

                                elevhuncount++;
                            }
                            if (leftvalue == 110) {

                                elevhuncount++;
                            }
                            if (rightvalue == 110) {

                                elevhuncount++;
                            }
                            if (bottomleftvalue == 110) {
                                elevhuncount++;
                            }
                            if (bottomvalue == 110) {
                                elevhuncount++;
                            }
                            if (bottomrightvalue == 110) {
                                elevhuncount++;
                            }
                            System.out.println("greencount: " + greencount);
                            System.out.println("flagcount: " + flagcount);
                            if (order.get(temporary) == 10) {
                                if (greencount == 1 && flagcount == 0) {
                                    while (greencountlist.size() > 0) {
                                        int d = greencountlist.get(0);
                                        int f = greencountlist.get(1);
                                        rclick(d, f);
                                        greencountlist.remove(0);
                                        greencountlist.remove(0);
                                        clicked = true;
                                    }
                                    while (greencountloc.size() > 0) {
                                        String z = greencountloc.get(0);
                                        order.put(z, 130);
                                        greencountloc.remove(z);
                                    }
                                }
                                if (flagcount == 1 && greencount > 0) {
                                    while (greencountlist.size() > 0) {
                                        int d = greencountlist.get(0);
                                        int f = greencountlist.get(1);
                                        click(d, f);
                                        clicked = true;
                                        greencountlist.remove(0);
                                        greencountlist.remove(0);
                                    }
                                } // 1 block addition

                            } else if (order.get(temporary) == 20) {
                                if (greencount == 2 && flagcount == 0) {
                                    while (greencountlist.size() > 0) {
                                        int d = greencountlist.get(0);
                                        int f = greencountlist.get(1);
                                        rclick(d, f);
                                        clicked = true;
                                        greencountlist.remove(0);
                                        greencountlist.remove(0);
                                    }
                                    while (greencountloc.size() > 0) {
                                        String z = greencountloc.get(0);
                                        order.put(z, 130);
                                        greencountloc.remove(z);
                                    }
                                } else if (greencount == 1 && flagcount == 1) {
                                    while (greencountlist.size() > 0) {
                                        int d = greencountlist.get(0);
                                        int f = greencountlist.get(1);
                                        rclick(d, f);
                                        clicked = true;
                                        greencountlist.remove(0);
                                        greencountlist.remove(0);
                                    }
                                    while (greencountloc.size() > 0) {
                                        String z = greencountloc.get(0);
                                        order.put(z, 130);
                                        greencountloc.remove(z);
                                    }
                                } else if (greencount > 0 && flagcount == 2) {
                                    while (greencountlist.size() > 0) {
                                        int d = greencountlist.get(0);
                                        int f = greencountlist.get(1);
                                        click(d, f);
                                        clicked = true;
                                        greencountlist.remove(0);
                                        greencountlist.remove(0);
                                    }
                                }
                            } else if (order.get(temporary) == 30) {
                                if (greencount + flagcount == 3) {
                                    while (greencountlist.size() > 0) {
                                        int d = greencountlist.get(0);
                                        int f = greencountlist.get(1);
                                        rclick(d, f);
                                        clicked = true;
                                        greencountlist.remove(0);
                                        greencountlist.remove(0);
                                    }
                                    while (greencountloc.size() > 0) {
                                        String z = greencountloc.get(0);
                                        order.put(z, 130);
                                        greencountloc.remove(z);
                                    }
                                } else if (flagcount == 3 && greencount > 0) {
                                    while (greencountlist.size() > 0) {
                                        int d = greencountlist.get(0);
                                        int f = greencountlist.get(1);
                                        click(d, f);
                                        clicked = true;
                                        greencountlist.remove(0);
                                        greencountlist.remove(0);
                                    }
                                }

                            } else if (order.get(temporary) == 40) {
                                if (greencount + flagcount == 4) {
                                    while (greencountlist.size() > 0) {
                                        int d = greencountlist.get(0);
                                        int f = greencountlist.get(1);
                                        rclick(d, f);
                                        clicked = true;
                                        greencountlist.remove(0);
                                        greencountlist.remove(0);
                                    }
                                    while (greencountloc.size() > 0) {
                                        String z = greencountloc.get(0);
                                        order.put(z, 130);
                                        greencountloc.remove(z);
                                    }
                                } else if (flagcount == 4 && greencount > 0) {
                                    while (greencountlist.size() > 0) {
                                        int d = greencountlist.get(0);
                                        int f = greencountlist.get(1);
                                        click(d, f);
                                        clicked = true;
                                        greencountlist.remove(0);
                                        greencountlist.remove(0);
                                    }
                                }
                            } else if (order.get(temporary) == 50) {
                                System.out.println("FIVE DETENCTED");
                                if (greencount + flagcount == 5) {
                                    while (greencountlist.size() > 0) {
                                        int d = greencountlist.get(0);
                                        int f = greencountlist.get(1);
                                        rclick(d, f);
                                        clicked = true;
                                        greencountlist.remove(0);
                                        greencountlist.remove(0);
                                    }
                                    while (greencountloc.size() > 0) {
                                        String z = greencountloc.get(0);
                                        order.put(z, 130);
                                        greencountloc.remove(z);
                                    }
                                } else if (flagcount == 5 && greencount > 0) {
                                    while (greencountlist.size() > 0) {
                                        int d = greencountlist.get(0);
                                        int f = greencountlist.get(1);
                                        click(d, f);
                                        clicked = true;
                                        greencountlist.remove(0);
                                        greencountlist.remove(0);
                                    }
                                }
                            }

                        }
                        if (xposdif == 17 && yposdif == 13) {
                        
                            int oldnumogreens = 0;
                            boolean running = false;
                            for (int i = 0; i < order.size(); i++) {
                                String l = ("d" + Integer.toString(i));
                                if (order.get(l) == 120) {
                                    running = true;
                                    oldnumogreens++;
                                }

                            }
                            int bob = getColor(180, 446);
                            if (bob==99){
                                oporator=false;
                            }
                            if (numogreens==1){
                                numogreens--;
                            }
                            System.out.println("Greens left: "+numogreens);
                            if (running == false) {
                                System.out.println("YOU WIN");
                                oporator = false;
                            }
                            if (numogreens != oldnumogreens) {
                                numogreens = oldnumogreens;
                            } else if (oldnumogreens == numogreens) {
                                ArrayList<Integer> greenposstrings = new ArrayList<Integer>();
                                for (int i = 0; i < order.size(); i++) {
                                    String l = ("d" + Integer.toString(i));
                                    if (order.get(l) == 120) {
                                        greenposstrings.add(i);
                                    }
                                }
                                int o = greenposstrings.size();
                                int r = ThreadLocalRandom.current().nextInt(o);
                                int newrandompos = greenposstrings.get(r);
                                int[] pol = pixelfrompos(newrandompos);
                                System.out.println("Random pick: " + Arrays.toString(pol));
                                int xneeded = Array.getInt(pol, 0);
                                int yneeded = Array.getInt(pol, 1);
                                click(xneeded, yneeded);
                                
                            }
                            
                        }

                    }

                    run = false;
                }
                if (x) {
                    if (xposdif == 17 && yposdif == 13) {
                        xposdif = 0;
                        yposdif = 0;
                        x = true;

                    }
                    if (xposdif < 17) {
                        xposdif++;
                        run = true;

                    } else {
                        yposdif++;
                        xposdif = 0;
                        run = true;
                    }
                }
            }

        } catch (

        AWTException e) {
            e.printStackTrace();
        }
    }

    public static int type() {
        Boolean x = true;
        int z = 0;
        Scanner sc = new Scanner(System.in);
        while (x) {
            System.out.println("type: 1 for easy\ntype: 2 for medium\ntype: 3 for hard");
            z = sc.nextInt();
            if (z == 1 || z == 2 || z == 3) {
                x = false;
            }
        }
        return z;

    }

    public static void click(int x, int y) throws AWTException {
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void rclick(int x, int y) throws AWTException {
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    public static int[] pixelfrompos(int pos) {
        final int originalx = 127;
        final int originaly = 335;
        int newx = (((pos - ((int) (pos / 18) * 18)) * 30) + originalx);
        int newy = (((pos / 18) * 30) + originaly);
        int d[] = { newx, newy };
        return d;

    }

    public static int spotLoc(int x, int y) {
        if (y > 0) {
            y *= 18;
        }
        return (int) (x + y);
    }

    public static void setBoundaries(int mode) {
        Scanner sc = new Scanner(System.in);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                int x = 0;
                int y = 0;
                final JFrame tframe = new JFrame("Frame");
                tframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                tframe.setAlwaysOnTop(true);
                tframe.setSize(540, 0);
                tframe.setLocation(112, 312);
                tframe.setVisible(true);
                final JFrame bframe = new JFrame("Frame");
                bframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                bframe.setAlwaysOnTop(true);
                bframe.setSize(540, 0);
                bframe.setLocation(167, 731);
                bframe.setVisible(true);
                
                final JFrame lframe = new JFrame("Frame");
                lframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                lframe.setAlwaysOnTop(true);
                lframe.setSize(0, 420);
                lframe.setLocation(32, 312);
                lframe.setVisible(true);
                final JFrame rframe = new JFrame("Frame");
                rframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                rframe.setAlwaysOnTop(true);
                rframe.setSize(0, 420);
                rframe.setLocation(572, 312);
                rframe.setVisible(true);
            }
        });
        System.out.println("Enter anything to start");
        String d = sc.nextLine();
    }

    public static int getColor(int x, int y) throws AWTException, InterruptedException {
        Robot bot = new Robot();
        Color check = bot.getPixelColor(x, y);
        Color doubcheck = bot.getPixelColor(x + 1, y - 12);
        bot.mouseMove(x, y - 12);
        ArrayList<Integer> checklist = new ArrayList<Integer>();
        checklist.add(check.getRed());
        checklist.add(check.getGreen());
        checklist.add(check.getBlue());
        if (checklist.get(0) == 255 && checklist.get(1) == 255 && checklist.get(2) == 255) {
            return 99;
        }
        ArrayList<Integer> doubchecklist = new ArrayList<Integer>();
        doubchecklist.add(doubcheck.getRed());
        doubchecklist.add(doubcheck.getGreen());
        doubchecklist.add(doubcheck.getBlue());
        if (checklist.get(0).intValue() > 1 && checklist.get(0).intValue() < 130 && checklist.get(1).intValue() > 109
                && checklist.get(1).intValue() < 150 && checklist.get(2).intValue() > 160
                && checklist.get(2).intValue() < 220) {
            // System.out.println("ONE DETECTED");
            return 10;
        } else if (checklist.get(0).intValue() > 50 && checklist.get(0).intValue() < 145
                && checklist.get(1).intValue() > 135 && checklist.get(1).intValue() < 200
                && checklist.get(2).intValue() > 5 && checklist.get(2).intValue() < 95) {
            // System.out.println("Two DETECTED");
            return 20;
        } else if (checklist.get(0).intValue() > 200 && checklist.get(0).intValue() < 225
                && checklist.get(1).intValue() > 40 && checklist.get(1).intValue() < 90
                && checklist.get(2).intValue() > 40 && checklist.get(2).intValue() < 85) {
            // System.out.println("three DETECTED");
            return 30;
        } else if (doubchecklist.get(0).intValue() > 105 && doubchecklist.get(0).intValue() < 140
                && doubchecklist.get(1).intValue() > 15 && doubchecklist.get(1).intValue() < 45
                && doubchecklist.get(2).intValue() > 150 && doubchecklist.get(2).intValue() < 170) {
            System.out.println("four DETECTED");
            return 40;
        } else if (checklist.get(0).intValue() > 235 && checklist.get(0).intValue() < 280
                && checklist.get(1).intValue() > 120 && checklist.get(1).intValue() < 160
                && checklist.get(2).intValue() > 1 && checklist.get(2).intValue() < 20) {
            System.out.println("five DETECTED");
            return 50;
        } else if (doubchecklist.get(0).intValue() > 225 && doubchecklist.get(0).intValue() < 265
                && doubchecklist.get(1).intValue() > 30 && doubchecklist.get(1).intValue() < 60
                && doubchecklist.get(2).intValue() > 0 && doubchecklist.get(2).intValue() < 20) {
            // System.out.println("flag DETECTED");
            return 130;
        } else if (checklist.get(0).intValue() > 190 && checklist.get(0).intValue() < 235
                && checklist.get(1).intValue() > 170 && checklist.get(1).intValue() < 210
                && checklist.get(2).intValue() > 135 && checklist.get(2).intValue() < 165) {
            // System.out.println("brown DETECTED");
            return 110;
        } else if (checklist.get(0).intValue() > 150 && checklist.get(0).intValue() < 195
                && checklist.get(1).intValue() > 195 && checklist.get(1).intValue() < 235
                && checklist.get(2).intValue() > 60 && checklist.get(2).intValue() < 130) {
            // System.out.println("green DETECTED");
            return 120;
        }
        System.out.println(checklist);
        System.out.println("doub: " + checklist);
        return 120;
    }

}